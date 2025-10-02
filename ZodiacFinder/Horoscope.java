import java.util.*;
import java.time.MonthDay;
public class Horoscope{
    private String sign;
    private MonthDay startDate;
    private MonthDay endDate;
    private String destiny;
    private int luckNumber;
    private String loveLife;

    public String getSign(){
        return sign;
    }

    public MonthDay getStartDate(){
        return startDate;
    }

    public MonthDay getEndDate(){
        return endDate;
    }

    public String getDestiny() {
        return destiny;
    }

    public int getLuckyNumber() {
        return luckNumber;
    }

    public String getLoveLife() {
        return loveLife;
    }

    public Horoscope(String sign, MonthDay startDate, MonthDay endDate, String destiny, int luckyNumber, String loveLife){
        this.sign = sign;
        this.endDate = endDate;
        this.startDate = startDate;
        this.destiny = destiny;
        this.luckNumber = luckyNumber;
        this.loveLife = loveLife;
    }
}
