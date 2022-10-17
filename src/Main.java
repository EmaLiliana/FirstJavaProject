public class Main {

    private static double inch;

    public static void main(String[] args) {
        printMyName();
        System.out.println("Rezultatul adunarii este: " + adunare(20, 10));
        System.out.println("Rezultatul scaderii este: " + scadere(20, 10));
        System.out.println("Rezultatul inmultirii este: " + inmultire(20, 10));
        System.out.println("Rezultatul impartirii este: " + impartire(20, 10));

        printMyJava();

        System.out.println("Media aritmetica a numerelor: 5, 10 si 15 este: " + media(5, 10, 15) / 3);

        printMyRobot();

        System.out.println("Restul impartirii numerelelor 10 si 6 este: " + rest(10, 6));

        System.out.println("40 grade Fahrenheit = " + fahrenheitToCelsius(5/9 * 40 - 32) + " grade Celsius");

        System.out.println("80 Inchs =  " + inchToMeter(80 * 0.0254) + "m");


    }


    public void String(String[] args) {
        System.out.println("Hello Liliana!");

        byte myByteVariable = 2 + 5;
        System.out.println(myByteVariable);

        double myDoubleVariable = 5.0 / 2.0;
        System.out.println(myDoubleVariable);
        byte myNegativeNumber = -5 + 8 * 6;
        System.out.println(myNegativeNumber);
        byte myModuleOp = (55 + 9) % 9;
        System.out.println(myModuleOp);
        byte myOpNumber = 20 + -3 * 5 / 8;
        System.out.println(myOpNumber);
        byte myLongOp = 5 + 15 / 3 * 2 - 8 % 3;
        System.out.println(myLongOp);

        int x = 2;
        int y = 5;
        int w = multiplication(x, y);

        System.out.println(w);

        float a = substract(x, y);
        System.out.println(a);

    }

    private static int multiplication(int first, int second) {
        int result = first * second;
        return result;
    }

    public static int substract(int first, int second) {
        int result = first / second;
        return result;
    }

    public static float substract(float first, float second) {
        float result = first / second;
        return result;
    }


    public static void printMyName() {
        System.out.println("Hello,\n Liliana!");
    }

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

    public static void printMyJava() {
        System.out.println("   J    a   v     v  a\n   J   a a   v   v  a a\nJ  J  aaaaa   V V  aaaaa\n JJ  a     a   v  a     a");

    }

    public static int media(int primulNumar, int alDoileaNumar, int alTreileaNumar) {

        int rezultat = primulNumar + alDoileaNumar + alTreileaNumar;
        return rezultat;
    }

    public static void printMyRobot() {
        System.out.println(" +'''''+ \n[| 0 0 |]\n |  ^  | \n | '_' | \n +_____+ ");

    }

    public static int rest(int primulNumar, int alDoileaNumar) {
        int rezultat = primulNumar % alDoileaNumar;
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





















