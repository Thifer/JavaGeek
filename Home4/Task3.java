package Home4;

import java.util.Iterator;
import java.util.LinkedList;

//Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор
public class Task3 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(sum(list));
    }

    static Integer sum(LinkedList<Integer>list){
        int num = 0;
        Iterator<Integer> iter = list.iterator();
        while (iter.hasNext()){
            num+=iter.next();
        }
        return num;
    }
}
