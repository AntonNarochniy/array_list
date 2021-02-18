package kg.megacom;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ArrayList< String> books = new ArrayList<>(Arrays.asList("Курочка ряба", "Каштанка", "Колобок", "Буратино", "Мойдодыр"));
        System.out.println(books.toString());
        String temp = books.get(books.size()-1);
        books.remove(books.size()-1);
        System.out.println(books.toString());
        books.set(books.size()-1, temp);
        System.out.println(books.get(books.size() - 1));
        books.clear();
        books.addAll(Arrays.asList("Java. Библиотека профессионала – Кей С. Хорстманн", "Head First", "Паттерны проектирования – Эрик Фримен, Элизабет Робсон", "Spring в действии – Крейг Уоллс" ));
    }
}
