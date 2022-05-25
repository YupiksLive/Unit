import org.junit.jupiter.api.Assertions;

public class Test {
    Calculator calculator = Calculator.instance.get();
    @org.junit.jupiter.api.Test
    public void testCalculatorPow(){
        int a = 2;
        int ex = 4;
        int result = calculator.pow.apply(a);
        Assertions.assertEquals(ex,result);
        Assertions.assertNotNull(ex);
    }
    @org.junit.jupiter.api.Test
    public void testCalculatorPositive(){
        int a = 2;
        boolean ex = true;
        boolean result = calculator.isPositive.test(a);
        Assertions.assertTrue(ex==result);
    }
    @org.junit.jupiter.api.Test
    public void testCalculatorAbs(){
        int a = 2;
        int ex = 2;
        int result = calculator.abs.apply(a);
        Assertions.assertEquals(ex,result);
    }
}
