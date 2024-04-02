public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        byte age = 17;
        if (age >= 18) {
            System.out.println("Вы достигли возраста совершеннолетия!");
        } else {
            System.out.println("Вы еще не достигли возраста совершеннолетия, нужно немного подождать");
        }
        System.out.println("Task 2");
        byte Temper = -5;
        if (Temper <= 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        } else {
            System.out.println("На улице тепло, можно идти без шапки");
        }
        System.out.println("Task 3");
        short Speed = 80;
        if (Speed >= 60) {
            System.out.println("Скорость превышена, ожидайте штраф");
        } else {
            System.out.println("Скорость не превышена, на сегодня без штрафов");
        }
        System.out.println("Task 4");
        byte age2 = 23;
        if (age2 > 2) {
            if (age2 <= 6) {
                System.out.println("Если возраст человека равен " + age2 + ", то ему нужно в детсад");
            } else if (age2 <= 17) {
                System.out.println("Если возраст человека равен " + age2 + ", то ему нужно в школу");
            } else if (age2 <= 24) {
                System.out.println("Если возраст человека равен " + age2 + ", то ему нужно в университет");
            } else {
                System.out.println("Если возраст человека равен " + age2 + ", то ему нужно на работу");
            }
        }
        System.out.println("Task 5");
        byte ageChild = 12;
        if (ageChild < 5) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то ему нельзя кататься на аттракционе");
        } else {
            if (ageChild < 14) {
                System.out.println("Если возраст ребенка " + ageChild + ", то ему можно кататься на аттракционе в сопровождении взрослого");
            } else {
                System.out.println("Если возраст ребенка " + ageChild + ", то ему можно кататься на аттракционе без сопровождения взрослого");
            }
        }
        System.out.println("Task 6");
        byte placeTaken = 55;
        if (placeTaken < 60) {
            System.out.println("Вы можете поехать сидя");
        } else if (placeTaken < 102) {
            System.out.println("Вы можете поехать стоя");
        } else {
            System.out.println("Все места заняты");
        }
        System.out.println("Task 7");
        int one = 52;
        int two = 322;
        int three = 55;
        if (one > two) {
            if (one > three) {
                System.out.println("Наибольшее число " + one);
            } else {
                System.out.println("Наибольшее число " + three);
            }
        } else if (two > three) {
                System.out.println("Наибольшее число " + two);
            } else {
                System.out.println("Наибольшее число " + three);
            }

    }
}