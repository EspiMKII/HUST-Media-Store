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
    - When asked, the staffs can look up the store's products and make recommendations based on the customer's preferences. These preferences could be about a media's type, creator, name, genre, or price.
    - Staffs can look up their information at the store while at work:
        - Their registered details at the store: name, starting date of work, position (in this case it would be just a staff), average pay.
        - Their work schedule and assignments. Each of these can be marked as uncompleted, completed, or completed late.
        - Performance metrics: work sessions (starting time and duration, possibly visualized in graphs), purchases completed in each session, average work time, and average purchases completed per session.
    - Staffs must log in at the start of a work session, and confirm and log out at the end of the session.

- Based on these requirements, we map out the following features of a staff's log in sessions:
    - A tab for registering purchases, which should also include options to register/log in a customer's account per purchase.
    - A tab for staff's information, with the information above. The information should be categorized into subtabs.
    - Credentials to log in as a staff (stored somewhere).
    - Option to check out and log out of the application.

**<span style="font-size:18px;">Manager Accounts</span>**

- A manager has the following duties and rights relevant to this project during their work sessions at the retail store:
    - They have all features a staff has.
    - They can view the store's staff list:
        - They can see a list of staffs with simple details for each one
        - They can edit the list (add staff, remove staff, edit details of staff)
    - They can view the financial details of the store, which should include:
        - Revenue history (graphs)
        - 