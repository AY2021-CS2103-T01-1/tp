package seedu.address.logic;

import java.nio.file.Path;

import javafx.collections.ObservableList;
import seedu.address.commons.core.GuiSettings;
import seedu.address.logic.commands.CommandResult;
import seedu.address.logic.commands.exceptions.CommandException;
import seedu.address.logic.parser.exceptions.ParseException;
import seedu.address.model.ReadOnlyAddressBook;
import seedu.address.model.ReadOnlyBidBook;
import seedu.address.model.ReadOnlyMeetingManager;
import seedu.address.model.bid.Bid;
import seedu.address.model.bidderaddressbook.ReadOnlyBidderAddressBook;
import seedu.address.model.calendar.CalendarMeeting;
import seedu.address.model.person.Person;
import seedu.address.model.person.bidder.Bidder;
import seedu.address.model.person.seller.Seller;
import seedu.address.model.property.Property;
import seedu.address.model.propertybook.ReadOnlyPropertyBook;
import seedu.address.model.selleraddressbook.ReadOnlySellerAddressBook;


/**
 * API of the Logic component
 */
public interface Logic {
    /**
     * Executes the command and returns the result.
     * @param commandText The command as entered by the user.
     * @return the result of the command execution.
     * @throws CommandException If an error occurs during command execution.
     * @throws ParseException If an error occurs during parsing.
     */
    CommandResult execute(String commandText) throws CommandException, ParseException;

    /**
     * Returns the AddressBook.
     *
     * @see seedu.address.model.Model#getAddressBook()
     */
    ReadOnlyAddressBook getAddressBook();

    /** Returns an unmodifiable view of the filtered list of persons */
    ObservableList<Person> getFilteredPersonList();

    /**
     * Returns the user prefs' address book file path.
     */
    Path getAddressBookFilePath();

    /**
     * Returns the user prefs' GUI settings.
     */
    GuiSettings getGuiSettings();

    /**
     * Set the user prefs' GUI settings.
     */
    void setGuiSettings(GuiSettings guiSettings);

    /**
     * Returns the BidBook.
     *
     * @see seedu.address.model.Model#getBidBook()
     */
    ReadOnlyBidBook getBidBook();

    ObservableList<Bid> getFilteredBidList();


    // ================ Meeting =================
    ReadOnlyMeetingManager getMeetingManager();

    ObservableList<CalendarMeeting> getFilteredMeetingList();

    // ================ BIDDER =================
    /**
     * Returns the BidderAddressBook.
     *
     * @see seedu.address.model.Model#getBidderAddressBook()
     */
    ReadOnlyBidderAddressBook getBidderAddressBook();

    /** Returns an unmodifiable view of the filtered list of persons */
    ObservableList<Bidder> getFilteredBidderList();

    /**
     * Returns the user prefs' address book file path.
     */
    Path getBidderAddressBookFilePath();

    // ================ SELLER =================
    /**
     * Returns the SellerAddressBook.
     *
     * @see seedu.address.model.Model#getSellerAddressBook()
     */
    ReadOnlySellerAddressBook getSellerAddressBook();

    /** Returns an unmodifiable view of the filtered list of persons */
    ObservableList<Seller> getFilteredSellerList();

    /**
     * Returns the user prefs' address book file path.
     */
    Path getSellerAddressBookFilePath();

    /**
     * Returns the PropertyBook.
     *
     * @see seedu.address.model.Model#getPropertyBook()
     */
    ReadOnlyPropertyBook getPropertyBook();

    /** Returns an unmodifiable view of the filtered list of properties */
    ObservableList<Property> getFilteredPropertyList();

}
