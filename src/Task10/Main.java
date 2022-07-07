package Task10;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("s1");
        set1.add("s2");

        Set<String> set2 = new HashSet<>();
        set2.add("s3");
        set2.add("s4");

        Set<String> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println(union);

        Set<String> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println(intersection);

        Map<String, String> personMap = new HashMap<>();
        personMap.put("Artem", "Kravchuk");
        personMap.put("Yana", "Majstrenko");
        personMap.put("Roman", "Vovk");
        personMap.put("Ihor", "Mytroshenko");
        personMap.put("Olha", "Lukjanko");
        personMap.put("Nadija", "Sydorenko");
        personMap.put("Oleksandr", "Rohovenko");
        personMap.put("Serhij", "Yaremchuk");
        personMap.put("Andrij", "Kusiak");
        personMap.put("Svitlana", "Pecheniuk");

        System.out.println(personMap);

        personMap.remove("Serhij");

        System.out.println(personMap);
    }
}

