public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int a = 100000;
        System.out.println("Значение переменной a с типом int равно " +a);
        byte b = 78;
        System.out.println("Значение переменной b с типом byte равно " +b);
        short c = 32000;
        System.out.println("Значение переменной c с типом short равно " +c);
        long d = 4590235L;
        System.out.println("Значение переменной d с типом long равно " +d);
        float e = 41.457f;
        System.out.println("Значение переменной e с типом float равно " +e);
        double f = 12378.09364581;
        System.out.println("Значение переменной f с типом double равно " +f);

        //Задача 2
        float A = 27.12f;
        long B = 987678965549L;
        double C = 2.786;
        short D = 569;
        int E = -159;
        short F = 27897;
        byte G = 67;

        System.out.println("Задача 3 ");
        byte firstTeacher = 23;
        byte secondTeacher = 27;
        byte thirdTeacher = 30;
        short paper = 480;
        int paperStudent = paper / (firstTeacher + secondTeacher + thirdTeacher);

        System.out.println("На каждого ученика рассчитано " + paperStudent + " листов бумаги");

        System.out.println("Задача 4");

        byte speedMash = 16;
        byte time1 = 20;
        short time2 = 1440;
        short time3 = 4320;
        int time4 = 43200;
        int speedMin = speedMash / 2;
        int performance1 = speedMin * time1;
        System.out.println("За " + time1 + " минут машина произвела " + performance1 + " штук бутылок");
        int performance2 = speedMin * time2;
        System.out.println("За " + time2 + " минут машина произвела " + performance2 + " штук бутылок");
        int performance3 = speedMin * time3;
        System.out.println("За " + time3 + " минут машина произвела " + performance3 + " штук бутылок");
        int performance4 = speedMin * time4;
        System.out.println("За " + time4 + " минут машина произвела " + performance4 + " штук бутылок");

        System.out.println("Задача 5");
        int white = 2;
        int brown = 4;
        int total = 120;
        int totalClasses = total / (white + brown);
        int totalWhite = totalClasses * white;
        int totalBrown = totalClasses * brown;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhite + " банок белой краски и " + totalBrown + " банок коричневой краски");

        System.out.println("Задача 6");
        int bananas = 5;
        int milk = 2;
        int iceCream = 2;
        int eggs = 4;

        int bananasGram = bananas * 80;
        int milkGram = milk * 105;
        int iceCreamGram = iceCream * 100;
        int eggsGram = eggs * 70;
        float gram = bananasGram + milkGram + iceCreamGram + eggsGram;
        float grPerKg = gram / 1000;
        System.out.println("Вес спортзавтрака " + gram + " в граммах и " + grPerKg + " в килограммах");

        System.out.println("Задача 7 ");
        int weight = 7;
        int gr1 = 250;
        int gr2 = 500;

        int kgPerGr = weight * 1000;
        int a1 = kgPerGr / gr1;
        int b1 = kgPerGr / gr2;
        int average = (a1 + b1) / 2;
        System.out.println("На похудение уйдет " + a1 + " дней, если терять по 250 грамм, если каждый день худеть на 500 грамм, то уйдет " + b1 + " дней");
        System.out.println(" В среднем на похудение уйдет " + average + " дней");

        System.out.println("Задача 8 ");
        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        float perYear = 1.1F;
        int months = 12;
        float mashaSalary = (float) ((float) masha * perYear );
        float denisSalary = (float) ((float) denis * perYear );
        float kristinaSalary = (float) ((float) kristina * perYear);

        int mashaGets = masha * months;
        int denisGets = denis * months;
        int kristinaGets = kristina * months;

        int mashaWillReceive = (int) (mashaSalary * months);
        int denisWillReceive = (int) (denisSalary * months);
        int kristinaWillReceive = (int) (kristinaSalary * months);

        int mashaIncome = mashaWillReceive - mashaGets;
        int denisIncome = denisWillReceive - denisGets;
        int kristinaIncome = kristinaWillReceive - kristinaGets;

        System.out.println("Маша теперь получает " + mashaSalary + " рублей. Годовой доход вырос на " + mashaIncome + " рублей");
        System.out.println("Денис теперь получает " + denisSalary + " рублей. Годовой доход вырос на " + denisIncome + " рублей!");
        System.out.println("Кристина теперь получает " + kristinaSalary + " рублей. Годовой доход вырос на " + kristinaIncome + " рублей");
    }
}