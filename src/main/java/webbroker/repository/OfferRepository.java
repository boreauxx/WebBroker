package webbroker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import webbroker.entity.entity.Offer;

@Repository
public interface OfferRepository extends JpaRepository<Offer, Long> {
}
