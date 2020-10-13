package seedu.address.model.property;

import java.util.function.Predicate;

import javafx.collections.ObservableList;
import seedu.address.model.ReadOnlyPropertyBook;
import seedu.address.model.id.Id;

public interface PropertyModel {

    /** {@code Predicate} that always evaluate to true */
    Predicate<Property> PREDICATE_SHOW_ALL_PROPERTIES = unused -> true;

    /**
     * Replaces property book data with the data in {@code propertyBook}.
     */
    void setPropertyBook(ReadOnlyPropertyBook propertyBook);

    /** Returns the property book. */
    ReadOnlyPropertyBook getPropertyBook();

    /**
     * Returns true if a property with the same identity as {@code property} exists in the property book.
     */
    boolean hasProperty(Property property);

    /**
     * Deletes the given property.
     * The property must exist in the property book.
     */
    void deleteProperty(Property target);

    /**
     * Deletes the property with the given id.
     * A property with the id must exist in the property book.
     * @param id The given id.
     */
    void deletePropertyByPropertyId(Id id);

    /**
     * Adds the given property.
     * {@code property} must not already exist in the property book.
     */
    void addProperty(Property property);

    /**
     * Gets the property with the given id.
     * {@code id} must exist in the property book.
     *
     * @param id The specified id.
     */
    Property getPropertyById(Id id);

    /**
     * Checks if the property book contains a property with the given id.
     *
     * @param id The given id.
     * @return True if a property exists.
     */
    boolean containsPropertyId(Id id);

    /**
     * Replaces the given property {@code target} with {@code editedProperty}.
     * {@code target} must exist in the property book.
     * The property identity of {@code editedProperty} must not be the same as another existing property in the
     * property book.
     */
    void setProperty(Property target, Property editedProperty);

    /** Returns an unmodifiable view of the filtered property list */
    ObservableList<Property> getFilteredPropertyList();

    /**
     * Updates the filter of the filtered property list to filter by the given {@code predicate}.
     * @throws NullPointerException if {@code predicate} is null.
     */
    void updateFilteredPropertyList(Predicate<Property> predicate);

}
