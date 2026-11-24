package org.example;

import org.example.beans.Parrot;
import org.example.beans.Person;
import org.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Person personBean = context.getBean(Person.class);
        Parrot parrotBean = context.getBean(Parrot.class);
        System.out.println("Person's name " + personBean.getName());
        System.out.println("Parrot's name " + parrotBean.getParrotName());
        System.out.println("Person's parrot " + personBean.getParrot());
    }
}
