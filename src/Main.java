public class Main {
    public static void main(String[] args) {

        // Задание 1

        HightYear years = new HightYear();
        years.year = 2008;
        years.Hyear();

    }

    public static void main1(String[] args) {

    }
}

class HightYear {
    int year;


    void Hyear() {
        if (year % 100 == 0 && year % 400 == 0) {
            System.out.println("год является високосным».");
        } else if (year % 4 == 0 || year % 400 == 0) {
            System.out.println("год является високосным».");
        } else {
            System.out.println("год не является високосным».");
        }

    }
}

// Задание 2
class Phone {
    public static void main(String[] args) {
        Os os = new Os();
        os.clientOS = 0;
        os.Android = 1;
        os.clientDeviceYear = 2018;
        os.phoneOs();

    }
}

class Os {
    int clientOS;
    int Android;
    int clientDeviceYear;

    void phoneOs() {

        if (clientOS == 0) {
            System.out.println("«Установите версию приложения для iOS по ссылке».");
        }

        if (Android == 1) {
            System.out.println("«Установите версию приложения для Android по ссылке».");
        }


        if (clientDeviceYear < 2015) {
            System.out.println("«Установите облегченную версию приложения для iOS по ссылке».");
        }
        if (clientDeviceYear > 2015) {
            System.out.println("Установите обычную версию приложения для iOS по ссылке");
        }

    }
}

// Задание 3
class Bank {
    public static void main(String[] args) {
        Distance delivery = new Distance();
        delivery.deliveryDistance = 95;
        delivery.DistBank();
    }
}

class Distance {
    int deliveryDistance;

    void DistBank() {
        if (deliveryDistance > 0 && deliveryDistance < 21) {
            System.out.println("Потребуется один день");
        } else if (deliveryDistance > 20 && deliveryDistance < 61) {
            System.out.println("Потребуется двое суток");
        } else {
            System.out.println("Потребуется трое суток");

        }
    }
}

class Find {
    public static void findingDuplicates(String a) { // метод который на вход принимает String a (строку с дублями)
        char[] letters = a.toCharArray(); // переводим строку в массив букв
        for (int i = 0; i < letters.length - 1; i++) { // проходим по массиву через цикл for
            if (letters[i] == letters[i + 1]) { // если символ текущий letters[i] совпадает со следующим letters[i + 1]
                System.out.println("Дублируется символ " + letters[i]); // символ дублируется
                return; // выходим из цикла
            }
        }
        System.out.println("Дублей нет!"); // в остальном дублей нет
    }


public static void main(String[]args){
    String test1 = "aabccddefgghiijjkk";
    findingDuplicates(test1);
    }
}




