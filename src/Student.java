public class Student {
    public static void main(String[] args) {
        String[] names = {"加藤さん", "中橋さん", "岡本さん"};
        int index = 2;
        try{
            if (index < 0 || 3 < index) {
                throw new ArrayIndexOutOfBoundsException();
            }
            System.out.println(names[index]);
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("配列の範囲を超えています。");
        }
    }
}
