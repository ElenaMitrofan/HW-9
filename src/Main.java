public class Main {
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] spendings = new int[30];
        for (int i = 0; i < spendings.length; i++) {
            spendings[i] = random.nextInt(100_000) + 100_000;
        }
        return spendings;
    }
    public static void main(String[] args) {
        int[] spendings = generateRandomArray();

        System.out.println("Задание 1");
        //посчитать сумму всех выплат за месяц
        int sum = 0;
        for (int element: spendings) {
            sum += element;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        System.out.println();
        System.out.println("Задание 2");
        // найти минимальную и максимальную трату за день
        int maxSpending = 0;
        for (int i = 0; i < spendings.length; i++) {
            if (spendings [i] > maxSpending) {
                maxSpending = spendings [i];
            }
        }
        System.out.println("Максимальная сумма затрат " + maxSpending);
        int minSpending = 200001;
        for (int i = 0; i < spendings.length; i++) {
            if (spendings [i] < minSpending) {
                minSpending = spendings [i];
            }
        }
        System.out.println("Минимальная сумма затрат " + minSpending);
        System.out.println();
        System.out.println("Задание 3");
        //какую в среднем сумму компания тратила в течение данных 30 дней
        float mean = (float) sum / spendings.length;
        System.out.println("Средняя сумма трат за месяц составила " + mean + " рублей");
        System.out.println();
        System.out.println("Задание 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
            if (i != 0) {
            }
        }
        System.out.println();




    }
}