public class Main {

    public static void main(String[] args) {
       PrimtalCheck tal1 =  new PrimtalCheck(21);
       tal1.printVar();
       tal1.isPrimtal();
       if (tal1.isSpeceficPrimtal(new int[]{2,3,5})){
           System.out.println(tal1.var + " går up i en blanding af 2,3 og 5");
        }
       else{
           System.out.println(tal1.var + " går ikke up i en blanding af 2,3 og 5");
       }
       PrimtalCheckExtended tal2 = new PrimtalCheckExtended(21);
         tal2.printVar();
         tal2.isPrimtal();
         tal2.isMoreSpeceficPrimtal();
    }
}