package wit.seven.bwash.dto;

import java.util.Date;

public class UserDTO {
    private Long idUser;
    private String nameUser;
    private String phoneUser;
    private String localUser;
    private Date timeUser;
    private String requestUser;

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
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
