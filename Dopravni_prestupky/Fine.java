package Dopravni_prestupky;

public class Fine {
    private String message;
    private double amount;

    public Fine(String message, double amount) {
        this.message = message;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return String.format("Fine: %s, Amount: %.2f", message, amount);
    }
}
