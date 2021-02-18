package kg.megacom;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ArrayList< String> books = new ArrayList<>(Arrays.asList("Курочка ряба", "Каштанка", "Колобок", "Буратино", "Мойдодыр")); //  добавить 5 книг
        System.out.println(books.toString());  // распечатать
        String temp = books.get(books.size()-1); //сохранить последнюю книгу
        books.remove(books.size()-1); //удалить последнюю книгу
        System.out.println(books.toString());  //распечатать
        books.set(books.size()-1, temp); //заменить последнюю книгу удаленной
        System.out.println(books.get(books.size() - 1)); //распечатать только последнюю книгу
        books.clear(); //очистить список
        books.addAll(Arrays.asList("Java. Библиотека профессионала – Кей С. Хорстманн", "Head First",
                "Паттерны проектирования – Эрик Фримен, Элизабет Робсон",
                "Spring в действии – Крейг Уоллс" )); //добавить 3 книги которые вы планируете почитать
    }
}
