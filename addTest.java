package demo2;

import org.junit.Test;
import org.junit.*;

public class addTest {
    @Test
    public void Testp(){
        add a=new add();
        Assert.assertEquals(5,a.addNo(2,3));
    }

    @Test
    public void Testn(){
        add a=new add();
        Assert.assertEquals(-5,a.addNo(-3, -2));
    }

    @Test
    public void TestZ(){
        add a=new add();
        Assert.assertEquals(0,a.addNo(0, 0));
    }
}


/*
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calc;

    // ✅ setUp (BeforeEach)
    @BeforeEach
    void setUp() {
        calc = new Calculator();
        System.out.println("Setup done");
    }

    // ✅ tearDown (AfterEach)
    @AfterEach
    void tearDown() {
        System.out.println("Cleanup done");
    }

    // ✅ Simple Test
    @Test
    void testAddition() {
        assertEquals(5, calc.add(2, 3));
    }

    // ✅ assertTrue
    @Test
    void testPositive() {
        assertTrue(calc.isPositive(10));
    }

    // ✅ assertFalse
    @Test
    void testNegative() {
        assertFalse(calc.isPositive(-5));
    }

    // ✅ assertNotEquals
    @Test
    void testNotEqual() {
        assertNotEquals(10, calc.add(2, 3));
    }

    // ✅ Exception Test
    @Test
    void testDivideException() {
        assertThrows(ArithmeticException.class, () -> {
            calc.divide(10, 0);
        });
    }

    // ✅ Repeated Test
    @RepeatedTest(3)
    void repeatedTestExample() {
        assertEquals(4, calc.add(2, 2));
    }

    // ✅ Force fail (Raise exception if test fails)
    @Test
    void testFailExample() {
        if (calc.add(2, 2) != 4) {
            throw new RuntimeException("Test failed manually!");
        }
    }
}
*/