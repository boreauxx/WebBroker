package webbroker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import webbroker.entity.entity.Tenant;

@Repository
public interface TenantRepository extends JpaRepository<Tenant, Long> {
}
