# CampusCause

## About
CampusCause is a crowdfunding platform designed specifically for students to fund their educational projects, research, and extracurricular activities. The platform bridges the gap between students in need of financial support and potential donors interested in fostering academic and extracurricular achievements. Through a user-friendly interface, CampusCause enables students to create funding campaigns, while allowing donors to find and contribute to causes they believe in.

## Technologies
This project is built using a range of technologies, ensuring a robust, scalable, and seamless experience:

- **Frontend**: React, Typescript, CSS, HTML
- **Backend**: Spring Boot, Java
- **Database**: MongoDB
- **CI/CD**: GitHub Actions, Docker
- **Deployment**: AWS (Amazon Web Services)

## Features
CampusCause offers a variety of features to cater to both students and donors:

- **User Profiles**: Dedicated profiles for students and donors to manage their activities and preferences.
- **Project Listings**: An intuitive interface for students to list their funding needs and for donors to browse and select projects to support.
- **Secure Payment Integration**: A reliable and secure system for processing donations.
- **Social Sharing**: Features allowing users to share projects on social media platforms to increase visibility.
- **Search and Filters**: Advanced search functionality to help donors find projects that match their interests.
- **Updates and Milestones**: Enables students to post updates on their project's progress to keep donors informed and engaged.
- **Comments and Interaction**: A platform for communication between students and donors, fostering a sense of community.
- **Ratings and Reviews**: Allows donors to leave feedback on projects, enhancing trust and transparency.

## Getting Started

### Prerequisites
Ensure you have the following installed:
- Java JDK 11 or higher
- Node.js and npm (for React frontend)
- MongoDB

### Setting Up the Development Environment
1. **Clone the repository**

   ```bash
   git clone https://github.com/EJ-Lan/CampusCause.git
   cd campuscause
   ```
2. **Backend Setup**

   Navigate to the backend directory and run the Spring Boot application:
   ```bash
   cd backend
   ./mvnw spring-boot:run
   ```
4. **Frontend Setup**
   
   Navigate to the frontend directory, install dependencies, and start the React application:
   ```bash
   cd frontend
   npm install
   npm start
   ```
5. **Accessing the Application**

   Visit `http://localhost:3000` in your web browser to view the react frontend.
   The backend API is accessible at `http://localhost:8000`

### Environment Configuration

Create a `.env` file and fill in your environemnt-specific configurations

## Deployment

The deployment process for CampusCause utilizes GitHub Actions for continuous integration and continuous deployment (CI/CD), ensuring that every merge into the main branch is automatically tested and deployed.

### CI/CD Workflow with Github Actions

#### Backend Deployment

1. **Automated Testing**: Upon every push to the main branch, GitHub Actions triggers a workflow that runs automated tests for the Spring Boot backend, ensuring code integrity and functionality.

2. **Dockerization**: Once the tests pass, the backend is Dockerized, creating a Docker image of the Spring Boot application.

3. **AWS ECR (Elastic Container Registry)**: The Docker image is then pushed to AWS ECR, a fully managed Docker container registry that makes it easy for developers to store, manage, and deploy Docker container images.

4. **AWS Elastic Beanstalk**: Finally, the Docker image stored in AWS ECR is deployed to AWS Elastic Beanstalk. Elastic Beanstalk automatically handles the deployment, from capacity provisioning, load balancing, and auto-scaling to application health monitoring, allowing the Spring Boot backend to be easily scalable and managed.

#### Frontend Deployment

1. **Automated Testing**: Similar to the backend, automated tests are run for the React frontend upon every push to the main branch, ensuring that the frontend codebase is stable and error-free.

2. **S3 Deployment**: Upon successful completion of frontend tests, the workflow builds the React application and deploys it to Amazon S3. Amazon S3 hosts the static assets of the frontend, serving the React application to users.




