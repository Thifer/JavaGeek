package Sem1;
/*ask_3
В первый день спортсмен пробежал x километров, а затем он каждый день увеличивал пробег на 10% от
предыдущего значения. По данному числу y определите номер дня, на который пробег спортсмена составит
не менее y километров.
Входные данные
Программа получает на вход действительные числа x и y

Выходные данные
Программа должна вывести одно натуральное число.

Sample Input:

10
20
Sample Output:

9*/


import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Введите начальную дистанцию");
        float x = myScanner.nextInt();
        System.out.println("Введите конечную дистанцию");
        int y = myScanner.nextInt();
        result(x,y);

    }

    static void result(float x,int y){
        int count = 1;
        while (x<y){
            x*=1.1;
            count++;
        }
        System.out.println(count);
    }

}
