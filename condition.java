import java.util.*;

public class condition {

    // public static void main(String arg[]){
    //     Scanner scr = new Scanner(System.in);
    //     int age = scr.nextInt();
    //     if(age > 18){
    //         System.out.println("Adult");
    //     }else{
    //         System.out.println("Not Adult");
    //     }
    // }

    // public static void main(String arg []){
    //     Scanner src = new Scanner(System.in);
    //     int value = src.nextInt();
    //     if(value % 2 == 0){
    //         System.out.println("Even");
    //     }else{
    //         System.out.println("Odd");
    //     }
    // }

    // public static void main(String arg[]){
    //     Scanner src = new Scanner(System.in);
    //     int a = src.nextInt();
    //     int b = src.nextInt();
    //     if(a == b){
    //         System.out.println("A and B is Equal");
    //     }else{
    //         if(a > b){
    //             System.out.println("a is grether");
    //         }else{
    //             System.out.println("a is lesser");
    //         }
    //     }
    // }

    public static void main(String arg[]){
        Scanner src = new Scanner(System.in);
        String button = src.next();
        switch (button) {
            case "Pashto": System.out.println("sanga ye");
            break;
            case "English": System.out.println("How are you");
             break;
            case "Urdu":System.out.println("kasa hoo");
            break;
            default: System.out.println("ya language nahe ha");
        }
    }
}
