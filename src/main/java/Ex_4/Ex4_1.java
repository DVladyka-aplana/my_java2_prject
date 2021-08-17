/**
 * Created for java 2.0 , Ex: 4.1
 * @author Vladyka
 */
package Ex_4;
import java.util.Arrays;
import java.util.Random;
/*Задание №4
1. Массив размерностью 20, заполняется случайными целыми числами от -10 до 10. Найти максимальный отрицательный и минимальный положительный элементы массива. Поменять их местами.*/

public class Ex4_1 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] myArray = new int[20];
        int maxNumber = 10;
        int minNumber = -10;
        int imax = 0;
        int imin = 0;
        for (int i = 0; i < 20; i++) {
            int x = (int) (Math.random() * 20 - 10);
            myArray[i] = x;
            if (maxNumber >= myArray[i] & 0<myArray[i]) {
                maxNumber = myArray[i];
                imax = i;
            }
            if (minNumber <= myArray[i] & 0>myArray[i]) {
                minNumber = myArray[i];
                imin = i;
            }
        }
        System.out.println("<<<Сформирован произвольный массив>>>");
        System.out.println(Arrays.toString(myArray));
        System.out.println("<Минимальный положительный элемент массива: " + maxNumber);
        System.out.println("<Максимальный отрицательный элемент массива: " + minNumber);
        myArray[imax] = minNumber;
        myArray[imin] = maxNumber;
        System.out.println("<<<Поменять элементы местами в массиве>>>");
        System.out.println(Arrays.toString(myArray));
    }
}

