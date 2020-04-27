import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Shildt {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int age = Integer.parseInt(reader.readLine());

        if (age <= 18) {
            System.out.println("Ваш возраст меньше 18 лет");
        }
        int i, b, c = 0;
        for (i = 0; i < 10; i++) {
            for (b = 0; b < 10; b++) {
                c = i * b;
                System.out.print(i + " x " + b + " = " + c);
            }
        }


    }
}
