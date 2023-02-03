public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1() {
        int a = 1545657;
        byte b = 3;
        short c = 100;
        long d = 109834;
        float e = 100.67F;
        double f = 5.5;
        System.out.println("Задача 1");
        System.out.println("Значение переменной 'а' с типом int равно " + a);
        System.out.println("Значение переменной 'b' с типом byte равно " + b);
        System.out.println("Значение переменной 'c' с типом short равно " + c);
        System.out.println("Значение переменной 'd' с типом long равно " + d);
        System.out.println("Значение переменной 'e' с типом float равно " + e);
        System.out.println("Значение переменной 'f' с типом double равно " + f);
    }
    public static void task2() {
        double a = 27.12;
        long b = 987678965549L;
        double c = 2.786;
        short d = 569;
        short e = -159;
        short f = 27867;
        byte g = 67;
    }
    public static void task3() {
        byte numberStudentsLM = 23;
        byte numberStudentsAS = 27;
        byte numberStudentsEA = 30;
        short paper = 480;
        short paperOnOneStudents = (short) (paper / (numberStudentsAS + numberStudentsEA + numberStudentsLM));
        System.out.println("Задача 3");
        System.out.println("На каждого ученика рассчитано " + paperOnOneStudents + " листов бумаги");
    }
    public static void task4() {
        byte bottlesInOneMin = 16 /2;
        short productionBottlesIn20Min = (short) (bottlesInOneMin * 20);
        short productionBottlesInDay = (short) (bottlesInOneMin * 60 * 24);
        int productionBottlesIn3Days = productionBottlesInDay * 3;
        int productionBottlesIn31Days = productionBottlesInDay * 31;
        int productionBottlesIn30Days = productionBottlesInDay * 30;
        int productionBottlesIn28Days = productionBottlesInDay * 28;
        int productionBottlesIn29Days = productionBottlesInDay * 29;
        System.out.println("Задача 4");
        System.out.println("За 20 минут машина произвела " + productionBottlesIn20Min + " штук бутылок");
        System.out.println("За сутки машина произвела " + productionBottlesInDay + " штук бутылок");
        System.out.println("За три дня машина произвела " + productionBottlesIn3Days + " штук бутылок");
        System.out.println("За длинный месяц (31 день) машина произвела " + productionBottlesIn31Days + " штук бутылок");
        System.out.println("За короткий месяц (30 дней) машина произвела " + productionBottlesIn30Days + " штук бутылок");
        System.out.println("За февраль (28 дней) машина произвела " + productionBottlesIn28Days + " штук бутылок");
        System.out.println("За февраль (високосный год) машина произвела " + productionBottlesIn29Days + " штук бутылок");
    }
    public static void task5() {
        int numberClass = 120 / (2 + 4);
        int numberWhitePaint = numberClass * 2;
        int numberBrownPaint = numberClass * 4;
        System.out.println("Задача 5");
        System.out.println("В школе, где " + numberClass + " классов, нужно " + numberWhitePaint + " банок белой краски и " + numberBrownPaint + " банок коричневой краски");
    }
    public  static void task6() {
        short breakfastInGrams = 80 * 5 + 105 * 2 + 100 * 2 + 70 * 4;
        double breakfastInKg = breakfastInGrams * 1.0 /1000;
        System.out.println("Задача 6");
        System.out.println("Завтрак спортсмена " + breakfastInGrams + " г. или " + breakfastInKg + " кг.");
    }
    public  static  void  task7() {
        short dietDays250 = (7 * 1000) / 250;
        System.out.println("Задача 7");
        System.out.println("При потере веса 250 г. в день спортсмену потребуется " + dietDays250 + " дней для сброса 7 кг веса");
        short dietDays500 = (7 * 1000) / 500;
        System.out.println("При потере веса 500 г.в день спортсмену потребуется " + dietDays500 + " дней для сброса 7 кг веса");
        double avNumberDays = (dietDays250 * 1.0 + dietDays500) / 2;
        System.out.println("Для сброса веса 7 кг спортсмену потребуется " + avNumberDays + " день в среднем");
    }
    public static void task8() {
        int salaryMaria = 67760;
        int salaryDenis = 83690;
        int salaryKris = 76230;
        System.out.println("Задача 8");
        System.out.println("Маша теперь получает " + (int) (salaryMaria * 1.1) + " рублей. Годовой доход вырос на " + (int) (salaryMaria * 0.1) + " рублей");
        System.out.println("Денис теперь получает " + (int) (salaryDenis * 1.1) + " рублей. Годовой доход вырос на " + (int) (salaryDenis * 0.1) + " рублей");
        System.out.println("Кристина теперь получает " + (int) (salaryKris * 1.1) + " рублей. Годовой доход вырос на " + (int) (salaryKris * 0.1) + " рублей");
    }
}