# ⚡ MCache - High Performance In-Memory Key-Value Store

**MCache** is a lightweight, high-performance, in-memory key-value database built with Java, inspired by Redis.

## 🚀 Features

- Basic commands: `SET`, `GET`, `DEL`
- TTL support: Automatic key expiration
- Custom text-based protocol (TCP)
- Multi-threaded architecture
- Health metrics (Spring Boot Actuator)
- Modular design

## 🏗️ Project Structure

```plaintext
mcache/
├── src/
│   └── main/
│       └── java/com/mcache/
│           ├── core/
│           ├── protocol/
│           ├── server/
│           ├── ttl/
│           └── Main.java
│       └── resources/



🖼️ High-Level Design

![HLD](https://github.com/user-attachments/assets/3d4ed806-a110-45b8-a8d4-2f4f09c29fe2)

🧩 Low-Level Design

![LLD](https://github.com/user-attachments/assets/73743a54-c510-4c07-86df-b62944f0e706)

🛠️ Tech Stack

- Java 21
- Spring Boot
- Maven
- Lombok
- TCP Sockets

<img src="https://img.shields.io/badge/GitHub-the--sky7-blue?logo=github&style=flat-square" alt="GitHub"></img>
