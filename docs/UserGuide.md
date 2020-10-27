PropertyFree is adapted from AB3, which is a desktop application for managing property listing. Leveraging on Command 
Line Interface for those who are more comfortable with typing than with Graphical User Interface (GUI).

The UserGuide is still in the midst of updating. However, you can find
the commands we are aspiring toward creating for Property Agents.

--------------------------------------------------------------------------------------------------------------------

## Quick start

1. Ensure you have Java `11` or above installed in your Computer.

2. Stay tuned to our release!


   ![Ui](images/Ui.png)


--------------------------------------------------------------------------------------------------------------------
# CS2103-W14-1: PropertyFree User Guide

**PropertyFree is a management system for property agents to track and manage their property listing 
details.** It **a**llows users to easily take control of their bookkeeping matters inclusive of seller ask prices, 
bidder buy prices, key details of properties and record keeping of past properties. 

PropertyFree also provides a 
calendar for property agents to manage their schedule be it for property viewings or meeting with clients. 
It is optimized for CLI users so that the bookkeeping can be done faster by typing in commands.


# Property Features

---

## Addition of Property Listing

Adds a property listing and its relevant details to the list of properties.

- Command:  `add -p`
- Format: `add -p n/PROPERTY_NAME s/SELLER_ID ab/ASKING_BID d/DESCRIPTION t/TYPE a/ADDRESS r/IS_RENTAL`

Example:

```java
add -p n/Sunrise s/C12345678 ab/100 d/Beautiful home t/landed a/99 Sunrise Street r/No
```

Expected Output:

```java
Property
    Id: P23
		Name: Sunrise
		Seller id: C12345678
		Asking bid: $100
		Description: Beautiful home
		Type: Landed
		Address: 99 Sunrise Street
		Rental: No
Has been added!
```

💡 IS_RENTAL can be the following format : Yes / yes / Y / y or No / no / N / n

## **Deletion of Property Listing**

Deletes a property listing that the seller no longer wants to sell.

- Command: `delete -p`
- Format: `delete -p PROPERTY_ID`

Example:

```java
delete -p P23
```

Expected Output:

```java
Property P23 has been deleted.
```

## **Editing Property Listing**

Edits a property listing.

- Command: `edit -p`
- Format: `edit -p PROPERTY_ID [n/PROPERTY_NAME] [s/SELLER_ID] 
[ab/ASKING_BID] [d/DESCRIPTION] [t/TYPE] [r/IS_RENTAL]`

Example:

```java
edit -p P23 ab/200
```

💡 Only the parameter provided will be updated while all other details remain the same.

Expected Output:

```java
Property
    Id: P23
		Name: Sunrise
		Seller id: S12345678
		Asking bid: $200
		Description: Beautiful home
		Address: 99 Sunrise Street
		Type: Landed
		Rental: No
Has been updated!
```

## **View List of Property**

Shows a picture of a the current property in the list.

- Command: `view -p`
- Format: `view -p`

Example:

```java
view -p
```

Expected Output:

```java
These are your current property listings!

1. Punggol Avenue 3 Block 46 #12-345
2. Chinatown Avenue 4 Block 44 #11-111
```

## **Search for a Property**

Searches for a property according to the address, property id or description of the property.

- Command: `search -p`
- Format: `search -p [PROPERTY_ID] [n/PROPERTY_NAME] [d/DESCRIPTION]`

Example:

```java
search -p Chinatown
```

Expected Output:

```java
Search Results:
1. Chinatown Avenue 4 Block 44 #11-111
```

## **Sort Property List**

Sorts the property accordingly to how I want it: property name (alphabetically), asking bid, type of housing, deal type (rental or sale)

- Command: `sort-p`
- Format:

    `sort-p name` 

    `sort-p bid` 

    `sort-p housing` 

    `sort-p deal` 

Example:

```java
sort -p name
```

Expected Output:

```java
Your property list is sorted!
1. Chinatown Avenue 4 Block 44 #11-111 
2. Punggol Avenue 3 Block 46 #12-345
```

---

# Bidder Features

## **Addition of Bidder**

Adds a bidder to the bidder list.

- Command: `add-b`
- Format: `add-b n/BIDDER_NAME p/PHONE_NUMBER`

Example:

```java
add-b n/Marcus Duigan p/12345678 
```

Expected Output:

```java
New bidder added: 
		Name: Marcus Duigan 
    Phone number: 12345678
		Id: B1
		Tags: [bidder]
```

## Searching for **Bidder**

User can search for a list of bidders based on their name. The returned list will retain names that matched with the keywords supplied.

- Command: `find-b`
- Format: **`find-b <KEYWORDS>`**

Example:

```java
find-b duigan
```

Expected Output:

```java
1 bidder(s) listed.
```

## View List **of Bidder**

Brings user to the bidder tab and shows the whole list of bidders. Can be used after filtering / searching bidders.

- Command: `list-b`
- Format: `list-b`

Example:

```java
list-b
```

Expected Output:

```java
Listed all bidders.
```

## Edit **of Bidder**

Edits the information of a bidder who is corresponding to the index in the list of bidders. Names, phone number and tags can be edited. 

- Command: `edit-b`
- Format: `edit-b <INDEX> [n/NEW_NAME] [p/NEW_PHONE_NUMER] [t/NEW_TAGS]`

Example:

```java
edit-b 1 n/Marcus Weagle Duigan p/987654321 t/Bidder
```

Expected Output:

```java
Edited Bidder:
	Name: Marcus Weagle Duigan
	Phone: 987654321
	Id: B1
	Tags: [Bidder]
```

The index will only correspond to the original list, NOT the filtered list (when used in search).

## Delete **Bidder**

Deletes the bidder that is corresponding to the index of the bidder in the list of the bidders.

- Command: `delete-b`
- Format: `delete-b <INDEX>`

Example:

```java
delete-b 1 
```

Expected Output:

```java
Deleted Bidder:
	Name: Marcus Weagle Duigan
	Phone: 987654321
	Id: B1
	Tags: [Bidder]
```

The index will only correspond to the original list, NOT the filtered list (when used in search).

# Seller Features

## **Addition of Seller**

Adds a seller to the seller list.

- Command: `add-s`
- Format: `add-s n/SELLER_NAME p/PHONE_NUMBER`

Example:

```java
add-s n/Kor Ming Soon p/12345778 
```

Expected Output:

```java
New seller added: 
		Name: Kor Ming Soon
    Phone number: 12345778 
		Id: S1
		Tags: [seller]
```

## Searching for **Seller**

User can search for a list of sellers based on their name. The returned list will retain names that matched with the keywords supplied.

- Command: `find-s`
- Format: **`find-s <KEYWORDS>`**

Example:

```java
find-s Ming
```

Expected Output:

```java
1 seller(s) listed.
```

## View List **of Seller**

Brings user to the seller tab and shows the whole list of sellers. Can be used after filtering / searching sellers.

- Command: `list-s`
- Format: `list-s`

Example:

```java
list-b
```

Expected Output:

```java
Listed all sellers.
```

## Edit **of Seller**

Edits the information of a seller who is corresponding to the index in the list of sellers. Names, phone number and tags can be edited. 

- Command: `edit-s`
- Format: `edit-s <INDEX> [n/NEW_NAME] [p/NEW_PHONE_NUMER] [t/NEW_TAGS]`

Example:

```java
edit-s 1 n/Joven Kor Ming Soon p/987654321 t/SELLER
```

Expected Output:

```java
Edited Seller:
	Name: Joven Kor Ming Soon
	Phone: 987654321
	Id: S1
	Tags: [SELLER]
```

The index will only correspond to the original list, NOT the filtered list (when used in search).

## Delete **Seller**

Deletes the seller that is corresponding to the index of the seller in the list of the sellers.

- Command: `delete-s`
- Format: `delete-s <INDEX>`

Example:

```java
delete-s 1 
```

Expected Output:

```java
Deleted Seller:
	Name: Joven Kor Ming Soon
	Phone: 987654321
	Id: B1
	Tags: [SELLER]
```

The index will only correspond to the original list, NOT the filtered list (when used in search).


# Bid Features

---

## Adding to Bid to a Property

Adds a bid to the property when there is a bidder for a specific property

- Command: `add -b`
- Format: `add -b a/ADDRESS c/CLIENT_NAME a/BID_AMOUNT`

Example:

```java
add -b a/99 Sunrise Street c/Marcus Duigan a/150000
```

Expected Output:

```java
Added bid to property: 99 Sunrise Street of $150,000 by Marcus Duigan
```

## View List of Bidders for a Property

Will display all bidders for a property

- Command: `list -b`
- Format: `list -b n/PROPERTY_NAME`

Example:

```java
list -b n/99 Sunrise Street
```

Expected Output:

```java
List of bidders for 99 Sunrise Street

* Marcus Duigan- $150000
* Kor Ming Soon- $140330
```

## Deletion of Existing Bid

Will display all bidders for a property

- Command: `delete -b`
- Format: `delete -b a/ADDRESS c/CLIENT_NAME`

Example:

```java
delete -b a/99 Sunrise Street c/Marcus Duigan
```

Expected Output:

```java
Removed bid made by Marcus Duigan for property: 99 Sunrise Street
```

## Editing Bid from a Property

Will edit a bidder’s bid value for a specific property

- Command: `edit -b`
- Format: `edit -b a/ADDRESS c/CLIENT_NAME ab/BID_AMOUNT`

Example:

```java
edit -b a/99 Sunrise Streetc/Marcus Duigan ab/140000
```

Expected Output:

```java
Edited bid made by: Marcus Duigan 
Property: 99 Sunrise Street
Amount: $140000
```

---

# Meeting Features

---

There are three types of meetings of which the agent will be able to add:

1. View - For viewing of properties
2. Admin - For general admin meetings
3. Paperwork - For signing of paperwork related to the selling and buying of the house

---

## Add a View Meeting

Creates a view meeting to be added to the schedule.

- Command: `add-m q/v`
- Format: `add-m q/v b/<BIDDER_ID> p/<PROPERTY_ID> v/<VENUE> t/<DATE>`

Example:

```java
add-m q/v b/B12 p/P12 v/2 ALBERT PARK t/11-12-2021
```
💡 p/BIDDER_ID indicates the id of the bidder.

💡 p/PROPERTY_ID indicates the id of the property listing.

💡 t/VENUE indicates the venue of the meeting.

💡 t/DATE indicates the date of the meeting.

Expected Output:

```java
New meeting added: Viewing
Bidder Id: B12
Property Id: P12
Venue: 2 ALBERT PARK
Date: 11-12-2021
```

## Add an Administrative Meeting

Creates an admin meeting to be added to the schedule.

- Command: `add-m q/a`
- Format: `add-m q/a b/<BIDDER_ID> p/<PROPERTY_ID> v/<VENUE> t/<DATE>`

Example:

```java
add-m q/a b/B12 p/P12 v/2 ALBERT PARK t/11-12-2021
```
💡 p/BIDDER_ID indicates the id of the bidder.

💡 p/PROPERTY_ID indicates the id of the property listing.

💡 t/VENUE indicates the venue of the meeting.

💡 t/DATE indicates the date of the meeting.

Expected Output:

```java
New meeting added: Admin
Bidder Id: B12
Property Id: P12
Venue: 2 ALBERT PARK
Date: 11-12-2021
```

## Add a Paperwork Meeting

Creates a paperwork meeting to be added to the schedule.

- Command: `add-m q/p`
- Format: `add-m q/p b/<BIDDER_ID> p/<PROPERTY_ID> v/<VENUE> t/<DATE>`

Example:

```java
add-m q/p b/B12 p/P12 v/2 ALBERT PARK t/11-12-2021
```
💡 p/BIDDER_ID indicates the id of the bidder.

💡 p/PROPERTY_ID indicates the id of the property listing.

💡 t/VENUE indicates the venue of the meeting.

💡 t/DATE indicates the date of the meeting.

Expected Output:

```java
New meeting added: Paperwork
Bidder Id: B12
Property Id: P12
Venue: 2 ALBERT PARK
Date: 11-12-2021
```

## Deleting an Existing Meeting


Deletes a meeting from the calendar when a meeting is cancelled

- Command: `delete-m`
- Format: `delete-m <INDEX>`

Example:

```java
delete-m 3
```

Expected Output:

```java
Deleted Meeting: Paperwork
Bidder Id: B12
Property Id: P12
Venue: eunos
Date: 12-05-2016
```

## View the list of all Meetings

Lists all the meetings in the meetingbook. Can be used after using the find meeting feature.

- Command: `list-m`
- Format: `list-m`

Example:

```java
list-m
```
Expected Output:

```java
Listed all meetings
```

## Editing an Existing Meeting

Edits an existing meeting detail that is in the list.

- Command: `edit-m`
- Format: `edit-m <INDEX> b/BIDDER_ID p/PROPERTY_ID v/VENUE t/DATE`

Example:

```java
edit-m 2 v/eunos
```

Expected Output:

```java
Edited Meeting: Admin
Bidder Id: B12
Property Id: P12
Venue: eunos
Date: 12-05-2016
```
The index will only correspond to the original list, NOT the filtered list (when used in find).


## Calendar Navigation Features

Calendar navigation features are commands which help the agent to navigate through the calendar. There are only two commands `next` and `prev` which aim to better serve agents who are more inclined with command line interface. 

## Navigate To Next Month in Calendar

Brings the next month page to view.

- Command: `next`
- Format: `next`


Example:

```java
next
```

Expected Output:

```java
Display next month of Calendar
```
Picture Example:

| Before (October)      | After (November) |
| ----------- | ----------- |
| ![october](images/CalendarPictures/Calendar_October.png) | ![november](images/CalendarPictures/Calendar_November.png)|


## Navigate To Previous Month in Calendar

Brings the next month page to view.

- Command: `prev`
- Format: `prev`

Example:

```java
prev
```

Expected Output:

```java
Display previous month of Calendar
```

Picture Example:

| Before (November)      | After (October) |
| ----------- | ----------- |
| ![november](images/CalendarPictures/Calendar_November.png) | ![october](images/CalendarPictures/Calendar_October.png) |

## FAQ

To be completed. Stay tuned!
