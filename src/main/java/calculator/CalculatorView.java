package calculator;

import calculator.metod.ComplexNumber;
import calculator.metod.calculators.CanCalculable;
import calculator.metod.calculators.InterfaceCalculableFactory;

import java.util.Scanner;

public class CalculatorView {
    private final Scanner scanner = new Scanner(System.in);
    private final InterfaceCalculableFactory iCalculableFactory;
    public CalculatorView (InterfaceCalculableFactory iCalculableFactory) {
        this.iCalculableFactory = iCalculableFactory;
    }

    public void run() {
        CanCalculable Calculator = iCalculableFactory.create(getArg());
        while (true) {
            System.out.print("Доступные операторы -> (+, -, *, /, =): ");
            String input = scanner.nextLine().toLowerCase();
            switch (input) {
                case "+":
                    Calculator.sum(getArg());
                    break;
                case "-":
                    Calculator.subtraction(getArg());
                    break;
                case "*":
                    Calculator.multiplication(getArg());
                    break;
                case "/":
                    Calculator.division(getArg());
                    break;
                case "=":
                    System.out.println("Результат: " + Calculator.getResult());
                    System.out.println("Посчитать еще (Y/N)?");
                    System.out.print("---> ");
                    String command = scanner.nextLine().toLowerCase();
                    if (command.equals("n")) {
                        return;
                    }
                    else {
                        Calculator = iCalculableFactory.create(getArg());
                    }
                    break;
                default:
                    System.out.println(input + "Невозможно выполнить");
            }
        }
    }
    private ComplexNumber getArg() {
        System.out.print("Введите комплексное число (a+bi или a-bi): ");
        String input = scanner.nextLine();

        String[] inputStr = input.split("\\+");
        String a = inputStr[0];
        String b = inputStr[1].split("[i]")[0];
        ComplexNumber complexNumber = new ComplexNumber(Integer.parseInt(a), Integer.parseInt(b));


        while (!input.matches("^\\d+\\+\\d+i$")) {
            System.out.println("Число " + input + " не комплексное");
            System.out.print("Введите другое комплексное число: ");
            input = scanner.nextLine();
        }
        return complexNumber;
    }
}
