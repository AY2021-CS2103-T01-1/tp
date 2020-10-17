package seedu.address.logic.commands.property;

import static seedu.address.logic.commands.CommandTestUtil.assertCommandFailure;
import static seedu.address.logic.commands.CommandTestUtil.assertCommandSuccess;
import static seedu.address.model.property.Property.DEFAULT_PROPERTY_ID;
import static seedu.address.testutil.TypicalPersons.getTypicalAddressBook;
import static seedu.address.testutil.bidder.TypicalBidder.getTypicalBidderAddressBook;
import static seedu.address.testutil.property.TypicalProperties.getTypicalPropertyBook;
import static seedu.address.testutil.seller.TypicalSeller.getTypicalSellerAddressBook;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import seedu.address.model.BidBook;
import seedu.address.model.MeetingBook;
import seedu.address.model.Model;
import seedu.address.model.ModelManager;
import seedu.address.model.UserPrefs;
import seedu.address.model.property.Property;
import seedu.address.testutil.property.PropertyBuilder;

/**
 * Contains integration tests (interaction with the Model) for {@code AddPropertyCommand}.
 */
public class AddPropertyCommandIntegrationTest {

    private Model model;

    @BeforeEach
    public void setUp() {
        model = new ModelManager(getTypicalAddressBook(), new UserPrefs(), new BidBook(), getTypicalPropertyBook(),
                getTypicalBidderAddressBook(), getTypicalSellerAddressBook(), new MeetingBook());
    }

    @Test
    public void execute_newProperty_success() {
        Property validProperty = new PropertyBuilder()
                .withPropertyId(DEFAULT_PROPERTY_ID.toString())
                .build();

        Model expectedModel = new ModelManager(
                model.getAddressBook(),
                new UserPrefs(),
                model.getBidBook(),
                model.getPropertyBook(),
                model.getBidderAddressBook(),
                model.getSellerAddressBook(),
                model.getMeetingManager()
        );
        expectedModel.addProperty(validProperty);

        assertCommandSuccess(new AddPropertyCommand(validProperty), model,
                String.format(AddPropertyCommand.MESSAGE_SUCCESS, validProperty), expectedModel);
    }

    @Test
    public void execute_duplicateProperty_throwsCommandException() {
        Property propertyInList = model.getPropertyBook().getPropertyList().get(0);
        assertCommandFailure(new AddPropertyCommand(propertyInList), model,
                AddPropertyCommand.MESSAGE_DUPLICATE_PROPERTY);
    }

}
