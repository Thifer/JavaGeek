package Home5;

import java.util.*;


//Пусть дан список сотрудников: Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина,
// Анна Крутова, Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова,
// Марина Светлова, Мария Савина, Мария Рыкова, Марина Лугова, Анна Владимирова,
// Иван Мечников, Петр Петин, Иван Ежов.
// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
// Отсортировать по убыванию популярности. Для сортировки использовать TreeMap.
public class Task2 {
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();
        fillList(nameList);
        printduplicate(nameList);
    }

    static void fillList(List<String> list){
        list.add("Иван Иванов");
        list.add("Светлана Петрова");
        list.add("Кристина Белова");
        list.add("Анна Мусина");
        list.add("Марина Светлова");
        list.add("Мария Савина");
        list.add("Мария Рыкова");
        list.add("Марина Лугова");
        list.add("Анна Владимирова");
        list.add("Иван Мечников");
        list.add("Петр Петин");
        list.add("Иван Ежов");
    }
    static void printduplicate(List<String> list){
        TreeMap<Integer,List<String>> treeMap = new TreeMap<>(Comparator.reverseOrder());
        String name;
        String nametocompare;
        int count;
        for (int i = 0; i < list.size(); i++) {
            count = 1;
            name = list.get(i).split(" ")[0];
            for (int j = i+1; j <list.size(); j++) {
                nametocompare = list.get(j).split(" ")[0];
                if(Objects.equals(name, nametocompare)){
                    count++;
                    list.remove(j);
                    j--;
                }
            }
            if(treeMap.containsKey(count)){
                treeMap.get(count).add(name);
            }else {
                List<String> addlist = new ArrayList<>();
                addlist.add(name);
                treeMap.put(count,addlist);
            }
        }
        System.out.println(treeMap);
    }
}
