package seedu.address.logic.commands;

import static seedu.address.logic.commands.CommandTestUtil.assertCommandSuccess;
import static seedu.address.testutil.TypicalBidder.getTypicalBidderAddressBook;
import static seedu.address.testutil.TypicalPersons.getTypicalAddressBook;
import static seedu.address.testutil.TypicalSeller.getTypicalSellerAddressBook;

import org.junit.jupiter.api.Test;

import seedu.address.model.AddressBook;
import seedu.address.model.BidBook;
import seedu.address.model.MeetingBook;
import seedu.address.model.Model;
import seedu.address.model.ModelManager;
import seedu.address.model.PropertyBook;
import seedu.address.model.UserPrefs;
import seedu.address.model.bidderaddressbook.BidderAddressBook;
import seedu.address.model.selleraddressbook.SellerAddressBook;


public class ClearCommandTest {

    @Test
    public void execute_emptyAddressBook_success() {
        Model model = new ModelManager();
        Model expectedModel = new ModelManager();

        assertCommandSuccess(new ClearCommand(), model, ClearCommand.MESSAGE_SUCCESS, expectedModel);
    }

    @Test
    public void execute_nonEmptyAddressBook_success() {
        Model model = new ModelManager(getTypicalAddressBook(), new UserPrefs(), new BidBook(), new PropertyBook(),
                getTypicalBidderAddressBook(), getTypicalSellerAddressBook(), new MeetingBook());
        Model expectedModel = new ModelManager(getTypicalAddressBook(), new UserPrefs(), new BidBook(),
                new PropertyBook(),
                getTypicalBidderAddressBook(),
                getTypicalSellerAddressBook(),
                new MeetingBook());
        expectedModel.setAddressBook(new AddressBook());
        expectedModel.setSellerAddressBook(new SellerAddressBook());
        expectedModel.setBidderAddressBook(new BidderAddressBook());
        assertCommandSuccess(new ClearCommand(), model, ClearCommand.MESSAGE_SUCCESS, expectedModel);
    }

}
