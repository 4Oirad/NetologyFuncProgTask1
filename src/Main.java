import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст записки местного жителя:");
        String aboriginalNote = scanner.nextLine();
        System.out.println("Получился такой словарь:");
        System.out.println(dictionary.apply(aboriginalNote));
    }
}
