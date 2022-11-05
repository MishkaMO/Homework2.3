public class Main {
    public static void main(String[] args) {
        var totalHour = 640;
        System.out.println(totalHour);
        var workHour = 8;
        System.out.println(workHour);
        var workers = totalHour / workHour;
        System.out.println("Всего работников в компании - " + workers + " человек ");
    }
}