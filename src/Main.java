public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int kg = 98;
        double heightm = 1.87;
        double bmi = service.calculate(kg, heightm);
        System.out.println(bmi);
    }
}