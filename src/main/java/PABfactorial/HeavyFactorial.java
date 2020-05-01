package PABfactorial;

public class HeavyFactorial extends Factorial{
    private int numllamadas=0;
    @Override
    public long compute(long value) {
        for (long i = 0; i < 10000000; i++) {
            double dummy = Math.sin(2.352 + i) * Math.cos(i - 0.235);
        }
        numllamadas +=1;
        return super.compute(value);
    }

    public int getNumllamadas(){
        return numllamadas;
    }
}
