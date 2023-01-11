package ICE3.Q3;

import java.util.Date;

public class Ticket {
    private Date screeningDate;
    private String title;

    public Ticket(String title){
        this.screeningDate = new Date();
        this.title = title;
    }

    public double calculatePrice(){
        return 10.00;
    }

}
