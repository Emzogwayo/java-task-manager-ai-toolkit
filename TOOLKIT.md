# 🧰 Toolkit Document

## 1. 📌 Title & Objective

### Title
**Java CLI Task Manager – Beginner Guide**

### Objective
The goal of this project is to build a simple command-line task manager using Java and understand how to use AI to learn and debug code.

---

## 2. 📖 Quick Summary

Java is a programming language used to build applications. In this project, I used Java to create a simple task manager that runs in the command line.

A real-world example of this would be simple note-taking or to-do list applications.

---

## 3. 💻 System Requirements

- **OS:** Windows / Mac / Linux  
- **Software:** Java JDK installed  
- **Code Editor:** VS Code / IntelliJ  

---

## 4. ⚙️ Installation & Setup

1. Install Java JDK from the official website  
2. Create a `.java` file named `TaskManager.java`  

### Compile the program:
```bash
javac TaskManager.java
```

### Run the program:
```bash
java TaskManager
```

---

## 5. 🧪 Minimal Working Example

### Description
This program allows users to:
- Add tasks  
- View tasks  
- Exit the program  

---

### Initial Base Code

```java
import java.util.ArrayList;
import java.util.Scanner;

public class TaskManager {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // clear buffer

            if (choice == 1) {
                System.out.print("Enter task: ");
                String task = scanner.nextLine();
                tasks.add(task);
                System.out.println("Task added!");
            } else if (choice == 2) {
                System.out.println("\nTasks:");
                for (int i = 0; i < tasks.size(); i++) {
                    System.out.println((i + 1) + ". " + tasks.get(i));
                }
            } else if (choice == 3) {
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice.");
            }
        }

        scanner.close();
    }
}
```

---

### Expected Output

```
1. Add Task
2. View Tasks
3. Exit
Choose an option:
```

---

## 6. 🤖 AI Prompt Journal

### Prompt 1: Making the Base Code

I am a beginner learning Java.  
Could you generate a simple command-line task manager program using ArrayList and Scanner?

**Requirements:**
- Allow users to add tasks  
- View tasks  
- Exit the program  
- Keep the implementation simple and beginner-friendly  
- Include comments in the code  

---

### Prompt 2: Understanding the Code

#### My Understanding Before Asking AI
- ArrayList stores tasks dynamically  
- Unsure how it differs from arrays  
- Thought lists start at index 1 (incorrect)  
- Knew Scanner gets input but not how it works  

#### Questions I Had
1. Difference between ArrayList and arrays  
2. How Scanner works  
   - `nextInt()` vs `nextLine()` vs `next()`  
3. What `scanner.close()` does  
4. Whether `break` exits the loop  

#### What I Learned
- ArrayList is dynamic, arrays are fixed  
- Indexing starts at 0  
- Scanner reads user input  
- `nextInt()` reads numbers, `nextLine()` reads full text  
- `break` exits the loop  

#### Evaluation
AI helped clarify misconceptions and improved my understanding of Java fundamentals.

---

### Prompt 3: Understanding Scanner Bug

#### Problem
Input was skipped after using `nextInt()`

#### Code Snippet
```java
int choice = scanner.nextInt();
String task = scanner.nextLine();
```

#### What I Learned
- `nextInt()` does NOT consume the newline  
- `nextLine()` reads the leftover newline  
- This causes skipped input  
- Adding an extra `scanner.nextLine()` fixes it  

#### Testing / Experimentation
- Removed `scanner.nextLine()` → bug occurred  
- Re-added it → issue resolved  

#### Evaluation
This helped me understand how Java handles input internally and why bugs occur when mixing `nextInt()` and `nextLine()`.

---

### Prompt 4: Improving the Program

#### AI Suggestions
- Handle empty task lists  
- Improve output messages  
- Number tasks  

#### What I Implemented
1. **Delete Task Feature** — Users can delete tasks by number  
2. **Empty Task Validation** — Prevents adding empty tasks  
3. **Invalid Input Handling** — Uses try-catch to prevent crashes  

#### Evaluation
These improvements made the program more user-friendly and easier to understand.

---

## 7. ⚠️ Common Issues & Fixes

### Scanner Input Skipping
- **Issue:** Input skipped when using `nextLine()`  
- **Cause:** `nextInt()` does not consume the newline character  
- **Fix:** Add `scanner.nextLine()` after `nextInt()`  

---

## 8. 📚 References

- Official Java Documentation  
- Course materials  
- AI assistance (ChatGPT, GitHub Copilot)  
- Online forums (e.g., Stack Overflow)  

---
