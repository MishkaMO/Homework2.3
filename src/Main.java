public class Main {
    public static void main(String[] args) {
        var totalHour = 640;
        System.out.println(totalHour);
        var workHour = 8;
        System.out.println(workHour);
        var workers = totalHour / workHour;
        System.out.println("Всего работников в компании - " + workers + " человек ");
        var newWorkers = workers + 94;
        System.out.println(newWorkers);
        var worksTotal = totalHour / newWorkers;
        System.out.println("Если в компании работает " + newWorkers + " человек, то всего " + worksTotal + " часов работы может быть поделено между сотрудниками");
    }
}