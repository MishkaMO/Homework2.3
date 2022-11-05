public class Main {
    public static void main(String[] args) {
        var weghtBoxer1 = 78.2;
        System.out.println(weghtBoxer1);
        var weghtBoxer2 = 82.7;
        System.out.println(weghtBoxer2);
        var totalWeghtBoxer = weghtBoxer1 + weghtBoxer2;
        System.out.println ("общий вес бойцов " + totalWeghtBoxer + "кг " );
        var weightDifference = weghtBoxer2 - weghtBoxer1;
        System.out.println("Разница веса бойцов " + weightDifference + "кг ");
    }
}