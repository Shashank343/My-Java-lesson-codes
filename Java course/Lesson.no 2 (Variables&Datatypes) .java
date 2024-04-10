import java.util.Scanner;

// Asking user to enter two integers and adding them:
class Adding2num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number: ");
        int a = sc.nextInt();
        System.out.println("Enter the 2nd number");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("The sum of two numbers is: ");
        System.out.println(sum);
        boolean b1 = sc.hasNextInt();
        System.out.println(b1);
        sc.close();
    }
}

// Asking the user to enter his name and save it as a string:
class UserStrInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String Str = sc.nextLine();
        System.out.println(Str);
        sc.close();
    }
}

// Practice set - 1
class StudentPercentage {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your 'Ist Language' marks: ");
    int M1 = sc.nextInt();
    System.out.println("Enter your 'Mathematics' marks: ");
    int M2 = sc.nextInt();
    System.out.println("Enter your 'Science' marks: ");
    int M3 = sc.nextInt();
    System.out.println("Enter your 'Social' marks: ");
    int M4 = sc.nextInt();
    System.out.println("Enter your 'IInd Language' marks: ");
    int M5 = sc.nextInt();
    // int percentage = (M1 + M2 + M3 + M4 + M5 / 2);
    // System.out.println("Your total percentage is: ");
    // System.out.println(percentage);
    float total=(M1 + M2 + M3 + M4 + M5)/5; 
    float perc =(total/500)*100 ; 
    System.out.print("Percentage = "+perc); 
    sc.close();
    }
}