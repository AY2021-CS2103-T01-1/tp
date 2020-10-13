package seedu.address.testutil.property;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import seedu.address.model.property.Property;
import seedu.address.model.propertybook.PropertyBook;

public class TypicalProperties {

    public static final Property PROPERTY_A = new PropertyBuilder()
            .withPropertyId("P1")
            .withPropertyType("HDB 2 room")
            .withPropertyName("Aljunied Building")
            .withAddress("101 Aljunied Drive")
            .withAskingPrice(999.99)
            .withSellerId("S1")
            .build();;
    public static final Property PROPERTY_B = new PropertyBuilder()
            .withPropertyId("P2")
            .withPropertyType("Condo")
            .withPropertyName("Bayfront Condominium")
            .withAddress("101 Bayfront Drive")
            .withAskingPrice(100000)
            .withSellerId("S2")
            .build();

    private TypicalProperties() {} // prevent instantiation

    /**
     * Returns an {@code PropertyBook} with all the typical properties.
     */
    public static PropertyBook getTypicalPropertyBook() {
        PropertyBook pb = new PropertyBook();
        for (Property property : getTypicalProperties()) {
            pb.addProperty(property);
        }
        return pb;
    }

    public static List<Property> getTypicalProperties() {
        return new ArrayList<>(Arrays.asList(PROPERTY_A, PROPERTY_B));
    }

}
