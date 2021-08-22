package Ex_7;
//Задание №7 Добавить обработку исключений в задание с ООП калькуляторам (например, исключение может возникнуть при делении на ноль)

import Ex_7.Operations.MathCalcul;
import Ex_7.Operations.Operations;

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.System.*;

public class ApplicCalc {
    private static double x;
    private static double y;

    public static void main(String[] args) {
        out.println("<<< Запуск калькулятора >>>");
        calc();
    }

    public static void calc(){
        Scanner in = new Scanner(System.in);
        out.println("Введите число x: ");
        try {
            x = in.nextDouble();
        } catch (InputMismatchException e) {
            err.println("Ошибка: введите число!");
            exit(0);
        }

        out.println("Введите действие: ");
        char z = in.next().charAt(0);
        out.println("Введите число y: ");
        try {
            y = in.nextDouble();
        }catch (InputMismatchException e) {
            err.println("Ошибка: введите число!");
            exit(0);
        }

        MathCalcul mathCalcul = new MathCalcul(x, y);
        Operations operations = null;

        switch (z) {
            case '+':
                out.println("Ответ: "+mathCalcul.plus(x,y));
                break;
            case '-':
                out.println("Ответ: "+mathCalcul.minus(x,y));
                break;
            case '*':
                out.println("Ответ: "+mathCalcul.multiply(x,y));
                break;
            case '/':
                out.println("Ответ: "+mathCalcul.divide(x,y));
                break;
            default: {
                out.println("Ошибка");
                exit(0);
            }
        }
    }
}

