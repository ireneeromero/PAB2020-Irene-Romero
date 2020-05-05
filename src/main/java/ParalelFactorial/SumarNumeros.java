package ParalelFactorial;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class SumarNumeros {
    public static void main(String[] args) throws IOException {
        List<Integer> numbers= List.of(1,2,3,4,5,6);

        double sum= numbers
                .stream()
                .reduce(0, (number1, number2) -> number1+number2);

        System.out.println("Sum: " + sum);


    }

}
