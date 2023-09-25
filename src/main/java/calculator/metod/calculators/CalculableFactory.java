package calculator.metod.calculators;

import calculator.metod.ComplexNumber;

public class CalculableFactory implements InterfaceCalculableFactory {
    public CanCalculable create(ComplexNumber arg) {
        return new Calculator(arg);
    }
}


