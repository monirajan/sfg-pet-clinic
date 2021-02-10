package guru.springframework.sfgpetclinic.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "visits")
public class Visit extends BaseEntity{

    private LocalDate date;
    private String descrption;

    @ManyToOne
    @JoinColumn(name = "pet_id")
    private Pet pet;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDescrption() {
        return descrption;
    }

    public void setDescrption(String descrption) {
        this.descrption = descrption;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
