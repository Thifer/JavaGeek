package Home1;

import java.util.HashMap;
import java.util.Scanner;

//Дан список. Выведите те его элементы, которые встречаются в списке только один раз.
//Элементы нужно выводить в том порядке, в котором они встречаются в списке.
//Входные данные
//Вводится список чисел. Все числа списка находятся на одной строке.
//Выходные данные
//Выведите ответ на задачу.
//Sample Input:
//6
//1
//2
//2
//3
//3
//3
//Sample Output:
//1
public class Task5 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String input = myScanner.nextLine();
        String[] array = input.split(" ");
        HashMap<String,Integer> map = new HashMap<>();
        for (String s : array) {
            if (map.containsKey(s)) {
                int newValue = map.get(s) + 1;
                map.put(s, newValue);
            } else {
                map.put(s, 1);
            }
        }
        for (var entry:map.entrySet()) {
            if(entry.getValue()==1) System.out.println(entry.getKey());
        }

    }
}
