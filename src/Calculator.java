public class Calculator {

    public static int adunare(int primulNumar, int alDoileaNumar) {

        int rezultat = primulNumar + alDoileaNumar;

        return rezultat;
    }

        public static int scadere(int primulNumar, int alDoileaNumar) {
        int rezultat = primulNumar - alDoileaNumar;
        return rezultat;
    }

    public static int inmultire(int primulNumar, int alDoileaNumar) {
        int rezultat = primulNumar * alDoileaNumar;
        return rezultat;
    }

    public static int impartire(int primulNumar, int alDoileaNumar) {
        int rezultat = primulNumar / alDoileaNumar;
        return rezultat;
    }
    public static int rest(int primulNumar, int alDoileaNumar) {
        int rezultat = primulNumar % alDoileaNumar;
        return rezultat;
    }
    public static int media(int primulNumar, int alDoileaNumar, int alTreileaNumar, int alPatruleaNumar) {


        int rezultat = (primulNumar + alDoileaNumar + alTreileaNumar) / alPatruleaNumar;
        return rezultat;
    }


        public static double inchToMeter(double args) {
        double inch = 80;
        double meter = inch * 0.0254;
        double rezultat = meter;

        return rezultat;
    }

    public static double fahrenheitToCelsius(double args){
            double fahrenheit = 40;
            double celsius = 5 / 9 * fahrenheit - 32;
            double rezultat = celsius;
            return rezultat;
        }






        }