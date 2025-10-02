import java.time.MonthDay;
import java.util.*;
public class CheckSign {
    List<Horoscope> horoscopes = new ArrayList<>();

    Horoscope aquarius = new Horoscope("Aquarius", MonthDay.of(1, 20), MonthDay.of(2, 18),
            "To innovate and bring social progress.", 11, "Independent, unique, and values friendship in love.");
    Horoscope pisces = new Horoscope("Pisces", MonthDay.of(2, 19), MonthDay.of(3, 20),
            "To bring compassion and creativity into the world.", 3, "Romantic, dreamy, and sensitive, but can be idealistic.");
    Horoscope aries = new Horoscope("Aries", MonthDay.of(3, 21), MonthDay.of(4, 19),
            "To inspire courage and leadership.", 9, "Passionate and adventurous, but sometimes impatient.");
    Horoscope taurus = new Horoscope("Taurus", MonthDay.of(4, 20), MonthDay.of(5, 20),
            "To build stability and enjoy life’s comforts.", 6, "Loyal and romantic, but stubborn in relationships.");
    Horoscope gemini = new Horoscope("Gemini", MonthDay.of(5, 21), MonthDay.of(6, 20),
            "To share ideas and connect people.", 5, "Flirty, curious, and sometimes inconsistent in love.");
    Horoscope cancer = new Horoscope("Cancer", MonthDay.of(6, 21), MonthDay.of(7, 22),
            "To nurture, protect, and create emotional bonds.", 2, "Deeply caring and sensitive, seeks emotional security.");
    Horoscope leo = new Horoscope("Leo", MonthDay.of(7, 23), MonthDay.of(8, 22),
            "To shine and inspire others with confidence.", 1, "Dramatic and affectionate, needs admiration.");
    Horoscope virgo = new Horoscope("Virgo", MonthDay.of(8, 23), MonthDay.of(9, 22),
            "To serve, heal, and improve the world.", 7, "Practical and caring, but can be overly critical in love.");
    Horoscope libra = new Horoscope("Libra", MonthDay.of(9, 23), MonthDay.of(10, 22),
            "To bring harmony, balance, and justice.", 8, "Romantic and charming, avoids conflict but indecisive.");
    Horoscope scorpio = new Horoscope("Scorpio", MonthDay.of(10, 23), MonthDay.of(11, 21),
            "To uncover truth and transform deeply.", 3, "Intense, loyal, but sometimes possessive in love.");
    Horoscope sagittarius = new Horoscope("Sagittarius", MonthDay.of(11, 22), MonthDay.of(12, 21),
            "To seek wisdom, freedom, and adventure.", 4, "Honest, playful, and adventurous, but dislikes restrictions.");


    CheckSign(){
        horoscopes.add(new Horoscope("Capricorn", MonthDay.of(12, 22), MonthDay.of(12, 31),
                "To build lasting success and legacy.", 8, "Loyal and committed, but can be cautious with feelings."));
        horoscopes.add(new Horoscope("Capricorn", MonthDay.of(1, 1), MonthDay.of(1, 19),
                "To build lasting success and legacy.", 8, "Loyal and committed, but can be cautious with feelings."));
        horoscopes.add(aquarius);
        horoscopes.add(pisces);
        horoscopes.add(aries);
        horoscopes.add(taurus);
        horoscopes.add(gemini);
        horoscopes.add(cancer);
        horoscopes.add(leo);
        horoscopes.add(virgo);
        horoscopes.add(libra);
        horoscopes.add(scorpio);
        horoscopes.add(sagittarius);
    }

    public Horoscope checkSign(MonthDay birthDate){

    for(Horoscope h: horoscopes) {
        if (!birthDate.isBefore(h.getStartDate()) && !birthDate.isAfter(h.getEndDate())){
            return h;
            }
        }
        return null;
    }
}


