package seedu.address.logic.commands.meetingcommands;

import static java.util.Objects.requireNonNull;
import static seedu.address.logic.parser.CliSyntax.PREFIX_MEETING_BIDDER_ID;
import static seedu.address.logic.parser.CliSyntax.PREFIX_MEETING_DATE;
import static seedu.address.logic.parser.CliSyntax.PREFIX_MEETING_ENDTIME;
import static seedu.address.logic.parser.CliSyntax.PREFIX_MEETING_PROPERTY_ID;
import static seedu.address.logic.parser.CliSyntax.PREFIX_MEETING_STARTTIME;
import static seedu.address.logic.parser.CliSyntax.PREFIX_MEETING_TYPE;
import static seedu.address.logic.parser.CliSyntax.PREFIX_MEETING_VENUE;

import java.util.Iterator;

import javafx.collections.ObservableList;
import seedu.address.commons.core.Messages;
import seedu.address.logic.commands.Command;
import seedu.address.logic.commands.CommandResult;
import seedu.address.logic.commands.EntityType;
import seedu.address.logic.commands.exceptions.CommandException;
import seedu.address.model.Model;
import seedu.address.model.meeting.Meeting;
import seedu.address.model.person.bidder.Bidder;
import seedu.address.model.property.Property;

/**
 * Adds a meeting to the meeting book.
 */
public class AddMeetingCommand extends Command {

    public static final String COMMAND_WORD = "add-m";

    public static final String MESSAGE_SUCCESS = "New meeting added: %1$s";

    public static final String MESSAGE_USAGE = COMMAND_WORD + ": Adds a meeting to the meeting book. "
            + "\n\nParameters: "
            + "\n" + PREFIX_MEETING_TYPE + "TYPE"
            + "\n" + PREFIX_MEETING_BIDDER_ID + "BIDDER_ID"
            + "\n" + PREFIX_MEETING_PROPERTY_ID + "PROPERTY_ID"
            + "\n" + PREFIX_MEETING_VENUE + "VENUE "
            + "\n" + PREFIX_MEETING_DATE + "DATE "
            + "\n" + PREFIX_MEETING_STARTTIME + "STARTTIME "
            + "\n" + PREFIX_MEETING_ENDTIME + "ENDTIME "
            + "\n\nExample: " + COMMAND_WORD + " "
            + PREFIX_MEETING_TYPE + "v "
            + PREFIX_MEETING_BIDDER_ID + "B12 "
            + PREFIX_MEETING_PROPERTY_ID + "P12 "
            + PREFIX_MEETING_VENUE + "2 ALBERT PARK "
            + PREFIX_MEETING_DATE + "11-12-2021 "
            + PREFIX_MEETING_STARTTIME + "12:30 "
            + PREFIX_MEETING_ENDTIME + "13:00 ";

    private final Meeting toAdd;

    /**
     * Constructor for an AddMeetingCommand object.
     * @param meeting meeting to be added to meetingbook.
     */
    public AddMeetingCommand(Meeting meeting) {
        requireNonNull(meeting);
        this.toAdd = meeting;
    }


    public boolean checkPID(Model model) {
        Iterator<Property> propLs = model.getFilteredPropertyList().iterator();
        while (propLs.hasNext()) {
            if (toAdd.getPropertyId().equals(propLs.next().getPropertyId())) {
                return true;
            }
        }
        return false;
    }

    public boolean checkBID(Model model) {
        Iterator<Bidder> bidLs = model.getFilteredBidderList().iterator();
        while (bidLs.hasNext()) {
            if (toAdd.getBidderId().equals(bidLs.next().getId())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public CommandResult execute(Model model) throws CommandException {
        requireNonNull(model);
        if (model.hasMeeting(toAdd)) {
            throw new CommandException(Messages.MESSAGE_DUPLICATE_MEETING);
        }
        if (!checkBID(model) || !checkPID(model)) {
            throw new CommandException(Messages.MESSAGE_INVALID_ID);
        }

        model.addMeeting(toAdd);
        return new CommandResult(String.format(MESSAGE_SUCCESS, toAdd)).setEntity(EntityType.MEETING);
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof AddMeetingCommand // instanceof handles nulls
                && toAdd.equals(((AddMeetingCommand) other).toAdd));
    }
}
