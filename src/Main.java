public class Main {
    public static void main(String[] args) {

        System.out.println("Задание №5");
        //Задание 1
        int age = 19;
        if (age >= 18) {
            System.out.println("Виу, ВиУ, Поздравляем с совершеннолетием");
        }
        if (age < 18) {
            System.out.println("Возраст совершеннолетия ещё не наступил, и нужно немного подождать.");
        }

        //Задание 2
        if (age >= 7 && age < 18) {
            System.out.println("Ребенок ходит в школу.");
        }
        if (age >= 18 && age < 24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет.");
        }
        if (age >= 24){
            System.out.println("Человек окончил университет и ему пора искать первую работу.");
        }

        //Задние 3

        int capacity = 102;
        int seatCapasity = 60;
        int standCapasity = capacity - seatCapasity;
        int seatUsed = 30;
        int standUsed = 10;
        if (seatUsed < seatCapasity){
            System.out.println ("Есть еще " + (seatCapasity - seatUsed) + " сидячих мест.");
        }
        if (standUsed < standCapasity){
            System.out.println ("Есть еще " + (standCapasity - standUsed) + " стоячих мест.");
        }
        if (standUsed == standCapasity){
            System.out.println ("Сидячих мест нет.");
        }
        if (seatUsed == seatCapasity) {
            System.out.println("Стоячих мест нет.");
        }

    }
}