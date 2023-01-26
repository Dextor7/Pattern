import java.util.*;

public class Pattern {

    public void pattern1(int n){
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    public void pattern2(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    public void pattern3(int n){
        for(int i=0;i<n;i++){
            int num = 1;
            for(int j=0;j<=i;j++){
                System.out.print(num);
                num ++;
            }
            System.out.print("\n");
        }
    }
    public void pattern4(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.print("\n");
        }   
    }
    public void pattern5(int n){
        for(int i=0;i<=n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    public void pattern6(int n){
        for(int i=0;i<=n;i++){
            int num= 1;
            for(int j=0;j<n-i;j++){
                System.out.print(num);
                num++;
            }
            System.out.print("\n");
        }
    }
    public void pattern7(int n){
        for(int i=0;i<n;i++){
            //space
            for(int j=0;j<n-i-1;j++){                               //Calculating the spaces in the pattern-> n-i-1
                System.out.print(" ");
            }
            //star
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            } 
            //Space
            for(int j=0;i<n-i-1;i++){
                System.out.print(" ");
            }  
            System.out.print("\n");                                //Calculating the stars in the pattern-> 2*i+1
        }
    }

    public static void main(String[] args) {
        Pattern inp = new Pattern();
        inp.pattern7(8);
    }
}