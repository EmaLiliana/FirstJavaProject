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
    public int sumOfNumberFromTo() {
        int sum = 0;

        for (int i = 0; i <= 100; i++) {
            sum = sum + i;
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
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();


        }


    }

    //Creati o metoda in clasa LogicalOp, care sa primeasca un numar ca si parametru. Metoda sa verifice numrul primit,
    // si sa afiseze in consola o numaratoare pana la 100, pornind de la numarul primit ca si parametru.
    public void numbFromTo(int numb) {
        do {
            System.out.println(numb);
            numb++;
        } while (numb <= 100);

    }

    // Creati o metoda in clasa LogicalOp, care sa primeste un numar ca si parametru. Metoda sa verifice numarul primit,
    // si sa afiseze in consola o numaratoare pana la -100, pornind de la numarul primit ca si parametru.
    public void minusNumber(int minus) {
        do {
            System.out.println(minus);
            minus--;
        } while (minus >= -100);
    }

    //Creati o metoda in clasa LogicalOp, care sa primeste doi parametrii de tip numar. Metoda sa afiseze o numaratoare intre
    // cele doua numere primite, pornind de la primul parametru primit, pana la cel de-al doilea
    // (ex: daca int x e primul parametru iar int y  este cel de-al doilea, numaratoarea sa se faca de la x, la y.
    public void countfromToNum(int firstNum, int lastNum) {
        do {
            System.out.println(firstNum);
            firstNum++;
        } while (firstNum <= lastNum);
    }

    // Creati o metoda in clasa LogicalOp, care primeste doi parametrii de tip numar.
    // Metoda trebuie sa verifice care dintre cele doua numere este mai mare, si sa execute o numaratoare
    // crescatoare de la cel mai mic la cel mai mare.(ex: daca int x e primul parametru iar int y  este cel de-al doilea,
    // daca x  este mai mare decat y,
    // atunci numaratoarea sa fie de la y la x).
    public void biggestNumbAndCount(int xx, int zz) {
        if (zz > xx) {
            do {
                System.out.println(xx);
                xx++;
            } while (xx <= zz);


        } else if (zz < xx) {
            do {
                System.out.println(zz);
                zz++;
            } while (zz <= xx);
        }

    }

    //Creati o metoda in clasa LogicalOp care sa afiseze toate numerele pare de la 1 la 100
    public void evenNumb(int i) {
        for (int y = i; i <= 100; i++) {

            do {
                System.out.println(i);
                i++;
            }
            while (i % 2 == 0);


        }
    }

    // Creati o metoda in clasa LogicalOp care sa afiseze toate numerele impare de la 1 la 100}

    public void oddNumb(int oddNumb) {
        for (int i = oddNumb; oddNumb <= 100; oddNumb++) {
            do {
                System.out.println(oddNumb);
                oddNumb++;
            } while (oddNumb % 2 != 0);
        }
    }

    //Creati o metoda care sa adune toate numerele din intervalul 111 si 8899. Sa se afiseze suma totala,
    // iar dupa aceea sa se calculeze si afiseze media numerelor din acel interval.
    // Introduceti o variabila int count in metoda, pentru a numara toate numerele din interval.
    public float averageAndSum(int avgSum, int avgSumOf) {
        float sum = 0;
        int count = 0;
        while (avgSum <= avgSumOf) {
            sum = sum + avgSum;
            count++;
            avgSum++;
        }
        return sum / count;
    }

    //Creati o metoda care sa primeasca doi parametrii de tip numar,
    // si sa returneze media numerelor divizibile cu 7, din acel interval.
    public float divisibleNumbers(int c, int d) {
        int sum = 0;
        int count = 0;
        for (int i = c; c <= d; c++) {
            while (c % 7 == 0) {
                sum = sum + c;
                count++;
                c++;
            }

        }
        return sum / count;
    }

    //Creati o metoda care sa afiseze primele 20 de numere din sirul lui Fibonacci
    public void fibonacci(int n1, int n2, int max) {

        for (int i = 1; i <= max; i++) {
            System.out.println(n1);
            n1++;
            int sum = n1 + n2;
            n1 = n2;
            n2 = sum;

        }

    }

    // Creati o metoda numita CozaLozaWoza.
//
//Metoda va afisa:
//
//- numerele de la 1 la 110
//
//- 11 numere pe linie
//
//- se va afisa Coza pentru numerele care sunt multiplu de 3 (1 2 Coza 4)
//
//- se va afisa Loza pentru numerele care sunt multiplu de 5 (2 3 4 Loza 6)
//
//- se va afisa Woza pentru numerele care sunt multiplu de 7 (4 5 6 Woza 8)
//
//- se va afisa CozaLoza pentru numerele care sunt multiplu de 3 SI 5
//
//- se va afisa CozaWoza pentru multiplu de 3 SI 7
//
//- se va afisa WozaLoza pentru multiplu de 5 SI 7
//
//- se va afisa CozaLozaWoza pentru multiplu de 3 SI 5 SI 7
//
//Ar trebui sa arate similar:
//
//1 2 Coza 4 Loza Coza Woza 8 Coza Loza 11
//
//Coza 13 Woza CozaLoza 16 17 Coza 19 Loza CozaWoza 22
//
//23 Coza Loza 26 Coza Woza 29 CozaLoza 31 32 Coza
}




















































