import java.util.Scanner;

public class GetStringClass {

    public GetStringClass(char[] chararray, int index) {
        String str = new String(chararray);
        int tempIndex = index + 1;
        System.out.println(str + ": charateren på " + tempIndex + " er " + chararray[index]);

    }

    public GetStringClass(char[] chararray, int index, char[] chararray2, int index2) {

        chararray[index] = chararray2[index2];
        String str = new String(chararray);
        int tempIndex = index + 1;

        chararray2[index2] = chararray[index];
        String str2 = new String(chararray2);
        int tempIndex2 = index2 + 1;

        System.out.println(str + ": charateren på " + tempIndex + " er " + chararray[index]);
        System.out.println(str2 + ": charateren på " + tempIndex2 + " er " + chararray2[index2]);
    }

    public static void main(String[] args) {

        //Opgave 1
        System.out.println("Opgave 1");
        Scanner sc = new Scanner(System.in);
        System.out.println("Skriv din tekst: ");

        String text = sc.nextLine();

        System.out.println("Skriv index på bogstav: ");
        int index = sc.nextInt() - 1;
        sc.nextLine();

        char[] charArray = text.toCharArray();
        new GetStringClass(charArray, index);


        //Opgave 2
        System.out.println("Opgave 2");
        System.out.println("hvilket bogstav vil du erstatte?");
        int index2 = sc.nextInt() - 1;
        sc.nextLine();

        /*System.out.println("hvad vil du ændre den til?");
        char newChar = sc.next().charAt(0);*/
        sc.nextLine();
        System.out.println("Skriv index på bostav du vil erstatte med");
        int index3 = sc.nextInt() - 1;
        charArray[index2] = charArray[index3];

        new GetStringClass(charArray, index2);


        //Opgave 3
        System.out.println("Opgave 3");
        System.out.println("Skriv din tekst: ");
        String Text2 = sc.nextLine();
        System.out.println("Skriv index på bogstav du vil erstatte: ");
        int index4 = sc.nextInt() - 1;
        sc.nextLine();
        char[] charArray2 = Text2.toCharArray();
        System.out.println("Skriv din anden tekst: ");
        String Text3 = sc.nextLine();
        System.out.println("Skriv index på bogstav du vil erstatte det første bogstav med: ");
        int index5 = sc.nextInt() - 1;
        sc.nextLine();
        char[] charArray3 = Text3.toCharArray();

        new GetStringClass(charArray2, index4, charArray3, index5);
    }
}


