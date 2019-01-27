package com.example.interceptor;

import nablarch.fw.ExecutionContext;
import nablarch.fw.Interceptor;
import nablarch.fw.jaxrs.JaxRsContext;
import nablarch.fw.web.HttpRequest;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Interceptor(InterceptorExample.Impl.class)
public @interface InterceptorExample {
    class Impl extends Interceptor.Impl<HttpRequest, Object, InterceptorExample> {

        @Override
        public Object handle(HttpRequest req, ExecutionContext ctx) {
            JaxRsContext jaxRsContext = JaxRsContext.get(ctx);
            Object inputForm = jaxRsContext.getRequest();
            Object ret = getOriginalHandler().handle(req, ctx);
            return ret;
        }
    }
}
