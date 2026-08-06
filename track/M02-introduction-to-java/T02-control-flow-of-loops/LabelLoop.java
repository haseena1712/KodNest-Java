public class LabelLoop {
    public static void main(String[] args) {
        banu : for(int i=1; i<=5; i++){
            heman : for(int j=1; j<=5; j++){
                if(i==2){
                    break banu;  
                }
                System.out.print("i: " + i + "j: " + j);
            }
            System.out.println();
            
        }
    }
}
