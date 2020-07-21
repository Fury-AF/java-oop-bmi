public class Main {
    public static void main(String[] args) {
        Athlete a = new Athlete("NickyV", 1.75, 75);
        BMI bmi = new BMI(a.weight, a.height);

        System.out.print(bmi.calculateBMI());
    }
}
