package pr2;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Human> people = List.of(
                new Human(30, "Kir", "Ga", LocalDate.of(1990, 5, 15), 80),
                new Human(25, "Ksu", "Li", LocalDate.of(1995, 8, 20), 55),
                new Human(35, "Gen", "Ru", LocalDate.of(1985, 3, 10), 75),
                new Human(40, "Van", "Ivanov", LocalDate.of(1980, 9, 25), 65),
                new Human(45, "Pen", "Ci", LocalDate.of(1975, 6, 5), 70)
        );

        // Вывод списка людей
        System.out.println("Список людей:");
        people.forEach(System.out::println);

        // Сортировка по весу в обратном порядке
        List<Human> sortedByWeightDesc = people.stream()
                .sorted((p1, p2) -> Integer.compare(p2.getWeight(), p1.getWeight()))
                .collect(Collectors.toList());
        System.out.println("\nСортировка по весу в обратном порядке:");
        sortedByWeightDesc.forEach(System.out::println);

        // Фильтрация по фамилии не Иванов
        List<Human> filteredByLastName = people.stream()
                .filter(p -> !p.getLastName().equals("Ivanov"))
                .collect(Collectors.toList());
        System.out.println("\nФильтрация по фамилии не Иванов:");
        filteredByLastName.forEach(System.out::println);

        // Сортировка по возрасту
        List<Human> sortedByAge = people.stream()
                .sorted((p1, p2) -> Integer.compare(p1.getAge(), p2.getAge()))
                .collect(Collectors.toList());
        System.out.println("\nСортировка по возрасту:");
        sortedByAge.forEach(System.out::println);

        // Вычисление произведения всех возрастов
        int productOfAges = people.stream()
                .mapToInt(Human::getAge)
                .reduce(1, (a, b) -> a * b);
        System.out.println("\nПроизведение всех возрастов: " + productOfAges);
    }
}
