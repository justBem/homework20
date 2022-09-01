import java.io.IOException;
import java.io.UncheckedIOException;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        try  {
            car.drive();

        } catch (UncheckedIOException e) {
            System.out.println(e);
        }
    }
}