package calculator.metod.calculators;

import calculator.metod.ComplexNumber;

public interface InterfaceCalculableFactory {
    CanCalculable create(ComplexNumber arg);
}
