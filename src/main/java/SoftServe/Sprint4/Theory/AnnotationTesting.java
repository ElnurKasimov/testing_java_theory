package SoftServe.Sprint4.Theory;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

@MyAnnotation(name="The first Annotation")
class ClassWhichIsTested {
    @MyAnnotation(name = "The third annotation", value = "From Field")
    private String any = "";

    @MyAnnotation(name="The second annotation", value = "From Method")
    public void someMethod() {

    }

}
public class AnnotationTesting {
    public static void main(String[] args) {
        Class<?> aClass = ClassWhichIsTested.class;
        Annotation[] annotations = aClass.getAnnotations();
        for (Annotation annotation : annotations) {
            if (annotation instanceof MyAnnotation) {
                System.out.println("annotation.annotationType() = " + annotation.annotationType());
                System.out.println("((MyAnnotation) annotation).name() = " +  ((MyAnnotation) annotation).name());
                System.out.println("((MyAnnotation) annotation).value() = " + ((MyAnnotation) annotation).value());
            }
        }
        try {
            Method method = aClass.getMethod("someMethod");
            MyAnnotation annotation1 = method.getAnnotation(MyAnnotation.class);
            System.out.println("name1: " + annotation1.name());
            System.out.println("value1: " + annotation1.value());

            Field field = aClass.getField("any");
           field.setAccessible(true);
            MyAnnotation annotation2 = method.getAnnotation(MyAnnotation.class);
            System.out.println("name2: " + annotation2.name());
            System.out.println("value2: " + annotation2.value());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        catch(NoSuchFieldException e) {
        e.printStackTrace();
    }
    }
}
