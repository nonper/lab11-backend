package se331.rest.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import se331.rest.entity.AuctionItem;

import java.util.List;

public interface AuctionRepository extends JpaRepository<AuctionItem, Long> {
    List<AuctionItem> findAll();

    Page<AuctionItem> findByDescriptionContainingOrSuccessfulBid_AmountContaining(
            String description, Integer successfulBidValues, Pageable page);

    Page<AuctionItem> findByDescriptionContainingOrTypeContainingOrSuccessfulBid_AmountLessThanEqual(String description, String type, Integer value, Pageable pageRequest);

    Page<AuctionItem> findBySuccessfulBid_AmountLessThanEqual(Integer value, Pageable pageRequest);
}
