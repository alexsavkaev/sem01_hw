import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        // 1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
            int i = new Random().nextInt(2001);
        System.out.println("Выпавшее число: " + i);

        // 2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
        int n = Integer.highestOneBit(i);
        System.out.println("Номер старшего значащего бита: " + n);
        // 3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
        int m1Length = 0;  // Находим длину будущего массива m1
        for (int j = i; j < Short.MAX_VALUE; j++) {
            if (j%n == 0) m1Length++;
        }

        int[] m1 = new int[m1Length]; // Создаём массив и наполняем его числами, кратными n
        for (int j = i, k = 0; j < Short.MAX_VALUE && k < m1Length; j++) {
            if (j%n == 0) {
                m1[k] = j;
                k++;
            }
        }
        System.out.println("Длина массива m1: " + m1Length + " (Чисел, кратных n)");

        // 4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
        int m2Length = 0; // Аналогично с m1, находим длину будущего массива
        for (int j = i; j > Short.MIN_VALUE ; j--) {
            if (j%n != 0) m2Length++;
        }
        int[] m2 = new int[m2Length]; // Создаём массив и наполняем его числами не кратными n
        for (int j = i, k = 0; j > Short.MIN_VALUE && k < m2Length; j--) {
            if (j%n != 0){
                m2[k] = j;
                k++;
            }
        } System.out.println("Длина массива m2: " + m2Length + " (Чисел, не кратных n)");
//        System.out.println("m1 = " + Arrays.toString(m1)); // Печать для проверки массивов
//        System.out.println("m2 = " + Arrays.toString(m2));
    }


}
