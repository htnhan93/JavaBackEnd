package hnt_15hcb2.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by htnha on 18/05/2017.
 */
@Entity
@Table(name = "Master")
public class MasterEntity {

    @NotNull
    @Size(max = 10)
    @Column(name = "MasterID", nullable = false)
    private String MasterID;

    @Size(max = 255)
    @Column(name = "MasterName")
    private String MasterName;

    @Size(max = 255)
    @Column(name = "Phone")
    private String Phone;

    @Size(max = 255)
    @Column(name = "Email")
    private String Email;

    @Column(name = "Status")
    private boolean Status;

    public String getMasterID() {
        return MasterID;
    }

    public void setMasterID(String masterID) {
        MasterID = masterID;
    }

    public String getMasterName() {
        return MasterName;
    }

    public void setMasterName(String masterName) {
        MasterName = masterName;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public boolean isStatus() {
        return Status;
    }

    public void setStatus(boolean status) {
        Status = status;
    }
}
