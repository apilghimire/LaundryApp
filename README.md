Objective
The project is a Laundry Management System designed to manage customer details, laundry orders, and provide functionalities like sorting, searching, and updating information. The system uses a Java Swing GUI to interact with the user and perform operations on data stored in lists or tables.

Core Components
1. Data Models
User Class:

Represents customers in the system.
Attributes:
userID: Unique identifier for the user.
userName: Full name of the user.
contactNumber: Contact number of the user.
userEmail: Email address of the user.
userAddress: Address of the user.
Laundry Class:

Represents laundry orders placed by customers.
Attributes:
laundryID: Unique identifier for the laundry order.
laundryWeight: Weight of the laundry.
laundryType: Type of laundry (e.g., wash, dry-clean, fold).
laundryStatus: Status of the order (e.g., "Sort Clothes", "Clean", "Fold").
laundryCondition: Indicates whether the order is "Active".
userID: ID of the customer who placed the order.
2. GUI Components
Dashboard Table (dashBoardTable):

Displays customer details (userID, userName, contactNumber, userEmail, userAddress).
Supports sorting by user name.
Order Management Table (jTable1):

Displays details of laundry orders.
Supports adding, deleting, sorting, and updating laundry orders.
Search Field (SearchTextField):

Allows users to search for customer information by userName.
Buttons:

Add/Update/Delete: Manage laundry orders and customer details.
Sort: Sort orders or customer data.
Search: Search for specific customer data.
3. Functionalities
Customer Management
Display customer information in the dashBoardTable.
Sort customers by userName.
Laundry Order Management
Add, delete, and update laundry orders.
Display orders in jTable1.
Sort orders by:
LaundryID (ascending/descending).
LaundryWeight (ascending/descending).
LaundryStatus (ascending/descending, respecting "Active" condition).
Search
Search for customers by userName using binary search.
Display matching results in the dashBoardTable.
Validation
Ensure all fields are filled during data entry.
Restrict updates and sorting to laundry orders with "Active" condition.
4. Logic Components
Sorting:

Sort Class:
Implements insertion sort for LaundryID.
Implements selection sort for LaundryWeight.
Implements recursive insertion sort for LaundryStatus.
Ensures sorting skips non-active laundry orders.
Binary Search:

BinarySearch Class:
Searches for customers in userList by userName.
Data Handling:

Methods to populate dashBoardTable and jTable1 with data.
Refresh tables dynamically after adding, updating, or deleting data.
Sample Workflow
Initialize Data:

Predefined users and laundry orders are loaded into userList and laundryList.
User Searches for a Customer:

Enters a userName in SearchTextField.
Clicks SearchButton.
BinarySearch finds the customer and displays details in dashBoardTable.
Add a Laundry Order:

User selects a customer, enters order details, and clicks AddOrderButton.
The order is added to laundryList and displayed in jTable1.
Sort Laundry Orders:

User selects a sort type (e.g., "by Weight Ascending").
Clicks SortButton.
Orders are sorted and the table is updated.
Update Laundry Status:

User selects a row in jTable1, chooses a new status, and clicks UpdateButton.
The status is updated if the order is "Active".
Delete an Order:

User selects a row in jTable1 and clicks DeleteButton.
The order is removed from laundryList.
Technologies Used
Programming Language: Java
GUI Framework: Swing
Data Structures:
ArrayList for userList and laundryList.
DefaultTableModel for table data.
Potential Enhancements
Database Integration:

Replace in-memory lists with a database for persistent storage.
Authentication:

Add a login system for admin or customer access.
Reporting:

Generate reports for completed laundry orders.
Improved Validation:

Add validation for email and phone number formats.
Responsive Design:

Make the GUI more user-friendly with improved layouts.
This project effectively manages a laundry business's core operations and demonstrates key programming concepts like GUI design, sorting algorithms, and search techniques.
