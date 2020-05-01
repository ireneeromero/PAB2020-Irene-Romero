package PABfactorial;

public class Factorial {
    public long compute(long value){
        long result;
        if (value<0){
            throw new RuntimeException("No se existe el factorial de un número negativo");
        }
        else if(value > 40){
            throw new RuntimeException("Número demasiado grande");

        }
        else if((value ==0)|| (value == 1)){
            result = 1;
        }
        else{
            // Computacionalmente mejor usar un for
            //result = value * compute(value-1);
            result = 1;
            for (int i = 1; i<=value; i++){
                result = i* result;
            }
        }
        return result;
    }
}
