/**
 * Java. Level 1. Lesson 2. Homework
 *
 * @author Philipp Vlasov
 * @version dated Sept 16, 2018
 */
class HomeWork2 {

    public static void main(String[] args) {
        /* Task 1
        Задать целочисленный массив, состоящий из элементов 0 и 1.
        Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
        С помощью цикла и условия заменить 0 на 1, 1 на 0;
         */
        // Задаем массив
        int[] a = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        // Обрабатываем
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) a[i] = 0;
            else a[i] = 1;
        }
        //Выводим и проверяем
        System.out.println("Проверка задачи 1");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        /* Task 2
        Задать пустой целочисленный массив размером 8.
        С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
         */
        // Задаем массив
        int[] b = new int[8];
        // Обрабатываем
        for (int i = 0; i < b.length; i++) {
            b[i] = i * 3;

        }
        //Выводим и проверяем
        System.out.println("Проверка задачи 2");
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
        /* Task 3
        Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
        пройти по нему циклом, и числа меньшие 6 умножить на 2;
         */
        // Задаем массив
        int[] x = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        // Обрабатываем
        for (int i = 0; i < x.length; i++) {
            if (x[i] < 6) x[i] = x[i] * 2;
        }
        //Выводим и проверяем
        System.out.println("Проверка задачи 3");
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
         /* Task 4
         Создать квадратный двумерный целочисленный массив
         (количество строк и столбцов одинаковое), и с помощью цикла(-ов)
         заполнить его диагональные элементы единицами;
         */
        // Задаем массив
        int[][] y = new int[4][4];
        // Обрабатываем
        for (int i = 0; i < y.length; i++) {
            for (int j = 0; j < y.length; j++) {
                if (i == j || j == y.length - 1 - i) y[i][j] = 1;
                else y[i][j] = 0;
            }
        }
        System.out.println("Проверка задачи 4");
        for (int i = 0; i < y.length; i++) {
            for (int j = 0; j < y.length; j++) {
                System.out.println(y[i][j]);
            }
        }

         /*  Task 5
         Задать одномерный массив и найти в нем
         минимальный и максимальный элементы (без помощи интернета)
         */
        // Задаем массив
        int[] z = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        // Обрабатываем
        int l = 0;
        for (int i = 1; i < z.length; i++) {
            if (z[i] > z[l]) l = i;
        }
        System.out.println("Проверка задачи 5");
        System.out.println(z[l]);
        System.out.println("Вывод 6");
        //Task 6 вызов метода cheakBalance
        System.out.println(cheakBalance(new int[]{1, 1, 1, 2, 1}));
        System.out.println(cheakBalance(new int[]{2, 1, 1, 2, 1}));
        System.out.println(cheakBalance(new int[]{10, 10}));
        //Task 7 вызов метода cheakBalance
    }
    /*Task 6
    Написать метод, в который передается не пустой одномерный
    целочисленный массив, метод должен вернуть true если в массиве
    есть место, в котором сумма левой и правой части массива равны.
     Примеры: checkBalance([1, 1, 1, || 2, 1]) → true,
     checkBalance ([2, 1, 1, 2, 1]) → false,
     checkBalance ([10, || 10]) → true,
     граница показана символами ||, эти символы в массив не входят.
     */
    public static boolean cheakBalance(int arr[]) {
        int s1 = 0, s2 = 0;
        for (int i = 0; i < arr.length-1; i++) {
            s1 = 0; s2 = 0; int j = i;
            while ( j >= 0){
                s1 = arr[j] + s1;
                j--;
            }
            j = i+1;
            while ( j < arr.length) {
                s2 = arr[j] + s2;
                j++;
            }
            if (s1 == s2) {
                break;
            }
        }
        return s1 == s2;
    }
}