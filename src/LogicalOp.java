public class LogicalOp {

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
    public void sumOfNumberFromTo(int sum){
        sum = 0;

        for ( int i = 0; i<=100; i++ ){
            sum = sum +i;
        }
        System.out.println(sum);

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



































