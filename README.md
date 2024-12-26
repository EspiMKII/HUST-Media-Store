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

An empty MySQL database named `hms` must be created manually. The tables will be created automatically by the application.

# Credits
We would like to give our credits to:
- The following group members for contributing to this project:
    - [Nguyễn Hải Dương](https://github.com/noeruchangd)
    - [Nguyễn Lê Hoàng](https://github.com/EspiMKII)
    - [Nguyễn Đình Phúc](https://github.com/phucnd220104)
    - [Trần Huy Hoàng](https://github.com/Iry6868)
- Our beloved professor, Mr. Trần Thế Hùng, for his guidance, support and undying passion for education.
- The developers of tools, libraries and dependencies used by this project.

