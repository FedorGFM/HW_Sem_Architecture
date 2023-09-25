package calculator.metod.calculators;

import calculator.metod.ComplexNumber;

public interface CanCalculable {
    void sum(ComplexNumber arg);
    void subtraction(ComplexNumber arg);
    void multiplication(ComplexNumber arg);
    void division(ComplexNumber arg);
    ComplexNumber getResult();
}
