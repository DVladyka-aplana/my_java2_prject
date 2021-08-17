/**
 * Created for java 2.0 , Ex: 1-2
 * @author Vladyka
 */
package Ex_1_2;
/*Задание №2
1. Начинаем писать калькулятор:
Реализовать сложение дробных чисел, которые пользователь вводит в консоль. Использовать комментарии и JavaDoc при описании метода. Использовать форматирование при выводе результата в консоль. Полученный результат округлять до 4-х знаков после запятой.
2. Запушить проект в свой репозиторий на GitHub
*Добавить возможность выбора другой операции (сложение, вычитание, деление, умножение)*/
import java.util.Scanner;
public class Calc1 {
    public static void main(String[] args) {
        System.out.println("<<< Запуск калькулятора >>>");
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число x: ");
        double x = in.nextDouble();
        System.out.println("Введите действие: ");
        char z = in.next().charAt(0);
        System.out.println("Введите число y: ");
        double y = in.nextDouble();

        double result;
        switch (z) {
            case '+':
                result = calcSum(x,y);
                calcAnsw(x,y,z,result);
                break;
            case '-':
                result = calcMin(x,y);
                calcAnsw(x,y,z,result);
                break;
            case '*':
                result = calcUm(x,y);
                calcAnsw(x,y,z,result);
                break;
            case '/':
                result = calcDel(x,y);
                calcAnsw(x,y,z,result);
                break;
            default:
                System.out.println("Ошибка");
                System.exit(0);
        }
    }

    /**
     *
     * @param xval input x
     * @param yval input y
     * @return return double
     */
    public static double calcSum(double xval, double yval){
        double answ = xval+yval;
        return answ;
    }

    /**
     *
     * @param xval input x
     * @param yval input y
     * @return return double
     */
    public static double calcMin(double xval, double yval){
        double answ = xval-yval;
        return answ;
    }
    public static double calcUm(double xval, double yval){
        double answ = xval*yval;
        return answ;
    }
    public static double calcDel(double xval, double yval){
        double answ = xval/yval;
        return answ;
    }

    /**
     *
     * @param xval input x
     * @param yval input y
     * @param zn input char
     * @param result input result
     */
    public static void calcAnsw(double xval, double yval, char zn, double result){
        System.out.print(xval+" "+zn+" "+yval+" = ");
        System.out.printf("%.4f",result);
    }
}
