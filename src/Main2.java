public class Main2 {
    public static void main(String[] args) {
        //if the text input is "FastTrack", print: "Learning comparison", if not, print :"Got to try more"
        LogicalOperation op = new LogicalOperation();
        String textInput = "FastTrack";
        System.out.println(op.textComp(textInput));


        // compare 2 numbers, get the greater number
        int first = 3;
        int second = 4;
        System.out.println(op.getGreaterNumber(first, second));


        //Given a text input and a number input,if the text is equal to "FastTrack" AND the number is
        //equal to or lower than 3, print the number and the text, in this order. If the text is not "FastTrack"
        //AND the number is equal to or higher than 4, print the number&text in this order.

        String textInput2 = "FastTrack";
        int numberInput= 3;

        System.out.println(op.textAndNumberComparison(textInput2, numberInput));
    }

}
