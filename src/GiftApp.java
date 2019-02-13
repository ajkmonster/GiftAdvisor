import java.util.ArrayList;
import java.util.Scanner;

public class GiftApp {
    private static Scanner keybd = new Scanner(System.in);
    private static String gender;
    private static String price;
    private static GiftDatabase giftsData;
    private static ArrayList<Gift> gifts;
    private static Gift g;
    private static String newList = "";
    private static String answer ="yes";

    public static void main(String[] args) {
        g = new Gift();
        giftsData = new GiftDatabase();
        gifts = new ArrayList<>();
        giftsData.setGifts(gifts);
        welcomeMessage();
        while(answer.equalsIgnoreCase("yes")) {
            gifter();
            exiter();
        }
    }

    public static void welcomeMessage() {
        System.out.println("Welcome to the Gifter app!");
    }

    public static void gifter() {
        System.out.println("Please enter the gender you are buying for " + "\"male\"" + " or " + "\"female\"" + "?");
        gender = keybd.nextLine();
        gender = returnUpper(gender);
        g.setName("");
        g.setGender(gender);
        System.out.println("Please enter the price you are buying at (high/medium/low): ");
        price = keybd.nextLine();
        price = returnUpper(price);
        g.setPrice(price);
        for (Gift newGifts : gifts) {
            if (g.getGender().equalsIgnoreCase(newGifts.getGender()) && g.getPrice().equalsIgnoreCase(newGifts.getPrice())) {
                newList +=newGifts.getName()+",";
            }
        }

        if (newList.equalsIgnoreCase("")) {
            System.out.println("We do not have any suggestions with what you input. We are truly sorry.");
        } else {
            newList = removeEnd(newList);
            System.out.println("The products we suggest you could buy for a "+gender.toLowerCase()+" and a "+price.toLowerCase()+" price: "+newList);
        }
    }

    public static void exiter() {
        System.out.println("Would you like to find another gift? (yes/no): ");
        answer = keybd.nextLine();
        if (answer.equalsIgnoreCase("yes")) {
            newList="";
        } else {
            System.out.println("Thank you for using the app!");
        }
    }

    //below is used to return a capitalized word.
    public static String returnUpper(String upper) {
        upper = upper.substring(0, 1).toUpperCase() + upper.substring(1).toLowerCase();
        return upper;
    }
    //below is used to delete the last character in a string and make sure it's a comma
    public static String removeEnd(String str) {
        if (str.charAt(str.length() - 1) == ',') {
            str = str.substring(0, str.length() - 1);
        }
        return str;
    }
}
