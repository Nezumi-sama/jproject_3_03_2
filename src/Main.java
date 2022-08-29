public class Main {
    public static void main(String[] args) {
        BmiService bmiResult = new BmiService();
        float heightt = 1.8f;
        float weightt = 97f;

        float result = bmiResult.calculate(heightt, weightt);
        System.out.println(result);

    }
}
