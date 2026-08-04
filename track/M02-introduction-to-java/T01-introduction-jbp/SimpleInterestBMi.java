public class SimpleInterestBMi {
      public static void main(String[] args) {
          double principle = 10000;
          double rate = 5;
          double time = 2;

          double simpleInterest = (principle*rate*time)/100;
          System.out.println("Simple Interest: " + simpleInterest);

          double weight = 60;
          double height = 1.6;

          double bmi = weight/(height*height);
          System.out.println("BMI: " + bmi);

          double celsius = 25;
          double fahrenheit = (celsius*9/5)+32;
          System.out.println("Fahrenheit: " + fahrenheit);
      }
}
