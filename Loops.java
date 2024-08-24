import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        for(int i=0; i<=number; i++){
            System.out.print(i+" ");
        }

        System.out.println("While loop...");

        while(number>0 && number<100){
            System.out.print(number+" ");
            number=number+1;
        }

        System.out.println("Do While loop...");

        do{
            System.out.print(number+" ");
            number=number-1;
        }while(number>0 && number<=100);
    }
}