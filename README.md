# NEC - National Electronic Health Care

NEC is a comprehensive platform that facilitates electronic healthcare services, streamlining the appointment process for both doctors and patients.

## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Technologies](#technologies)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
- [Project Structure](#project-structure)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

## Introduction

NEC aims to simplify and enhance the healthcare experience by providing a centralized platform for managing doctor appointments. It offers a seamless interaction between doctors and patients, making the appointment scheduling process efficient and user-friendly.

## Features

- **User Authentication**: Secure user authentication for both doctors and patients.
- **Appointment Scheduling**: Easy-to-use interface for scheduling and managing appointments.
- **Profile Management**: Update and manage user profiles for doctors and patients.
- **Real-time Notifications**: Receive notifications for appointment updates and reminders.
- **Doctor Dashboard**: Specialized dashboard for doctors to view and manage appointments.
- **Patient Dashboard**: Patient-centric dashboard for viewing upcoming and past appointments.
- **Admin Panel**: Administrative tools to manage users, appointments, and system settings.

## Technologies

- **Frontend**: React.js
- **Backend**: Node.js, Express.js
- **Database**: MongoDB
- **Authentication**: JSON Web Tokens (JWT)
- **Real-time Updates**: Socket.io
- **Styling**: CSS (or preferred styling solution)
- **Deployment**: Docker, Heroku, or your preferred hosting platform.

## Getting Started

Follow these steps to set up the NEC project locally.
### Step 1: Clone the Repository

```bash
git clone https://github.com/Abdullahofficial00/NEC.git
cd NEC
**RUN Backend**
### Prerequisites

1. Node.js and npm
2. MongoDB installed and running
3. (Any additional prerequisites...)
*Step 2: Set Up MongoDB*
Create a MongoDB account by visiting MongoDB and signing up.
Note the "Connect to your application URI" for the database.
Add your current IP address to the MongoDB database's IP whitelist in the .env file
```bash
cd server
npm install
```bash
npm start
Now the backend is running.
**RUN Frontend**
In the .env file replace the port you set on the backend end side on default it is written 8081
```bash
cd NEC
cd react_frontend
cd client
npm install
*Run it*
npm start
**Ready to Use**
It will open your default browser and open the application. If you want to open it in your customized browser copy the link from the shell and paste to the browser.


