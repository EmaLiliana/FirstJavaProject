public class LogicalOp {
    //Homework
    public int checkBiggerNumber(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            return firstNumber;
        } else {
            return secondNumber;
        }
    }

    public String textComparison(String textInput) {
        if (textInput.equals("FastTrack")) {
            return "Learning text comparison.";
        } else {
            return "Got to try more.";
        }
    }

    public String textAndNumber(String textInput2, int numberInput) {
        if (textInput2.equals("FastTrackIt") && numberInput <= 3) {
            return "FastTrackIt3";
        } else if (!textInput2.equals("FastTrackIt") && numberInput >= 4) {
            return numberInput + textInput2;
        } else {
            return "No condition was met.";
        }
    }


    public String switchNumber(int number) {
        number = 20;
        switch (number) {
            case 20:
                ;
                break;

        }
        return "The number is:20";

    }


    public String trueOrFalse(int number) {
        number = 28;
        if (number % 2 == 0) {
            return "True";
        } else {
            return "False";
        }

    }

    public String isEligibleToVote(int ageNumber) {
        ageNumber = 18;
        if (ageNumber >= 18) {
            return "True";
        } else {
            return "False";
        }
    }

    public int biggestNumberAgain(int first, int second, int third) {
        first = 6;
        second = 4;
        third = 2;
        if (first > second && third < second) {
            return first;
        } else if (second > first && third < first) {
            return second;
        }
        {
            return third;
        }


    }

    public String amountSnow(int snowNumber) {
        snowNumber = 4;
        if (snowNumber > 8 || snowNumber == 6) {
            return "The amount of snow this winter was:" + snowNumber + " cm.";
        } else {
            return "The forecast snow is:" + snowNumber + " cm.";
        }

    }

    public String greaterAndLower(int number) {
        number = 4;
        if (number > 3 && (!equals(4))) {
            return "The number is greater than 3 and not equal to 4.";
        }
        else if (number == 4) {
            return "The number is equal to 4.";
        }
        else if (number < 3) {
            return "The number is lower than 3.";
        }
        else {
            return "Time for sleep.";
        }

    }

}





























