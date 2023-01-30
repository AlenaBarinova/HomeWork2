public class Main {
    public static void main(String[] args) {
        /*Task1*/
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        /*Task2*/
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
        /*Task3*/
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);
        /*Task4*/
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend /7;
        System.out.println(friend);
        /*Task5*/
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        /*Task6*/
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var totalWeight = boxer1 + boxer2;
        System.out.println(totalWeight);
        System.out.println(boxer2 - boxer1);
        /*Task7*/
        System.out.println(boxer2 - boxer1);
        System.out.println(boxer2 % boxer1);
        System.out.println();
        /*Task8*/
        var totalWorkingHours = 640;
        var perWorkingHours = 8;
        // общее количество сотрудников
        var totalNumberOfWorkers = totalWorkingHours / perWorkingHours;
        System.out.println("всего работают в компаниии - " + totalNumberOfWorkers + " человек " );
        // если в компании работает на 94 человека больше
        var addWorker = totalNumberOfWorkers + 94;
        System.out.println("Если в компании работает" + addWorker + "человек," +
                "то всего" + (addWorker * perWorkingHours) +
                "часов работы может быть поделено между сотрудниками." );














    }

}