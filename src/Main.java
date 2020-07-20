public class Main {
    public static void main(String[] args) {
        Athlete a = new Athlete("NickyV", 1.75, 75);
        IMC imc = new IMC(a.weight, a.height);
    }
}
