package calculator;

import calculator.Impl.CalculatorImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by lodz on 2016/03/07.
 */
public class TestCalculator {
    private Calculator calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new CalculatorImpl();
    }

    @Test
    public void testAdd() throws Exception {
        Assert.assertEquals(3,calculator.add(1,2));
    }

    @Test
    public void testSubtract() throws Exception {
        Assert.assertEquals(2,calculator.subtract(3,1));

    }

    @Test
    public void testMultiply() throws Exception {
        Assert.assertEquals(20,calculator.multiply(5,4));

    }

    @Test
    public void testDivide() throws Exception {
        Assert.assertEquals(2,calculator.divide(12,6));

    }
}
