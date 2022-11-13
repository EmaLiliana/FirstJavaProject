public class MainArray {
    public static void main(String[] args) {
        LogicalOpArray opArray = new LogicalOpArray();

        //int [] myArray = new int [100];
        //for( int i = 0; i < myArray.length ; i++) //sau for(int i =0; i<100; i++)
        //{
        //myArray[i] = i+1;    // de la 1-100, nu de la 0-99
        // }
        // for (int i=0; i< myArray.length; i++){
        //   System.out.print(myArray[i] + " ");
        //}

        //}
        int position = 100;
        opArray.getArrayValue(position);


        //int evenNumbersPosition= 100;
        //opArray.getEvenNumbersFromArray(evenNumbersPosition);
        System.out.println();

        int arrayEvenPosition=100;
        opArray.getEvenNumbersFromArray(arrayEvenPosition);

        System.out.println();
        int [] myArray = { 2,6,8,10,20} ;
        System.out.println(opArray.getAverageFromArray(myArray));


        int [] a= {10,20,40,50,30};
        int searchValue= 50;
        opArray.arrayValue(a,searchValue);

        int [] arrayPosition = {2,3,4,5,6};
        int number = 3;
        opArray.returnPosition(arrayPosition,number);

        String [] linesDisplay = {"- "};
        opArray.lines(linesDisplay);
        System.out.println();

        int[] numbersArray = {1,2,3,4,5};
        int numberArray= 5;
        opArray.getOutNumberFromArray( numbersArray, numberArray);
        System.out.println();


        opArray.getSecondSmallestNumber();




        opArray.copyValue();



        opArray.liliCopyArrayValues();




    }
}






