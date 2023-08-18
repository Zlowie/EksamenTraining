import java.util.ArrayList;
import java.util.Random;

public class RP {
    String[] inputList;
    RP(String[] input){
        inputList = input;
    }

    ArrayList<String> rp(){
        ArrayList<Integer> rIndex = new ArrayList<Integer>();
        ArrayList<String> rList = new ArrayList<String>();

        for (int i = 0; i < inputList.length; i++){

            Random r = new Random();
            int result = r.nextInt(inputList.length);

            while (rIndex.contains(result)){
                result = r.nextInt(inputList.length);
            }
            rIndex.add(result);
        }
        for (int i = 0; i < inputList.length; i++){
            rList.add(inputList[rIndex.get(i)]);
        }
        return rList;
    }

    public static void main(String[] args) {
        String[] myList = {"Anders", "Boris", "Cecilie", "David", "William"};
        RP hold = new RP(myList);

        for(String elev : hold.rp()){
            System.out.println(elev);
        }
    }
}
