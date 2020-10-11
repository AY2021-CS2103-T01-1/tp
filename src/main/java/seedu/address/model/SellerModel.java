package seedu.address.model;

import java.nio.file.Path;
import java.util.function.Predicate;

import javafx.collections.ObservableList;
import seedu.address.model.person.seller.Seller;
import seedu.address.model.selleraddressbook.ReadOnlySellerAddressBook;

public interface SellerModel {

    /** {@code Predicate} that always evaluate to true */
    Predicate<Seller> PREDICATE_SHOW_ALL_SELLERS = unused -> true;

    /**
    * Returns the user prefs' Seller address book file path.
    */
    Path getSellerAddressBookFilePath();

    /**
     * Sets the user prefs' Seller address book file path.
     */
    void setSellerAddressBookFilePath(Path sellerAddressBookFilePath);

    /**
     * Replaces address book data with the data in {@code addressBook}.
     */
    void setSellerAddressBook(ReadOnlySellerAddressBook sellerAddressBook);

    /** Returns the AddressBook */
    ReadOnlySellerAddressBook getSellerAddressBook();

    /**
     * Returns true if a seller with the same identity as {@code seller} exists in the address book.
     */
    boolean hasSeller(Seller seller);

    /**
     * Deletes the given seller.
     * The seller must exist in the address book.
     */
    void deleteSeller(Seller target);

    /**
     * Adds the given seller.
     * {@code seller} must not already exist in the address book.
     */
    void addSeller(Seller seller);

    /**
     * Replaces the given seller {@code target} with {@code editedSeller}.
     * {@code target} must exist in the address book.
     * The seller identity of {@code editedSeller} must not be the same as another existing seller in the address book.
     */
    void setSeller(Seller target, Seller editedSeller);

    /** Returns an unmodifiable view of the filtered seller list */
    ObservableList<Seller> getFilteredSellerList();

    /**
     * Updates the filter of the filtered seller list to filter by the given {@code predicate}.
     * @throws NullPointerException if {@code predicate} is null.
     */
    void updateFilteredSellerList(Predicate<Seller> predicate);

}
