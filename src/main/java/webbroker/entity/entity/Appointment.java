package webbroker.entity.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import webbroker.util.BaseEntity;

@Entity
@Table(name = "appointments")
@Getter @Setter @NoArgsConstructor
public class Appointment extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "offer_id")
    private Offer offer;

    @ManyToOne
    @JoinColumn(name = "broker_id")
    private Broker broker;
}
