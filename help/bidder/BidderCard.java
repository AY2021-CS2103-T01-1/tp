package seedu.address.ui.bidder;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import seedu.address.model.person.bidder.Bidder;
import seedu.address.ui.UiPart;

import java.util.Comparator;

public class BidderCard extends UiPart<Region> {

    private static final String FXML = "BidderListCard.fxml";

    /**
     * Note: Certain keywords such as "location" and "resources" are reserved keywords in JavaFX.
     * As a consequence, UI elements' variable names cannot be set to such keywords
     * or an exception will be thrown by JavaFX during runtime.
     *
     * @see <a href="https://github.com/se-edu/addressbook-level4/issues/336">The issue on AddressBook level 4</a>
     */


    public final Bidder bidder;

    @FXML
    private HBox cardPane;
    @FXML
    private Label name;
    @FXML
    private Label id;
    @FXML
    private Label phone;
    @FXML
    private FlowPane tags;

    /**
     * Creates a {@code BidderCode} with the given {@code Bidder} and index to display.
     */
    public BidderCard(Bidder bidder, int displayedIndex) {
        super(FXML);
        this.bidder = bidder;
        id.setText(displayedIndex + ". ");
        name.setText(bidder.getName().fullName);
        phone.setText(bidder.getPhone().value);
        bidder.getTags().stream()
                .sorted(Comparator.comparing(tag -> tag.tagName))
                .forEach(tag -> tags.getChildren().add(new Label(tag.tagName)));
    }

    @Override
    public boolean equals(Object other) {
        // short circuit if same object
        if (other == this) {
            return true;
        }

        // instanceof handles nulls
        if (!(other instanceof BidderCard)) {
            return false;
        }

        // state check
        BidderCard card = (BidderCard) other;
        return id.getText().equals(card.id.getText())
                && bidder.equals(card.bidder);
    }

}
