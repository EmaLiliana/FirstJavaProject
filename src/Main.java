public class Main {



    public static void main(String[] args) {
        printMyName();
        System.out.println("Rezultatul adunarii este: "+ Calculator.adunare(20,10));
        System.out.println("Rezultatul scaderii este: "+ Calculator.scadere(20,10));
        System.out.println("Rezultatul inmultirii este: "+ Calculator.inmultire(20,10));
        System.out.println("Rezultatul impartirii este: "+ Calculator.impartire(20,10));

        printMyJava();

        System.out.println("Media aritmetica a numerelor: 5, 10 si 15 este: " + Calculator.media( 5,10,15,3));

        printMyRobot();

        System.out.println("Restul impartirii numerelelor 10 si 6 este: " + Calculator.rest(10, 6));

        System.out.println("40 grade Fahrenheit = " + Calculator.fahrenheitToCelsius(5 / 9 * 40 - 32) + " grade Celsius");

        System.out.println("80 Inchs =  " + Calculator.inchToMeter(80 * 0.0254) + "m");


    }
    public static void printMyName() {
        System.out.println("Hello,\n Liliana!");}
    public static void printMyJava () {
        System.out.println("   J    a   v     v  a\n   J   a a   v   v  a a\nJ  J  aaaaa   V V  aaaaa\n JJ  a     a   v  a     a");

    }
    public static void printMyRobot () {
        System.out.println(" +'''''+ \n[| 0 0 |]\n |  ^  | \n | '_' | \n +_____+ ");
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

    public static int multiplication(int first, int second) {
        int result = first * second;
        return result;
    }

    public static int substract(int first, int second) {
        int result = first / second;
        return result;
    }














    }

























