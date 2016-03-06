package calculator.Impl;

import calculator.*;
import calculator.impl.AddClassImp;
import calculator.impl.DivideClassImpl;
import calculator.impl.MultiplyClassImpl;
import calculator.impl.SubtractClassImpl;

/**
 * Created by lodz on 2016/03/07.
 */
public class CalculatorImpl implements Calculator {

    private AddClass add = new AddClassImp();
    private SubtractClass sub = new SubtractClassImpl();
    private DivideClass divide = new DivideClassImpl();
    private MultiplyClass multiply = new MultiplyClassImpl();

    public int add(int a, int b) {
        return add.add(a,b);
    }

    public int divide(int a, int b) {
        return divide.divide(a,b);
    }

    public int multiply(int a, int b) {
        return multiply.multiply(a,b);
    }

    public int subtract(int a, int b) {
        return sub.subtract(a,b);
    }
}
