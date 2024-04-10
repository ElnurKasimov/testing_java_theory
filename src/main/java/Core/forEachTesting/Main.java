package Core.forEachTesting;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Main {



    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("first", 20));
        personList.add(new Person("second", 25));
        personList.add(new Person("third", 30));
        System.out.println(personList.toString());
        for (Person person : personList) {
            if(person.getAge() == 25) {
                person.setName("SECOND");
            }
        }
        System.out.println(personList.toString());
        printClassAnnotations(Person.class);

    }

    public static void printClassAnnotations(Class<?> classObject) {
        for (Annotation annotation : classObject.getAnnotations()) {
            String longName = annotation.annotationType().getName();
            int lastDotIndex = longName.lastIndexOf('.');
            //int openingBracketIndex = annotation.toString().indexOf('(', lastDotIndex);
            System.out.println(longName.substring(lastDotIndex + 1));
        }
    }

}
