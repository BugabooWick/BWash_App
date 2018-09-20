package wit.seven.bwash.dto;

import java.util.Date;

public class ServiceCenterDTO {
    private Long serviceId;
    private String serviceName;
    private String servicePhone;
    private String servicePicture;
    private Date serviceOpenTime;
    private Double servicePrices;
    private String serviceDescription;
    private Integer serviceRatting;

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

    public Integer getServiceRatting() {
        return serviceRatting;
    }

    public void setServiceRatting(Integer serviceRatting) {
        this.serviceRatting = serviceRatting;
    }

    @Override
    public String toString() {
        return "ServiceCenterDTO{" +
                "serviceId=" + serviceId +
                ", serviceName='" + serviceName + '\'' +
                ", servicePhone='" + servicePhone + '\'' +
                ", servicePicture='" + servicePicture + '\'' +
                ", serviceOpenTime=" + serviceOpenTime +
                ", servicePrices=" + servicePrices +
                ", serviceDescription='" + serviceDescription + '\'' +
                ", serviceRatting=" + serviceRatting +
                '}';
    }
}
