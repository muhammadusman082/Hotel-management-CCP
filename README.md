# Hotel-management system -CCP

# Guest House Management System

A robust and modular **Java-based application** designed to manage daily operations of a guest house, including room allocations, guest registrations, and reservation tracking.

---

 Overview
This system follows the **Model-View-Controller (MVC)** architectural pattern to ensure a clean separation of concerns. It allows administrators to handle multiple rooms, manage various room types (Single, Double, Suite), and process guest check-ins/check-outs efficiently.

---

 Key Features
* **Room Management:** Add and track rooms within the guest house.
* **Reservation System:** Create, validate, and cancel bookings using unique reservation IDs.
* **Guest Handling:** Manage guest profiles, including their contact details and identity information.
* **Check-in/Check-out:** Automated logic to verify room availability before assigning guests.
* **Flexible Pricing:** Support for different room categories with associated costs.

---

 Project Structure
The project is organized into distinct packages for better scalability:

* **main**: Contains the entry point of the application (`Main.java`).
* **controller**: Logic layer that manages the flow of data (e.g., `GuestHouseChain`, `GuestHouse`).
* **entities**: Contains core business objects like `Room`, `Reservation`, and `RoomType`.
* **model**: Defines the data structures such as `Guest`, `Address`, `Name`, `Money`, and `Identity`.

---

    Technologies & Concepts Used
* **Object-Oriented Programming (OOP):** Used Inheritance (e.g., `ReserverPayer` extending `Guest`), Encapsulation, and Polymorphism.
* **Java Collections:** For managing lists of rooms and reservations.
* **Enums:** Used for fixed categories like `RoomKind` (SINGLE, DOUBLE, SUITE).
* **Data Validation:** Logic-based checks to prevent double-booking or invalid cancellations.
* **Modular Design:** Code is split into reusable components to avoid redundancy.

---

    Core Components

| Component | Description |
| :--- | :--- |
| **GuestHouse** | The central repository for rooms and primary business logic. |
| **GuestHouseChain** | Acts as a manager to coordinate operations between the guesthouse and the guests. |
| **ReserverPayer** | Specialized guest class that handles payment and identity details. |
| **RoomType** | Maps specific room categories to their respective nightly rates. |

---
     How to Run
1.  Ensure you have **Java JDK** installed.
2.  Maintain the folder structure according to the package names (`controller`, `entities`, `model`, `main`).
3.  Compile and run the `Main.java` file from the `main` package.