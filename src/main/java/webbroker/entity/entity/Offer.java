package webbroker.entity.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;
import webbroker.entity.enums.ApartmentType;
import webbroker.util.BaseEntity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "offers")
@Getter @Setter @NoArgsConstructor
public class Offer extends BaseEntity {

    @Column(name = "apartment_type", nullable = false)
    @Enumerated(EnumType.STRING)
    private ApartmentType apartmentType;

    @Column(name = "brokers_description", columnDefinition = "TEXT")
    private String brokersDescription;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "post_date", nullable = false)
    @DateTimeFormat(pattern = "yyyy/MM/dd hh/MM/ss")
    private LocalDateTime postDate;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private Owner owner;

    @OneToMany(mappedBy = "offer")
    private List<Appointment> appointments;
}
