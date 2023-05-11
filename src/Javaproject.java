import javax.swing.*;
import java.awt.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Javaproject  extends Inheritance {
    public static void main(String[] args) {


         JPanel panel= new JPanel(null);
        JFrame frame = new JFrame();
        frame.setSize(950, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle(" Mobile Book Management System.");
        frame.setVisible(true);
        frame.add(panel);

        panel.setLayout(null);
        JLabel J=new JLabel("UserName");
        J.setBounds(10,20,80,25);
        panel.add(J);

        frame.setVisible(true);

        JTextField test=new JTextField(20);
test.setBounds(100,20,165,25);
panel.add(test);


JLabel pass=new JLabel("Password");

pass.setBounds(10,50,80,25);
panel.add(pass);



        //frame.setVisible(true);
        JTextField passtext=new JTextField();
        passtext.setBounds(100,50,80,25);
        panel.add(passtext);

        Button btn=new Button("SUBMIT");
        btn.setBounds(80,80,100,50);

frame.add(btn);

        frame.setVisible(true);
//frame.setLayout(null);
//frame.setVisible(true);









        Inheritance p = new Inheritance();
       p.wellcome();


        System.out.println("    LOGIN   ");
        Scanner input1 = new Scanner(System.in);


        System.out.println("Enter Username :");

        Scanner input = new Scanner(System.in);
        String username = input.next();
        String password = input.next();
        Pattern pattern = Pattern.compile("((?=.*[A-Z])(?=.*[a-z])(?=.*[0-9]).{7,20})");// must have to give that one capital letter,small,letter,or any number.....
        Matcher matcher = pattern.matcher(username);


        if (matcher.matches()) {
            System.out.println();
        } else {
            System.out.println("Invalid Username!");
return;
        }

        Pattern pattern1 = Pattern.compile("((?=.*[0-9])(?=.*[#@$%&!?_]).{6,12})");//password more than 6 number and any symbol and any number
        Matcher matcher1 = pattern1.matcher(password);


        if (matcher1.find()) {


            System.out.println("Access Granted! Welcome To  Moblile Book Store Management System!");
        }

else{
            System.out.println("Invalid Password!");
            return;

        }


while (true){
        System.out.println("\t\t\t\t\t*---------------*");

        System.out.println(
                "\t\t\t\t\t\1.Show All Books\n"+
                "\t\t\t\t\t\2.Buying Books\n"+
                "\t\t\t\t\t\3.Return Book\n"+
                " \t\t\t\t\t\4.Bus shedule\n"+
                "\t\t\t\t\t\5.Exit\n");
        System.out.println("Enter Your Choice!");
    Scanner input2 = new Scanner(System.in);
    int ch = input.nextInt();
        switch(ch) {
            case 1:

                System.out.println("\t\t* Show All Book: \n");
                showallbooks();
                int ch1 = input.nextInt();
                switch (ch1) {
                    case 2:
                        Buyingbooks();


                }
                break;


            case 2:

                System.out.println(" \t\t*Buying Books:");
                Buyingbooks();

                int ch2 = input.nextInt();
                switch (ch2) {

                    case 3:
                        Returnbooks();

                }
                break;


            case 3:

                System.out.println("\t\t*Return Book: ");
                Returnbooks();

                int ch3 = input.nextInt();
                switch (ch3) {

                    case 4:
                        busshedule();
                }

                break;

            case 4:

                System.out.println("\t\t*Show where the bus will stop and when.* ");
                busshedule();
                break;


            case 5:
                //Exit();
                System.out.println("\t\t*we are exiting system: ");
                return;

            default:
                System.out.println("!!Invalid Input!!\nPress enter and Read Instruction Carefully: ");

                break;

        }
    }
}
}


