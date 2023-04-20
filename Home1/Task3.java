package Home1;

import java.util.Scanner;

//+Задано уравнение вида q + w = e, q, w, e >= 0.
// Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69.
// Требуется восстановить выражение до верного равенства.
// Предложить хотя бы одно решение или сообщить, что его нет.
public class Task3 {

    public static void calc(String q,String w,int e){
        int firstmark = (q.length())-(q.indexOf("?")+1);
        int secondmark = (w.length())-(w.indexOf("?")+1);
        q=q.replace("?","0");
        w=w.replace("?","0");
        int qI = Integer.parseInt(q);
        int wI = Integer.parseInt(w);
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                int first = (int) (qI + (Math.pow(10,firstmark)) *i);
                int second = (int) (wI + (Math.pow(10,secondmark)) *j);
                if (first+second==e)
                    System.out.println(first + "+" + second + "=" + e);
            }
        }
    }
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Задано уравнение вида q + w = e, q, w, e >= 0");
        System.out.println("Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69");
        System.out.println("Введите q");
        String q = myScanner.next();
        System.out.println("Введите w");
        String w = myScanner.next();
        System.out.println("Введите e");
        int e = myScanner.nextInt();
        calc(q,w,e);

    }
}
