package ru.geekbrains;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.commons.lang3.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Person person = new Person("James", "Bond", 40);
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        gson.toJson(person, Person.class);
        
    }
}
