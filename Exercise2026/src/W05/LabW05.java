import java.util.Scanner;

public class LabW05 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter an Integer:");
        int nombor=in.nextInt();
        
        System.out.print("The factor of " + nombor + " is: ");
        for(int i=1;i<=nombor;i++){
            if(nombor%i==0){
            System.out.print(i + " ");
   
           }
        }
    }
}
