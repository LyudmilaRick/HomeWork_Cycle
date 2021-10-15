public class Main {

    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        int i = 1;
        // use while as a cycle
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.print("\n");
        // use for as a cycle
        i = 10;
        for (; i >= 1; --i) {
            System.out.print(i + " ");
        }
        System.out.print("\n");
        // Задача 2
        System.out.println("Задача 2");
        int firstFriday = 1; // first this month friday
        int lastMonthDay = 31;
        for (i = firstFriday; i <= lastMonthDay; i = i + 7) {
            System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет!");
        }
        // Задача 3
        System.out.println("Задача 3");
        int currentYear = 2021;
        int calcFromYear = currentYear - 200;
        int calcToYear = currentYear + 100;
        int periodMeeting = 79;
        for (; calcFromYear <= calcToYear; ++calcFromYear) {
            if (calcFromYear % periodMeeting == 0) {
                // we have found the first year of meeting
                break;
            }
        }
        for (i = calcFromYear; i <= calcToYear; i = i + periodMeeting) {
            System.out.println("Год встречи с кометой, " + i);
        }
        // Задача 4
        System.out.println("Задача 4");
        for (i = 1; i <= 30; ++i) {
            System.out.print(i + ": ");
            if (i % 3 == 0) {
                System.out.print("ping ");
            }
            if (i % 5 == 0) {
                System.out.print("pong");
            }
            System.out.print("\n");
        }
        // Задача 5
        System.out.println("Задача 5");
        System.out.println("Первые 10 чисел последовательности Фибоначчи");
        int firstFibonacciNumber = 0;
        int nextFibonacciNumber = 1;
        int sumFibonacciNumber;
        for (i = 1; i <= 10; ++i) {

            System.out.print(firstFibonacciNumber  + " ");
            sumFibonacciNumber = firstFibonacciNumber + nextFibonacciNumber;
            firstFibonacciNumber = nextFibonacciNumber;
            nextFibonacciNumber  = sumFibonacciNumber;
                }
    }
}