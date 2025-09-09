import java.util.Scanner;
public class problem3 {
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextInt();
        float pen = sc.nextInt();
        float eraser = sc.nextInt();
        float total = pencil+pen+eraser;
        System.out.println("Bill is:"+total);
        float newTotal = (total)+(0.18f*total);
        System.out.println("Bill with 18% GST:" +newTotal);
    }
}


    

