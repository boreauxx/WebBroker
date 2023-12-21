package webbroker.entity.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import webbroker.util.BaseEntity;

import java.math.BigDecimal;

@Entity
@Table(name = "tenants")
@Getter @Setter @NoArgsConstructor
public class Tenant extends BaseEntity {

    @Column(name = "full_name", nullable = false)
    private String fullName;

    @Column(name = "max_rent_price", nullable = false)
    private BigDecimal maxRentPrice;

    @Column(name = "search_description", nullable = false, columnDefinition = "TEXT")
    private String searchDescription;

    @Column(name = "has_pets", nullable = false)
    private boolean hasPets = false;

    @ManyToOne
    @JoinColumn(name = "broker_id")
    private Broker broker;
}
