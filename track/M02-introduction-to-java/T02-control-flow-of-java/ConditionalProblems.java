public class ConditionalProblems {
    public static void main(String[] args) {
       int number = -7;
       int firstScore = 18;
       int secondScore = 25;

       if(number>0){
          System.out.println("Number is positive");
       }else if(number<0){
          System.out.println("Number is negative");
       }else{
          System.out.println("Number is zero");
       }
          
         if (number % 2 == 0){
          System.out.println("Number is Even");
         }else{
          System.out.println("Number is Odd");
         } 
            
           if(firstScore >= secondScore) {
            System.out.println("Larger score: " + firstScore);
           } else{
            System.out.println("Larger score: " + secondScore);
           }

       }
    }

