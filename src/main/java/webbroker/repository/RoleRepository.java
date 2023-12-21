package webbroker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import webbroker.entity.entity.Role;
import webbroker.entity.enums.BrokerRole;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByName(BrokerRole role);
}
