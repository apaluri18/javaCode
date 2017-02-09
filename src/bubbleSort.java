public class bubbleSort {

    public int[] bubbleS(int list[]) {

        int[] myList = list;

        //int max = myList[0];
        int temp = 0;

        for (int i = 0; i < myList.length; i++) {

            for (int j = 0; j < (myList.length - i - 1); j++) {

                if (myList[j] > myList[j + 1]) {
                    temp = myList[j];
                    myList[j] = myList[j + 1];
                    myList[j + 1] = temp;
                }


            }


        }

        System.out.println("Array is now Sorted printing...");

        return myList;
    }


    public static void main(String args[]) {
        
         System.out.println("Enter 5 elements for the array..");
        

        int[] unsortedList = {51, 7, 1, 101, 15};
        int[] sortedList;


        bubbleSort sort = new bubbleSort();

        System.out.println("Sorting array..");

        sortedList = sort.bubbleS(unsortedList);



        for (int x = 0; x < sortedList.length; x++)

        {
            System.out.println(sortedList[x]);
        }


    }


}
