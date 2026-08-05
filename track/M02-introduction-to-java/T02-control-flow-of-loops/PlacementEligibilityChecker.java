public class PlacementEligibilityChecker {
    public static void main(String[] args) {

        int marks = 72;
        int attendence = 80;
        boolean ProjectCompleted = true;

        boolean marksEligible = marks >= 60;
        boolean attendenceEligible = attendence >= 75;
        boolean academicEligible = marksEligible && attendenceEligible;
        boolean placementEligible = academicEligible && ProjectCompleted;
        
        if(placementEligible){
            System.out.println("Eligible");
        }else{
            System.out.println("Not Eligible");
        }
        
        
    }
}
