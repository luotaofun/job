//package com.luotao.plugin;
//
//import org.apache.ibatis.executor.statement.StatementHandler;
//import org.apache.ibatis.plugin.*;
//import org.apache.ibatis.session.ResultHandler;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.stereotype.Component;
//
//import java.sql.Statement;
//import java.util.Properties;
//
///**
// * @Classname SqlLogPlugin
// * @Description 记录sql查询耗时
// * @Version 1.0.0
// * @Date 2025/4/11 2:30
// * @Author LuoTao
// */
//@Component
//@Intercepts({
//        @Signature(
//                type = StatementHandler.class,
//                method = "query",
//                args={Statement.class, ResultHandler.class}
//        )
//})
//public class SqlLogPlugin implements Interceptor {
//    public static final Logger log = LoggerFactory.getLogger(SqlLogPlugin.class);
//    @Override
//    public Object intercept(Invocation invocation) throws Throwable {
//        long b = System.currentTimeMillis();
//        String sql = ((StatementHandler) invocation.getTarget()).getBoundSql().getSql();
//        Object obj = invocation.proceed();
//        log.info(sql + " cost " + (System.currentTimeMillis()-b) + "ms");
//        System.out.println(sql + " cost " + (System.currentTimeMillis()-b) + "ms");
//        return obj;
//    }
//
//    @Override
//    public Object plugin(Object target) {
//        return Plugin.wrap(target,this);
//    }
//
//    @Override
//    public void setProperties(Properties properties) {
//        Interceptor.super.setProperties(properties);
//    }
//}
