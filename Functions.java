import java.util.Scanner;

public class Functions {
    public void prime(int number){
        int fact=1;
        if(number>0){
            for(int i=1; i<=number;i++){
                fact=fact*i;
            }
        }
        System.out.println(fact);
    }

    public static void main(String[] args){
        Functions fun = new Functions();
        Scanner scan = new Scanner(System.in);
        int num=scan.nextInt();
        fun.prime(num);
    }
    
}
