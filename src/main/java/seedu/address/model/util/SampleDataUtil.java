package seedu.address.model.util;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import seedu.address.model.AddressBook;
import seedu.address.model.BidBook;
import seedu.address.model.MeetingBook;
import seedu.address.model.ReadOnlyAddressBook;
import seedu.address.model.ReadOnlyBidBook;
import seedu.address.model.ReadOnlyMeetingManager;
import seedu.address.model.bid.Bid;
import seedu.address.model.bidderaddressbook.BidderAddressBook;
import seedu.address.model.bidderaddressbook.ReadOnlyBidderAddressBook;
import seedu.address.model.calendar.CalendarAdmin;
import seedu.address.model.calendar.CalendarBidderId;
import seedu.address.model.calendar.CalendarMeeting;
import seedu.address.model.calendar.CalendarPaperwork;
import seedu.address.model.calendar.CalendarPropertyId;
import seedu.address.model.calendar.CalendarTime;
import seedu.address.model.calendar.CalendarVenue;
import seedu.address.model.calendar.CalendarViewing;
import seedu.address.model.id.Id;
import seedu.address.model.person.Name;
import seedu.address.model.person.Person;
import seedu.address.model.person.Phone;
import seedu.address.model.person.bidder.Bidder;
import seedu.address.model.person.seller.Seller;
import seedu.address.model.price.Price;
import seedu.address.model.property.Address;
import seedu.address.model.property.IsClosedDeal;
import seedu.address.model.property.IsRental;
import seedu.address.model.property.Property;
import seedu.address.model.property.PropertyName;
import seedu.address.model.property.PropertyType;
import seedu.address.model.propertybook.PropertyBook;
import seedu.address.model.propertybook.ReadOnlyPropertyBook;
import seedu.address.model.selleraddressbook.ReadOnlySellerAddressBook;
import seedu.address.model.selleraddressbook.SellerAddressBook;
import seedu.address.model.tag.Tag;

/**
 * Contains utility methods for populating {@code AddressBook} with sample data.
 */
public class SampleDataUtil {
    public static Person[] getSamplePersons() {
        return new Person[] {
            new Person(new Name("Alex Yeoh"), new Phone("87438807"),
                getTagSet("friends")),
            new Person(new Name("Bernice Yu"), new Phone("99272758"),
                getTagSet("colleagues", "friends")),
            new Person(new Name("Charlotte Oliveiro"), new Phone("93210283"),
                getTagSet("neighbours")),
            new Person(new Name("David Li"), new Phone("91031282"),
                getTagSet("family")),
            new Person(new Name("Irfan Ibrahim"), new Phone("92492021"),
                getTagSet("classmates")),
            new Person(new Name("Roy Balakrishnan"), new Phone("92624417"),
                getTagSet("colleagues"))
        };
    }

    public static ReadOnlyAddressBook getSampleAddressBook() {
        AddressBook sampleAb = new AddressBook();
        for (Person samplePerson : getSamplePersons()) {
            sampleAb.addPerson(samplePerson);
        }
        return sampleAb;
    }

    /**
     * Returns a tag set containing the list of strings given.
     */
    public static Set<Tag> getTagSet(String... strings) {
        return Arrays.stream(strings)
                .map(Tag::new)
                .collect(Collectors.toSet());
    }

    // ================= BIDS ==================
    public static Bid[] getSampleBids() {
        return new Bid[] {
            new Bid("P01", "B01", 45000),
            new Bid("P02", "B23", 123456),
            new Bid("P31", "B11", 42344),
            new Bid("P01", "B02", 45100),
            new Bid("P01", "B45", 65000),
            new Bid("P12", "B22", 450002),
        };
    }

    public static ReadOnlyBidBook getSampleBidBook() {
        BidBook sampleBb = new BidBook();
        for (Bid sampleBid : getSampleBids()) {
            sampleBb.addBid(sampleBid);
        }
        return sampleBb;
    }

    // ================= BIDDERS ==================
    public static Bidder[] getSampleBidders() {
        return new Bidder[] {
            new Bidder(new Name("Kor Ming Soon"), new Phone("125678"), new HashSet<>(), new Id("B", 1)),
            new Bidder(new Name("Harsha"), new Phone("12345777"), new HashSet<>(), new Id("B", 2)),
            new Bidder(new Name("Marcus"), new Phone("47876428"), new HashSet<>(), new Id("B", 3)),
            // Bidder.makeBidder(new Name("Chris"), new Phone("12345678"), new HashSet<>(), new Id("B", 4))
        };
    }

    public static ReadOnlyBidderAddressBook getSampleBidderAddressBook() {
        BidderAddressBook sampleBidderAb = new BidderAddressBook();
        for (Bidder sampleBidder : getSampleBidders()) {
            sampleBidderAb.addBidder(sampleBidder);
        }
        return sampleBidderAb;
    }

    // ================= SELLERS ==================
    public static Seller[] getSampleSellers() {
        return new Seller[] {
            new Seller(new Name("Dianne"), new Phone("7897456"), new HashSet<>(), new Id("S", 1)),
            new Seller(new Name("Christopher"), new Phone("12345777"), new HashSet<>(), new Id("S", 2)),
        };
    }

    public static ReadOnlySellerAddressBook getSampleSellerAddressBook() {
        SellerAddressBook sampleSellerAb = new SellerAddressBook();
        for (Seller sampleSeller : getSampleSellers()) {
            sampleSellerAb.addSeller(sampleSeller);
        }
        return sampleSellerAb;
    }

    // ================= PROPERTY ==================
    public static Property[] getSampleProperties() {
        return new Property[]{
            new Property(new Id("P1"), new PropertyName("Sunrise Condo"), new Id("S123"),
                new Address("Block 123"), new Price(100), new PropertyType("Condo"),
                new IsRental("No"), new IsClosedDeal("Active")),
            new Property(new Id("P2"), new PropertyName("Sundown HDB"), new Id("S567"),
                new Address("Block 456"), new Price(200), new PropertyType("HDB"),
                new IsRental("No"), new IsClosedDeal("Active")),
            new Property(new Id("P3"), new PropertyName("Moonshine Mansion"), new Id("S789"),
                new Address("Block 789"), new Price(1000), new PropertyType("Mansion"),
                new IsRental("No"), new IsClosedDeal("Active"))
        };
    }

    public static ReadOnlyPropertyBook getSamplePropertyBook() {
        PropertyBook samplePb = new PropertyBook();
        for (Property sampleProperty : getSampleProperties()) {
            samplePb.addProperty(sampleProperty);
        }
        return samplePb;
    }

    // ================= MEETING ==================
    public static CalendarMeeting[] getSampleMeetings() {
        return new CalendarMeeting[] {
            new CalendarPaperwork(new CalendarBidderId("b1"), new CalendarPropertyId("p2"),
                        new CalendarTime("15 OCT 2020"), new CalendarVenue("Marina Bay")),
            new CalendarAdmin(new CalendarBidderId("b5"), new CalendarPropertyId("p6"),
                        new CalendarTime("19 OCT 2020"), new CalendarVenue("Bedok")),
            new CalendarViewing(new CalendarBidderId("b11"), new CalendarPropertyId("p8"),
                        new CalendarTime("21 OCT 2020"), new CalendarVenue("Tampines"))
        };
    }

    public static ReadOnlyMeetingManager getSampleMeetingBook() {
        MeetingBook sampleMeetingAb = new MeetingBook();
        for (CalendarMeeting sampleMeeting : getSampleMeetings()) {
            sampleMeetingAb.addMeeting(sampleMeeting);
        }
        return sampleMeetingAb;
    }
}
