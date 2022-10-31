public class LogicalOp {
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


    public String switchNumber() {
        int number = 20;
        switch (number) {
            case 20:
                ;
                break;

        }
        return "The number is 20.";

    }


    public boolean trueOrFalse() {
        int number = 28;

        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }

    public boolean isEligibleToVote() {
        int ageNumber = 18;
        if (ageNumber >= 18) {
            return true;
        } else {
            return false;
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
        } else if (number == 4) {
            return "The number is equal to 4.";
        } else if (number < 3) {
            return "The number is lower than 3.";
        } else {
            return "Time for sleep.";
        }

    }


    // Homework "Java for Loop"


    // Creati o metoda in clasa LogicalOp, care sa primeasca un numar ca si parametru.
    // Metoda sa verifice numarul primit, si sa afiseze in consola o numaratoare pana la 100,
    // pornind de la numarul primit ca si parametru.
    // Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.
    public void printFromNumberToNumber(int number) {
        for (int i = number; i <= 100; i++) {
            System.out.println(i);
        }

    }

    //Creati o metoda in clasa LogicalOp, care sa primeasca un numar ca si parametru.
    // Metoda sa verifice numrul primit, si sa afiseze in consola o numaratoare pana la -100,
    // pornind de la numarul primit ca si parametru.
    // Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.
    public void printFromNumberToMinusNumber(int number) {
        for (int i = number; i >= -100; i--) {
            System.out.println(i);
        }
    }

    //Creati o metoda in clasa LogicalOp, care sa primeasca doi parametrii de tip numar.
    // Metoda sa afiseze o numaratoare intre cele doua numere primite, pornind de la primul parametru primit,
    // pana la cel de-al doilea(ex: daca int x e primul parametru iar int y  este cel de-al doilea,
    // numaratoarea sa se faca de la x, la y.
    public void counterFromTo(int x, int y) {
        for (int i = x; i <= y; i++) {
            System.out.println(i);
        }
    }

    //Creati o metoda in clasa LogicalOp, care sa primeasca doi parametrii de tip numar.
    // Metoda trebuie sa verifice care dintre cele doua numere este mai mare, si sa execute o numaratoare crescatoare
    // de la cel mai mic la cel mai mare.
    // (ex: daca int x e primul parametru iar int y  este cel de-al doilea, daca x  este mai mare decat y,
    // atunci numaratoarea sa fie de la y la x).
    public void compareAndCount(int first, int last) {
        while (first <= last) {
            System.out.println(first);
            first++;
        }
        while (last <= first) {
            System.out.println(last);
            last++;
        }
    }


    //Creati o metoda in clasa LogicalOp care sa afiseze toate numerele pare de la 1 la 100.
    public void evenNumber(int n) {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

    }

    // Creati o metoda in clasa LogicalOp care sa afiseze toate numerele impare de la 1 la 100
    public void oddNumber(int a) {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);

            }
        }
    }

    //Creati o metoda in clasa LogicalOp care sa primeasca un parametru de tip numar.
    // Metoda sa adune toate numerele pana la 100, pornind de la numarul primit ca si parametru,
    // iar la final sa returneze rezultatul.
    // Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.
    public int sumOfNumberFromTo(){
        int sum = 0;

        for ( int i = 0; i<=100; i++ ){
            sum = sum +i;
        }
        return sum;

    }


    //Creat o metoda in clasa LogicalOp care sa afiseze urmatorul tipar:
    //*******
    //
    //******
    //
    //*****
    //
    //****
    //
    //***
    //
    //**
    //
    //*
    public void stars(int n) {
        n = 7;
        for (int i = 1; i <=n ; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();


        }


    }
}



































