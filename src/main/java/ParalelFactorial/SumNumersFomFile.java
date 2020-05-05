package ParalelFactorial;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class SumNumersFomFile {
    public static void main(String[] args) throws IOException {
        double sum= Files
                .lines(Paths.get("data\numbers.txt"))
                .parallel()
                .map(Integer ::valueOf)
                .reduce(0, (number1, number2) -> number1+number2);

        System.out.println("Sum: " + sum);
    }

}
