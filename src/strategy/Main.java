package strategy;

import java.util.Scanner;

public class Main {

    private static void runApp() {
        Scanner scanner = new Scanner(System.in);
        boolean isContinue = true;
        while (isContinue) {
            System.out.println("Choose an application");
            System.out.println("1 - RPGGame");
            System.out.println("Press any key to exit");
            String str = scanner.nextLine();
            switch (str) {
                case "1": {
                    strategy.RPGGame.Main.main();
                    break;
                }
                default: {
                    System.out.println("Goodbye (Strategy)");
                    isContinue = false;
                    scanner.close();
                    break;
                }
            }
        }
    }
    
    public static void main() {
        runApp();
    }
}
