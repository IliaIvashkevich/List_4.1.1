import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        while (true) {
            System.out.println("Выберите действие:\n" +
                    "1. Добавить задачу\n" +
                    "2. Вывести список задач\n" +
                    "3. Удалить задачу\n" +
                    "0. Выход");
            String input = scanner.next();
            int operation = Integer.parseInt(input);
            if (operation == 0) {
                break;
            }
            switch (operation) {
                case 1:
                    System.out.println("Введите задачу для планирования:");
                    String task = scanner.next();
                    list.add(task);
                    break;
                case 2:
                    Iterator<String> iterator = list.iterator();
                    if (!iterator.hasNext()) {
                        System.out.println("Никаких задач не запланированно");
                        break;
                    }
                    System.out.println("Список задач:");
                    int number = 1;

                    while (iterator.hasNext()) {
                        String s = iterator.next();
                        System.out.println(number + ". " + s);
                        number++;
                    }
                    break;
                case 3:
                    Iterator<String> iterator2 = list.iterator();
                    if (!iterator2.hasNext()) {
                        System.out.println("Никаких задач не запланированно");
                        break;
                    }
                    System.out.println("Укажите номер задачи которую хотите удалить:");
                    int number2 = 1;
                    while (iterator2.hasNext()) {
                        String s = iterator2.next();
                        System.out.println(number2 + ". " + s);
                        number2++;
                    }
                    String taskToRemove = scanner.next();
                    int inputNumberToRemove = Integer.parseInt(taskToRemove);
                    int numberToRemove = inputNumberToRemove - 1;
                    list.remove(numberToRemove);
                    break;
            }
        }
    }
}
