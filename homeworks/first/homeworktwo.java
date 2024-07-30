package homeworks.first;
import java.util.*;

public class homeworktwo{

    public static void main(String arg[]){
        Scanner src = new Scanner(System.in);

        System.out.print("Enter First Digits : ");
        int a = src.nextInt();

        System.out.print("Enter Second Digits : ");
        int b = src.nextInt();

        System.out.print("Enter operator : ");
        char c = src.next().charAt(0);
        if(c == '+'){
            System.out.println(a+b);
        }else if(c == '-'){
            System.out.println(a-b);
        }else if(c == '*'){
            System.out.println(a * b);
        }else if(c == '/'){
            System.out.println(a/b);
        }else if(c == '%'){
            System.out.println(a%b);
        }else{
            System.out.println("Not Find");
        }
    }

}
