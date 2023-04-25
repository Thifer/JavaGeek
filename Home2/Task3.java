package Home2;

import java.util.Scanner;

//На первой строке записывается натуральное число n - количество строчек в книге.
//Затем вводится n строк - строки книги.
//потом вводится натуральное число m - количество продуктов, на которые у человека аллергия.
//Потом вводится m строк - вида "продукт1 - продукт2",
//где продукт1 - продукт, на который у человека аллергия и продукт2 - продукт,
//на который следует заменить продукт1. Гарантируется что любой продукт состоит из 1 слова.
//название продуктов написаны строчными буквами. Гарантируется, что продукты, на которые нужно выполнить замену,
//не встречаются изначально в тексте.
//
//Выходные данные
//Замените все продукты в поваренной книге Васи и выведите их построчно на экран. На окончания не обращайте внимание. ВАЖНО!!! Если продукт, который следует заменить написан с большой буквы, то и замена тоже должна начинаться с большой буквы!
//
//Sample Input:
//
//2
//Рецепт 1. Арахис 100гр, мороженое 200гр. Возьмите арахис и измелчите его. Посыпьте измельчённый арахис на мороженое.
//Рецепт 2. Клубника 100гр, сгущенка 3кг. Смешать, есть) Радоваться жизни.
//3
//арахис - колбаса
//клубника - вишня
//сгущенка - молоко
//Sample Output:
//
//Рецепт 1. Колбаса 100гр, мороженое 200гр. Возьмите колбаса и измелчите его. Посыпьте измельчённый колбаса на мороженое.
//Рецепт 2. Вишня 100гр, молоко 3кг. Смешать, есть) Радоваться жизни.
public class Task3 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Введите число строк");
        int n = myScanner.nextInt();
        System.out.println("Введите число аллергенов");
        int m = myScanner.nextInt();
        String[] book = new String[n];
        String[] AllergenPair = new String[m];
        myScanner.nextLine();
        for (int i = 0; i < book.length; i++) {
            System.out.println("Введите рецепт");
            //book[i] = myScanner.nextLine();
        }
        System.out.println("Введите аллергены и их заменители через  - ");
        for (int i = 0; i < AllergenPair.length; i++) {
            AllergenPair[i] = myScanner.nextLine();
        }
        replacer(book,AllergenPair);
    }

    public static void replacer(String[] book,String[] allergen){
        for (String s : allergen) {
            String source = s.split(" - ")[0];
            String target = s.split(" - ")[1];
            for (int j = 0; j < book.length; j++) {
                book[j] = book[j].toLowerCase().replace(source, target);
            }
        }
        for (String s : book) {
            System.out.println(s);

        }
    }
}
