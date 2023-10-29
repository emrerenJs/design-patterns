package observer;

import java.util.Scanner;

public class Main {
    private static void runApp() {
        Scanner scanner = new Scanner(System.in);
        boolean isContinue = true;
        while (isContinue) {
            System.out.println("Choose an application");
            System.out.println("1 - Weather Station");
            System.out.println("Press any key to exit");
            String str = scanner.nextLine();
            switch (str) {
                case "1": {
                    observer.WeatherStation.Main.main();
                    break;
                }
                default: {
                    System.out.println("Goodbye (Observer)");
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
