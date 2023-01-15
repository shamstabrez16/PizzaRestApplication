package pizza.com.PizzaRestApplication.Entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity(name = "time_slots")
public class Time_slots {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private  String slot_type;
    private Date start_time ;
    private Date end_time;
    private  int availability ;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Time_slots{" +
                "id=" + id +
                ", slot_type='" + slot_type + '\'' +
                ", start_time=" + start_time +
                ", end_time=" + end_time +
                ", availability=" + availability +
                '}';
    }

    public String getSlot_type() {
        return slot_type;
    }

    public void setSlot_type(String slot_type) {
        this.slot_type = slot_type;
    }

    public Date getStart_time() {
        return start_time;
    }

    public void setStart_time(Date start_time) {
        this.start_time = start_time;
    }

    public Date getEnd_time() {
        return end_time;
    }

    public void setEnd_time(Date end_time) {
        this.end_time = end_time;
    }

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }
}
