import java.util.Scanner;

public class App {

    private static void runApp() {
        Scanner scanner = new Scanner(System.in);
        boolean isContinue = true;
        while (isContinue) {
            System.out.println("Choose a pattern");
            System.out.println("1 - strategy");
            System.out.println("2 - observer");
            System.out.println("Press any key to exit");
            String str = scanner.nextLine();
            switch (str) {
                case "1": {
                    strategy.Main.main();
                    break;
                }
                case "2": {
                    observer.Main.main();
                    break;
                }
                default: {
                    System.out.println("Goodbye..");
                    isContinue = false;
                    scanner.close();
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        runApp();
    }
}
