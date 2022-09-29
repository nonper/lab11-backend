package se331.rest.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.text.DateFormat;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BidDTO {
    Long id;
    Integer amount;
    DateFormat datetime;
    AuctionItem item;
}
