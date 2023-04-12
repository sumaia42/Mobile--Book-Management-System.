
import java.util.Scanner;
public class Javaproject  extends Inheritance {
    public static void main(String[] args) {
     Inheritance p = new Inheritance();
     p.wellcome();
        String Username;
        String Password;

        Password = "farha123";
        Username = "farha";


        System.out.println("    LOGIN   ");
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter Username : ");
        String username = input1.next();

        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter Password : ");
        String password = input2.next();
        if (username.equals(Username) && password.equals(Password)) {

            System.out.println("Access Granted! Welcome To  Moblile Book Store Management System!");
        }
        else if (username.equals(Username)) {
            System.out.println("Invalid Password!");
            return;
        } else if (password.equals(Password)) {
            System.out.println("Invalid Username!");
            return;
        }
        else{
            System.out.println("Invalid Username & Password!");
            return;
        }




        System.out.println("\t\t\t\t\t*---------------*");

        System.out.println(
                        "\t\t\t\t\t\1.Show All Books\n" +
                        "\t\t\t\t\t\2.Buying Books\n" +
                        "\t\t\t\t\t\3.Return Book\n" +
               " \t\t\t\t\t\4.bus shedule\n"+
                        "\t\t\t\t\t\4.Exit\n");
        System.out.println("Enter Your Choice!");
        Scanner input = new Scanner(System.in);
        int ch = input.nextInt();
        switch (ch) {
            case 1:

                System.out.println("\t\t* Show All Book: \n");
                showallbooks();
                return;
            case 2:

                System.out.println(" \t\t*Buying Books:");
                Buyingbooks();
                return;
            case 3:

                System.out.println("\t\t*Return Book: ");
                Returnbooks();
                return;
            case 4:

                System.out.println("\t\t*Show where the bus will stop and when.* ");
                //new create bus shedule
                return;
            case 5:
                //Exit();
                System.out.println("\t\t*Press enter to continue: ");
                return;
            default:
                System.out.println("!!Invalid Input!!\nPress enter and Read Instruction Carefully: ");
                return;


        }

    }
}
