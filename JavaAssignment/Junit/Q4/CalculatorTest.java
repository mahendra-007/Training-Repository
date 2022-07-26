package question4;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class CalculatorTest {

    Calculator cal;

    @BeforeAll
    static void SetupAll() {
        System.out.println("@BeforAll Method");

    }

    @BeforeEach
    void setup() {
        cal = new Calculator();
        System.out.println("@BeforeEach Method");
    }

    @Test
    public void test() {

        int expected = 5;
        int actual = cal.add(2, 3);
        assertEquals(expected, actual,"Should give right sum");
        System.out.println(actual);
    }

    @Test
   public void test2() {
        int expected = 8;
        int actual = cal.add(4, 4);
        assertEquals(expected, actual,"should give right output");
        System.out.println(actual);
    }
    @AfterEach
    void setup2() {
        System.out.println("@AfteEach Method");
    }

    @AfterAll
    static void SetupAll2() {
        System.out.println("@AfterAll Method");

    }

}
