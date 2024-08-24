import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int[]array = new int[number];
        for(int i=0;i<=array.length-1;i++){
            array[i]=scan.nextInt();
        }

        for(int i=0;i<=array.length-1;i++){
            int temp;
            for(int j=i+1;j<=array.length-1;j++){
                if(array[i]>array[j]){
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }

        System.out.println("Sorted Array....");
        for(int i=0;i<=array.length-1;i++){
            System.out.print(array[i]+" ");
        }
    }
    
}
