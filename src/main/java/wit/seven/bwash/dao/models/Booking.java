package wit.seven.bwash.dao.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "booking")
public class Booking implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "booking_id")
    private Long bookingId;

    @Column(name = "booking_lat")
    private Double bookLat;

    @Column(name = "booking_lng")
    private Double bookLng;

    @Column(name = "booking_status")
    private Boolean bookStatus;

    @Column(name = "booking_time")
    private Date bookingTime;

    @Column(name = "booking_request")
    private String bookingRequest;

    @ManyToOne
    @Id
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @Id
    @JoinColumn(name = "service_id")
    private ServiceCenter serviceCenter;

    public Double getBookLat() {
        return bookLat;
    }

    public void setBookLat(Double bookLat) {
        this.bookLat = bookLat;
    }

    public Long getBookingId() {
        return bookingId;
    }

    public void setBookingId(Long bookingId) {
        this.bookingId = bookingId;
    }

    public Double getBookLng() {
        return bookLng;
    }

    public void setBookLng(Double bookLng) {
        this.bookLng = bookLng;
    }

    public Boolean getBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(Boolean bookStatus) {
        this.bookStatus = bookStatus;
    }

    public Date getBookingTime() {
        return bookingTime;
    }

    public void setBookingTime(Date bookingTime) {
        this.bookingTime = bookingTime;
    }

    public String getBookingRequest() {
        return bookingRequest;
    }

    public void setBookingRequest(String bookingRequest) {
        this.bookingRequest = bookingRequest;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ServiceCenter getServiceCenter() {
        return serviceCenter;
    }

    public void setServiceCenter(ServiceCenter serviceCenter) {
        this.serviceCenter = serviceCenter;
    }
}
