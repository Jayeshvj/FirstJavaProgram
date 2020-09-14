import java.util.Scanner;


public class SwitchCase {


    public static void main(String[] args) {
        int choice;
        System.out.println("Select Choices 1) C\t 2) C++\t 3) Java\t 4)Python\t");
        Scanner s = new Scanner(System.in);
        choice = s.nextInt();
        switch(choice){
            case 1:
                System.out.println("You love C");
                break;
            case 2:
                System.out.println("You love C++");
                break;
            case 3:
                System.out.println("You love Java");
                break;
            case 4:
                System.out.println("You love Python");
                break;
                default: System.out.println("Invalid Choice");


    }

    }

}
