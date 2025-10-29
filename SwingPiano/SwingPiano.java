import javax.sound.midi.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class SwingPiano extends JFrame {


    private static final int[] WHITE_MIDI = {
            60, 62, 64, 65, 67, 69, 71,
            72, 74, 76, 77, 79, 81, 83, 84
    };
    private static final String[] WHITE_LABELS = {
            "C4","D4","E4","F4","G4","A4","B4",
            "C5","D5","E5","F5","G5","A5","B5","C6"
    };

    private static final int[] BLACK_MIDI = {
            61, 63, 66, 68, 70, 73, 75, 78, 80, 82
    };
    private static final int[] BLACK_LEFT_WHITE_INDEX = {
            0, 1, 3, 4, 5, 7, 8, 10, 11, 12
    };

    private static final int WHITE_W = 60;
    private static final int WHITE_H = 220;
    private static final int BLACK_W = 38;
    private static final int BLACK_H = 140;

    private Synthesizer synth;
    private MidiChannel channel;
    private JComboBox<String> modeBox;

    public SwingPiano() {
        setTitle("Java Swing Piano");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        initMidi();

        int totalWhite = WHITE_MIDI.length;
        int width = totalWhite * WHITE_W;

        JLayeredPane layered = new JLayeredPane();
        layered.setPreferredSize(new Dimension(width, WHITE_H));


        for (int i = 0; i < totalWhite; i++) {
            int x = i * WHITE_W;
            JButton key = makeKey(Color.WHITE, Color.BLACK, WHITE_LABELS[i], true);
            key.setBounds(x, 0, WHITE_W, WHITE_H);
            int note = WHITE_MIDI[i];
            key.addActionListener(e -> playWithFlash(key, note, 280));
            layered.add(key, JLayeredPane.DEFAULT_LAYER);
        }


        for (int i = 0; i < BLACK_MIDI.length; i++) {
            int leftWhite = BLACK_LEFT_WHITE_INDEX[i];
            int x = (leftWhite + 1) * WHITE_W - (BLACK_W / 2);
            JButton key = makeKey(Color.BLACK, Color.DARK_GRAY, "", false);
            key.setBounds(x, 0, BLACK_W, BLACK_H);
            int note = BLACK_MIDI[i];
            key.addActionListener(e -> playWithFlash(key, note, 280));
            layered.add(key, JLayeredPane.PALETTE_LAYER);
        }


        String[] modes = {"Piano", "Organ", "Synth", "Xylophone"};
        modeBox = new JComboBox<>(modes);
        modeBox.addActionListener(e -> changeMode(modeBox.getSelectedIndex()));

        JPanel topPanel = new JPanel();
        topPanel.add(new JLabel("Instrument: "));
        topPanel.add(modeBox);

        setContentPane(new JPanel(new BorderLayout()) {{
            add(topPanel, BorderLayout.NORTH);
            add(layered, BorderLayout.CENTER);
        }});
        pack();
        setLocationRelativeTo(null);
    }

    private JButton makeKey(Color bg, Color border, String text, boolean isWhite) {
        JButton b = new JButton(text);
        b.setFocusPainted(false);
        b.setMargin(new Insets(0, 0, 6, 0));
        b.setBackground(bg);
        b.setForeground(isWhite ? Color.BLACK : Color.WHITE);
        b.setBorder(BorderFactory.createLineBorder(border));
        b.setOpaque(true);
        b.setHorizontalTextPosition(SwingConstants.CENTER);
        b.setVerticalTextPosition(SwingConstants.BOTTOM);
        return b;
    }

    private void initMidi() {
        try {
            synth = MidiSystem.getSynthesizer();
            synth.open();
            channel = synth.getChannels()[0];
            channel.programChange(0);
        } catch (MidiUnavailableException e) {
            JOptionPane.showMessageDialog(this,
                    "MIDI unavailable: " + e.getMessage(),
                    "MIDI Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void changeMode(int index) {
        if (channel == null) return;

        int program = switch (index) {
            case 0 -> 0;
            case 1 -> 16;
            case 2 -> 81;
            case 3 -> 13;
            default -> 0;
        };

        channel.programChange(program);
    }

    private void playWithFlash(JButton key, int note, int ms) {
        if (channel == null) return;

        Color orig = key.getBackground();
        key.setBackground(orig.equals(Color.WHITE) ? new Color(230, 230, 230) : new Color(40, 40, 40));
        channel.noteOn(note, 110);

        Timer t = new Timer(ms, (ActionEvent e) -> {
            channel.noteOff(note);
            key.setBackground(orig);
        });
        t.setRepeats(false);
        t.start();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new SwingPiano().setVisible(true));
    }
}
