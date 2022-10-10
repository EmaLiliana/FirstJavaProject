public class Main {
    public static void main(String[] args) {
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

        float  a = substract (x,y);
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
}