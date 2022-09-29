package se331.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import se331.rest.dao.AuctionDao;
import se331.rest.entity.AuctionItem;
import se331.rest.entity.Organizer;

import java.util.List;
import java.util.Optional;

@Service
public class AuctionServiceImpl implements AuctionService{

    @Autowired
    AuctionDao auctionDao;
    @Override
    public Page<AuctionItem> getAuctionItems(Integer pageSize, Integer page) {
        return auctionDao.getAuctionItems(pageSize, page);
    }

    @Override
    public Optional<AuctionItem> getAuctionItem(Long id) {
        return auctionDao.getAuctionItem(id);
    }

    @Override
    public Page<AuctionItem> getAuctionItems(String description,String type, Integer value, Pageable pageable) {
        return auctionDao.getAuctionItems(description, type , value ,pageable);
    }

    @Override
    public Page<AuctionItem> getAuctionItemFromValue(Integer value, Pageable pageable) {
        return auctionDao.getAuctionItemFromValue(value, pageable);
    }

}
