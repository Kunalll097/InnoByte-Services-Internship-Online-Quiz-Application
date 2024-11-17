Here’s an updated **README.md** description incorporating React with Vite and Tailwind CSS for the frontend:  

---

# Quiz App  

This project is a full-stack Quiz Application developed during an internship at InnoByte Services. The app consists of a **React + Vite** frontend and a **Spring Boot** backend, allowing users to create, manage, and participate in quizzes.  

## Frontend  

The frontend is built with **React**, **Vite**, and **Tailwind CSS** for a fast and modern user interface. The application provides a seamless experience for quiz management and participation.  

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
- 
---

## Running the Frontend  

#### 1. Navigate to the frontend directory:  

```bash  
cd frontend  
```  

#### 2. Install dependencies:  

```bash  
npm install  
```  

#### 3. Start the development server:  

```bash  
npm run dev  
```  

The frontend will start on `http://localhost:5173`.  

---

## Conclusion  

This project combines modern frontend and backend technologies to deliver a comprehensive quiz application. With React, Vite, Tailwind CSS, Spring Boot, and MySQL, it provides a fast, scalable, and user-friendly experience.
