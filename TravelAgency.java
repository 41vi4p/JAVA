public class TravelAgency {

    // View Customer Name & Itinerary
    public static int getNameLength(String name) {
        return name.length();
    }

    public static int getItineraryLength(String itinerary) {
        return itinerary.length();
    }

    public static char getCharacterFromName(String name, int index) {
        return name.charAt(index);
    }

    // Modify Itinerary
    public static String extractItinerarySection(String itinerary, int start, int end) {
        return itinerary.substring(start, end);
    }

    // Compare Destinations
    public static boolean compareDestinationsCaseSensitive(String destination1, String destination2) {
        return destination1.equals(destination2);
    }

    public static boolean compareDestinationsCaseInsensitive(String destination1, String destination2) {
        return destination1.equalsIgnoreCase(destination2);
    }

    // Update Customer Information
    public static String updateCustomerMiddleName(String fullName, String middleName) {
        String[] parts = fullName.split(" ");
        if (parts.length == 3) {
            parts[1] = middleName;
        }
        return String.join(" ", parts);
    }

    public static String appendVIPStatus(String nameOrItinerary) {
        return nameOrItinerary + " (VIP)";
    }

    // Find Specific Details
    public static int findFirstOccurrence(String itinerary, String city) {
        return itinerary.indexOf(city);
    }

    public static int findLastOccurrence(String itinerary, char character) {
        return itinerary.lastIndexOf(character);
    }

    // Correct Itinerary Errors
    public static String replaceIncorrectDetails(String itinerary, String incorrect, String correct) {
        return itinerary.replace(incorrect, correct);
    }

    // Standardize Names
    public static String convertNameToUpperCase(String name) {
        return name.toUpperCase();
    }

    public static String convertNameToLowerCase(String name) {
        return name.toLowerCase();
    }

    // Trim Unnecessary Spaces
    public static String trimSpaces(String text) {
        return text.trim();
    }

    public static void main(String[] args) {
        // Example usage
        String customerName = "John A. Doe";
        String itinerary = "Flight to Paris, then to Berlin, and finally to Tokyo.";

        System.out.println("Name Length: " + getNameLength(customerName));
        System.out.println("Itinerary Length: " + getItineraryLength(itinerary));
        System.out.println("First Character of Name: " + getCharacterFromName(customerName, 0));
        System.out.println("Extracted Itinerary Section: " + extractItinerarySection(itinerary, 10, 15));
        System.out.println("Compare Destinations (Case Sensitive): " + compareDestinationsCaseSensitive("Paris", "paris"));
        System.out.println("Compare Destinations (Case Insensitive): " + compareDestinationsCaseInsensitive("Paris", "paris"));
        System.out.println("Updated Middle Name: " + updateCustomerMiddleName(customerName, "B."));
        System.out.println("Appended VIP Status: " + appendVIPStatus(customerName));
        System.out.println("First Occurrence of 'Berlin': " + findFirstOccurrence(itinerary, "Berlin"));
        System.out.println("Last Occurrence of 'o': " + findLastOccurrence(itinerary, 'o'));
        System.out.println("Corrected Itinerary: " + replaceIncorrectDetails(itinerary, "Berlin", "Munich"));
        System.out.println("Name in Uppercase: " + convertNameToUpperCase(customerName));
        System.out.println("Name in Lowercase: " + convertNameToLowerCase(customerName));
        System.out.println("Trimmed Name: " + trimSpaces("  John A. Doe  "));
    }
}