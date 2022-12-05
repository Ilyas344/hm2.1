public class Main {
    public static void main(String[] args) {
        int varInt = 0;
        byte varByte = 1;
        short varShort = 32767;
        long varLong = 1232342424;
        float varFloat = 34343535;
        double varDouble = 0.0001;
        System.out.println("Значение переменной varInt с типом int равно " + varInt);
        System.out.println("Значение переменной varByte с типом byte равно " + varByte);
        System.out.println("Значение переменной varShort с типом short равно " + varShort);
        System.out.println("Значение переменной varLong с типом long равно " + varLong);
        System.out.println("Значение переменной varFloat с типом float равно " + varFloat);
        System.out.println("Значение переменной varDouble с типом double равно " + varDouble);
        int varInt2 = -159;
        double varDouble2 = 27.12;
        float varFloat2 = 2.786f;
        short varShort2 = 569;
        boolean varBoolean = false;
        long varLong2 =987678965549L;
        byte varByte2 = 67;

        int students = 23 + 27 + 30;
        int list = 480;
        double studentsList = list / students;
        System.out.println("На каждого ученика рассчитано " + studentsList + " листов бумаги");

        int bootle = 16 / 2;
        int time = 20;
        System.out.println("За " + time + " минут машины произвела бутылок " + bootle * time + " штук ");
        time = 60 * 24;
        System.out.println("За " + time + " минут машины произвела бутылок " + bootle * time + " штук ");
        time = 60 * 24 * 3;
        System.out.println("За " + time + " минут машины произвела бутылок " + bootle * time + " штук ");
        time = 60 * 24 * 3 * 30;
        System.out.println("За " + time + " минут машины произвела бутылок " + bootle * time + " штук ");

        int paint = 120;
        int Class = 120 / 4 + 2;
        System.out.println("В школе, где " + Class + " классов, нужно " + Class * 2 + " банок белой краски и " + Class * 4 + " банок коричневой краски");

        int banan = 80;
        int milk = 105;
        int iceCream = 100;
        int egg = 70;
        int eat = (banan * 5 + milk * 2 + iceCream * 2 + egg * 4);
        double eatKg = eat / 1000;
        System.out.println("Вес питания в граммах" + eat + "\n В килогаммах" + eatKg);

        int weigt = 7 * 1000;
        int weigt250 = 250;
        int weigt500 = 500;
        System.out.println("Что бы похудеть на " + weigt + " потребуется при 250г " + weigt / weigt250 + " дней");
        System.out.println("Что бы похудеть на " + weigt + " потребуется при 500г " + weigt / weigt500 + " дней");

        int Masha =67700;
        int Denis =83690;
        int Kristina =76230;

        System.out.println("Маша теперь получает "+Masha*1.1+" рублей. Годовой доход вырос на "+Masha*0.1*12+ " рублей");
        System.out.println("Маша теперь получает "+Denis*1.1+" рублей. Годовой доход вырос на "+Denis*0.1*12+ " рублей");
        System.out.println("Маша теперь получает "+Kristina*1.1+" рублей. Годовой доход вырос на "+Kristina*0.1*12+ " рублей");

    }
}