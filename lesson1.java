import java.util.Scanner;

class lesson1 {

    // declaring and initializing variables outside the main 
    //use static keyword 

     //static int age = 23;
    // static int number1 = 13;
     //static int number2 = 17;
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");

        String name = scanner.nextLine();
        System.out.println(name);

        scanner.close();
        //int age = 23;
        //equal to operator
        //System.out.println(number1 == number2);
        //not equal to operator
       // System.out.println(number1 != number2);
        //greater than or equal to
        //System.out.println(number1 >= number2);
        //System.out.println(number1 == number2);
    }
}