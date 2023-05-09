public class PrimtalCheck{
    int var;

    public PrimtalCheck(int var){
        this.var = var;
    }

    public void printVar() {
        System.out.println("det indtastede tal er: " + var);
    }

    public void isPrimtal(){
        for (int i = 1; i < var; i++) {
            if (var % i == 0) {
                System.out.println(var + " er et primtal i tallet " + i);
            }
        }
    }
    public boolean isSpeceficPrimtal(int[] tal){
        int var = this.var;
        for (int i = 0; i < tal.length; i++) {
            while (var % tal[i] == 0){
                var /= tal[i];
            }
        }
        return var == 1;
    }
}
