public class Main {
    public static void main(String[] args) {
        int age = 27;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то не достиг " +
                    "совершеннолетия, нужно немного подождать");
        }

        int temperature = -1;
        if (temperature >= 5) {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        } else {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        }
        int carSpeed = 120;
        if (carSpeed <= 60) {
            System.out.println("Если скорость " + carSpeed + ", то можно ездить спокойно");
        } else {
            System.out.println("Если скорость " + carSpeed + ", придется заплатить штраф");
        }

        int age1 = 20;
        if (age1 >= 2 && age1 <= 6) {
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в детский сад");
        }
        if (age1 >= 7 && age1 <= 17) {
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в школу");
        }
        if (age1 >= 18 && age1 <= 24) {
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в университет");
        }
        if (age1 > 24) {
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить на работу");
        }

        int age2 = 14;
        if (age2 < 5) {
            System.out.println("Если возраст ребенка равен " + age2 + ", то ему нельзя кататься на аттракционе");
        }
        if (age2 >= 5 && age2 < 14) {
            System.out.println("Если возраст ребенка равен " + age2 + ", то ему можно кататься на аттракционе " +
                    "в сопровождении взрослого");
        }
        if (age2 >= 14) {
            System.out.println("Если возраст ребенка равен " + age2 + ", то ему можно кататься на аттракционе " +
                    "без сопровождения взрослого");
        }

        int occupiedStandPlaces = 42;
        int occupiedSeatPlaces = 13;
        int allStandPlaces = 42;
        int allSeatPlaces = 60;
        int vacantStandPlaces = allStandPlaces - occupiedStandPlaces;
        int vacantSeatPlaces = allSeatPlaces - occupiedSeatPlaces;
        if (vacantSeatPlaces != 0 && vacantStandPlaces != 0) {
            System.out.println("В этом вагоне " + vacantSeatPlaces + " сидячих мест и " + vacantStandPlaces + " стоячих мест свободно");
        } else {
            if (vacantSeatPlaces == 0 && vacantStandPlaces != 0) {
                System.out.println("В этом вагоне свободно " + vacantStandPlaces + " стоячих мест. Сидячие места раскуплены");
            } else {
                if (vacantStandPlaces == 0 && vacantSeatPlaces != 0) {
                    System.out.println("В этом вагоне свободно " + vacantSeatPlaces + " сидячих мест. Стоячие места раскуплены");
                } else {
                    System.out.println("В этом вагоне нет свободных мест");
                }
            }
        }

        int one = 64;
        int two = 45;
        int three = 64;
        if (one >= two && one >= three) {
            System.out.println("Наибольшее число "+one);
        } else {
            if (two >= one && two >= three) {
                System.out.println("Наибольшее число "+two);
            } else {
                System.out.println("Наибольшее число "+three);
            }
        }

    }
}