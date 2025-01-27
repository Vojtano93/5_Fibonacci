public class FibonaccihoPosloupnost {

    public static void main(String[] args) {
        System.out.println("Fibonacciho posloupnost");

        // Hodnota vstupu
        int n = 10;

        // Zobrazení výsledku Fibonacciho čísla
        System.out.println("Fibonacciho číslo je: " + fibonacci(n));
    }

    // Rekurzivní metoda pro výpočet Fibonacciho čísla
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        // Rekurzivní výpočet: F(n) = F(n-1) + F(n-2)
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}