public class Main {
    private int[] array = generateArray(10);
    private int  target = 10;
    private int resultCount = 0;


    private void findcombination(int[] array, int target) {
        for(int i = 0; i<array.length - 1; i++) {
            for(int j = 0; j<array.length - 1; j++) {
                if(array[i] + array[j] == target) {
                    System.out.println(array[i] + " + " + array[j] + " = " + target);
                    resultCount++;
                }
            }
        }
        System.out.println("Total number of combinations: " + resultCount);

    }

    public static void main(String[] args) {
        Main main = new Main();
        main.findcombination(main.array, main.target);
    }

    private int[] generateArray(int size) {
        int[] array = new int[size];
        for(int i = 0; i<size; i++) {
            array[i] = i;
        }
        return array;
    }
}

