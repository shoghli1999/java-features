/**
 * Java Features Analysis - Course Project
 * Analysis and Design of Languages
 * Student: Shirin Shoghli (ID: 9625512123)
 * Professor: Ezzat Doost
 * University: Islamic Azad University South Tehran Branch
 * Year: 2021
 * 
 * This program demonstrates Java's core features as presented in the course project.
 * Based on the presentation: "Java Features Analysis"
 */
public class SimpleJavaDemo {
    
    public static void main(String[] args) {
        System.out.println("=== Java Features Analysis ===");
        System.out.println("Course: Analysis and Design of Languages");
        System.out.println("Student: Shirin Shoghli (9625512123)");
        System.out.println("Professor: Ezzat Doost");
        System.out.println("University: Islamic Azad University South Tehran Branch");
        System.out.println("Year: 2021\n");
        
        // Demonstrate core Java features from presentation
        demonstrateJavaHistory();
        demonstrateStaticTyping();
        demonstrateOOP();
        demonstrateCollections();
        demonstrateExceptionHandling();
        demonstrateMultithreading();
        demonstrateNetworking();
        demonstrateLanguageComparison();
        demonstrateJavaAdvantages();
        
        System.out.println("\n=== Analysis Complete ===");
        System.out.println("Java: Write Once, Run Anywhere (WORA)");
        System.out.println("One of the top programming languages worldwide (TIOBE Index)");
    }
    
    // Java History and Introduction
    private static void demonstrateJavaHistory() {
        System.out.println("1. JAVA INTRODUCTION:");
        System.out.println("   - Designed by James Gosling at Sun Microsystems");
        System.out.println("   - Released: May 23, 1995");
        System.out.println("   - Top 2 programming language since 2001 (TIOBE Index)");
        System.out.println("   - Improved alternative to C++ (portable, beginner-friendly)");
        System.out.println("   - Simple, object-oriented, network-friendly, interpreted");
        System.out.println("   - Robust, secure, architecture-neutral, portable");
        System.out.println("   - High-performance, multithreaded, dynamic\n");
    }
    
    // Static Typing - Types must be declared
    private static void demonstrateStaticTyping() {
        System.out.println("2. STATIC TYPING:");
        
        // Java requires type declaration
        String language = "Java";
        int releaseYear = 1995;
        double currentVersion = 21.0;
        boolean isTopLanguage = true;
        
        System.out.println("   Language: " + language);
        System.out.println("   Release Year: " + releaseYear);
        System.out.println("   Current Version: " + currentVersion);
        System.out.println("   Top Language: " + isTopLanguage);
        
        // This would cause compilation error:
        // language = 42; // Type mismatch!
        System.out.println("   ✓ Types checked at compile time");
        System.out.println("   ✓ Errors caught before runtime");
        System.out.println("   ✓ Unlike Python/JavaScript (dynamic typing)\n");
    }
    
    // Object-Oriented Programming
    private static void demonstrateOOP() {
        System.out.println("3. OBJECT-ORIENTED PROGRAMMING:");
        
        // Create objects
        Student student = new Student("Shirin Shoghli", "Computer Science", "9625512123");
        Course course = new Course("Analysis and Design of Languages", "Ezzat Doost");
        University university = new University("Islamic Azad University South Tehran Branch");
        
        // Use objects
        System.out.println("   Student: " + student.getName());
        System.out.println("   Student ID: " + student.getStudentId());
        System.out.println("   Course: " + course.getName());
        System.out.println("   Professor: " + course.getProfessor());
        System.out.println("   University: " + university.getName());
        
        // Polymorphism demonstration
        Person person1 = new Student("Ali", "Engineering", "123456");
        Person person2 = new Professor("Dr. Ezzat Doost", "Computer Science");
        
        System.out.println("   " + person1.introduce());
        System.out.println("   " + person2.introduce());
        System.out.println("   ✓ Encapsulation: Private fields with public accessors");
        System.out.println("   ✓ Inheritance: Person → Student/Professor");
        System.out.println("   ✓ Polymorphism: Method overriding\n");
    }
    
    // Collections and Generics
    private static void demonstrateCollections() {
        System.out.println("4. COLLECTIONS & GENERICS:");
        
        // ArrayList with generics
        java.util.List<String> programmingLanguages = new java.util.ArrayList<>();
        programmingLanguages.add("Java");
        programmingLanguages.add("Python");
        programmingLanguages.add("C++");
        programmingLanguages.add("JavaScript");
        programmingLanguages.add("C#");
        
        System.out.println("   Programming Languages: " + programmingLanguages);
        
        // HashMap with rankings
        java.util.Map<String, Integer> languageRankings = new java.util.HashMap<>();
        languageRankings.put("Java", 1);
        languageRankings.put("Python", 2);
        languageRankings.put("C++", 3);
        languageRankings.put("JavaScript", 4);
        languageRankings.put("C#", 5);
        
        System.out.println("   Java Ranking: " + languageRankings.get("Java"));
        System.out.println("   ✓ Type-safe collections");
        System.out.println("   ✓ Generic data structures\n");
    }
    
    // Exception Handling (Robustness)
    private static void demonstrateExceptionHandling() {
        System.out.println("5. EXCEPTION HANDLING (ROBUSTNESS):");
        
        // Array bounds checking
        int[] numbers = {1, 2, 3, 4, 5};
        
        try {
            System.out.println("   Valid access: " + numbers[2]);
            System.out.println("   Invalid access attempt...");
            int invalid = numbers[10]; // This will throw exception
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("   ✓ Caught: " + e.getMessage());
        }
        
        // Type safety demonstration
        try {
            String text = "Hello World";
            System.out.println("   String length: " + text.length());
            // text = 42; // Compilation error - static typing!
            System.out.println("   ✓ No runtime type errors");
            System.out.println("   ✓ Array bounds checking");
            System.out.println("   ✓ No pointers (safer than C++)");
        } catch (Exception e) {
            System.out.println("   Error: " + e.getMessage());
        }
        System.out.println();
    }
    
    // Multithreading
    private static void demonstrateMultithreading() {
        System.out.println("6. MULTITHREADING:");
        
        // Create threads
        Thread thread1 = new Thread(() -> {
            for (int i = 1; i <= 3; i++) {
                System.out.println("   Thread 1: Task " + i);
                try { Thread.sleep(100); } catch (InterruptedException e) {}
            }
        });
        
        Thread thread2 = new Thread(() -> {
            for (int i = 1; i <= 3; i++) {
                System.out.println("   Thread 2: Task " + i);
                try { Thread.sleep(100); } catch (InterruptedException e) {}
            }
        });
        
        // Start threads
        thread1.start();
        thread2.start();
        
        // Wait for completion
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {}
        
        System.out.println("   ✓ Concurrent execution");
        System.out.println("   ✓ GUI + network handling simultaneously");
        System.out.println("   ✓ Built-in thread support\n");
    }
    
    // Network Programming
    private static void demonstrateNetworking() {
        System.out.println("7. NETWORK PROGRAMMING:");
        
        try {
            // URL handling
            java.net.URL url = new java.net.URL("https://www.google.com");
            System.out.println("   Protocol: " + url.getProtocol());
            System.out.println("   Host: " + url.getHost());
            System.out.println("   ✓ Built-in networking support");
            System.out.println("   ✓ TCP/IP, HTTP, FTP protocols");
            System.out.println("   ✓ Easy URL-based access");
            System.out.println("   ✓ Network-friendly language\n");
        } catch (java.net.MalformedURLException e) {
            System.out.println("   Error: " + e.getMessage());
        }
    }
    
    // Language Comparison
    private static void demonstrateLanguageComparison() {
        System.out.println("8. LANGUAGE COMPARISON:");
        
        System.out.println("   Java vs Python:");
        System.out.println("   Java:   String name = \"Java\";     // Static typing");
        System.out.println("   Python: name = \"Python\"          # Dynamic typing");
        
        System.out.println("   Java vs JavaScript:");
        System.out.println("   Java:      String message = \"Hello\";");
        System.out.println("   JavaScript: let message = \"Hello\";");
        System.out.println("   ✓ Different languages, similar syntax");
        System.out.println("   ✓ JavaScript was originally LiveScript");
        
        System.out.println("   Java vs C++:");
        System.out.println("   Java:   String text = \"Hello\";    // Automatic GC");
        System.out.println("   C++:    char* text = new char[6];   // Manual memory");
        System.out.println("   ✓ Java: No pointers, safer");
        System.out.println("   ✓ C++: More control, potential errors\n");
    }
    
    // Java Advantages
    private static void demonstrateJavaAdvantages() {
        System.out.println("9. JAVA ADVANTAGES:");
        System.out.println("   ✓ Platform Independence (WORA)");
        System.out.println("   ✓ Object-Oriented Programming");
        System.out.println("   ✓ High-Level Language");
        System.out.println("   ✓ Enterprise Standard");
        System.out.println("   ✓ Security (no pointers, sandbox)");
        System.out.println("   ✓ Distributed Computing Support");
        System.out.println("   ✓ Automatic Memory Management");
        System.out.println("   ✓ Large Community & Ecosystem");
        System.out.println("   ✓ Career Opportunities");
        System.out.println("   ✓ Used in Android, Enterprise, Big Data\n");
    }
}

// Base class for inheritance
abstract class Person {
    protected String name;
    
    public Person(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public abstract String introduce();
}

// Student class - inheritance
class Student extends Person {
    private String major;
    private String studentId;
    
    public Student(String name, String major, String studentId) {
        super(name);
        this.major = major;
        this.studentId = studentId;
    }
    
    public String getStudentId() {
        return studentId;
    }
    
    @Override
    public String introduce() {
        return "I'm " + name + ", studying " + major + " (ID: " + studentId + ")";
    }
}

// Professor class - inheritance
class Professor extends Person {
    private String department;
    
    public Professor(String name, String department) {
        super(name);
        this.department = department;
    }
    
    @Override
    public String introduce() {
        return "I'm Professor " + name + " from " + department + " department";
    }
}

// Course class - encapsulation
class Course {
    private String name;
    private String professor;
    
    public Course(String name, String professor) {
        this.name = name;
        this.professor = professor;
    }
    
    // Getters (encapsulation)
    public String getName() {
        return name;
    }
    
    public String getProfessor() {
        return professor;
    }
}

// University class
class University {
    private String name;
    
    public University(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
}
