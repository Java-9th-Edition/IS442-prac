package ICE3.Q3;

public class AdvancedBookingTicket extends Ticket {
    private int numDaysInAdvance;

    public AdvancedBookingTicket (String title, int numDaysInAdvance){
        super(title);
        this.numDaysInAdvance = numDaysInAdvance;
    }

    public double calculatePrice() {
        double halfOriginalPrice = super.calculatePrice() / 2;
        double finalPrice = super.calculatePrice();
        while (this.numDaysInAdvance > 0) {
            if (finalPrice > halfOriginalPrice){
                finalPrice /= 2;
            }
            this.numDaysInAdvance--;
        }
        return finalPrice;
    }

}
