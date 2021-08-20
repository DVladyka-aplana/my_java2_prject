/**
 * Created for java 2.0 , Ex: 5
 * @author Vladyka
 */
package Ex_5;
//Задание №5: Реализовать калькулятор в стиле ООП. Архитектуру приложения продумать самостоятельно.

import Ex_5.Operations.*;
import java.util.Scanner;

public class ApplicCalc {
    public static void main(String[] args) {
        System.out.println("<<< Запуск калькулятора >>>");
        calc();
    }

    public static void calc(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число x: ");
        double x = in.nextDouble();
        System.out.println("Введите действие: ");
        char z = in.next().charAt(0);
        System.out.println("Введите число y: ");
        double y = in.nextDouble();

        Plus plus = new Plus(x, y);
        Minus minus = new Minus(x, y);
        Multiply umn = new Multiply(x, y);
        Divide del = new Divide(x, y);
        Operations operations = null;

        switch (z) {
            case '+' -> operations = plus;
            case '-' -> operations = minus;
            case '*' -> operations = umn;
            case '/' -> operations = del;
            default -> {
                System.out.println("Ошибка");
                System.exit(0);
            }
        }
        System.out.println("Ответ: "+operations.operation(x,y));
    }
}

