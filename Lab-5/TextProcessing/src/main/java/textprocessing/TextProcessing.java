package textprocessing;
import java.util.Scanner;

public class TextProcessing {
    private String word;
public TextProcessing(String word) {
        this.word = word;
    }

    private String reversedString(String str) {
        if (str.isEmpty()) {
            return str;  // Base case
        }
        return reversedString(str.substring(1)) + str.charAt(0);  // Recursive case
    }
    public String reverse() {
        return reversedString(word);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a sting to reverse: ");
        String word= sc.nextLine();
        TextProcessing text =new TextProcessing(word);
        System.out.println("The given string is: "+ text.word);
        System.out.println("The reversed string is: "+ text.reverse());
    }
}
