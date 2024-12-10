import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.IntStream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    static class Foo {
         static short krat;

        public static String returStr(int number) {
            krat = 0;
            if (number % 3 == 0) {
                krat++;
            }
            if (number % 5 == 0) {
                Foo.krat += 2;
            }

            return switch (Foo.krat) {
                case 1 -> "Foo";
                case 2 -> "Bar";
                case 3 -> "FooBar";
                default -> String.valueOf(number);
            };

        }


        public static void main(String[] args) {
            System.out.println("Введите число больше нуля");
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt() + 1;
            IntStream.range(1, number).mapToObj((x) -> String.valueOf(Foo.returStr(x))).forEach(System.out::println);


        }
    }
}