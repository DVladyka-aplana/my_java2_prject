/**
 * Created for java 2.0 , Ex: 6
 * @author Vladyka
 */
package Ex_6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/*Задание №6:
Есть входной файл с набором слов, написанных через пробел
Необходимо:
- Прочитать слова из файла.
- Отсортировать в алфавитном порядке.
- Посчитать сколько раз каждое слово встречается в файле. Вывести статистику на консоль
- Найти слово с максимальным количеством повторений. Вывести на консоль это слово и сколько раз оно встречается в файле*/

public class InputFile {
    static ArrayList<String> MyArrayList = new ArrayList<>();
    /**
     *
     * @param args input .txt file
     * @throws IOException if file not found
     */
    public static void main(String[] args) throws IOException {
        readFile();
        sortTxt();
        maxLenWord();
    }
    /**
     *
     * @throws IOException if file not found
     */
    public static void readFile() throws IOException {
        FileInputStream stream = new FileInputStream("src/main/java/Ex_6/textFile.txt");
        int lenght = stream.available();
        byte [] data = new byte[lenght];
        stream.read(data);
        String text = new String(data);
        String [] myArr = text.split(" ");
        for (String words:myArr) {
            MyArrayList.add(words);
        }
        System.out.println("<<<Прочитать слова из файла>>>");
        System.out.println(MyArrayList);
        System.out.println("-----------------------------------------------------------------");
    }

    public static void sortTxt(){
        System.out.println("<<<Отсортировать в алфавитном порядке>>>");
        Collections.sort(MyArrayList);
        System.out.println(MyArrayList);
        System.out.println("-----------------------------------------------------------------");
    }

    public static void maxLenWord(){
        Set<String> noDubl = new HashSet<String>(MyArrayList);
        ArrayList<String> MyArrayList1 = new ArrayList<>(noDubl);
        int kol=0;
        int maxI=0;
        int kolMaxI=0;
        System.out.println("<<<Сколько раз каждое слово встречается в файле>>>");
        for (int i=0; i<MyArrayList1.size(); i=i+1){
            String oneWord = MyArrayList1.get(i);
            kol=0;
            for (int j=0; j<MyArrayList.size(); j=j+1){
                String dubWord = MyArrayList.get(j);
                if(oneWord.equals(dubWord)){
                    kol=kol+1;
                }
            }
            if (kolMaxI<kol){
                maxI = i;
                kolMaxI = kol;
            }
            System.out.println(oneWord + " - " + kol);
        }
        System.out.println("-----------------------------------------------------------------");
        System.out.println("<<<Слово с максимальным количеством повторений>>>");
        System.out.println(MyArrayList1.get(maxI) + " - "+ kolMaxI);
        System.out.println("-----------------------------------------------------------------");
    }
}
