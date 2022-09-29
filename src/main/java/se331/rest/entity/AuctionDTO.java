package se331.rest.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuctionDTO {
    Long id;
    String description;
    String type;
    List<AuctionBidDTO> bids;
    BidSuccessfulBidDTO successfulBid;
}
