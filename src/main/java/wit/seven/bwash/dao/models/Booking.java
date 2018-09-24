package wit.seven.bwash.dao.models;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Booking {
    private String bookLocation;
    private Boolean bookStatus;

    public String getBookLocation() {
        return bookLocation;
    }

    public void setBookLocation(String bookLocation) {
        this.bookLocation = bookLocation;
    }

    public Boolean getBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(Boolean bookStatus) {
        this.bookStatus = bookStatus;
    }

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @ManyToOne
    @JoinColumn(name = "service_id")
    private ServiceCenter serviceCenter;

    public ServiceCenter getServiceCenter() {
        return serviceCenter;
    }

    public void setServiceCenter(ServiceCenter serviceCenter) {
        this.serviceCenter = serviceCenter;
    }
}
