package wit.seven.bwash.dao.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tb_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private long idUser;

    @Column(name = "user_name")
    private String nameUser;

    @Column(name = "user_phone")
    private String phoneUser;

    @Column(name = "user_location")
    private String localUser;

    @Temporal(value = TemporalType.TIMESTAMP)
    @Column(name = "user_time")
    private Date timeUser = new Date();

    @Column(name = "user_request")
    private String requestUser;

    public long getIdUser() {
        return idUser;
    }

    public void setIdUser(long idUser) {
        this.idUser = idUser;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getPhoneUser() {
        return phoneUser;
    }

    public void setPhoneUser(String phoneUser) {
        this.phoneUser = phoneUser;
    }

    public String getLocalUser() {
        return localUser;
    }

    public void setLocalUser(String localUser) {
        this.localUser = localUser;
    }

    public Date getTimeUser() {
        return timeUser;
    }

    public void setTimeUser(Date timeUser) {
        this.timeUser = timeUser;
    }

    public String getRequestUser() {
        return requestUser;
    }

    public void setRequestUser(String requestUser) {
        this.requestUser = requestUser;
    }
}
