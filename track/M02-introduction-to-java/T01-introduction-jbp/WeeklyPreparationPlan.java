public class WeeklyPreparationPlan {
    public static void main(String[] args) {
       int JavaHoursPerDay = 2;
       int AptitudeHoursPerDay = 1;
       int numberofPreparation = 5;

       int weeklyJavaHours = JavaHoursPerDay*numberofPreparation;
       int weeklyAptitudeHours = AptitudeHoursPerDay*numberofPreparation;
       int totalPreparationHours = weeklyJavaHours+weeklyAptitudeHours;

       System.out.println("Java: " + weeklyJavaHours);
       System.out.println("Aptitude: " + weeklyAptitudeHours);
       System.out.println("Total Preparation: " + totalPreparationHours);
    }
}
