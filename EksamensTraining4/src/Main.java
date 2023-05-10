import java.util.Arrays;

public class Main {

     int[] arr1 = {1, 2, 3, 4, 5};
     int[] arr2 = {10, 7, 8, 6, 9};
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println("Before swapping");
        System.out.println("arr1");
        main.printArray(main.arr1);
        System.out.println("arr2");
        main.printArray(main.arr2);






        //swapping until the arrays stay the same
        int[] temparr1 = Arrays.copyOf(main.arr1, main.arr1.length);
        int[] temparr2 = Arrays.copyOf(main.arr1, main.arr1.length);
        int Loops = 0;
        boolean similiar = false;
        while (!Arrays.equals(main.arr1, main.arr2) && !similiar){


            System.out.println("\n");
            int secondLowest = main.findSecondLowestValue(main.arr1);
            System.out.println("Second lowest value in arr1 is: " + secondLowest);
            secondLowest = main.findSecondLowestValue(main.arr2);
            System.out.println("Second lowest value in arr2 is: " + secondLowest);

            main.swap(main.arr1, main.arr2, main.findSecondLowestValue(main.arr1), main.findSecondLowestValue(main.arr2));

            System.out.println("\n");
            System.out.println("After swapping");
            System.out.println("arr1:");
            main.printArray(main.arr1);
            System.out.println("arr2:");
            main.printArray(main.arr2);

            if (Arrays.equals(temparr1, main.arr1)) {
                similiar = true;
            }
            if (Arrays.equals(temparr2, main.arr1)) {
                similiar = true;
            }

            if(Loops % 2 == 0){
                temparr2 = Arrays.copyOf(main.arr1, main.arr1.length);
            }
            else{
                temparr1 = Arrays.copyOf(main.arr1, main.arr1.length);
            }
            Loops++;
            System.out.println("Loops: " + Loops);
        }

    }

    public void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }

    //find second lowest value
    public int findSecondLowestValue(int[] arr){
        int lowest = 99999;
        int secondLowest = arr[0];
        int secondLowestIndex = 0;
        int LowestIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < lowest){
                secondLowest = lowest;
                lowest = arr[i];
                secondLowestIndex = LowestIndex;
                LowestIndex = i;
            }
            else if (arr[i] < secondLowest){
                secondLowest = arr[i];
                secondLowestIndex = i;

            }
        }
        return secondLowestIndex;
    }

    //swaps locations of two values in two arrays
    public void swap(int[] arr1, int[] arr2, int index1, int index2){
        int temp = arr1[index1];
        arr1[index1] = arr2[index2];
        arr2[index2] = temp;
    }

}
