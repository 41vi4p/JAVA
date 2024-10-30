// Flight Class
class Flight {
    private String flightNumber;
    private int availableSeats;

    public Flight(String flightNumber, int availableSeats) {
        this.flightNumber = flightNumber;
        this.availableSeats = availableSeats;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void bookSeat() throws Exception {
        if (availableSeats <= 0) {
            throw new Exception("No available seats on flight " + flightNumber);
        }
        availableSeats--;
    }
}

// Customer Class
class Customer {
    private String name;
    private String email;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}

// FlightBookingSystem Class
public class FlightBookingSystem {

    public static void bookFlight(Customer customer, Flight flight, double paymentAmount) {
        try {
            validateInput(customer, flight, paymentAmount);
            flight.bookSeat();
            processPayment(paymentAmount);
            System.out.println("Flight booked successfully for " + customer.getName());
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public static void validateInput(Customer customer, Flight flight, double paymentAmount) throws Exception {
        if (customer.getName() == null || customer.getName().isEmpty()) {
            throw new Exception("Customer name is invalid");
        }
        if (customer.getEmail() == null || customer.getEmail().isEmpty()) {
            throw new Exception("Customer email is invalid");
        }
        if (flight == null) {
            throw new Exception("Flight is invalid");
        }
        if (paymentAmount <= 0) {
            throw new Exception("Payment amount is invalid");
        }
    }

    public static void processPayment(double amount) throws Exception {
        if (amount <= 0) {
            throw new Exception("Invalid payment amount");
        }
        // Simulate payment processing
        System.out.println("Payment of $" + amount + " processed successfully.");
    }

    public static void main(String[] args) {
        Customer customer = new Customer("John Doe", "john.doe@example.com");
        Flight flight = new Flight("AB123", 2);

        // Successful booking
        bookFlight(customer, flight, 300.0);

        // Attempt to book with invalid payment amount
        bookFlight(customer, flight, -50.0);

        // Attempt to book with no available seats
        bookFlight(customer, flight, 300.0);
        bookFlight(customer, flight, 300.0);
    }
}