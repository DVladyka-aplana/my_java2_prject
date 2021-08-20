/**
 * Created for java 2.0 , Ex: 4.2
 * @author Vladyka
 */
package Ex_4;
/*Задание №4
2. Формируется новогодний подарок. Он может включать в себя разные сладости (Candy, Jellybean, etc.) У каждой сладости есть название, вес, цена и свой уникальный параметр. Необходимо собрать подарок из сладостей. Найти общий вес подарка, общую стоимость подарка и вывести на консоль информацию о всех сладостях в подарке.*/
import java.util.*;
public class Ex4_2 {
    static Sweet sweetMars = new Sweet("Mars", 200, 500, "Шоколадные конфеты Марс");
    static Sweet sweetMaska = new Sweet("Маска", 100, 600, "Шоколадные конфеты Маска");
    static Sweet sweetDushes = new Sweet("Дюшес", 50, 450, "Леденцы Дюшес");
    static ArrayList<String> MyArrayList = new ArrayList<>();
    static double totalpr = 0;
    static double totalmass = 0;
    static boolean endchose = false;

    public static void main(String[] args) {
        System.out.println("<<<Формирование подарочного набора>>>");
        infoVvod();
        Scanner in = new Scanner(System.in);
        while (!endchose) {
            int x = in.nextInt();
            switch (x) {
                case 1:
                    addMars();
                    break;
                case 2:
                    addMaska();
                    break;
                case 3:
                    addDush();
                    break;
                case 4:
                    changeSweet();
                    infoVvod();
                    break;
                case 5:
                    endchose = true;
                    break;
            }
        }
        itogMass();
    }

    /**
     * @String Вывод на консоль начального текста
     */
    public static void infoVvod() {
        System.out.println("<Введите число и нажмите Enter, чтобы добавить сладость в подарок:");
        System.out.println("<'1' - \"Mars\"");
        System.out.println("<'2' - \"Маска\"");
        System.out.println("<'3' - \"Дюшес\"");
        System.out.println("<'4' - Задать вручную поля для имеющихся сладостей");
        System.out.println("<'5' - закончить выбор");
    }

    /**
     * Добавить конфеты Mars
     */
    public static void addMars() {
        MyArrayList.add(sweetMars.getName());
        totalpr = totalpr + sweetMars.getPrice();
        totalmass = totalmass + sweetMars.getWeight();
        System.out.println("Конфеты " + sweetMars.getName() + " - " + sweetMars.getInfo() + " добавлены в корзину: " + sweetMars.getPrice() + " руб." + sweetMars.getWeight() + " гр.");
    }

    /**
     * Добавить конфеты Маска
     */
    public static void addMaska() {
        MyArrayList.add(sweetMaska.getName());
        totalpr = totalpr + sweetMaska.getPrice();
        totalmass = totalmass + sweetMaska.getWeight();
        System.out.println("Конфеты " + sweetMaska.getName() + " - " + sweetMaska.getInfo() + " добавлены в корзину: " + sweetMaska.getPrice() + " руб." + sweetMaska.getWeight() + " гр.");
    }

    /**
     * Добавить конфеты Дюшес
     */
    public static void addDush() {
        MyArrayList.add(sweetDushes.getName());
        totalpr = totalpr + sweetDushes.getPrice();
        totalmass = totalmass + sweetDushes.getWeight();
        System.out.println("Конфеты " + sweetDushes.getName() + " - " + sweetDushes.getInfo() + " добавлены в корзину: " + sweetDushes.getPrice() + " руб." + sweetDushes.getWeight() + " гр.");
    }

    /**
     * Изменить параметры для конфет
     */
    public static void changeSweet() {
        System.out.println("<<<Задать параметры>>>");
        System.out.println("Введите номер сладости, для которой нужно изменить параметры: ");
        Scanner input = new Scanner(System.in);
        int numberChang = input.nextInt();
        System.out.println("Введите стоимость: ");
        int priceChange = input.nextInt();
        System.out.println("Введите массу: ");
        int massChange = input.nextInt();
        if (numberChang == 1) {
            sweetMars.setPrice(priceChange);
            sweetMars.setWeight(massChange);
            System.out.println("Конфеты " + sweetMars.getName() + " - " + sweetMars.getInfo() + "; новые параметры: " + sweetMars.getPrice() + " руб." + sweetMars.getWeight() + " гр.");
        } else if (numberChang == 2) {
            sweetMaska.setPrice(priceChange);
            sweetMaska.setWeight(massChange);
            System.out.println("Конфеты " + sweetMaska.getName() + " - " + sweetMaska.getInfo() + "; новые параметры: " + sweetMaska.getPrice() + " руб." + sweetMaska.getWeight() + " гр.");
        } else if (numberChang == 3) {
            sweetDushes.setPrice(priceChange);
            sweetDushes.setWeight(massChange);
            System.out.println("Конфеты " + sweetDushes.getName() + " - " + sweetDushes.getInfo() + "; новые параметры: " + sweetDushes.getPrice() + " руб." + sweetDushes.getWeight() + " гр.");
        }
    }

    /**
     * Подсчет и вывод итоговых значений
     */
    public static void itogMass() {
        int kolmars = 0;
        int kolmask = 0;
        int koldush = 0;
        for (int i = 0; i < MyArrayList.size(); i++) {
            String name = MyArrayList.get(i);
            if (name == "Mars") {
                kolmars = kolmars + 1;
            } else if (name == "Маска") {
                kolmask = kolmask + 1;
            } else if (name == "Дюшес") {
                koldush = koldush + 1;
            }
        }
        System.out.println("<<<Сформирован подарочный набор>>>");
        System.out.println("Конфеты Mars: " + kolmars + " шт.");
        System.out.println("Конфеты Маска: " + kolmask + " шт.");
        System.out.println("Конфеты Дюшес: " + koldush + " шт.");
        System.out.println(String.format("\nОбщий вес подарка: %s гр.\nОбщая цена подарка: %s руб.", totalmass, totalpr));
    }
}
