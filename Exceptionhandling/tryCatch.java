package Exceptionhandling;

// exception handling is used to resolve the program continue it's execution even after error in runtime
// two types of error :- Compile time error and Runtime error
// Compile time error :- Syntax error
// Runtime error :- error at runtime of program
// Checked exception :- error at compile time and handeled by javac compiler
// Unchecked exception :- error at run time
// Exception is happen at run-time
// the default handler for exception called in main after all methods remove from stack and only main method
// is remaning in stack
// throws keyword is used in method signature
// throw keyword is use to no execution after this line

//throw e - I am NOT fully handling it and it is used for rethrow an exception


public class tryCatch {
    public static void main(String[] args) throws ArithmeticException // it is not for handling it is for alerting the developer that this method can throw arithmetic run-time error
    {
        int a = 10;
        int b = 0;

        int arr[] = new int[5];
        try {
            arr[10] = 10;
            int temp = a/b; 
            System.out.println(arr[10]);
            System.out.println(temp);

            // throw new Exception("Error occured");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            // throw e; // Code after throw e never runs
        } catch (NegativeArraySizeException e) {
            System.out.println("Enter positive size of array");
        } catch (NullPointerException e) {
            System.out.println("Null pointer exception");
        } catch (Exception e) {
            System.out.println("Error occured");
        }
        finally {     // always execute
            System.out.println("Finally is executed");
        }

        int age = 15;
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or above");
        }
    
    }
}
 