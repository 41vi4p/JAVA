import java.util.*;

class noseats extends Exception 
{
    public noseats(String message) {
        super(message);
    }
}

class paymenterror extends Exception 
{
    public paymenterror(String message) {
        super(message);
    }
}

class Flight 
{
    int seats = 2; 
    void bookflight() throws noseats, paymenterror
    {
        Scanner s = new Scanner(System.in);
        if (seats <= 0) 
        {
            throw new noseats("No seats available on this flight.");
        }
        System.out.print("Enter payment amount: ");
        double paymentAmount = s.nextDouble();
        if (paymentAmount < 5000) 
        {
            throw new paymenterror("Payment must be at least 5000 rupees.");
        }

        // Confirm booking and reduce seat count
        seats--;
        System.out.println("Booking confirmed! Seats remaining: " + seats);
    }
}
public class Airlines
{
    public static void main(String[] args) {
        System.out.println("Welcome to Aahana Airlines:");
        Flight f= new Flight();
        try 
        {
            f.bookflight();
        } 
        catch (noseats e) 
        {
            System.err.println("Error: " + e.getMessage());
        } 
        catch (paymenterror e) 
        {
            System.err.println("Error: " + e.getMessage());
        } 
        finally 
        {
            System.out.println("Thank you for choosing Aahana Airlines.");
        }
    }
}