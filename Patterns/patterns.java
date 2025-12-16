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

// 7.  


