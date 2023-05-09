public class PrimtalCheckExtended extends PrimtalCheck{
    public PrimtalCheckExtended(int var){
        super(var);
    }

    public void isMoreSpeceficPrimtal(){
        if (isSpeceficPrimtal(new int[]{2,3,5, 7})){
            System.out.println(var + " går up i en blanding af 2,3,5 og 7");
        }
        else{
            System.out.println(var + " går ikke up i en blanding af 2,3,5 og 7");
        }

    }
}
