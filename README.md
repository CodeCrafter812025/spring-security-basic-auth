# Spring Security Basic Auth Demo

This is a simple Spring Boot REST API project demonstrating basic authentication using Spring Security.

## 🔐 Features

- In-memory authentication with two users: `user`, `admin`
- Role-based access control:
    - `/public/**` → accessible by anyone
    - `/user/**` → requires USER or ADMIN
    - `/admin/**` → requires ADMIN
- Stateless API using HTTP Basic authentication
- Configurable and ready for extension to JWT

## 🧪 How to Test

1. Run the app:

2. Test these endpoints:

| Endpoint           | Method | Access        |
|--------------------|--------|---------------|
| `/public/hello`    | GET    | Public        |
| `/user/hello`      | GET    | USER or ADMIN |
| `/admin/hello`     | GET    | ADMIN only    |

Use Postman or browser with:
- `user` / `1234`
- `admin` / `admin`

## 📦 Tech Stack

- Java 17+
- Spring Boot
- Spring Security
- Maven

## 📁 Folder Structure

