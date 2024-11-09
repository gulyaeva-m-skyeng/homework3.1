public class Main {
    public static void main(String[] args) {

        //task 1
        System.out.println("Task 1");

        int os = 1;
        if (os == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (os == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Неверное значение");
        }
//task 2
        System.out.println("Task 2");
        os = 0;
        int clientDeviceYear = 2015;
        if (os == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (os == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите обычную версию приложения для iOS по ссылке");
        } else if (os == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите обычную версию приложения для Android по ссылке");
        }

        //task 3
        System.out.println("Task 3");
        int year = 2029;
        if (year > 1584 && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)) {
            System.out.println(year + "год является високосным");
        } else {
            System.out.println(year + "год не является високосным");
        }

        //task 4
        System.out.println("Task 4");

        int deliveryDistance = 95;
        int days;

        if (deliveryDistance <= 20) {
            days = 1;
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            days = 2;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            days = 3;
        } else {
            days = -1;
        }
        if (days != -1) {
            System.out.println("Потребуется дней: " + days);
        } else {
            System.out.println("Доставки нет");
        }
    }
}
