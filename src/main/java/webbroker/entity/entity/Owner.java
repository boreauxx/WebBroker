package webbroker.entity.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import webbroker.util.BaseEntity;

import java.util.List;

@Entity
@Table(name = "owners")
@Getter @Setter @NoArgsConstructor
public class Owner extends BaseEntity {

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "phone_number", nullable = false)
    private String phoneNumber;

    @OneToMany(mappedBy = "owner")
    private List<Offer> offers;
}
