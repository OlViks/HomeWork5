public class Main {
    public static void main(String[] args) {

        System.out.println("Задание №5");
        ///Задание 1.2
        //Задание 1
        int age = 3;
        if (age >= 2 && age <= 6) {
            System.out.println ("Если возраст человека  " + age + " , то ему нужно ходить в детский сад.");
        } else if (age >= 7  && age < 18) {
            System.out.println ("Если возраст человека  " + age + " , то ему нужно ходить в школу.");
        } else if (age >= 18  && age < 24) {
            System.out.println ("Если возраст человека  " + age + " , то ему нужно ходить в университет.");
        }else {
            System.out.println ("Если возраст человека  " + age + " , то ему нужно ходить на работу.");
        }
        //Задание 2

        if (age < 5 ) {
            System.out.println ("Если возраст человека  " + age + " ,  он не может кататься на аттракционе. ");
        } else if (age >= 5  && age < 14) {
            System.out.println ("Если возраст человека  " + age + " ,  то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя. ");
        }else {
            System.out.println ("Если возраст человека равен " + age + " он может кататься без сопровождения взрослого.");
        }
        //Задание 3
        int one = 1011;
        int two = 2;
        int three = 2;
        if (one > two) {
            if (one >= three) {
                System.out.println("Большее значение - " + one);
            }else{
                System.out.println("Большее значение - " + three);
            }
        } else if (two > one) {
            if (two >= three) {
                System.out.println("Большее значение - " + two);
            }else{
                System.out.println("Большее значение - " + three);
            }
        }else{
            if (three > one) {
            }else if (three > two) {
                System.out.println("Большее значение - " + three);
            }
        }

    }
}