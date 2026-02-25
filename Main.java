import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Instantiate an ArrayList to hold Restaurant Objects
        ArrayList<Restaurant> restaurantList = new ArrayList<>();

        // Take user input using JOptionPane and store in variable
        String name = JOptionPane.showInputDialog("Enter Restaurant Name: ");
        int waitTime = Integer.parseInt(JOptionPane.showInputDialog("Enter Restaurant Wait Time in Minutes (ex. 30): "));
        double rating = Double.parseDouble(JOptionPane.showInputDialog("Enter Restaurant Rating (ex. 0.0 - 5.0): "));
        double avgPrice = Double.parseDouble(JOptionPane.showInputDialog("Enter Restaurant Average Price (ex. 12.50): "));
        double distance = Double.parseDouble(JOptionPane.showInputDialog("Enter Restaurant Distance in Miles (ex. 6.7: "));
        String hoursOpen = JOptionPane.showInputDialog("Enter Restaurant Hours (ex. 11:00am - 10:00pm): ");



        // Instantiate Restaurant object with those variables
        Restaurant userRestaurant = new Restaurant(name, waitTime, rating, avgPrice, distance, hoursOpen);
        System.out.println(userRestaurant);

        // Add User's restaurant object to the Array List
        restaurantList.add(userRestaurant);
    }

}
