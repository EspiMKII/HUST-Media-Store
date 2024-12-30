<h1 align="center" style="font-size:24px;">ACCOUNT HIEARCHY</h1>

**<span style="font-size:18px;">Basics:</span>**
- The management system will have 2 modules:
    - the staff module
    - the manager module
- Upon opening the application, a worker at the store will log into their module, with their account, based on their position.
- A special kind of account can be registered for customers.

**<span style="font-size:18px;">Staff Accounts</span>**

- A staff has the following duties and rights relevant to this project during their work sessions at the retail store:
    - When customers have picked up their products and are at the register to purchase them, staff will perform the purchase via the application.
    - When asked, the staffs can look up the store's products and make recommendations based on the customer's preferences:
        -  These preferences could be about a media's type, creator, name, genre, or price.
        -  They can filter the products by these metrics.
    - Staffs can look up their information at the store while at work:
        - Their registered details at the store: name, starting date of work, position (in this case it would be just a staff), average pay.
        - Performance metrics: average purchases completed in each session, work sessions done this week/month/year.
    - Staffs must log in at the start of a work session, and confirm and log out at the end of the session.

- Based on these requirements, we map out the following features of a staff's log in sessions:
    - A tab for registering purchases, which should also include options to register/log in a customer's account per purchase.
    - A tab for staff's information, with the information above. The information should be categorized into subtabs.
    - Credentials to log in as a staff: a workplace email, and a password (stored somewhere).
    - Option to check out and log out of the application.

**<span style="font-size:18px;">Manager Accounts</span>**

- A manager has the following duties and rights relevant to this project during their work sessions at the retail store:
    - They have all features a staff has.
    - They can view the store's staff list:
        - They can see a list of staffs with simple details for each one: Name, position, and last logged in time. 
        - They can edit the list (add staff, remove staff, edit details of staff)
    - They can view the financial details of the store, which should include:
        - Revenue history, per month. (graphs)
        - Expenses history. (we won't go into details of expenses, we're just going to list out how much money is spent during a month)
        - Profit history. (Profit = Revenue - Expenses)
    - They can view the store's product list:
        - They can see a list of products with full details of each product.
        - They can filter the products by different metrics.
        - They can edit the list (add a product, remove a product, edit a product's details)

- Based on these requirements, we map out the following features of a manager's log in session:
    - The same tabs as as staff (duh).
    - A tab for the store's financial details.
    - A tab to modify the store as desired.
    - Credentials to log in as a manager: a workplace email, and a password.
    - Option to check out and log out of the applications.


**<span style="font-size:18px;">Customer "accounts":</span>**
- When a staff registers a purchase, the customer can opt in to make an account at the store
- The only purpose of the account is to accumulate purchase points and use said points to apply discounts on their purchases
    - There should be a formula to determine how many points is accumulated per a customer's purchase
    - The account is not meant to be used to log into the application; only staffs and managers can do that.
    - There should also be a formula to determine how much money these points can discount from a customer's purchase
- The credentials for a customer's account should be their name, and their phone number.