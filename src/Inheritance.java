import java.util.Scanner;

public class Inheritance extends Encapsulation {



    static void payments(double c){
        double b =(c-c*0.1);
        System.out.println("The  final payments is :"+b);
    }


      static void showallbooks(){
          System.out.println("1. History Books");
          System.out.println("2.Si-fi Books");
          System.out.println("3.Horror Books");
          System.out.println("4.Classical Books");
          System.out.println("5.Kids Books");
          System.out.println("6.Study Books");
          System.out.println("7.Job Books");
     }
     static void Buyingbooks() {
         String name1;
         Scanner input = new Scanner(System.in);
         name1 = input.nextLine();
Encapsulation a=new Encapsulation();

         if(name1.equals("History Books")||name1.equals("Si-fi Books")||name1.equals("Horror Books")||name1.equals("Classical Books")||name1.equals("Kids Books")||name1.equals("Study Books")){
             System.out.println("Available books in the store");
             System.out.println("All information");

             System.out.println("Enter your name:");
             a.setName(input.next());

             System.out.println("Enter your email:");
             a.setEmail(input.next());

             System.out.println("Enter your address:");
             a.setAddress(input.next());

             System.out.println("Enter your permanent address:");
             a.setPeraddress(input.next());

             System.out.println("Enter your phone number:");
             a.setMoboile(input.next());

             System.out.println("Enter today's Date:");

             a.setDate(input.next());

             System.out.println("Enter your payments:");
             a.setPayments(input.nextDouble());



             System.out.println("*-------------*");

             System.out.println("\t1.FULL NAME:"+ a.getName());
             System.out.println("\t2.EMAIL ADDRESS:"+a.getEmail());
             System.out.println("\t3.PRESENT ADDRESS:"+a.getAddress());
             System.out.println("\t4.PERMANENT Books:"+a.getPeraddress());
             System.out.println("\t5.MOBILE NUMBER:"+a.getMoboile());
             System.out.println("\t6.Date:"+a.getDate());
             System.out.println("\t7.Payments"+a.getPayments());

          payments(a.getPayments());


         }
         else {
             System.out.println(" Not available books in the store");
         }

     }

    static void Returnbooks(){
        String day;
        String C ="1";
        System.out.println(" Books must be returned within 1 day");
        System.out.println("*-------------*");
        Scanner input = new Scanner(System.in);
        day = input.nextLine();
        if(day.equals(C)) {


            System.out.println(" Available to return books");
        }
        else{
            System.out.println(" Not return books");
        }

}

static void  busshedule(){





    System.out.println("Friday 4 pm will go to Mirpur");
    System.out.println("Sunday 2 pm will go to uttara");
    System.out.println("Tuesday 4 pm will go to Mirpur12");
    System.out.println("Monday 3 pm will go to DhanmondiF");
    }

     }
