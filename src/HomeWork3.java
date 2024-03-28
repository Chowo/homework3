public class HomeWork3 {
    public static void main(String[] args) {
        //Task 01
        int depth = 5789;
        byte width = 12;
        short height = 456;
        long weight = 15854689L;
        float pi = 3.14f;
        double x = 67.980674356;
        System.out.println("Значение переменной depth с типом int равно " + depth);
        System.out.println("Значение переменной width с типом byte равно " + width);
        System.out.println("Значение переменной height с типом short равно " + height);
        System.out.println("Значение переменной weight с типом long равно " + weight);
        System.out.println("Значение переменной pi с типом float равно " + pi);
        System.out.println("Значение переменной x с типом double равно " + x);

        //Task 02
        float a = 27.12f;
        long b = 987678965549L;
        double c = 2.786;
        short d = 569;
        short e = -159;
        int f = 27897;
        byte g = 67;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);

        //Task 03
        short firstTeacherStudents = 23;
        short secondTeacherStudents = 27;
        short thirdTeacherStudents = 30;
        int totalAmountOfPaper = 480;
        int paperProStudent = totalAmountOfPaper/(firstTeacherStudents + secondTeacherStudents + thirdTeacherStudents);
        System.out.println("На каждого ученика расчитано " + paperProStudent + " листов бумаги");

        //Task 04
        byte productivityProTwoMinutes = 16;
        int productsForTwentyMinutes = productivityProTwoMinutes * 10;
        int productsForDay = productivityProTwoMinutes * 24*60/2;
        int productsForThreeDays = productsForDay * 3;
        int productsForAMonth = productsForDay * 30;
        System.out.println("За 20 минут машина произвела " + productsForTwentyMinutes + " штук бутылок");
        System.out.println("За день произвела " + productsForDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + productsForThreeDays + " штук бутылок");
        System.out.println("За месяц машина произвела " + productsForAMonth + " штук бутылок");

        //Task 05
        int paintTins = 120;
        int brownPaintPerClassroom = 2;
        int whitePaintPerClassroom = 4;
        int paintedClassrooms = paintTins/(brownPaintPerClassroom + whitePaintPerClassroom);
        int totalBrownTins = paintedClassrooms * brownPaintPerClassroom;
        int totalWhiteTins = paintedClassrooms * whitePaintPerClassroom;
        System.out.println("В школе, где " + paintedClassrooms + " классов, нужно " + totalWhiteTins + " банок белой краски и " + totalBrownTins + " банок коричневой краски");

        //Task 06
        int bananaWeight = 80;
        int milkWeight = 105;
        int icecreamWeight = 100;
        int eggWeight = 70;
        int sportBreakfastWeight = 5 * bananaWeight + 2 * milkWeight + 2 * icecreamWeight + 4 * eggWeight;
        System.out.println("Вес спортивного завтрака " + sportBreakfastWeight + " г");
        System.out.println("Вес спортивного завтрака в килограммах составляет " + (float) sportBreakfastWeight / 1000 + " кг");

        //Task 07
        int weightLossGoal = 7;
        int minDailyWeightLoss = 250;
        int maxDailyWeightLoss = 500;
        float longestLoss = (float) weightLossGoal * 1000 / minDailyWeightLoss;
        float shortestLoss = (float) weightLossGoal * 1000 / maxDailyWeightLoss;
        float averageWeightLossTime = (longestLoss + shortestLoss) / 2;
        System.out.println("Максимальное количество дней для похудения - " + longestLoss + " дней");
        System.out.println("Минимальное количество дней для похудения - " + shortestLoss + " дней");
        System.out.println("Среднее количество дней для похудения - " + averageWeightLossTime + " дней");

        //Task 08
        float mariasOldSalary = 67760f;
        float denisOldSalary = 83690f;
        float kristinasOldSalary = 76230f;
        float mariasNewSalary = mariasOldSalary * 1.1f;
        float denisNewSalary = denisOldSalary * 1.1f;
        float kristinasNewSalary = kristinasOldSalary * 1.1f;
        float yearlyMariasIncomeIncrease = (mariasNewSalary - mariasOldSalary) * 12;
        float yearlyDenisIncomeIncrease = (denisNewSalary - denisOldSalary) * 12;
        float yearlyKristinasIncomeIncrease = (kristinasNewSalary - kristinasOldSalary) * 12;
        System.out.println("Маша теперь получает " + mariasNewSalary + " рублей. Годовой доход вырос на " + yearlyMariasIncomeIncrease + " рублей");
        System.out.println("Денис теперь получает " + denisNewSalary + " рублей. Годовой доход вырос на " + yearlyDenisIncomeIncrease + " рублей");
        System.out.println("Кристина теперь получает " + kristinasNewSalary + " рублей. Годовой доход вырос на " + yearlyKristinasIncomeIncrease + " рублей");

    }
}
