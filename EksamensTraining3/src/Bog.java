public class Bog {

    String Title;
    String forfatter;
    String udgivelsesår;

    Bog boger[] = new Bog[10];

    Bog (String Title, String Forfatter, String Udgivelsesår){
        this.Title = Title;
        this.forfatter = Forfatter;
        this.udgivelsesår = Udgivelsesår;
    }

    public String toString(){

        String finalString = this.Title + ": (" + this.forfatter + "," + this.udgivelsesår + ")";
        return finalString;
    }

    public void makeBog(String Title, String Forfatter, String Udgivelsesår, int index){
        boger[index] = new Bog(Title, Forfatter, Udgivelsesår);
    }
    public void removeBog(int index){
        boger[index] = null;
    }
    public void printBogListe(){
        for (int i = 0; i < boger.length; i++) {
            System.out.println(boger[i]);
        }
    }
}
