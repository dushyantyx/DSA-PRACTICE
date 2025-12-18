import java.util.Scanner;


// 1. SQUARE PATTERN
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
} 

// 2. RIGHT ANGLE TRIANGLE

 public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
} 

// 3. Right-Angled Number Pyramid
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        sc.close();
    }
}

// 4. Right-Angled Number Pyramid - II
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   // number of rows

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}

// 5. Inverted Right Pyramid
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        sc.close();
    }
}

//6.  Inverted Numbered Right Pyramid 
class Solution {
    // Function to print Pattern 6
    public void pattern6(int N) {
        // Outer loop for rows
        for (int i = 0; i < N; i++) {
            // Inner loop for columns
            // Prints numbers from 1 up to (N - i)
            for (int j = N; j > i; j--) {
                System.out.print((N - j + 1) + " ");
            }
            // Move to next line
            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Create object of Solution class
        Solution sol = new Solution();

        // Define size of pattern
        int N = 5;

        // Call pattern function
        sol.pattern6(N);
    }
}

// 7. Star pyramid

class Solution {
    // Function to print Pattern 7
    public void pattern7(int N) {
        // Outer loop for rows
        for (int i = 0; i < N; i++) {

            // Print leading spaces
            for (int j = 0; j < N - i - 1; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            // Print trailing spaces
            for (int j = 0; j < N - i - 1; j++) {
                System.out.print(" ");
            }

            // Move to next row
            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int N = 5;
        sol.pattern7(N);
    }
}

// 8. Inverted Star Pyramid

class Solution {
    // Function to print Pattern 8
    public void pattern8(int N) {
        // Outer loop for rows
        for (int i = 0; i < N; i++) {

            // Print leading spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 0; j < 2 * N - (2 * i + 1); j++) {
                System.out.print("*");
            }

            // Print trailing spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // Move to next row
            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int N = 5;
        sol.pattern8(N);
    }
}

// 9. Diamond
class Solution {
    // Function to print the erect (upright) pyramid
    public void erectPyramid(int N) {
        for (int i = 0; i < N; i++) {
            // Print spaces before stars
            for (int j = 0; j < N - i - 1; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            // Print spaces after stars
            for (int j = 0; j < N - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    // Function to print the inverted pyramid
    public void invertedPyramid(int N) {
        for (int i = 0; i < N; i++) {
            // Print spaces before stars
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 0; j < 2 * N - (2 * i + 1); j++) {
                System.out.print("*");
            }
            // Print spaces after stars
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        int N = 5;
        Solution obj = new Solution();
        obj.erectPyramid(N);
        obj.invertedPyramid(N);
    }
}


//---------------------------------- WILL ADD MORE IN FUTURE RN AM FED UP WITH PATTERNS------------------------------------------------
