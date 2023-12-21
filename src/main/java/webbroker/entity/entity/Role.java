package webbroker.entity.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import webbroker.entity.enums.BrokerRole;
import webbroker.util.BaseEntity;

import java.util.List;

@Entity
@Table(name = "roles")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Role extends BaseEntity {

    @Column(name = "name", nullable = false)
    @Enumerated(EnumType.STRING)
    private BrokerRole name;

    @OneToMany(mappedBy = "role")
    private List<Broker> brokers;
}
