import java.util.Scanner;
import java.util.Arrays;

public class Lab7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        task1(); // Сумма отрицательных A[20]
        task2(); // Сумма положительных B[15]
        task3(); // Произведение отрицательных A[12]
        task4(); // Произведение положительных C[25]
        task5(); // Среднее арифметическое D[17]
        task6(); // Сумма отр. по строкам A[10][10] -> B[10]
        task7(); // Сумма пол. по строкам B[5][5] -> A[5]
        task8(); // Произведение отр. по столбцам A[12][6]
        task9(); // Произведение пол. элементов главной диагонали C[5][5]
        task10(); // Среднее диагонали D[7][7]
        task11(); // Swap min/max A[25]
        task12(); // Сортировка по возрастанию B[25]
        task13(); // Среднее значение C[20]
        task14(); // Сумма четных и нечетных D[30]
        task15(); // Таблица 3x5 случайных чисел (<10)
        task16(); // Метод maxX() (максимальный элемент)
        task17(sc); // Операции со строками s1-s5

        sc.close();
    }

    // 1. Сумма отрицательных элементов массива A[20] (целые числа) [cite: 100]
    private static void task1() {
        System.out.println("--- Задача 1 ---");
        int[] a = new int[20];
        int sum = 0;
        for (int i = 0; i < 20; i++) {
            a[i] = (int) (Math.random() * 200 - 100);
            if (a[i] < 0) sum += a[i];
        }
        System.out.println("Сумма отрицательных: " + sum);
    }

    // 2. Сумма положительных элементов массива B[15] [cite: 101]
    static void task2() {
        System.out.println("--- Задача 2 ---");
        int[] b = new int[15];
        int sum = 0;
        for (int i = 0; i < 15; i++) {
            b[i] = (int) (Math.random() * 100 - 50);
            if (b[i] > 0) sum += b[i];
        }
        System.out.println("Сумма положительных: " + sum);
    }

    // 3. Произведение отрицательных элементов массива A[12] (вещественные) [cite: 102]
    static void task3() {
        System.out.println("--- Задача 3 ---");
        double[] a = new double[12];
        double mult = 1.0;
        boolean hasNegative = false;
        for (int i = 0; i < 12; i++) {
            a[i] = Math.random() * 20 - 10;
            if (a[i] < 0) {
                mult *= a[i];
                hasNegative = true;
            }
        }
        System.out.println("Произведение отрицательных: " + (hasNegative ? mult : 0));
    }

    // 4. Произведение положительных элементов массива C[25] [cite: 103]
    static void task4() {
        System.out.println("--- Задача 4 ---");
        int[] c = new int[25];
        long mult = 1;
        for (int i = 0; i < 25; i++) {
            c[i] = (int) (Math.random() * 10);
            if (c[i] > 0) mult *= c[i];
        }
        System.out.println("Произведение положительных: " + mult);
    }

    // 5. Среднее арифметическое элементов массива D[17] [cite: 104]
    static void task5() {
        System.out.println("--- Задача 5 ---");
        int[] d = new int[17];
        double sum = 0;
        for (int i = 0; i < 17; i++) {
            d[i] = (int) (Math.random() * 100);
            sum += d[i];
        }
        System.out.println("Среднее арифметическое: " + (sum / 17));
    }

    // 6. Сумма отрицательных по строкам A[10][10] -> B[10] [cite: 105]
    static void task6() {
        System.out.println("--- Задача 6 ---");
        int[][] a = new int[10][10];
        int[] b = new int[10];
        for (int i = 0; i < 10; i++) {
            int rowSum = 0;
            for (int j = 0; j < 10; j++) {
                a[i][j] = (int) (Math.random() * 20 - 10);
                if (a[i][j] < 0) rowSum += a[i][j];
            }
            b[i] = rowSum;
        }
        System.out.println("Массив сумм B: " + Arrays.toString(b));
    }

    // 7. Сумма положительных по строкам B[5][5] -> A[5] [cite: 106]
    static void task7() {
        System.out.println("--- Задача 7 ---");
        int[][] b = new int[5][5];
        int[] a = new int[5];
        for (int i = 0; i < 5; i++) {
            int rowSum = 0;
            for (int j = 0; j < 5; j++) {
                b[i][j] = (int) (Math.random() * 20 - 5);
                if (b[i][j] > 0) rowSum += b[i][j];
            }
            a[i] = rowSum;
        }
        System.out.println("Массив сумм A: " + Arrays.toString(a));
    }

    // 8. Произведение отрицательных по столбцам A[12][6] [cite: 107]
    static void task8() {
        System.out.println("--- Задача 8 ---");
        int[][] a = new int[12][6];
        for (int j = 0; j < 6; j++) {
            long colMult = 1;
            boolean found = false;
            for (int i = 0; i < 12; i++) {
                a[i][j] = (int) (Math.random() * 10 - 5);
                if (a[i][j] < 0) {
                    colMult *= a[i][j];
                    found = true;
                }
            }
            System.out.println("Столбец " + j + " произведение отр: " + (found ? colMult : 0));
        }
    }

    // 9. Произведение положительных главной диагонали C[5][5] [cite: 108]
    static void task9() {
        System.out.println("--- Задача 9 ---");
        int[][] c = new int[5][5];
        long mult = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                c[i][j] = (int) (Math.random() * 10);
            }
            if (c[i][i] > 0) mult *= c[i][i];
        }
        System.out.println("Произведение главной диагонали: " + mult);
    }

    // 10. Среднее арифметическое главной диагонали D[7][7] [cite: 109]
    static void task10() {
        System.out.println("--- Задача 10 ---");
        double[][] d = new double[7][7];
        double sum = 0;
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                d[i][j] = Math.random() * 10;
            }
            sum += d[i][i];
        }
        System.out.println("Среднее диагонали: " + (sum / 7));
    }

    // 11. Поменять местами max и min в A[25] [cite: 110]
    static void task11() {
        System.out.println("--- Задача 11 ---");
        int[] a = new int[25];
        int minIdx = 0, maxIdx = 0;
        for (int i = 0; i < 25; i++) {
            a[i] = (int) (Math.random() * 100);
            if (a[i] < a[minIdx]) minIdx = i;
            if (a[i] > a[maxIdx]) maxIdx = i;
        }
        int temp = a[minIdx];
        a[minIdx] = a[maxIdx];
        a[maxIdx] = temp;
        System.out.println("Min и Max изменены.");
    }

    // 12. Сортировка B[25] по возрастанию [cite: 111]
    static void task12() {
        System.out.println("--- Задача 12 ---");
        int[] b = new int[25];
        for (int i = 0; i < 25; i++) b[i] = (int) (Math.random() * 100);
        Arrays.sort(b);
        System.out.println("Отсортированный массив: " + Arrays.toString(b));
    }

    // 13. Среднее значение C[20] [cite: 112]
    static void task13() {
        System.out.println("--- Задача 13 ---");
        int[] c = new int[20];
        double sum = 0;
        for (int i = 0; i < 20; i++) {
            c[i] = (int) (Math.random() * 100);
            sum += c[i];
        }
        System.out.println("Среднее: " + (sum / 20));
    }

    // 14. Сумма четных и нечетных элементов D[30] [cite: 113]
    static void task14() {
        System.out.println("--- Задача 14 ---");
        int[] d = new int[30];
        int sumEven = 0, sumOdd = 0;
        for (int i = 0; i < 30; i++) {
            d[i] = (int) (Math.random() * 100);
            if (d[i] % 2 == 0) sumEven += d[i];
            else sumOdd += d[i];
        }
        System.out.println("Сумма четных: " + sumEven + ", нечетных: " + sumOdd);
    }

    // 15. Таблица 3x5 случайных чисел (<10) [cite: 114]
    static void task15() {
        System.out.println("--- Задача 15 ---");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print((int)(Math.random() * 10) + " ");
            }
            System.out.println();
        }
    }

    // 16. Вывод максимального элемента (метод maxX()) [cite: 115]
    static void task16() {
        System.out.println("--- Задача 16 ---");
        System.out.println("Максимальный элемент: " + maxX());
    }

    public static short maxX() {
        short[] array = new short[10];
        for (int i = 0; i < 10; i++) array[i] = (short)(Math.random() * 50);
        short max = array[0];
        for (short val : array) if (val > max) max = val;
        return max;
    }

    // 17. Операции со строками
    static void task17(Scanner sc) {
        System.out.println("--- Задача 17 ---");
        System.out.println("Введите 5 строк (s1, s2, s3, s4, s5):");
        String s1 = sc.next(), s2 = sc.next(), s3 = sc.next(), s4 = sc.next(), s5 = sc.next();
        if (s4.equals(s5)) {
            System.out.println("Результат: " + s1 + s2 + " или " + s1 + s3);
        } else {
            System.out.println("s4 не равно s5");
        }
    }
}