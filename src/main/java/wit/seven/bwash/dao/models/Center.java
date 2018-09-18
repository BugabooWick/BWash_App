package wit.seven.bwash.dao.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tb_center")
public class Center {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "center_id")
    private Long idCenter;

    @Column(name = "service_name")
    private String nameService;

    @Column(name = "service_phone")
    private String phoneService;

    @Column(name = "service_picture")
    private String pictureService;

    @Temporal(value = TemporalType.TIMESTAMP)
    @Column(name = "service_open_time")
    private Date openTimeService = new Date();

    @Column(name = "service_price")
    private Double pricesService;

    @Column(name = "service_description")
    private String descriptionService;

    @Column(name = "service_ratting")
    private Integer rattingService;


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

    public String getPhoneService() {
        return phoneService;
    }

    public void setPhoneService(String phoneService) {
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
