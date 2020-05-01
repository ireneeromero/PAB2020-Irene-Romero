package PABFibonacci;

public class Fibonacci {
    
    public static int computeFibonacci(long value){
        if(value==0){
            return 0;
        }
        else if(value==1){
            return 1;
        }
        else if(value> 1){
            return computeFibonacci(value-1) + computeFibonacci(value-2);
        }
        else{
            System.out.println("Deben ser numeros postivios");
            return -1;
        }
    }
}
