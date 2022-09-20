public class Main {
    public static void main (String[] args) {
        var dog = 8.0; // число с точкой потому, что такой тип потребуется во второй азадаче
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        // Задача 2

        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        //  Задача 3

        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        // Задача 4

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        // Задача 5

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        // Задача 6

        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var totalWeightOfBoxers = firstBoxerWeight + secondBoxerWeight;
        System.out.println(totalWeightOfBoxers);

        var weightDifferenceOfBoxers = secondBoxerWeight - firstBoxerWeight;
        System.out.println(weightDifferenceOfBoxers);

        // Задача 7

        var weightDifferenceOfBoxers2 = secondBoxerWeight % firstBoxerWeight;
        System.out.println(weightDifferenceOfBoxers2); // вывожу в консоль для того, чтобы проверить результат.
        // Операция вычитания использована в прошлой задаче.

        // Задача 8

        var workingHours = 640;
        var workingHoursOfOneWorker = 8;
        var amountOfWorkers = workingHours / workingHoursOfOneWorker;
        System.out.println("Всего работников в компании " + amountOfWorkers + " человек");

        var amountOfWorkers2 = amountOfWorkers + 94;
        var workingHours2 = amountOfWorkers2 * 8;
        System.out.println("Если в компании работает " + amountOfWorkers2 + " человек, то всего " + workingHours2 + " часов работы может быть поделено между сотрудниками.");

    }
}
