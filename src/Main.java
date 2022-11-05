public class Main {
    public static void main(String[] args) {
        var weightBoxer1 = 78.2;
        System.out.println(weightBoxer1);
        var weightBoxer2 = 82.7;
        System.out.println(weightBoxer2);
        var totalWeghtBoxer = weightBoxer1 + weightBoxer2;
        System.out.println ("общий вес бойцов " + totalWeghtBoxer + "кг " );
        var weightDifference = weightBoxer1 - weightBoxer2;
        System.out.println("Разница веса бойцов " + weightDifference + "кг ");

        var divisionRemainder = (weightBoxer2 + weightBoxer1) % weightBoxer1;
        System.out.println("Разница веса " + divisionRemainder + "кг ");
    }
}