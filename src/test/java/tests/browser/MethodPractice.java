package tests.browser;

public class MethodPractice {

    public static void main(String[] args) {


        MethodPractice.printMessage();
        printMessage("John");
        printMessage("Alex");
        printMessage("Killy");

        String message = "Hello World"; // Remove the space between the words!

        System.out.println(removeSpaces(message));
        System.out.println(removeSpaces("Hello welcome to tekschool"));
        printStringWithRemovedSpaces("Hello Humans!");

        int result = sum(10, 5);
        System.out.println(result);
        System.out.println(sum(20, 10));
        printSum(35, 25);


        charactersInString("I love java!");
        char[] characters = charactersInString(message);
        printArray(characters);


    }

    public static void printMessage() {
        System.out.println("Hello Humans!");
    }

    public static void printMessage(String name) {
        System.out.println("Hello " + name);
    }

    public static String removeSpaces(String str) {
        return str.replaceAll(" ", "");
    }

    public static void printStringWithRemovedSpaces(String str) {
        System.out.println(str.replaceAll(" ", ""));
    }

    // 10 + 5 => 15
    // Should return the result
    // Should print the result of the addition

    public static int sum(int a, int b) {
        return a + b;
    }

    public static void printSum(int a, int b) {
        System.out.println(sum(a, b));
    }

    // String str = "Hello Humans!";
    // Return an array of characters
    // Print each character of the String.
    public static char[] charactersInString(String str) {
        /*       return str.toCharArray();*/
        return removeSpaces(str).toCharArray();
    }


    public static void printArray(String[] arr) {
        for (String String : arr) {
            System.out.println(String);
        }
    }


    public static void printArray(char[] arr) {
        for (char character : arr) {
            System.out.println(character);
        }
    }
}



    //Aseel

//    public static void main(String[] args) {
//
//        int result = sum(12, 12);
//        System.out.println(result);
//
//        stringToCharArrayPrint("Hello World");
//
//
//    }
//
//    public static int sum(int a, int b) {
//        return a + b;
//    }
//
//    public static char[] stringToCharArray(String input) {
//        return input.toCharArray();
//    }
//
//    public static void stringToCharArrayPrint(String input) {
//        char[] arr = input.toCharArray();
//        for (char character : arr) {
//            System.out.print("[ " + character + " ]");
//        }
//    }


    // salma

//        public static void main(String[] args) {
//
//            System.out.println(sum(5, 10));
//            sumOfNumbers(5, 10);
//
//            String str = "Hello Human!";
//            char[] charArray = convertStringToArray(str);
//            for (char Char : charArray) {
//                System.out.print(Char + " ");
//            }
//            printEachCharacter(str);
//        }
//
//        public static int sum(int a, int b) {
//            return a + b;
//        }
//
//        public static void sumOfNumbers(int a, int b) {
//            System.out.println("the sum is " + a + b);
//        }
//
//        public static char[] convertStringToArray(String str) {
//            return str.toCharArray();
//        }
//
//        public static void printEachCharacter(String str) {
//            for (int i = 0; i < str.length(); i++) {
//                System.out.println(str.charAt(i));
//            }
//        }


