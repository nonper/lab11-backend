package se331.rest.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import se331.rest.entity.AuctionItem;
import se331.rest.entity.Bid;
import se331.rest.entity.Event;
import se331.rest.entity.Organizer;
import se331.rest.repository.AuctionRepository;
import se331.rest.repository.BidRepository;
import se331.rest.repository.EventRepository;
import se331.rest.repository.OrganizerRepository;

import javax.transaction.Transactional;

@Component
public class InitApp implements ApplicationListener<ApplicationReadyEvent> {
    @Autowired
    EventRepository eventRepository;

    @Autowired
    OrganizerRepository organizerRepository;

    @Autowired
    AuctionRepository auctionRepository;

    @Autowired
    BidRepository bidRepository;

    @Override
    @Transactional
    public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent) {
        Bid bid1, bid2, bid3, bid4, bid5, bid6,bid7,bid8,bid9,bid10,bid11,bid12,bid13,bid14,bid15 ,succ1, succ2, succ3;
        bid1 = bidRepository.save(Bid.builder()
                .amount(120)
                .datetime("21-09-2020")
                .build());
        bid2 = bidRepository.save(Bid.builder()
                .amount(180)
                .datetime("22-09-2020")
                .build());
        bid3 = bidRepository.save(Bid.builder()
                .amount(380)
                .datetime("24-09-2020")
                .build());
        bid4 = bidRepository.save(Bid.builder()
                .amount(230)
                .datetime("22-09-2020")
                .build());
        bid5 = bidRepository.save(Bid.builder()
                .amount(80)
                .datetime("21-09-2020")
                .build());
        bid6 = bidRepository.save(Bid.builder()
                .amount(1180)
                .datetime("23-09-2020")
                .build());
        bid7 = bidRepository.save(Bid.builder()
                .amount(80)
                .datetime("21-09-2020")
                .build());
        bid8 = bidRepository.save(Bid.builder()
                .amount(180)
                .datetime("22-09-2020")
                .build());
        bid9 = bidRepository.save(Bid.builder()
                .amount(1180)
                .datetime("23-09-2020")
                .build());
        bid10 = bidRepository.save(Bid.builder()
                .amount(10)
                .datetime("20-09-2020")
                .build());
        bid11 = bidRepository.save(Bid.builder()
                .amount(110)
                .datetime("22-09-2020")
                .build());
        bid12 = bidRepository.save(Bid.builder()
                .amount(1180)
                .datetime("24-09-2020")
                .build());
        bid13 = bidRepository.save(Bid.builder()
                .amount(120)
                .datetime("23-09-2020")
                .build());
        bid14 = bidRepository.save(Bid.builder()
                .amount(1180)
                .datetime("26-09-2020")
                .build());
        bid15 = bidRepository.save(Bid.builder()
                .amount(11180)
                .datetime("30-09-2020")
                .build());

        succ1 = bidRepository.save(Bid.builder()
                .amount(180)
                .build());
        succ2 = bidRepository.save(Bid.builder()
                .amount(280)
                .build());
        succ3 = bidRepository.save(Bid.builder()
                .amount(350)
                .build());
        AuctionItem tempAuc = null;
        tempAuc = auctionRepository.save(AuctionItem.builder()
                .description("This is a pen")
                .type("Stationery")
                .successfulBid(succ1)
                .build());
        tempAuc.getBids().add(bid1);
        tempAuc.getBids().add(bid2);
        tempAuc.getBids().add(bid3);
        bid1.setItem(tempAuc);
        bid2.setItem(tempAuc);
        bid3.setItem(tempAuc);
        tempAuc = auctionRepository.save(AuctionItem.builder()
                .description("This is a pencil")
                .type("Stationery")
                .successfulBid(succ2)
                .build());
        tempAuc.getBids().add(bid4);
        tempAuc.getBids().add(bid5);
        tempAuc.getBids().add(bid6);
        bid4.setItem(tempAuc);
        bid5.setItem(tempAuc);
        bid6.setItem(tempAuc);
        tempAuc = auctionRepository.save(AuctionItem.builder()
                .description("This is an apple")
                .type("Fruit")
                .successfulBid(succ3)
                .build());
        tempAuc.getBids().add(bid7);
        tempAuc.getBids().add(bid8);
        tempAuc.getBids().add(bid9);
        bid7.setItem(tempAuc);
        bid8.setItem(tempAuc);
        bid9.setItem(tempAuc);
        tempAuc = auctionRepository.save(AuctionItem.builder()
                .description("This is a ruler")
                .type("Stationery")
                .build());
        tempAuc.getBids().add(bid10);
        tempAuc.getBids().add(bid11);
        tempAuc.getBids().add(bid12);
        bid10.setItem(tempAuc);
        bid11.setItem(tempAuc);
        bid12.setItem(tempAuc);
        tempAuc = auctionRepository.save(AuctionItem.builder()
                .description("This is a pineapple")
                .type("Fruit")
                .build());
        tempAuc.getBids().add(bid13);
        tempAuc.getBids().add(bid14);
        tempAuc.getBids().add(bid15);
        bid13.setItem(tempAuc);
        bid14.setItem(tempAuc);
        bid15.setItem(tempAuc);
//        AuctionItem auc1, auc2, auc3, auc4, auc5;
//        auc1 = auctionRepository.save(AuctionItem.builder()
//                .description("This is a pen")
//                .type("Stationery")
//                .build());
//        auc2 = auctionRepository.save(AuctionItem.builder()
//                .description("This is a apple")
//                .type("Fruit")
//                .build());
//        auc3 = auctionRepository.save(AuctionItem.builder()
//                .description("This is a pineapple")
//                .type("Fruit")
//                .build());
//        auc4 = auctionRepository.save(AuctionItem.builder()
//                .description("This is a ruler")
//                .type("Stationery")
//                .build());
//        auc5 = auctionRepository.save(AuctionItem.builder()
//                .description("This is a pencil")
//                .type("Stationery")
//                .build());
//
//        Bid tempBid = null;
//        tempBid = bidRepository.save(Bid.builder()
//                .amount(120)
//                .datetime("22-09-2020")
//                .build());
//        auc1.getBids().add(tempBid);

        Organizer org1, org2, org3;
        org1 = organizerRepository.save(Organizer.builder()
                .name("CAMT").build());
        org2 = organizerRepository.save(Organizer.builder()
                .name("CMU").build());
        org3 = organizerRepository.save(Organizer.builder()
                .name("ChiangMai").build());
        Event tempEvent = null;
        tempEvent = eventRepository.save(Event.builder()
                .category("Academic")
                .title("Midterm Exam")
                .description("A time for taking the exam")
                .location("CAMT Building")
                .date("3rd Sept")
                .time("3.00-4.00 pm.")
                .petAllowed(false)
                .organizer(org1)
                .build());
        org1.getOwnEvents().add(tempEvent);
        tempEvent = eventRepository.save(Event.builder()
                .category("Academic")
                .title("Commencement Day")
                .description("A time for celebration")
                .location("CMU Convention hall")
                .date("21th Jan")
                .time("8.00am-4.00 pm.")
                .petAllowed(false)
                .organizer(org1)
                .build());
        org1.getOwnEvents().add(tempEvent);
        tempEvent = eventRepository.save(Event.builder()
                .category("Cultural")
                .title("Loy Krathong")
                .description("A time for Krathong")
                .location("Ping River")
                .date("21th Nov")
                .time("8.00-10.00 pm.")
                .organizer(org2)
                .petAllowed(false)
                .build());
        org2.getOwnEvents().add(tempEvent);
        tempEvent = eventRepository.save(Event.builder()
                .category("Cultural")
                .title("Songkran")
                .description("Let's Play Water")
                .location("Chiang Mai Moat")
                .date("13th April")
                .time("10.00am - 6.00 pm.")
                .petAllowed(true)
                .organizer(org3)
                .build());
        org3.getOwnEvents().add(tempEvent);
    }
}
