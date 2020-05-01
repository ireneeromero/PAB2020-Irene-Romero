package PABfactorial;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FactorialTest {
    private Factorial factorial;

    @BeforeEach
    public void setup(){
        factorial= new Factorial();
    }



    @Test

    public void shouldFactorialOf0Return1(){
        long expectedvalue= 1;
        long obtainedvalue= factorial.compute(0);

        assertEquals(expectedvalue, obtainedvalue);

    }
    @Test
    public void shouldFactorial1f0Return1(){
        long expectedvalue= 1;
        long obtainedvalue= factorial.compute(1);

        assertEquals(expectedvalue, obtainedvalue);

    }
    @Test
    public void shouldFactorial2f0Return2(){
        long expectedvalue= 2;
        long obtainedvalue= factorial.compute(2);

        assertEquals(expectedvalue, obtainedvalue);

    }

    @Test
    public void shouldFactorial4f0Return24(){
        long expectedvalue= 24;
        long obtainedvalue= factorial.compute(4);

        assertEquals(expectedvalue, obtainedvalue);

    }
    @Test
    public void shouldFactorialofNegativeNumber(){

        assertThrows(RuntimeException.class, () -> factorial.compute(-1) );

    }


}