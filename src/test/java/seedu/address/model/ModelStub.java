package seedu.address.model;

import java.nio.file.Path;
import java.util.function.Predicate;

import javafx.collections.ObservableList;
import seedu.address.commons.core.GuiSettings;
import seedu.address.model.bid.Bid;
import seedu.address.model.bidderaddressbook.ReadOnlyBidderAddressBook;
import seedu.address.model.calendar.CalendarMeeting;
import seedu.address.model.id.Id;
import seedu.address.model.person.Person;
import seedu.address.model.person.bidder.Bidder;
import seedu.address.model.person.seller.Seller;
import seedu.address.model.property.Property;
import seedu.address.model.propertybook.ReadOnlyPropertyBook;
import seedu.address.model.selleraddressbook.ReadOnlySellerAddressBook;

/**
 * A default model stub that have all of the methods failing.
 */
public class ModelStub implements Model {
    @Override
    public void setUserPrefs(ReadOnlyUserPrefs userPrefs) {
        throw new AssertionError("This method should not be called.");
    }

    @Override
    public ReadOnlyUserPrefs getUserPrefs() {
        throw new AssertionError("This method should not be called.");
    }

    @Override
    public GuiSettings getGuiSettings() {
        throw new AssertionError("This method should not be called.");
    }

    @Override
    public void setGuiSettings(GuiSettings guiSettings) {
        throw new AssertionError("This method should not be called.");
    }

    @Override
    public Path getAddressBookFilePath() {
        throw new AssertionError("This method should not be called.");
    }

    @Override
    public void setAddressBookFilePath(Path addressBookFilePath) {
        throw new AssertionError("This method should not be called.");
    }

    @Override
    public Path getPropertyBookFilePath() {
        throw new AssertionError("This method should not be called.");
    }

    @Override
    public void setPropertyBookFilePath(Path propertyBookFilePath) {
        throw new AssertionError("This method should not be called.");
    }

    @Override
    public void addPerson(Person person) {
        throw new AssertionError("This method should not be called.");
    }

    @Override
    public void addBid(Bid bid) {
        throw new AssertionError("This method should not be called.");
    }

    @Override
    public void setMeetingManager(ReadOnlyMeetingManager meetingManager) {

    }

    @Override
    public ReadOnlyMeetingManager getMeetingManager() {
        throw new AssertionError("This method should not be called.");
    }

    @Override
    public boolean hasMeeting(CalendarMeeting meeting) {
        throw new AssertionError("This method should not be called.");
    }

    @Override
    public void deleteMeeting(CalendarMeeting target) {
        throw new AssertionError("This method should not be called.");
    }

    @Override
    public void addMeeting(CalendarMeeting meeting) {
        throw new AssertionError("This method should not be called.");
    }

    @Override
    public void setMeeting(CalendarMeeting target, CalendarMeeting editedMeeting) {
        throw new AssertionError("This method should not be called.");
    }

    @Override
    public ObservableList<CalendarMeeting> getFilteredMeetingList() {
        throw new AssertionError("This method should not be called.");
    }

    @Override
    public void updateFilteredMeetingList(Predicate<CalendarMeeting> predicate) {
        throw new AssertionError("This method should not be called.");
    }

    @Override
    public void setAddressBook(ReadOnlyAddressBook newData) {
        throw new AssertionError("This method should not be called.");
    }

    @Override
    public ReadOnlyAddressBook getAddressBook() {
        throw new AssertionError("This method should not be called.");
    }

    @Override
    public ReadOnlyBidBook getBidBook() {
        throw new AssertionError("This method should not be called.");
    }

    @Override
    public boolean hasPerson(Person person) {
        throw new AssertionError("This method should not be called.");
    }

    @Override
    public void deletePerson(Person target) {
        throw new AssertionError("This method should not be called.");
    }

    @Override
    public void setPerson(Person target, Person editedPerson) {
        throw new AssertionError("This method should not be called.");
    }

    @Override
    public ObservableList<Person> getFilteredPersonList() {
        throw new AssertionError("This method should not be called.");
    }

    @Override
    public ObservableList<Bid> getFilteredBidList() {
        throw new AssertionError("This method should not be called.");
    }

    @Override
    public void updateFilteredPersonList(Predicate<Person> predicate) {
        throw new AssertionError("This method should not be called.");
    }

    @Override
    public void updateFilteredBidList(Predicate<Bid> predicate) {
        throw new AssertionError("This method should not be called.");
    }

    // ================= PROPERTY =================

    @Override
    public void setPropertyBook(ReadOnlyPropertyBook propertyBook) {
        throw new AssertionError("This method should not be called.");
    }

    @Override
    public ReadOnlyPropertyBook getPropertyBook() {
        throw new AssertionError("This method should not be called.");
    }

    @Override
    public boolean hasProperty(Property property) {
        throw new AssertionError("This method should not be called.");
    }

    @Override
    public void deleteProperty(Property target) {
        throw new AssertionError("This method should not be called.");
    }

    @Override
    public void deletePropertyByPropertyId(Id id) {
        throw new AssertionError("This method should not be called.");
    }

    @Override
    public void addProperty(Property property) {
        throw new AssertionError("This method should not be called.");
    }

    @Override
    public Property getPropertyById(Id id) {
        throw new AssertionError("This method should not be called.");
    }

    @Override
    public boolean containsPropertyId(Id id) {
        throw new AssertionError("This method should not be called.");
    }

    @Override
    public void setProperty(Property target, Property editedProperty) {
        throw new AssertionError("This method should not be called.");
    }

    @Override
    public ObservableList<Property> getFilteredPropertyList() {
        throw new AssertionError("This method should not be called.");
    }

    @Override
    public void updateFilteredPropertyList(Predicate<Property> predicate) {
        throw new AssertionError("This method should not be called.");
    }

    // ================= BIDDER =================

    @Override
    public Path getBidderAddressBookFilePath() {
        throw new AssertionError("This method should not be called.");
    }

    @Override
    public void setBidderAddressBookFilePath(Path bidderAddressBookFilePath) {
        throw new AssertionError("This method should not be called.");
    }

    @Override
    public void setBidderAddressBook(ReadOnlyBidderAddressBook bidderAddressBook) {
        throw new AssertionError("This method should not be called.");
    }

    @Override
    public ReadOnlyBidderAddressBook getBidderAddressBook() {
        throw new AssertionError("This method should not be called.");
    }

    @Override
    public boolean hasBidder(Bidder bidder) {
        throw new AssertionError("This method should not be called.");
    }

    @Override
    public void deleteBidder(Bidder target) {
        throw new AssertionError("This method should not be called.");
    }

    @Override
    public void addBidder(Bidder bidder) {
        throw new AssertionError("This method should not be called.");
    }

    @Override
    public void setBidder(Bidder target, Bidder editedBidder) {
        throw new AssertionError("This method should not be called.");
    }

    @Override
    public ObservableList<Bidder> getFilteredBidderList() {
        throw new AssertionError("This method should not be called.");
    }

    @Override
    public void updateFilteredBidderList(Predicate<? super Person> predicate) {
        throw new AssertionError("This method should not be called.");
    }

    // ================= SELLER =================

    @Override
    public Path getSellerAddressBookFilePath() {
        throw new AssertionError("This method should not be called.");
    }

    @Override
    public void setSellerAddressBookFilePath(Path sellerAddressBookFilePath) {
        throw new AssertionError("This method should not be called.");
    }

    @Override
    public void setSellerAddressBook(ReadOnlySellerAddressBook sellerAddressBook) {
        throw new AssertionError("This method should not be called.");
    }

    @Override
    public ReadOnlySellerAddressBook getSellerAddressBook() {
        throw new AssertionError("This method should not be called.");
    }

    @Override
    public boolean hasSeller(Seller seller) {
        throw new AssertionError("This method should not be called.");
    }

    @Override
    public void deleteSeller(Seller target) {
        throw new AssertionError("This method should not be called.");
    }

    @Override
    public void addSeller(Seller seller) {
        throw new AssertionError("This method should not be called.");
    }

    @Override
    public void setSeller(Seller target, Seller editedSeller) {
        throw new AssertionError("This method should not be called.");
    }

    @Override
    public ObservableList<Seller> getFilteredSellerList() {
        throw new AssertionError("This method should not be called.");
    }

    @Override
    public void updateFilteredSellerList(Predicate<? super Person> predicate) {
        throw new AssertionError("This method should not be called.");
    }
}
