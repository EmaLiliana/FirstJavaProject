public class LogicalOpArray {

        // creati o metoda care sa scrie pe un array de 100 de pozitii, valorile de la 1 la 100.
        public void getArrayValue(int positions) {
            int[] myArray = new int[positions];
            for (int i = 0; i < 100; i++) {
                myArray[i] = i + 1;
            }
            for (int i = 0; i < 100; i++) {
                System.out.print(myArray[i] + " ");
            }

        }

        //Creati o metoda care primeasca un parametru de tip array de numere intregi gol,
        // si sa il returneze populat cu toate valorile pare de la 1 la 100
        public void getEvenNumbersFromArray(int arrayEvenPosition) {
            int[] array = new int[arrayEvenPosition];

            for (int i = 0; i < 100; i++) {
                array[i] = i + 1;
            }
            for (int i = 0; i < 100; i++) {
                if (array[i] % 2 == 0) {
                    System.out.print(array[i] + " ");

                }
            }


        }

        // Creati o metoda care sa primeasca un parametru de tip array de numere, si sa fie populat cu valori.
        // Metoda sa calculeze si sa returneze media numerelor din array.
        public float getAverageFromArray(int[] myArray) {
            float sum = 0;
            for (int i = 0; i < myArray.length; i++) {
                sum = sum + myArray[i];
            }

            return sum / myArray.length;
        }

        // Creati o metoda care sa primeasca un parametru de tip array de string-uri, populat cu valori,
        // si un parametru de tip String. Metoda sa verifice daca valoarea string-ului primit se regaseste in array-ul primit,
        // iar daca da sa returneze true iar daca nu, sa returneze false.
        public void arrayValue(int[] a, int searchValue) {
            a = new int[]{10, 20, 40, 50, 30};
            searchValue = 50;
            boolean flag = false;
            for (int i = 0; i < a.length; i++) {
                if (searchValue == a[i]) {
                    System.out.println("True ");
                    flag = true;
                    break;
                }

            }
            if (!flag) { //(flag==false)
                System.out.println("False");
            }


        }

        //Creati o metoda care sa primeasca un parametru de tip array de numere, populat cu valori,
        // si un parametru de tip numar. Metoda sa verifice daca numarul primit se afla in array-ul primit,
        // si daca da, atunci sa returneze pozitia pe care se afla numarul.
        public void returnPosition(int[] arrayPosition, int number) {
            int[] arrayValue = {2, 3, 4, 5, 6};
            number = 3;
            for (int i = 0; i < arrayValue.length; i++) {
                if (number == arrayValue[i]) {
                    System.out.println("Position: " + i);
                    break;
                }

            }
        }

        // Creati o metoda care sa afiseze urmatoarea grila, folosind un array:
        // x10
        //- - - - - - - - - -
        public void lines(String[] linesDisplay) {
            linesDisplay = new String[100];

            for (int j = 0; j < linesDisplay.length; j++) {
                if (j % 10 == 0) {
                    System.out.println();

                }
                System.out.print(linesDisplay[j] = "- ");
            }
        }


        //  Creati o metoda care sa primeasca un parametru de tip array de numere, populat cu valori, si un parametru de tip numar.
        //  Metoda sa verifice daca numarul exista in array, si daca da, sa returneze array-ul primit, fara acel numar
        public void getOutNumberFromArray(int[] numbersArray, int numberArray) {
            numbersArray = new int[]{1, 2, 3, 4, 5};
            numberArray = 5;
            for (int i = 0; i < numbersArray.length; i++) {
                if (numberArray != numbersArray[i])
                    System.out.print(numbersArray[i]);
            }


        }

        //Creati o metoda care sa primeasca un array, si sa returneze al doilea cel mai mic numar din array.
        //public void secondSmallestNumber(int[] myArrayyNumb) {
        public void getSecondSmallestNumber() {
            int[] myArrayN = {10, 20, 30};
            int smallestNumber = 0;
            int secondSmallestNumber = 0;
            for (int i = 0; i < myArrayN.length; i++) {
                if (myArrayN[i] > smallestNumber) {
                    secondSmallestNumber = smallestNumber;
                    smallestNumber = myArrayN[i];
                } else if (myArrayN[i] > secondSmallestNumber) {
                    secondSmallestNumber = myArrayN[i];
                }
            }
            System.out.println("The 2nd smallest number is: " + secondSmallestNumber);
        }

        //Creati o metoda care sa primeasca doi parametrii: un array populat cu valori, si un array gol.
        // Metoda sa copieze toate valorile din primul array, parcurgandu-l, in cel de-al doilea
        public void copyValue() {
            int[] firstArray = {1, 2, 3, 4, 5};
            int[] secondArray = new int[firstArray.length];
            for (int i = 0; i < firstArray.length; i++) {
                secondArray[i] = firstArray[i];
            }
            for (int i = 0; i < secondArray.length; i++) {
                System.out.println("Second array: " + secondArray[i]);
            }


        }

        public void liliCopyArrayValues() {
            int[] unu = {6, 7, 8, 9, 10};
            int[] doi = new int[unu.length];
            for (int i = 0; i < unu.length; i++) {
                doi[i] = unu[i];
            }
            for (int i = 0; i < doi.length; i++) {
                System.out.println(doi[i]);
            }
        }
    }




























