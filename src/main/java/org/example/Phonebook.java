package org.example;
import java.util.*;

public class Phonebook {
    public static Map<String, ArrayList<String>> phonebook = new HashMap<>();

    public static void add(String name, String phone) {
        String nameKey = name.toLowerCase();
        if (phonebook.containsKey(nameKey)) {
            phonebook.get(nameKey).add(phone);
        } else {
            phonebook.put(nameKey, new ArrayList<String>(Arrays.asList(phone)));
        }
    }

    public static void get(String name) {
        ArrayList<String> entry = phonebook.get(name.toLowerCase());
        if (entry != null) {
            System.out.println("По строке \'" + name + "\' нашлись телефоны: " + entry.toString());
        } else {
            System.out.println("По строке \'" + name + "\' записей нет");
        }
    }
}
