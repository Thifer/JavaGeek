package Home2;
// Посчитайте сколько драгоценных камней в куче обычных камней
// Пример:
// jewels = “aB”, stones = “aaaAbbbB”
// Результат в консоль ”a3B1”
public class Task1 {
    public static void main(String[] args) {
        String jewels = "aB";
        String stones = "aaaAbbbB";
        System.out.println(findJewelsInStones(jewels,stones));
    }

    public static String findJewelsInStones(String jewels, String stones) {
        int[] arr = new int[jewels.length()];
        for (int i = 0; i < jewels.length() ; i++) {
            for (int j = 0; j < stones.length(); j++) {
                if(jewels.charAt(i)==stones.charAt(j))
                    arr[i]++;
            }
        }
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < jewels.length(); i++) {
            ans.append(jewels.charAt(i));
            ans.append(arr[i]);
        }
        return ans.toString();
    }
}
