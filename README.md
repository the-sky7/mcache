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



## 🖼️ High-Level Design

![img.png](img.png)

## 🧩 Low-Level Design

![img_1.png](img_1.png)

## 🛠️ Tech Stack

- Java 21
- Spring Boot
- Maven
- Lombok
- TCP Sockets

Made by [the-sky7](https://github.com/the-sky7)