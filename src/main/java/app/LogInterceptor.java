/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

/**
 *
 * @author vasil
 */
@Interceptor
@ConsoleLog
public class LogInterceptor {

    @AroundInvoke
    public Object log(InvocationContext ic) throws Exception {
        System.out.println("Invocation method: " + ic.getMethod().getName());
        return ic.proceed();
    }
}
