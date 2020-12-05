package code._4_student_effort.hard.drinking;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.time.Duration;
import java.time.Instant;

public class PersonInvocationHandler implements java.lang.reflect.InvocationHandler {
    private final IPerson person;

    public PersonInvocationHandler(IPerson person) {
        this.person = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Instant start = Instant.now();
        Object result = method.invoke(person, args);
        Instant end = Instant.now();
        for (Annotation annotation : method.getAnnotations())
            if (annotation instanceof LogExecutionTime) {
                Duration duration = Duration.between(start, end);
                System.out.println(person.getName() + " has been " + method.getName() + "ing for " + duration);
            }
        return result;
    }
}
