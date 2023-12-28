package ru.geekbrains;

import com.google.gson.Gson;

import java.util.List;

public class PersonList {
    public static final String FILE_JSON = "persons.json";
    private static final Gson gson = new Gson();

    public void saveToFile(String filename, List<Person> persons){
        if(filename.endsWith(".json")){
            gson.toJson(persons, Person.class);
        }
    }
}
