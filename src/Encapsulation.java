import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Encapsulation extends Polymorphism {

    String name;
    String email;
    String address;
    String peraddress;
    String moboile;
    String date;
    double payments;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;

        Pattern pattern3 = Pattern.compile("((?=.*[a-z])([0-9])(?=.*[@.]).{10,30})");// must have to given small latter and @ and . or any number......
        Matcher matcher3 = pattern3.matcher(email);


        if (matcher3.find()) {


            System.out.println("");
        }

        else{
            System.out.println("Invalid email!");


        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPeraddress() {
        return peraddress;
    }

    public void setPeraddress(String peraddress) {
        this.peraddress = peraddress;
    }




    public String getMoboile() {
        return moboile;
    }

    public void setMoboile(String moboile) {
        this.moboile = moboile;



        Pattern pattern2 = Pattern.compile("((?=.*[0-9]).{11,11})");//must have to give 11 degite number....
        Matcher matcher2 = pattern2.matcher(moboile);


        if (matcher2.find()) {


            System.out.println("");
        }

        else{
            System.out.println("Invalid Mobile Number!");


        }
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getPayments() {
        return payments;
    }

    public void setPayments(double payments) {
        this.payments = payments;
    }


}
