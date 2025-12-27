package org.example;

import org.springframework.aop.framework.ProxyFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        ProxyFactory pf = new ProxyFactory();
        pf.addAdvice(new LoggingAspect());
        pf.setTarget(new Math());
        Math math = (Math) pf.getProxy();
        System.out.println("sum : " + math.add(4,20));

        
    }
}
