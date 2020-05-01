package PABFibonacci;

public class Fibonacci {
    
    public long computeFibonacci(long n, long k){
        if((n<=0) || (k<=0)){
            throw new RuntimeException("Deben ser numeros postivios");
        }

        else if((n==1) || (n==2)){
            return 1;
        }

        else{
            return computeFibonacci(n-1, k) + k*computeFibonacci(n-2, k);
        }
    }
}
