package se331.rest.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import se331.rest.entity.AuctionItem;

import java.util.List;
import java.util.Optional;

public interface AuctionService {
    Page<AuctionItem> getAuctionItems(Integer pageSize, Integer page);

    Optional<AuctionItem> getAuctionItem(Long id);

    Page<AuctionItem> getAuctionItems(String description, String type, Integer value, Pageable pageable);

    Page<AuctionItem> getAuctionItemFromValue(Integer value, Pageable pageable);
}
