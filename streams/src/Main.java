import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Ninja> ninjas = new ArrayList<>();

        ninjas.add(new Ninja("Naruto Uzumaki", "Konoha", 17));
        ninjas.add(new Ninja("Sasuke Uchiha", "Konoha", 17));
        ninjas.add(new Ninja("Sakura Haruno", "Konoha", 17));
        ninjas.add(new Ninja("Kakashi Hatake", "Konoha", 30));
        ninjas.add(new Ninja("Gaara", "Suna", 18));
        ninjas.add(new Ninja("Temari", "Suna", 19));
        ninjas.add(new Ninja("Kankuro", "Suna", 20));
        ninjas.add(new Ninja("Rock Lee", "Konoha", 17));

        // Filtragem
        /*
        *   ninjas.stream()
        *       .filter(ninja -> ninja.getVila().equalsIgnoreCase("Suna"))
        *       .forEach(System.out::println);
        */

        // Ordenação
        /*
        ninjas.stream()
            .sorted((n1, n2) -> n1.getName().compareTo(n2.getName()))
            .forEach(System.out::println);
        */

        //Map - Mostrar e Mapear um atributo
        ninjas.stream()
                .map(Ninja::getName)
                .forEach(System.out::println);

        // MAX - Filtrar por ninja mais velho
        Ninja ninjaMaisVelho = ninjas.stream()
                .max((n1, n2) -> Integer.compare(n1.getIdade(), n2.getIdade()))
                .orElse(null);
        System.out.println(ninjaMaisVelho);
    }
}