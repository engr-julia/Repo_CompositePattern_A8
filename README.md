# 🎓 New Era University Organizational System

---

## 📌 Overview
This project models the organizational structure of a university where units can contain other units or exist independently.

The system represents:
- Colleges
- Departments
- Teachers
- Students

Each unit is treated uniformly through a common interface.

---

## 🧩 Design Pattern Used
### Composite Design Pattern

This pattern allows:
- Individual objects (**Student, Teacher**)  
- Groups of objects (**Department, College**)  

to be handled the same way.

---

## 🏗️ System Structure

### Components:
- `EducationalUnit` (Interface)
- `College` (Composite)
- `Department` (Composite)
- `Teacher` (Leaf)
- `Student` (Leaf)

---

## ⚙️ Features

### ✅ Hierarchical Modeling
- Colleges can contain departments, teachers, students, and sub-colleges.
- Departments can contain teachers and students.

### ✅ Student Count Calculation
- Recursively counts all students inside a structure.

### ✅ Budget Calculation
- **Teacher** → Salary  
- **Student** → -Tuition Fee  
- **Department** → Teachers - Students  
- **College** → Sum of all units  

### ✅ Display Structure
- Prints all units in an organized format.

---

## ▶️ How to Run

```bash
javac *.java
java Main
