/**
 * Created for java 2.0 , Ex: 3
 * @author Vladyka
 */
package Ex_3;
import java.util.Scanner;
/*Задание №3
1. Реализовать базовые операции калькулятора (+,-,/,*) для предыдущего задания
2. Поиск максимального элемента в массиве. Для начала задать массив слов.Размерность массива произвольна, задается в консоли. После чего в консоли вводятся слова в количестве равном заданной длине массива. В полученном массиве необходимо найти самое длинное слово. Результат вывести на консоль
3. Программа должна выполнять одно из заданий на выбор. Если в консоли ввести 1 - запуститься выполнение калькулятора, если 2 - поиск максимального слова в массиве.*/
public class CalcMass {

    public static void main(String[] args) {
        System.out.println("<<< Введите номер приложения и Enter для запуска (1-калькулятор, 2-массив слов) >>>");
        Scanner in = new Scanner(System.in);
        int pril = in.nextInt();
        if (pril==1) {
            calc();
        }
        else if (pril==2){
            masiv();
        }
        else {
            System.out.println("Ошибка");
        }
    }

    public static void calc(){
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

    public static void masiv(){
        System.out.println("<Введите размер массива (количество слов): ");
        Scanner in = new Scanner(System.in);
        int kolsl = in.nextInt();
        if (kolsl <= 0) {
            System.out.println("<<<Недопустимый размер массива!>>>");
        } else {
            String[] myArray = new String[kolsl];
            int maxLen = 0;
            int numSl = 0;
            System.out.println("<<<Ввод данных>>>");
            for (int i = 0; i < myArray.length; i++) {
                System.out.println("<Введите " + (i + 1) + "-й элемент массива: ");
                String slovo = in.next();
                myArray[i] = slovo;
                int len = slovo.length();
                if (len > maxLen) {
                    maxLen = len;
                    numSl = i;
                }
            }
            System.out.println("<Максимальный элемент массива (самое длинное слово):");
            System.out.println(myArray[numSl]);
        }
    }
}

