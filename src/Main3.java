public class Main3 {


    public static void main(String[] args) {
        LogicalOp op = new LogicalOp();
        //int firstNumber = 5;
        //int secondNumber = 9;
        //System.out.println(op.checkBiggerNumber(firstNumber,secondNumber));
        int biggest = op.checkBiggerNumber(5, 9);
        System.out.println("The biggest number is: " + biggest);

        String textInput = "FastTrack";
        System.out.println(op.textComparison(textInput));

        String textInput2 = "FastTrackIt";
        int numberInput = 3;
        System.out.println(op.textAndNumber(textInput2,numberInput));

        System.out.println(op.switchNumber());

        System.out.println(op.trueOrFalse());

        System.out.println(op.isEligibleToVote());

        System.out.println(op.biggestNumberAgain( 2,4,6));

        System.out.println(op.amountSnow(10));

        System.out.println(op.greaterAndLower(9));


    }


}
