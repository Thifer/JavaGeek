package Home4;
//Реализуйте очередь с помощью LinkedList со следующими методами: enqueue() - помещает элемент в конец очереди,
//dequeue() - возвращает первый элемент из очереди и удаляет его,
//first() - возвращает первый элемент из очереди, не удаляя.

import java.util.LinkedList;
public class Task2 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        enqueue(list,1);
        int num1 = first(list);
        int num = dequeue(list);
        System.out.println(num);
        System.out.println(num1);

    }
    static void enqueue(LinkedList<Integer> list,int num){
        list.addLast(num);
    }
    static Integer dequeue(LinkedList<Integer> list){
        return list.pollFirst();
    }

    static Integer first(LinkedList<Integer>list){
        return list.getFirst();
    }
}
