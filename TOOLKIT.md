Toolkit Document
1.	Title & Objective

Title:
Java CLI Task Manager – Beginner Guide
Objective:
The goal of this project is to build a simple command-line task manager using Java and understand how to use AI to learn and debug code.

2.	Quick Summary

Java is a programming language used to build applications. In this project, I used Java to create a simple task manager that runs in the command line.
A real-world example of this would be simple note-taking or to-do list applications.

3.	System Requirements

OS: Windows / Mac / Linux 
Software: Java JDK installed 
Code editor: (VS Code / IntelliJ) 

4.	Installation & Setup

1.	Install Java JDK from the official website
2.	Create a .java file named TaskManager.java
3.	Compile the program: 
javac TaskManager.java
4.	Run the program: 
java TaskManager

5.	Minimal Working Example

Description:
This program allows users to:
•	Add tasks 
•	View tasks 
•	Exit the program 

Initial Base Code:
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

Expected Output:
1. Add Task
2. View Tasks
3. Exit
Choose an option:

6.	AI Prompt Journal

Prompt 1: Making the Base Code

I am a beginner learning Java.
Could you generate a simple command-line task manager program using ArrayList and Scanner?
Requirements:
•	Allow users to add tasks 
•	View tasks 
•	Exit the program 
•	Keep the implementation simple and beginner-friendly 
Please include comments in the code to explain key parts.

Prompt 2: Understanding the Code

I’m a beginner trying to understand a simple Java task manager program.
Here is my current understanding:
•	The program uses an ArrayList called tasks to store tasks. 
•	Choice 1 allows the user to add a task. 
•	Choice 2 displays all tasks. 
•	Choice 3 exits the program. 
•	The program uses a while loop to keep running until the user exits. 
However, I’m confused about a few concepts:
1.	What is the difference between an ArrayList and an array? 
2.	How does Scanner work in Java? 
o	What is the difference between nextInt(), nextLine(), and next()? 
3.	What does scanner.close() actually do? 
4.	Does break exit the entire while loop? 
Please explain these concepts in simple terms with examples.

My understanding before asking AI:
•	I thought ArrayList stores tasks dynamically 
•	I wasn’t sure how it differs from arrays 
•	I thought lists might start at index 1 (incorrect) 
•	I knew Scanner gets input but didn’t understand its methods 

What I learned from AI:
•	ArrayList is dynamic, arrays are fixed size 
•	Both arrays and ArrayLists start indexing at 0 
•	Scanner reads user input from keyboard 
•	nextInt() reads numbers, nextLine() reads full text 
•	break exits the loop completely 

Evaluation:
AI helped clarify misconceptions and improved my understanding of Java fundamentals.

Prompt 3: (understanding Scanner more)

I’m trying to understand how Scanner.nextLine() works after nextInt() in Java.
Here’s my current understanding:
•	nextInt() reads the number the user enters 
•	nextLine() reads a full line of text 
However, I’m confused because when I remove an extra nextLine() from my code, the program skips user input.
For example:
Choose an option: 1
Enter task:
Task added!
It doesn’t allow me to type the task.
Here is the code snippet:
int choice = scanner.nextInt();
String task = scanner.nextLine();
Could you:
1.	Explain why the input is being skipped 
2.	Describe what happens internally when pressing Enter 
3.	Explain why adding an extra nextLine() fixes the issue 
4.	Give a simple step-by-step example of how input is processed 

My understanding before asking AI:
•	I knew nextInt() reads numbers 
•	I knew nextLine() reads text 
•	I didn’t understand why input was being skipped 

What I learned:
•	nextInt() does not consume the newline (Enter) 
•	The leftover newline is immediately read by nextLine() 
•	This causes input to be skipped 
•	Adding an extra nextLine() clears the buffer 

Evaluation:
This helped me understand how Java handles user input internally and why bugs can occur when mixing nextInt() and nextLine().

Testing / Experimentation:
•	I removed scanner.nextLine() to observe behavior 
•	The program skipped input and did not allow entering a task 
•	I re-added it and confirmed the issue was resolved

Prompt 4:
I have built a basic Java CLI to-do list application using ArrayList and Scanner.
It allows users to:
•	Add tasks 
•	View tasks 
•	Exit the program 
I want to slightly improve the program without making it more complex.
Could you suggest:
1.	2–3 small improvements to make the program more user-friendly 
2.	Improvements that are simple enough for a beginner 
3.	Brief explanations of why each improvement is useful 

What AI suggested:
•	Handling empty task lists 
•	Improving output messages 
•	Numbering tasks 

What I implemented:

1. Delete Task Feature — Users can now select option 3 to delete tasks by their number. The program displays the task list and asks which one to delete.
2. Empty Task Validation — When adding a task, it checks if the input is empty (even just spaces) and prevents it from being added.
3. Invalid Input Handling — The menu input is now wrapped in a try-catch block that catches non-numeric entries. If a user types letters, it shows a friendly error message instead of crashing.

Evaluation:
These improvements made the program more user-friendly and easier to understand.

7.	Common Issues & Fixes
Common Issue: Scanner Input Skipping
•	Issue: Input skipped when using nextLine() 
•	Cause: nextInt() does not consume the newline character 
•	Fix: Add an extra scanner.nextLine() after nextInt()

8.	References 
•	Official Java Documentation 
•	Course materials 
•	AI assistance (ChatGPT, Github copilot) 
•	Online forums (e.g., StackOverflow)

