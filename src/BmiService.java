public class BmiService {
    public int calculate(int kg, double heightm) {
        double result = kg / (heightm * heightm);
        int bmi = (int) result;
        return bmi;


    }
}
