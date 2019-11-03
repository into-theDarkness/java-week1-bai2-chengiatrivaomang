import java.util.Scanner;

public class Arrayinfo {
    public static void main(String[] args) {
        int array[] = new int []{1,3,4,5,0,0};
        int index, X;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap gia tri ban can chen: ");
        X = input.nextInt();
        System.out.println("Nhap vi tri ban can chen gia tri: ");
        index = input.nextInt();
        if ( index < 0 || index > array.length-1){
            System.out.println("Vi tri nhap cua ban bi sai roi");
        }
        for(int i = index; i < array.length; i++){
            array[i] = X;
            array[i+1] = array[i+2];
        }
    }
}
