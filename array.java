import java.util.Scanner;

public class Arrays2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int numbers[]= new int[n];
      import java.util.*;
  // loop for input
        for (int i=0; i<n; i++){
           numbers[i]= sc.nextInt();
        }
         // loop for output
        for(int j=0;j<n; j++){
            System.out.print(numbers[j]+" ");
        }
    }
}
