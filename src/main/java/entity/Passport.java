package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name="Passport")
public class Passport {
    @Id
    @GeneratedValue
    private int id;
    private Date passportExpiryDate;
    private boolean isPassportValid;
    private int citizenId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getPassportExpiryDate() {
        return passportExpiryDate;
    }

    public void setPassportExpiryDate(Date passportExpiryDate) {
        this.passportExpiryDate = passportExpiryDate;
    }

    public boolean isPassportValid() {
        return isPassportValid;
    }

    public void setPassportValid(boolean passportValid) {
        isPassportValid = passportValid;
    }

    public int getCitizenId() {
        return citizenId;
    }

    public void setCitizenId(int citizenId) {
        this.citizenId = citizenId;
    }
}
