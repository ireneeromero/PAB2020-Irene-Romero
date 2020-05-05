package ParalelFactorial;

import PABfactorial.Factorial;
import PABfactorial.HeavyFactorial;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FactorialParalelo {
    public static void main(String[] args){
        List<Integer> numbers= List.of(1,2, 3, 4, 5 ,6,7, 8, 9, 10, 11, 12, 13,14,15,16);
        List<List<Long>> factorialValue;

        HeavyFactorial factorial= new HeavyFactorial();
        int numberofCoresToUse=4;
        System.setProperty("java.util.concurrent.ForkJoinPool.common.parallelsin", "" + numberofCoresToUse);


        long initTime= System.currentTimeMillis();

       factorialValue= numbers
               .stream()
               .filter(number -> (number % 2) == 0)
               .map(number -> {
                   System.out.println(number) ;
                   return List.of(Long.valueOf(number), factorial.compute(number)) ;
               })
               .collect(Collectors.toList());





        long totalTime= System.currentTimeMillis() -initTime;

        System.out.println("Total computing time: " + totalTime);

        for(int i=0; i< factorialValue.size(); i++){
            System.out.println("Number: " + numbers.get(i) + " Factorial: "+ factorialValue.get(i));
        }

     //   System.out.println("Number of factorial.compute() operations: " + factorial.getNumllamadas()) ;
    }

}
