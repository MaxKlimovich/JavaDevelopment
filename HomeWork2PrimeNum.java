public class HomeWork2PrimeNum {
    /**
     * Вывести все простые числа от 1 до 1000
     */
    public static void main(String[] args) {
        Num myNum = new Num();
        myNum.Number();
    }
}
class Num {
    void Number() {
        int size = 1000;
        for (int i = 1; i <= size; i++) {
            int count = 0;
            for (int j = 1; j < i + 1; j++) {
                if (i % j == 0) count++;
            }
            if (count == 2) {
                System.out.println(i);
            }
        }
    }
}

