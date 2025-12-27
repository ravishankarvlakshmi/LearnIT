package org.example;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LoggingAspect implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        Object args[] = invocation.getArguments();
        String methodName = invocation.getMethod().getName();

        System.out.println("entering into method name : " + methodName +
                "(" + args[0] + "," + args[1] + ")");

        args[0] = (Integer) args[0] + 10;
        args[1] = (Integer) args[1] + 10;
        Object ret = invocation.proceed();

        System.out.println("exiting the method : " + methodName + "("
        + args[0] + "," + args[1] + ") return value :" + ret );

        ret = (Integer) ret + 10;
        return ret;
    }

}
