package Home3;

import java.util.*;

//Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
//Вывести название каждой планеты и количество его повторений в списке.
public class Task3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        filllist(list,100);
        HashMap<String,Integer> map = new HashMap<>();
        for (String s : list) {
            if (map.containsKey(s)) {
                int newValue = map.get(s) + 1;
                map.put(s, newValue);
            } else {
                map.put(s, 1);
            }
        }
        System.out.println(map);
    }

    static void filllist(List<String> list,int count){
        Random rnd = new Random();
        for (int i = 0; i < count; i++) {
            switch (rnd.nextInt(9)+1){
                //Меркурий, Венера, Земля, Марс, Юпитер, Сатурн, Уран, Нептун, Плутон
                case 1:
                    list.add("Меркурий");
                    break;
                case 2:
                    list.add("Венера");
                    break;
                case 3:
                    list.add("Земля");
                    break;
                case 4:
                    list.add("Марс");
                    break;
                case 5:
                    list.add("Юпитер");
                    break;
                case 6:
                    list.add("Сатурн");
                    break;
                case 7:
                    list.add("Уран");
                    break;
                case 8:
                    list.add("Нептун");
                    break;
                case 9:
                    list.add("Плутон");
                    break;
            }
        }
    }
}
