import java.util.*;

//1 Calculator
class Calculator {
    public static void main(String[] args) {
        int a = 10, b = 20;
        int result = add(a, b);
        System.out.println("The result is: " + result);
    }

    public static int add(int x, int y) {
        return x + y;
    }
}

//2 Employee Class
class Employee {
    private String name;
    private double salary;

    public void setInfo(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setInfo("John", 50000.0);
        emp.display();
    }
}

//3 Calculate Area
class Circle {
    public static double calculateArea(double radius) {
        final double PI = 3.141592653589793;
        return PI * radius * radius;
    }

    public static void main(String[] args) {
        double radius = 5;
        double result = calculateArea(radius);
        System.out.println("The area is: " + result);
    }
}

//4 Addition Method
class CalculateSum {
    static void add(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    public static void main(String[] args) {
        add(3, 4);
    }
}

//5 Array Example
class ArrayExample {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        for (int num : arr) {
            System.out.println(num);
        }
    }
}

//6 Multiply Function
class Multiply {
    public static int multiply(int x, int y) {
        return x * y;
    }

    public static void main(String[] args) {
        int result = multiply(3, 5);
        System.out.println("Product: " + result);
    }
}

//7 If-else Condition
class CompareNumbers {
    public static void main(String[] args) {
        int a = 5, b = 7;
        System.out.println(a < b ? "a is less than b" : "b is less than or equal to a");
    }
}

//8 Calculator Operations
class CalculatorOperations {
    public int add(int x, int y) {
        return x + y;
    }

    public int subtract(int x, int y) {
        return x - y;
    }

    public static void main(String[] args) {
        CalculatorOperations calc = new CalculatorOperations();
        int result = calc.add(10, 5) + calc.subtract(20, 8);
        System.out.println("Result: " + result);
    }
}

//9 Sum of Array Elements
class SumArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = Arrays.stream(numbers).sum();
        System.out.println("The sum is: " + sum);
    }
}

//10 Point Class
class Point {
    private int x, y;

    public Point(int a, int b) {
        x = a;
        y = b;
    }

    public void display() {
        System.out.println("x = " + x + ", y = " + y);
    }

    public static void main(String[] args) {
        Point pt = new Point(10, 20);
        pt.display();
    }
}

//11 Rectangle & Calculation
class Rectangle {
    private int length, width;

    public Rectangle(int l, int w) {
        length = l;
        width = w;
    }

    public int calculateArea() {
        return length * width;
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5, 8);
        System.out.println("Area: " + rect.calculateArea());
    }
}

//12 Greeting Function
class Greet {
    public static void greet(String name) {
        System.out.println("Hello, " + (name == null ? "there" : name) + "!");
    }

    public static void main(String[] args) {
        greet("Alice");
        greet(null);
    }
}

//13 Temperature Converter
class TemperatureConverter {
    public double fToC(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public double cToF(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter();
        double fTemp = converter.fToC(25);
        double cTemp = converter.cToF(98.6);
        System.out.println("25 Celsius is " + fTemp + " Fahrenheit");
        System.out.println("98.6 Fahrenheit is " + cTemp + " Celsius");
    }
}

//14 Fencing Cost Calculation
class FencingCostCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select the type of field for fencing cost calculation:");
        System.out.println("1. Square (Rs. 10/meter)");
        System.out.println("2. Rectangle (Rs. 12/meter)");
        System.out.println("3. Circle (Rs. 13/meter)");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter side length: ");
                int side = scanner.nextInt();
                System.out.println("Total Cost: Rs. " + (4 * side * 10));
                break;
            case 2:
                System.out.print("Enter length: ");
                int length = scanner.nextInt();
                System.out.print("Enter breadth: ");
                int breadth = scanner.nextInt();
                System.out.println("Total Cost: Rs. " + (2 * (length + breadth) * 12));
                break;
            case 3:
                System.out.print("Enter radius: ");
                int radius = scanner.nextInt();
                System.out.println("Total Cost: Rs. " + (2 * Math.PI * radius * 13));
                break;
            default:
                System.out.println("Invalid input.");
        }

        scanner.close();
    }
}
