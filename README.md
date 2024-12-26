# HUST-Media-Store
Management system for a media store! Created for HUST's OOP course, semester 20241.

# Prerequisites

The following must be installed to run the project:
- JDK 23 or higher
- MySQL 8.0 or higher
- Gradle 8.21 (Gradle 9.0 will fail)

# Configuration

Various variables (most notably the database connection credentials) are configured via a .env file.

Create a .env file in the root directory of the project with the following content:

```
DB_URL=jdbc:mysql://localhost:3306/hust_media_store
DB_USER=root
DB_PASSWORD=your_password
```

