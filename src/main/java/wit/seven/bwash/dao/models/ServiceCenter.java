package wit.seven.bwash.dao.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "service_center")
public class ServiceCenter implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "service_id")
    private Long serviceId;

    @Column(name = "service_name")
    private String serviceName;

    @Column(name = "service_phone")
    private String servicePhone;

    @Column(name = "service_picture")
    private String servicePicture;

    @Temporal(value = TemporalType.TIMESTAMP)
    @Column(name = "service_open_time")
    private Date serviceOpenTime = new Date();

    @Column(name = "service_lat")
    private Double serviceLat;

    @Column(name = "service_lng")
    private Double serviceLng;

    @Column(name = "service_prices")
    private Double servicePrices;

    @Column(name = "service_description")
    private String serviceDescription;

    @Column(name = "service_rating")
    private Integer serviceRating;

    @OneToMany(mappedBy = "serviceCenter")
    private Set<Booking> bookings;

    public Set<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(Set<Booking> bookings) {
        this.bookings = bookings;
    }

    public Long getServiceId() {
        return serviceId;
    }

    public void setServiceId(Long serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServicePhone() {
        return servicePhone;
    }

    public void setServicePhone(String servicePhone) {
        this.servicePhone = servicePhone;
    }

    public String getServicePicture() {
        return servicePicture;
    }

    public void setServicePicture(String servicePicture) {
        this.servicePicture = servicePicture;
    }

    public Date getServiceOpenTime() {
        return serviceOpenTime;
    }

    public void setServiceOpenTime(Date serviceOpenTime) {
        this.serviceOpenTime = serviceOpenTime;
    }

    public Double getServiceLat() {
        return serviceLat;
    }

    public void setServiceLat(Double serviceLat) {
        this.serviceLat = serviceLat;
    }

    public Double getServiceLng() {
        return serviceLng;
    }

    public void setServiceLng(Double serviceLng) {
        this.serviceLng = serviceLng;
    }

    public Double getServicePrices() {
        return servicePrices;
    }

    public void setServicePrices(Double servicePrices) {
        this.servicePrices = servicePrices;
    }

    public String getServiceDescription() {
        return serviceDescription;
    }

    public void setServiceDescription(String serviceDescription) {
        this.serviceDescription = serviceDescription;
    }

    public Integer getServiceRating() {
        return serviceRating;
    }

    public void setServiceRating(Integer serviceRating) {
        this.serviceRating = serviceRating;
    }
}
