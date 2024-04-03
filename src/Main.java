
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные о враче:");
        System.out.print("Имя: ");
        String name = scanner.nextLine();
        System.out.print("Возраст: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.print("Специализация: ");
        String specialization = scanner.nextLine();
        System.out.print("Больница: ");
        String hospital = scanner.nextLine();
        System.out.print("Зарплата: ");
        double salary = Double.parseDouble(scanner.nextLine());
        Doctor doctor = new Doctor(name, age, specialization, hospital, salary);
        Thread serializationThread = new Thread(() -> {
            try {
                FileOutputStream fileOut = new FileOutputStream("M:\\doctor.txt");
                ObjectOutputStream out = new ObjectOutputStream(fileOut);
                out.writeObject(doctor);
                out.close();
                fileOut.close();
                System.out.println("Объект сохранен в файле: M:\\doctor.txt");
            } catch (IOException var3) {
                var3.printStackTrace();
            }

        });
        serializationThread.start();
    }
}
