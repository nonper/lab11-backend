package se331.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import se331.rest.entity.AuctionItem;
import se331.rest.entity.Event;
import se331.rest.service.AuctionService;
import se331.rest.util.LabMapper;


@RestController
public class AuctionController {

    @Autowired
    AuctionService auctionService;

    @GetMapping("auction")
    public ResponseEntity<?> getAuctionItems(@RequestParam(value = "_limit", required = false) Integer perPage
            , @RequestParam(value = "_page", required = false) Integer page
            , @RequestParam(value = "description", required = false) String description
            , @RequestParam(value = "successfulBid", required = false) Integer successfulBid){
        perPage = perPage == null ? 10 : perPage;
        page = page == null ? 1 : page;
        Page<AuctionItem> pageOutput;
        if(description == null){
            pageOutput = auctionService.getAuctionItems(perPage, page);
        } else {
            pageOutput =
                    auctionService.getAuctionItems(description, successfulBid, PageRequest.of(page-1,perPage));
        }
        HttpHeaders responseHeader = new HttpHeaders();
        responseHeader.set("x-total-count", String.valueOf(pageOutput.getTotalElements()));

        return new
                ResponseEntity<>(LabMapper.INSTANCE.getAuctionDTO(pageOutput.getContent()),responseHeader, HttpStatus.OK);
    }

//    @GetMapping("/auctions")
//    ResponseEntity<?> getOrganizers() {
//        return ResponseEntity.ok(LabMapper.INSTANCE.getAuctionDTO(auctionService.getAuctionItems()));
//    }

}
