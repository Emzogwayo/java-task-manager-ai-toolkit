## Technologies Used
- Java  
- ArrayList (for dynamic task storage)  
- Scanner (for user input)  

---

**How to Run**

**1. Prerequisites**
- Java JDK installed  
- Any code editor (VS Code, IntelliJ, etc.)

**2. Compile the Program**
```bash
javac TaskManager.java

**3. Run the Program**
java TaskManager

**Example Output**
1. Add Task
2. View Tasks
3. Delete Task
4. Exit
Choose an option:

**What I Learned**
Difference between ArrayList and arrays
How Scanner handles user input
Common input bug with nextInt() and nextLine()
How to debug and fix errors
How to improve a program incrementally

**Common Issue**
Input Skipping Bug
Problem: Input gets skipped when using nextLine()
Cause: nextInt() does not consume the newline character
Fix: Add an extra scanner.nextLine() after nextInt()

**AI Usage**
AI was used to:
Generate the initial version of the program
Explain Java concepts (ArrayList, Scanner, loops)
Debug input handling issues
Suggest small improvements

All code was reviewed, tested, and modified to ensure understanding.

**References**
Official Java Documentation
Course materials
ChatGPT
StackOverflow

**Future Improvements**
Save tasks to a file
Add task deadlines
Improve user interface
