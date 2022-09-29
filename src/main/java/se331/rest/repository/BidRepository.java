package se331.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se331.rest.entity.Bid;

import java.util.List;

public interface BidRepository extends JpaRepository<Bid, Long> {

}
