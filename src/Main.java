public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        byte age = 17;
        if (age >= 18) {
            System.out.println("Если Ваш возраст равен " + age + ", Вы достигли возраста совершеннолетия!");
        } else {
            System.out.println("Если Ваш возраст равен " + age + ", Вы еще не достигли возраста совершеннолетия, нужно немного подождать");
        }
        System.out.println("Task 2");
        byte temper = -5;
        if (temper <= 5) {
            System.out.println("При температуре " + temper + " градусов на улице холодно, нужно надеть шапку");
        } else {
            System.out.println("При температуре " + temper + " градусов на улице тепло, можно идти без шапки");
        }
        System.out.println("Task 3");
        short speed = 80;
        if (speed >= 60) {
            System.out.println("Если скорость " + speed + "км/ч, то ожидайте штраф");
        } else {
            System.out.println("Если скорость " + speed + "км/ч, то на сегодня без штрафов");
        }
        System.out.println("Task 4");
        byte age2 = 23;
        if (age2 >= 2) {
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
            System.out.println("Все места заняты");//
        }
        System.out.println("Task 7");
        int one = 52;
        int two = 322;
        int three = 55;
        int max;
        if (one > two) {
            max = one;
        } else {
            max = two;
        }
        if (three>max) {
           System.out.println("Наибольшее число " + three);
        }
        else {
            System.out.println("Наибольшее число " + max);
        }
    }
}