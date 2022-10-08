import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class lol {
    public static void main(String[] args) throws IOException {

        Scanner askPass = new Scanner(System.in);
        System.out.println("Enter password: ");

        String password = askPass.nextLine();
        String realPass = "i";

        if (password.equals(realPass)) {
            Scanner askDate = new Scanner(System.in);
            System.out.println("Enter Date: ");
            String date = askDate.nextLine();

            Scanner askEntry = new Scanner(System.in);
            System.out.println("How was you day? ");
            String entry = askEntry.nextLine();

            FileWriter filewriter = new FileWriter("/Users/haideral-zubaidi/Documents/JavaCoding/Diary/src/main/java");
            filewriter.write(date + "" + entry);
            filewriter.close();

        }
        else {
            System.out.println("Wrong password bitch");
        }

    }
}
