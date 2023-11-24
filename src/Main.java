import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("");
//
//        for (int i = 0; i < 7; i++) {
//            for (int j = 0; j < 7; j++) {
//                System.out.print(i + "" + j + "\t");
//            }
//            System.out.println("");
//        }
//
//        for (int i = 1; i <= 7; i++) {
//            for (int j = 1; j <= 7; j++) {
//                if (j == 1 || j == 7 || i == j) {
//                    System.out.print(i + "" + j + "\t");
//                } else {
//                    System.out.print(" " + "\t");
//                }
//            }
//            System.out.println("");
//        }
//        System.out.println("");
//        System.out.println("");
//        System.out.println("");
//        for (int i = 1; i <= 7; i++) {
//            for (int j = 1; j <= 7; j++) {
//                if (j == 1 || j == 7 || i == 1 || i ==7) {
//                    System.out.print(i + "" + j + "\t");
//                } else {
//                    System.out.print(" " + "\t");
//                }
//            }
//            System.out.println("");
//        }
//
//        System.out.println("");
//        System.out.println("");
//        System.out.println("");
//        for (int i = 1; i < 7; i++) {
//            for (int j = 1; j < i; j++) {
//                System.out.print("*"+ "\t");
//            }
//            System.out.println("");
//        }
//
//        String test = "abc";
//        test = test + test;
//        System.out.println(test);

    class A{
        public void funcA(){
            System.out.printf("đây là a");
        }
    }

        class B extends A{
            public void funcB(){
                System.out.printf("đây là b");
            }
        }

        A obj = new B();
        ((B) obj).funcB();
    }

}