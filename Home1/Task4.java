package Home1;

import java.util.Scanner;

//Task_6
//Вводится массив (сначала количество элементов, потом сами элементы).
//Найдите сумму его элементов с чётными индексами и выведите её.
//А потом выведите числа, которые суммировались.
//Sample Input:
//4
//1
//2
//3
//4
//Sample Output:
//4
//1
//3
public class Task4 {
    public static void main(String[] args) {
        int[] array;
        int sum = 0;
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Введите количество элементов массива");
        array = new int[myScanner.nextInt()];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Введите элемент массива");
            array[i] = myScanner.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            if (i%2==0){
                System.out.println(array[i]);
                sum+=array[i];
            }
        }
        System.out.println(sum);
    }
}
