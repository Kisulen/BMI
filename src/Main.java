public class Main {

    public static void main(String [] args) {
        BmiService service = new BmiService();
        int weight = 75;
        float height = (float) 1.8;
        float bmi = service.calculate(height, weight);
        System.out.println(bmi);
    }

}
