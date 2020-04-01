package core.basesyntax;

/**
 * <p>Реализуйте метод sqrt(), вычисляющий квадратный корень числа. В отличие от Math.sqrt(),
 * это метод при передаче отрицательного параметра должен бросать исключение
 * java.lang.IllegalArgumentException с сообщением "Expected non-negative number, got ?",
 * где вместо вопросика будет подставлено фактически переданное в метод число.</p>
 */
public class SqrtOperation {
    public static void main(String[] args) {
        System.out.println(sqrt(-2));
    }

    public static double sqrt(double number) {
        if (number < 0) {
            throw new IllegalArgumentException(String
                    .format("Expected non-negative number, got %.2f", number));
        }
        return Math.sqrt(number);
    }
}
