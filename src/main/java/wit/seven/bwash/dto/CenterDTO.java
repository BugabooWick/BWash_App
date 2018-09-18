package wit.seven.bwash.dto;

import wit.seven.bwash.dao.models.Center;

import java.util.Date;
import java.util.List;

public class CenterDTO {
    private Long idCenter;
    private String nameService;
    private Integer phoneService;
    private String pictureService;
    private Date openTimeService;
    private Double pricesService;
    private String descriptionService;
    private Integer rattingService;
    private List<Center> serviceBWashList;

    public List<Center> getServiceBWashList() {
        return serviceBWashList;
    }

    public void setServiceBWashList(List<Center> serviceBWashList) {
        this.serviceBWashList = serviceBWashList;
    }

    public Long getIdCenter() {
        return idCenter;
    }

    public void setIdCenter(Long idCenter) {
        this.idCenter = idCenter;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public Integer getPhoneService() {
        return phoneService;
    }

    public void setPhoneService(Integer phoneService) {
        this.phoneService = phoneService;
    }

    public String getPictureService() {
        return pictureService;
    }

    public void setPictureService(String pictureService) {
        this.pictureService = pictureService;
    }

    public Date getOpenTimeService() {
        return openTimeService;
    }

    public void setOpenTimeService(Date openTimeService) {
        this.openTimeService = openTimeService;
    }

    public Double getPricesService() {
        return pricesService;
    }

    public void setPricesService(Double pricesService) {
        this.pricesService = pricesService;
    }

    public String getDescriptionService() {
        return descriptionService;
    }

    public void setDescriptionService(String descriptionService) {
        this.descriptionService = descriptionService;
    }

    public Integer getRattingService() {
        return rattingService;
    }

    public void setRattingService(Integer rattingService) {
        this.rattingService = rattingService;
    }
}
