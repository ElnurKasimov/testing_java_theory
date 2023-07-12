package SoftServe.Classes.Sprint4.Test7;

import java.lang.annotation.*;
import java.lang.reflect.*;

class ClassForAnnot {
    @CamelCase
    public static void example() {
    }

    @CamelCase
    public void Example() {
    }

    public static void _main(String args[]) {
    }
}

class Class1 {
    @CamelCase
    public void correct() {
    }

    @CamelCase
    public void InCorrect() {
    }

    @CamelCase
    public void JustMethod() {
    }
}

class Class2 {
    @CamelCase
    public void correct() {
    }

    @CamelCase
    public void oneMoreCorrect() {
    }
}

public class CheckCamelCase {
    public  static final String CAMELCASE_PATTERN = "^[a-z]+(?:[A-Z][a-zA-Z0-9]*)*$";
    private static final String  ERROR_MESSAGE_TEMPLATE = "method %s.%s doesn't satisfy camelCase naming convention";

    public static boolean checkAndPrint(Class clazz) {
        boolean result = true;
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            Annotation annotation = method.getAnnotation(CamelCase.class);
            if ( annotation != null) {
                System.out.println("Annotation : " +  annotation.getClass().getName());
                if(!method.getName().matches(CAMELCASE_PATTERN) ) {
                    result = false;
                    System.out.printf(ERROR_MESSAGE_TEMPLATE, clazz.getName(), method.getName());
                    System.out.println();
                }
            }

        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("------------- Result for class ClassForAnnot---------------------------------");
        System.out.println("Result :" +CheckCamelCase.checkAndPrint(ClassForAnnot.class));
        System.out.println("------------- Result for class Class1---------------------------------");
        System.out.println("Result :" +CheckCamelCase.checkAndPrint(Class1.class));
        System.out.println("------------- Result for class Class2---------------------------------");
        System.out.println("Result :" +CheckCamelCase.checkAndPrint(Class2.class));
    }
}
