package Lab04;

public class VatCaCulator {
    public static double getVat(double price) {
        if (price < 10000000) {
            return price * 0.1;
        } else if (price < 20000000) {
            return price * 0.15;
        } else if (price < 30000000) {
            return price * 0.2;
        } else{
            return price * 0.25;
        }
    }
}

