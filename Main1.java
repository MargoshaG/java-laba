package lab5_Margo;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1 {

    // создаем список объектов
    private static List<String> objects = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Добро пожаловать в программу для работы со списком объектов!");

// бесконечный цикл для работы с программой
        while (true) {
            System.out.println("Выберите действие, которое хотите выполнить:");
            System.out.println("1. Добавить объект в список");
            System.out.println("2. Удалить объект из списка");
            System.out.println("3. Показать список объектов");
            System.out.println("4. Выйти из программы");

// считываем выбор пользователя
            int choice = scanner.nextInt();

// в зависимости от выбора пользователя выполняем соответствующие действия
            switch (choice) {
                case 1:
                    addObject(scanner);
                    break;
                case 2:
                    removeObject(scanner);
                    break;
                case 3:
                    showObjects();
                    break;
                case 4:
                    System.out.println("Работа программы завершена.");
                    scanner.close();
                    System.exit(0); // выходим из программы
                default:
                    System.out.println("Некорректный выбор. Попробуйте еще раз.");
                    break;
            }
        }
    }

    // метод для добавления объекта в список
    private static void addObject(Scanner scanner) {
        System.out.print("Введите название объекта: ");
        String object = scanner.next();
        objects.add(object);
        showObjects();
    }

    // метод для удаления объекта из списка
    private static void removeObject(Scanner scanner) {
        System.out.println("Введите номер объекта, который хотите удалить:");
        showObjects();
        int index = scanner.nextInt();
        if (index >= 1 && index <= objects.size()) {
            objects.remove(index - 1);
            showObjects();
        } else {
            System.out.println("Некорректный номер объекта. Попробуйте еще раз.");
        }
    }

    // метод для вывода списка объектов на экран
    private static void showObjects() {
        if (objects.isEmpty()) {
            System.out.println("Список объектов пуст.");
        } else {
            System.out.println("Список объектов:");
            for (int i = 0; i < objects.size(); i++) {
                System.out.println((i+1) + ". " + objects.get(i));
            }
        }
    }
}