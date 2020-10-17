package seedu.address.model.bidbook;

import static java.util.Objects.requireNonNull;

import java.util.List;

import javafx.collections.ObservableList;
import seedu.address.model.bid.Bid;
import seedu.address.model.bid.UniqueBidList;

public class BidBook implements ReadOnlyBidBook {

    private final UniqueBidList listOfBids;

    {
        listOfBids = new UniqueBidList();
    }

    public BidBook() {
    }

    /**
     * Constructor to create a BidBook
     * @param toBeCopied item to be contained in teh BidBook Object
     */
    public BidBook(ReadOnlyBidBook toBeCopied) {
        this();
        resetData(toBeCopied);
    }

    public void setBid(Bid target, Bid editedBid) {
        requireNonNull(editedBid);

        listOfBids.setBid(target, editedBid);
    }

    public void setBids(List<Bid> bids) {
        this.listOfBids.setBids(bids);
    }

    public void addBid(Bid b) {
        listOfBids.add(b);
    }

    /**
     * checks if the listOfBods contains the specified bid
     * @param bid bid to be compared to the list
     * @return boolean value if the bid is in the list
     */
    public boolean hasBid(Bid bid) {
        requireNonNull(bid);
        return listOfBids.contains(bid);
    }

    /**
     * resets the data inside the bidBook bye setting it as the new bidBook
     * @param newData data to overwrite the old data
     */
    public void resetData(ReadOnlyBidBook newData) {
        requireNonNull(newData);
        setBids(newData.getBidList());
    }

    /**
     * Removes {@code key} from this {@code BidBook}.
     * {@code key} must exist in the bid book.
     */
    public void removeBid(Bid key) {
        listOfBids.remove(key);
    }

    @Override
    public String toString() {
        return listOfBids.asUnmodifiableObservableBidList().size() + " bids";
        // TODO: refine later
    }

    @Override
    public ObservableList<Bid> getBidList() {
        return listOfBids.asUnmodifiableObservableBidList();
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof BidBook // instanceof handles nulls
                && listOfBids.equals(((BidBook) other).listOfBids));
    }

    @Override
    public int hashCode() {
        return listOfBids.hashCode();
    }

}
