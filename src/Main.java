import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class Main {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        while(true)
        {
            System.out.println("Введите IP адресс или exit для завершения");
            String IP=scanner.next();
            if (IP.equalsIgnoreCase("exit"))
            {
                break;
            }
            boolean bool= check_patern(IP);
            if(bool==true) {
                System.out.println("Строка является IP адресом");
            }
            else {
                System.out.println("Строка не является IP адресом");
            }
        }



    }
    public static boolean check_patern( String IP)
    {
        String patern = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
        Pattern pattern = Pattern.compile(patern);
        Matcher matcher = pattern.matcher(IP);
        return matcher.matches();
    }

}