package PABfactorial;

public class HeavyFactorial extends Factorial{
    private long iterations ;
    private int numberOfComputeCalls=0;

    public HeavyFactorial() {
        this(10000000) ;
    }

    public HeavyFactorial(long iterations) {
        this.iterations = iterations ;
    }

    @Override
    public long compute(long value) {
        for (long i = 0 ; i < iterations; i++) {
            double dummy = Math.sin(2.352 +i) * Math.cos(i - 0.235) ;
        }

        //critical section
        numberOfComputeCalls = numberOfComputeCalls+1;
        /* numberOfComputeCalls=2
        compute(4) --> 2
        compute(8) --> 2
        compute(4) --> 3
        compute(8) --> 3
         */

        return super.compute(value) ;
    }
}
