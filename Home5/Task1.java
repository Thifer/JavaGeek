package Home5;

import java.util.HashMap;

//Реализуйте структуру телефонной книги с помощью HashMap,
// учитывая, что 1 человек может иметь несколько телефонов.
// Нужны методы добавления новой записи в книгу и метод поиска записей в телефонной книге
public class Task1 {
    public static void main(String[] args) {
        HashMap<String,String> phonebook = new HashMap<>();
        addphone(phonebook,"+7-999-999-99-99","Name");
        addphone(phonebook,"+7-999-999-99-98","Name");
        phonesearch(phonebook,"+7-999-999-99-99");
        namesearch(phonebook,"Name");
    }
    //Не особо понял, зачем этот медот просят
    static void addphone(HashMap<String,String> phonebook,String phone,String name){
        phonebook.put(phone,name);
    }
    static void phonesearch(HashMap<String,String> hashMap,String phone){
        System.out.println(hashMap.get(phone));
    }
    static void namesearch(HashMap<String,String> hashMap,String name){
        hashMap.forEach((key,value) -> {
            if(value.equals(name)){
                System.out.println(key);
            }
        });
    }
}
