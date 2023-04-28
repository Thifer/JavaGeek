package Home3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//Пусть дан произвольный список целых чисел, удалить из него четные числа
public class Task1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        fillList(list, 10);
        System.out.println(list);
        removeeven(list);
        System.out.println(list);
    }

    static void removeeven(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
                i--;
            }
        }
    }

    static void fillList(List<Integer> list, int count) {
        Random rnd = new Random();
        for (int i = 0; i < count; i++) {
            list.add(rnd.nextInt(100));
        }
    }
}
