package webbroker.entity.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import webbroker.util.BaseEntity;

import java.util.List;

@Entity
@Table(name = "brokers")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Broker extends BaseEntity {

    @Column(name = "username", nullable = false, unique = true)
    private String username;

    @Column(name = "password", nullable = false)
    private String password;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;

    @OneToMany(mappedBy = "broker")
    private List<Tenant> tenants;

    @OneToMany(mappedBy = "broker")
    private List<Appointment> appointments;
}
