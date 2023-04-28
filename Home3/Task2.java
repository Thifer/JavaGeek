package Home3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Задан целочисленный список ArrayList.
// Найти минимальное, максимальное и среднее арифметическое из этого списка.
// Collections.max()
public class Task2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Task1.fillList(list,10);
        System.out.println(list);
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
        double res = 0;
        for(int m:list){
            res+=m;
        }
        System.out.println(res/list.size());

    }
}
