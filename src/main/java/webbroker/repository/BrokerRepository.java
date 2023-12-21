package webbroker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import webbroker.entity.entity.Broker;

@Repository
public interface BrokerRepository extends JpaRepository<Broker, Long> {
}
