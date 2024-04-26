# NEC - National Electronic Health Care (Built by Rayan Rasheed)

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

# Getting Started

## Step 1: Clone the Repository

```bash
git clone https://github.com/Abdullahofficial00/NEC.git
cd NEC
```

## Step 2: Set Up MongoDB

1. **Prerequisites:**
   - Node.js and npm
   - MongoDB installed and running
   - (Any additional prerequisites...)

2. **Create a MongoDB Account:**
   - Visit [MongoDB](https://www.mongodb.com/) and sign up.
   - Note the "Connect to your application URI" for the database.

3. **Add IP to Whitelist:**
   - Add your current IP address to the MongoDB database's IP whitelist in the `.env` file.

```bash
cd server
npm install
```

## Run Backend

```bash
npm start
```

Now, the backend is running.

## Run Frontend

1. In the `.env` file, replace the port with the one you set on the backend side. By default, it is set to 8081.

```bash
cd NEC/react_frontend/client
npm install
```

2. Run the frontend:

```bash
npm start
```

## Ready to Use

The application will open in your default browser. If you prefer a customized browser, copy the link from the shell and paste it into your browser.


