package Week2;

import org.junit.Assert.*;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class MathematicsTest {
    @Test
    public void AddTest() {
        double num1 = 5;
        double num2 = 6;

        double result = Mathematics.Add(num1, num2);

        assertTrue("Error: There was an issue with Mathematics.Add() result = " + result, result == 11);
    }

    @Test
    public void SubtractTest() {
        double num1 = 20;
        double num2 = 10;

        double result = Mathematics.Subtract(num1, num2);

        assertTrue("Error: There was an issue with Mathematics.Subtract() result = " + result, result == 10);
    }

    @Test
    public void MultiplyTest() {
        double num1 = 10;
        double num2 = 10;

        double result = Mathematics.Multiply(num1, num2);

        assertTrue("Error: There was an issue with Mathematics.Multiply() result = " + result, result == 100);
    }

    @Test
    public void DivideTest() {
        double num1 = 100;
        double num2 = 10;

        double result = Mathematics.Divide(num1, num2);

        assertTrue("Error: There was an issue with Mathematics.Divide() result = " + result, result == 10);
    }

    @Test
    public void OperandTest() {
        double num1 = 5;
        double num2 = 6;
        String operand = "+";

        double result = Mathematics.operand(num1, num2, operand);

        assertTrue("Error: There was an issue with Mathematics.operand() result = " + result, result == 11);
    }
}
