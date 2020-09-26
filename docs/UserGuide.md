---
layout: page
title: User Guide
---

PropertyFree is adapted from AB3, utilizing on CLI to run features and commands.

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

## **Addition of Seller**

Adds a seller to the seller list.

- Command: `add -s`
- Format: `add -s n/SELLER_NAME p/PHONE_NUMBER a/ADDRESS`

Example:

```java
add -c n/Marcus Duigan p/12345678 a/99 Hill Street
```

Expected Output:

```java
Client
    Id: S2
    Name: Marcus Duigan
    Phone number: 12345678
    Address: 99 Hill Street
Has been added!
```

## **View List of Sellers**

Views the list of sellers with property listings that I manage.

- Command: `list -s`
- Format: `list -s`

Example:

```java
list -s
```

Expected Output:

```java
Here are the list of sellers:
C1 Marcus Duigan, 12345678, 99 Hill Street
C2 Kor Ming Soon, 12345679, 99 Mountain Street
```

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

# Calendar Features

---

There are three types of meetings of which the agent will be able to add:

1. View - For viewing of properties
2. Admin - For general admin meetings
3. Paperwork - For signing of paperwork related to the selling and buying of the house

---

## Add a View Meeting

Creates a view meeting to be added to the schedule.

- Command: `add -m view`
- Format: `add -m view at/PROPERTY_ID by/TIME d/DESCRIPTION`

Example:

```java
add -m view at/4 by/12102020 1600 d/bring to condo
```

💡 at/PROPERTY_ID indicates the id of the property listing.

💡 by/TIME indicates the time of the meeting.

Expected Output:

```java
Client Viewing Meeting: 12 Oct 2020 at 1600hrs
    Id: C2
    Name: Marcus Duigan
    Phone number: 12345678
    Address: 99 Hill Street
    Type: Seller
    Description: bring to condo
Has been added!
```

## Add an Administrative Meeting

Creates an admin meeting to be added to the schedule.

- Command: `add -m admin`
- Format: `add -m admin at/PROPERTY_ID by/TIME d/DESCRIPTION`

Example:

```java
add -m admin at/4 by/12102020 1600 d/talk about regulations
```

💡 at/PROPERTY_ID indicates the id of the property listing.

💡 by/TIME indicates the time of the meeting.

Expected Output:

```java
Client Admin Meeting: 12 Oct 2020 at 1600hrs
    Id: C2
    Name: Marcus Duigan
    Phone number: 12345678
    Address: 99 Hill Street
    Type: Seller
    Description: talk about regulations
Has been added!
```

## Add a Paperwork Meeting

Creates a paperwork meeting to be added to the schedule.

- Command: `add -m admin`
- Format: `add -m paper at/PROPERTY_ID by/TIME d/DESCRIPTION`

Example:

```java
add -m paper at/4 by/12102020 1600 d/sign CPF paper
```

💡 at/PROPERTY_ID indicates the id of the property listing.

💡 by/TIME indicates the time of the meeting.

Expected Output:

```java
Client Paperwork Meeting: 12 Oct 2020 at 1600hrs
    Id: C2
    Name: Marcus Duigan
    Phone number: 12345678
    Address: 99 Hill Street
    Type: Seller
     Description: sign CPF paper
Has been added!
```

## Deleting a Meeting

Deletes a meeting from the calendar when a meeting is cancelled

- Command: `delete -m`
- Format: `delete -m m/MEETING_ID`

Example:

```java
delete -m m/M4
```

Expected Output:

```java
Meeting M4 has been deleted
```

## Editing an Existing Meeting

Edits an existing meeting detail that is in the list.

- Command: `edit -m`
- Format: `edit -m m/MEETING_ID by/TIME t/TYPE_MEETING d/DESCRIPTION`

Example:

```java
edit -c m/4 by/12102020 1600 t/view d/show bedroom
```

💡 at/PROPERTY_ID indicates the id of the property listing.

💡 by/TIME indicates the time of the meeting.

Expected Output:

```java
Client Paperwork Meeting: 12 Oct 2020 at 1600hrs
    Id: C2
    Name: Marcus Duigan
    Phone number: 12345678
    Address: 99 Hill Street
    Type: Seller
    Description: show bedroom
Has been added!
```

## Listing all Meeting Schedules

Displays all meetings in the calendar list chronologically

- Command: `add -m admin`
- Format: `add -m admin at/PROPERTY_ID by/TIME d/DESCRIPTION`

Example:

```java
add -m admin at/4 by/12102020 1600 d/talk about regulations
```

💡 at/PROPERTY_ID indicates the id of the property listing.

💡 by/TIME indicates the time of the meeting.

Expected Output:

```java
Client Admin Meeting: 12 Oct 2020 at 1600hrs
    Id: C2
    Name: Marcus Duigan
    Phone number: 12345678
    Address: 99 Hill Street
    Type: Seller
    Description: talk about regulations
Has been added!
```

## FAQ

To be completed. Stay tuned!
