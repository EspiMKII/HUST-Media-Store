<h1 align="center" style="font-size:24px;">DATA REQUIRED</h1>

Based on what we have planned so far, we need the following tables:

1. Table for staff list. The attributes of this table are:
    - (String) email: the form of each email should be like staff.name@hms.com or manager.name@hms.com for the sake of differentiation
    - (String) password
    - (String) name
    - (Date) starting date of work
    - (String) position
    - (float) salary
    - (long) purchases registered
    - (int) login sessions completed
    - (int) average purchases done per session = login sessions completed / purchases registered
    - (long) work sessions done this week/month/year (should be 3 attributes)

    This means the feature to check for login credentials should check data from this table. 

2. Table for customer accounts' credentials. The attributes of this table are:
    - (String) name: the name of the customer (duh)
    - (long) phone number: since Java doesn't store longs with leading 0's, we can use country code as the beginning of the phone numbers i.e. 84962123456 (here, the leading 84 is the country code for Vietnam).

3. Table for financial details. The attributes of this table are:
    - (String) month: should be "mm/yyyy" i.e. "05/2024". We don't really need to use the Date data type here since this information is purely going to be used to create charts.
    - (float) revenue
    - (float) expenses
    - (float) profit = revenue - expenses (do we need this?)

4. Tables to stores products of the 3 different types of media.
    - Each table should contain these attributes:
      - (String) title
      - (list of Strings) creators
      - (Date) release date
      - (list of Strings) genres
      - (String) language
      - (float) price
    - The table for DVDs should include a (long) length attribute.
    - The table for Books should include a (long) pages attribute.
    - The table for CDs should include an attribute for tracks. since we are using HashMaps in the source code, I think the best data type to store in SQL would be JSON.