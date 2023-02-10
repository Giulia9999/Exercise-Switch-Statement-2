import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Start {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String input = "";

        while(true){
            System.out.print("Enter a string: ");
            input = scanner.nextLine();
            switch (input) {
                case "size" -> System.out.println(list.size());
                case "clear" -> list.clear();
                case "print" -> System.out.println(list);
                case "stop" -> System.exit(0);
                default -> list.add(input);
            }
        }
    }
}
