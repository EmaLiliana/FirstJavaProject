public class LogicalOperation {
    public String textComp(String textInput) {
        if (textInput.equals("FastTrack")) {
            return "Learning text comparison";
        } else {


            return "Got to try some more.";
        }
    }

    public int getGreaterNumber(int first, int second) {
        if (first > second) {
            return first;
        } else {
            return second;
        }
    }

    public String textAndNumberComparison(String textInput2, int numberInput) {
        if (textInput2.equals("FastTrack") && numberInput <= 3) {
            return textInput2 + numberInput;
        } else if (!textInput2.equals("FastTrack") && numberInput >= 4) {
            return numberInput + textInput2;
        } else {
            return "No condition was met";
        }

    }


    }

