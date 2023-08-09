import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задача 1");
        checkLeapYear(scanYear());
        printSeparator();
    }

    public static int scanYear() {
        System.out.println("Введите год: ");
        Scanner scannerForYear = new Scanner(System.in);
        int scannedYear = scannerForYear.nextInt();
        return scannedYear;
    }

    public static void checkLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void printSeparator() {
        System.out.println("============================================================================");
    }

    public static void task2() {
        System.out.println("Задача 2");
        int clientOS = scanTypeOS();
        int clientDeviceYear = scanYearOfRelease();
        displayMessageForInstallation(clientOS, clientDeviceYear);
        printSeparator();
    }

    public static int scanTypeOS() {
        System.out.println("Введите тип Вашей операционной системы: 0 — iOS, 1 — Android ");
        Scanner scannerForTypeOS = new Scanner(System.in);
        int typeOfOperationSystem = scannerForTypeOS.nextInt();
        return typeOfOperationSystem;
    }

    public static int scanYearOfRelease() {
        System.out.println("Введите год выпуска Вашего устройства");
        Scanner scannerForYear = new Scanner(System.in);
        int yearOfRelease = scannerForYear.nextInt();
        return yearOfRelease;
    }

    public static void displayMessageForInstallation(int typeOS, int year) {
        int yearOfRelease2015 = 2015;
        if (typeOS == 0 && year < yearOfRelease2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (typeOS == 1 && year < yearOfRelease2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (typeOS == 0 && year >= yearOfRelease2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (typeOS == 1 && year >= yearOfRelease2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        printNumberOfDeliveryDays(scanDeliveryDistance());
        printSeparator();
    }

    public static int scanDeliveryDistance() {
        System.out.println("Введите расстояние от офиса до адреса доставки в км ");
        Scanner scannerForDistance = new Scanner(System.in);
        int deliveryDistance = scannerForDistance.nextInt();
        return deliveryDistance;
    }

    public static void printNumberOfDeliveryDays(int deliveryDistance) {
        int daysOfDelivery = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + daysOfDelivery);
        } else if (deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + (daysOfDelivery + 1));
        } else if (deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + (daysOfDelivery + 2));
        } else {
            System.out.println("Доставка невозможна");
        }
    }
}