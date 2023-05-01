package Home4;
//Пусть дан LinkedList с несколькими элементами.
// Реализуйте метод, который вернет “перевернутый” список.
// Постараться не обращаться к листу по индексам.

import java.util.LinkedList;

public class Task1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }
        LinkedList<Integer> newlist = SwapList(list);
        System.out.println(list);
        System.out.println(newlist);
    }
    static LinkedList<Integer> SwapList(LinkedList<Integer> list){
        LinkedList<Integer> listtoswap = new LinkedList<>(list);
        LinkedList<Integer> swapedlist = new LinkedList<>();
        while (listtoswap.size()>0){
            swapedlist.add(listtoswap.getLast());
            listtoswap.removeLast();
        }
        return swapedlist;
    }
}
