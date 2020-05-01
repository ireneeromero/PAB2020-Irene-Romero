package PABFibonacci;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {
    private Fibonacci fibonacci;

    @BeforeEach
    public void setup(){
        fibonacci= new Fibonacci();
    }


    @Test
    public void with1asNand3asKreturns1(){
        long expectedvalue= 1;
        long obtainedvalue= fibonacci.computeFibonacci(1, 3);

        assertEquals(expectedvalue, obtainedvalue);
    }
    @Test
    public void with2asNand3asKreturns1(){
        long expectedvalue= 1;
        long obtainedvalue= fibonacci.computeFibonacci(2, 3);

        assertEquals(expectedvalue, obtainedvalue);
    }

    @Test
    public void with3asNand3asKreturns4(){
        long expectedvalue= 4;
        long obtainedvalue= fibonacci.computeFibonacci(3, 3);

        assertEquals(expectedvalue, obtainedvalue);
    }

    @Test
    public void with4asNand3asKreturns7(){
        long expectedvalue= 7;
        long obtainedvalue= fibonacci.computeFibonacci(4, 3);

        assertEquals(expectedvalue, obtainedvalue);
    }

    @Test
    public void with5asNand3asKreturns19(){
        long expectedvalue= 19;
        long obtainedvalue= fibonacci.computeFibonacci(5, 3);

        assertEquals(expectedvalue, obtainedvalue);
    }
    @Test
    public void with6asNand3asKreturns40(){
        long expectedvalue= 40;
        long obtainedvalue= fibonacci.computeFibonacci(6, 3);

        assertEquals(expectedvalue, obtainedvalue);
    }
    @Test
    public void with5asNand5asKreturns41(){
        long expectedvalue= 41;
        long obtainedvalue= fibonacci.computeFibonacci(5, 5);

        assertEquals(expectedvalue, obtainedvalue);
    }

    @Test
    public void NegativeNorKReturnException(){
        assertThrows(RuntimeException.class, () -> fibonacci.computeFibonacci(-1,-3) );
    }

    @Test
    public void NegativeNReturnException(){
        assertThrows(RuntimeException.class, () -> fibonacci.computeFibonacci(-1,3) );
    }

    @Test
    public void NegativeKReturnException(){
        assertThrows(RuntimeException.class, () -> fibonacci.computeFibonacci(1,-3) );
    }







}