public class Main {
    public static void main(String[] args) {
        // Task 1
        byte byteVar = 10;
        short shortVar = 200;
        int intVar = 30;
        long longVar = 400L;

        float floatVar = 12.5f;
        double doubleVar = 5.5;

        boolean boolVar = true;
        char charVar = 33;

        // Task 2
        System.out.println("========== Task 2 ============");

        double firstBoxerWeight = 78.2;
        double secondBoxerWeight = 82.7;

        double totalWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println("Общий вес боксеров: " + totalWeight + " кг.");

        double weightDifference = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Разница в весе боксеров: " + weightDifference + " кг.");

        // Task 3
        System.out.println("========== Task 3 ============");

        int bananas = 5;
        int bananaTotalWeight = bananas * 80;

        int milk = 200;
        int milkTotalWeight = (milk / 100) * 105;

        int iceCream = 2;
        int iceCreamWeight = iceCream * 100;

        int rawEggs = 4;
        int eggsWeight = rawEggs * 70;

        double totalWeightInGrams = bananaTotalWeight + milkTotalWeight + iceCreamWeight + eggsWeight;
        double totalWeightInKilograms = totalWeightInGrams / 1000;

        System.out.println("Общий вес продуктов: " + totalWeightInGrams + " грамм!");
        System.out.println("Общий вес продуктов: " + totalWeightInKilograms + " кг!");

        // Task 4
        System.out.println("========== Task 4 ============");
        double weightToLose = 7.0;

        double minWeightAmount = 250.0 / 1000; // кг
        double maxWeightAmount = 500.0 / 1000; // кг

        int maxNumberOfDays = (int)(weightToLose / minWeightAmount); // кол-во дней при мин потери веса
        int minNumberOfDays = (int)(weightToLose / maxWeightAmount); // кол-во дней при макс потери веса
        int averageNumberOfDays = (maxNumberOfDays + minNumberOfDays) / 2; // среднее кол-во дней

        System.out.println("Минимальная потеря веса: " + minWeightAmount + " кг.");
        System.out.println("Максимальная потеря веса" + maxWeightAmount + " кг.");
        System.out.println("Количество дней при мин. потере веса: " + minNumberOfDays);
        System.out.println("Количество дней при макс. потере веса: " + maxNumberOfDays);
        System.out.println("Среднее кол-во дней: " + averageNumberOfDays);

        // Task 5
        System.out.println("========== Task 5 ============");

        int firstEmployeeSalary = 67_760;
        int firstEmployeeSalaryForYear = firstEmployeeSalary * 12;
        int secondEmployeeSalary = 83_690;
        int secondEmployeeSalaryForYear = secondEmployeeSalary * 12;
        int thirdEmployeeSalary = 76_230;
        int thirdEmployeeSalaryFoYear = thirdEmployeeSalary * 12;

        int firstEmployeeIncreasedSalary = (firstEmployeeSalary / 10) + firstEmployeeSalary;
        int secondEmployeeIncreasedSalary = (secondEmployeeSalary / 10) + secondEmployeeSalary;
        int thirdEmployeeIncreasedSalary = (thirdEmployeeSalary / 10) + thirdEmployeeSalary;

        int firstEmployeeIncomeDifference = (firstEmployeeIncreasedSalary * 12) - firstEmployeeSalaryForYear;
        int secondEmployeeIncomeDifference = (secondEmployeeIncreasedSalary * 12) - secondEmployeeSalaryForYear;
        int thirdEmployeeIncomeDifference = (thirdEmployeeIncreasedSalary * 12) - thirdEmployeeSalaryFoYear;

        System.out.println("Маша теперь получает " + firstEmployeeIncreasedSalary + " рублей. Годовой доход вырос на " + firstEmployeeIncomeDifference + " рублей");
        System.out.println("Денис теперь получает " + secondEmployeeIncreasedSalary + " рублей. Годовой доход вырос на " + secondEmployeeIncomeDifference + " рублей");
        System.out.println("Кристина теперь получает " + thirdEmployeeIncreasedSalary + " рублей. Годовой доход вырос на " + thirdEmployeeIncomeDifference + " рублей");
    }
}