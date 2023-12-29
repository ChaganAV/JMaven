package ru.geekbrains;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.*;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        List<Person> persons = new ArrayList<Person>();
        persons.add(new Person("James", "Bond", 40));
        persons.add(new Person("Marry", "Bona", 34));
        Person person = new Person("James", "Bond", 40);
        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting();
        Gson gson = builder.create();
        Type listType = new TypeToken<List<Person>>(){}.getType();
        String personJson = gson.toJson(persons, listType);
        System.out.println(personJson);
        persons = gson.fromJson(personJson,listType);
        for (Person pers: persons) {
            System.out.println(pers);
        }
        // toString, equals, hashCode
        System.out.println("=== StringUtils.equals ===");
        Person personsFirst = persons.get(0);
        Person personLast = persons.get(1);
        if(StringUtils.equals(personsFirst.getFirstName(),personLast.getFirstName())){
            System.out.println(String.format("%s = %s",personsFirst,personLast));
        }else {
            System.out.println(String.format("%s != %s",personsFirst,personLast));
        }
        System.out.println("=== ArrayUtils.toString ===");
        System.out.println(ArrayUtils.toString(persons));
        System.out.println("=== ArrayUtils.hashCode ===");
        System.out.println(ArrayUtils.hashCode(persons));
    }
}
