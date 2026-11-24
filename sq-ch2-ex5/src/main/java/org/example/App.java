package org.example;

import org.example.beans.Parrot;
import org.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;


public class App 
{
    public static void main( String[] args )
    {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
//        Parrot p = context.getBean(Parrot.class);
//        System.out.println( p );
//        System.out.println( p.getName() );
//
//        System.out.println( "Hello World!" );
        Parrot x = new Parrot();
        x.setName("Andrew");
        Supplier<Parrot> parrotSupplier = () -> x;
        context.registerBean("parrot", Parrot.class, parrotSupplier);

        Parrot p = context.getBean(Parrot.class);
        System.out.println(p.getName());


    }
}
