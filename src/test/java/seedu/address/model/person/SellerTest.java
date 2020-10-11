package seedu.address.model.person;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static seedu.address.logic.commands.CommandTestUtil.VALID_NAME_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_PHONE_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_TAG_HUSBAND;
import static seedu.address.testutil.Assert.assertThrows;
import static seedu.address.testutil.TypicalSeller.ALICE;
import static seedu.address.testutil.TypicalSeller.BOB;

import org.junit.jupiter.api.Test;

import seedu.address.testutil.SellerBuilder;

public class SellerTest {

    @Test
    public void asObservableList_modifyList_throwsUnsupportedOperationException() {
        Seller person = new SellerBuilder().build();
        assertThrows(UnsupportedOperationException.class, () -> person.getTags().remove(0));
    }

    @Test
    public void isSamePerson() {
        // same object -> returns true
        assertTrue(ALICE.isSamePerson(ALICE));

        // null -> returns false
        assertFalse(ALICE.isSamePerson(null));

        // different phone and email -> returns false
        Seller editedAlice = new SellerBuilder(ALICE).withPhone(VALID_PHONE_BOB).build();
        assertFalse(ALICE.isSamePerson(editedAlice));

        // different name -> returns false
        editedAlice = new SellerBuilder(ALICE).withName(VALID_NAME_BOB).build();
        assertFalse(ALICE.isSamePerson(editedAlice));

        // same name, same phone, different attributes -> returns true
        editedAlice = new SellerBuilder(ALICE)
                .withTags(VALID_TAG_HUSBAND).build();
        assertTrue(ALICE.isSamePerson(editedAlice));

        // same name, same phone, different attributes -> returns true
        editedAlice = new SellerBuilder(ALICE)
                .withTags(VALID_TAG_HUSBAND).build();
        assertTrue(ALICE.isSamePerson(editedAlice));
    }

    @Test
    public void equals() {
        // same values -> returns true
        Seller aliceCopy = new SellerBuilder(ALICE).build();
        assertTrue(ALICE.equals(aliceCopy));

        // same object -> returns true
        assertTrue(ALICE.equals(ALICE));

        // null -> returns false
        assertFalse(ALICE.equals(null));

        // different type -> returns false
        assertFalse(ALICE.equals(5));

        // different person -> returns false
        assertFalse(ALICE.equals(BOB));

        // different name -> returns false
        Seller editedAlice = new SellerBuilder(ALICE).withName(VALID_NAME_BOB).build();
        assertFalse(ALICE.equals(editedAlice));

        // different phone -> returns false
        editedAlice = new SellerBuilder(ALICE).withPhone(VALID_PHONE_BOB).build();
        assertFalse(ALICE.equals(editedAlice));

        // different tags -> returns false
        editedAlice = new SellerBuilder(ALICE).withTags(VALID_TAG_HUSBAND).build();
        assertFalse(ALICE.equals(editedAlice));
    }
}
