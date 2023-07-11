package SoftServe.Sprint4.Theory;

import javax.swing.*;
import java.lang.annotation.Annotation;

@MyAnnotation(name="THe first Annotation")
class ClassWhichIsTested {

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
    }
}
