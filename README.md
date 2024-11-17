# Quiz App  

This project is a full-stack Quiz Application developed during an internship at InnoByte Services. It is divided into two parts:  
- **Frontend**: Located in the `Quiz-App-frontend` branch, built with React, Vite, and Tailwind CSS.  
- **Backend**: Located in the `Quiz-App-backend` branch, built with Spring Boot.  

## Frontend  

The frontend is built with **React**, **Vite**, and **Tailwind CSS**, providing a modern and responsive user interface for managing and participating in quizzes.  

### Features  

- View questions  
- Add new questions  
- Delete questions  
- Update questions  
- Create quizzes  
- Submit quizzes and view results  

### Technologies Used  

- **React + Vite**  
- **React Router**  
- **Axios**  
- **Tailwind CSS**  

### API Integration  

The frontend communicates with the backend via RESTful APIs. API methods are configured in `src/api/api.js`.  

#### Example API Methods  

- `fetchAllQuestions()`  
- `addQuestion(question)`  
- `deleteQuestion(id)`  
- `updateQuestion(id, question)`  
- `createQuiz(category, numQ, title)`  
- `getQuizById(id)`  
- `submitQuiz(id, responses)`  
- `getQuizzes()`  

### Running the Frontend  

1. Navigate to the `Quiz-App-frontend` branch:  
   ```bash  
   git checkout Quiz-App-frontend  
   ```  

2. Install dependencies:  
   ```bash  
   npm install  
   ```  

3. Start the development server:  
   ```bash  
   npm run dev  
   ```  

The frontend will start on `http://localhost:5173`.  

---

## Conclusion  

This project leverages modern technologies like React, Vite, Tailwind CSS, Spring Boot, and MySQL to deliver a robust and user-friendly quiz management system.
