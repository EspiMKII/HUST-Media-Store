<h1 align="center" style="font-size:24px;">MAIN DOCUMENTATION</h1>  

<span style="font-size:13px;">**Preface:** This documentation serves as the entry of the documentations for this project</span> 

**<span style="font-size:18px;">Introduction</span>**
- This section provides an overview of the project's purpose, scope, and key features. It aims to give readers a clear understanding of what to expect from the documentation.

**<span style="font-size:16px;">Purpose</span>**
- The project is made for the 152626 Object-Oriented Programming class in semester 1/2024 of HUST.
- The aimed readers of these documentations are mostly ourselves, the developers. As such, admittedly, the structure of the docs will be quite random, as I'm just spewing whatever is up on my mind first. I am sorry for this inconvenience.

**<span style="font-size:16px;">Scope</span>**
- The documentation covers the design, implementation, and usage of the HUST Media Store project, including its class diagrams.
- The document also provides instructions on how to set up the development environment, run the project, and perform testing.
- Additionally, it outlines the features and functionalities of the application.

**<span style="font-size:16px;">Key Features</span>**

- **Account Hierarchy:**
    - Differentiation between staff and management accounts.
    - Also includes customers' "accounts".

- **Staff:**
    - Recommender pane to suggest products to customers.
    - Customer purchase menu for managing orders during a working session.
    - View staff's working information, including pay and work done (e.g., charts).

- **Manager:**
    - Access to all staff menus.
    - View information of all staff members.
    - View financial details, including revenue and expenses.
    - Edit store products (add, remove, edit).

- **Products:**
    - Blu-ray
    - CD
    - DVD
    - Book

- **Customers Account System:**
    - Allows customers to accumulate purchase points and use them for discounts.
    - New customers can create an account in the system.
    - Staff can link purchases to customer accounts to reward points.

**<span style="font-size:18px;">Tools and Frameworks</span>**

- Obviously Java. Specifically, we use Gradle to build our application.
- The database is managed with mySQL.
- The UI is built with JavaFX.
  
**<span style="font-size:18px;">References</span>**

- [Kumar Shivam Ranjan's implementation of a retail management system](https://github.com/kumar-shivam-ranjan/Retail-Store-Management-System) (I couldn't build the mvn project tho so does it really count)
- [Nguyen Tien Dat' OOP Lab project](https://github.com/DatTienNguyenn/oop-lab-20226023)