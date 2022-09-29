package se331.rest.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import se331.rest.entity.AuctionItem;

import java.util.Optional;

public interface AuctionDao {

    Page<AuctionItem> getAuctionItems(Integer pageSize, Integer page);

    Optional<AuctionItem> getAuctionItem(Long id);

    Page<AuctionItem> getAuctionItems(String description, Integer value, Pageable page);

    Page<AuctionItem> getAuctionItemFromValue(Integer value, Pageable page);
}
