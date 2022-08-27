import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose the region of Kyrgyzstan: ");
        String region = scanner.nextLine();
        String result = "";
        int a = 0;
        while (!region.equals("")) {
            switch (region) {
                case "BATKEN":
                    result = Regions.BATKEN.getDescript();
                    a = 1;
                    break;
                case "ISSYKKUL":
                    result = Regions.ISSYKKUL.getDescript();
                    a = 1;
                    break;
                case "NARYN":
                    result = Regions.NARYN.getDescript();
                    a = 1;
                    break;
                case "OSH":
                    result = Regions.OSH.getDescript();
                    a = 1;
                    break;
                case "JALALABAD":
                    result = Regions.JALALABAD.getDescript();
                    a = 1;
                    break;
                case "CHUY":
                    result = Regions.CHUY.getDescript();
                    a = 1;
                    break;
                case "TALAS":
                    result = Regions.TALAS.getDescript();
                    a = 1;
                    break;
                default:
                    result = "The wrong region was selected, please enter the region again: ";
                    a = 0;
                    break;
            }
            System.out.print(result);
            if (a == 1) {
                break;
            }
            region = scanner.nextLine();
        }
    }
}