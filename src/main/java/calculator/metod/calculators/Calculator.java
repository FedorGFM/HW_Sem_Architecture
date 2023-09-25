package calculator.metod.calculators;

import calculator.metod.ComplexNumber;

public class Calculator implements CanCalculable {
    private final ComplexNumber primaryArg;

    public Calculator(ComplexNumber primaryArg) {
        this.primaryArg = primaryArg;

    }
    @Override
    public void sum(ComplexNumber arg) {
        int a = primaryArg.getA() + arg.getA();
        int b = primaryArg.getB() + arg.getB();
        primaryArg.setA(a);
        primaryArg.setB(b);
    }

    @Override
    public void subtraction(ComplexNumber arg) {
        int a = primaryArg.getA() - arg.getA();
        int b = primaryArg.getB() - arg.getB();
        primaryArg.setA(a);
        primaryArg.setB(b);
    }

    @Override
    public void multiplication(ComplexNumber arg) {
        int a = primaryArg.getA() * arg.getA() - primaryArg.getB() * arg.getB();
        int b = primaryArg.getA() * arg.getB() + primaryArg.getB() * arg.getA();
        primaryArg.setA(a);
        primaryArg.setB(b);
    }

    @Override
    public void division(ComplexNumber arg) {
        int a = (primaryArg.getA() * arg.getA() + primaryArg.getB() * arg.getB()) / (arg.getA() * arg.getA() + arg.getB() * arg.getB());
        int b = (primaryArg.getB() * arg.getA() - primaryArg.getA() * arg.getB()) / (arg.getA() * arg.getA() + arg.getB() * arg.getB());
        primaryArg.setA(a);
        primaryArg.setB(b);
    }

    @Override
    public ComplexNumber getResult() {
        return primaryArg;
    }
}
