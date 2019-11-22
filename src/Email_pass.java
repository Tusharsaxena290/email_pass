import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Email_pass {
    public static void main(String[] args) {
        String regex1="[a-z]{4,12}.[a-z]{4,12}_iot1\\\\d{1}@gla.ac.in";
        String regex2="\\w{12}";
        Pattern p1=Pattern.compile(regex1);

        Pattern p2=Pattern.compile(regex2);
        Scanner sc=new Scanner(System.in);
        String username=sc.nextLine().trim();
        String pass=sc.nextLine().trim();
        if(username.matches(String.valueOf(p1))){
            if(pass.matches(String.valueOf(p2))){
                System.out.println("you are good to go");
            }
            else{
                System.out.println("the password is wrong");
            }

        }
        else{
            System.out.println("invalid username");
        }


    }
}
