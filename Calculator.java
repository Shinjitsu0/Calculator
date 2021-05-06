import java.util.function.*;



public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;

    Predicate<Integer> isPositive = x -> x > 0;

    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    BinaryOperator<Integer> devide = (x, y) -> y == 0 ? 0 : (x / y);
    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    Consumer<Integer> println = System.out::println;

    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(2, 1);
        int b = calc.minus.apply(4,1);
        int c = calc.devide.apply(a, b);
        calc.println.accept(c);
    }
}
