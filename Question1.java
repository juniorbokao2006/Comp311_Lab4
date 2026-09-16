import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        String[] wordList = new String[20];
        int size = 0;

        try {
            Scanner inputScanner = new Scanner(new File("names.txt"));

            while (inputScanner.hasNext() && size < wordList.length) {
                wordList[size++] = inputScanner.next();
            }

            inputScanner.close();

            System.out.println("Read " + size + " word(s) from names.txt:");
            for (int index = 0; index < size; index++) {
                int displayNum = index + 1;
                System.out.println(displayNum + ". " + wordList[index]);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Could not find names.txt. Make sure it is in the same folder as this program.");
        }
    }
}