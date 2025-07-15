package com.service; // Defines the package for this class

import com.service.bean.MyConnection;
import com.service.bean.SpringBean; // Imports the SpringBean class
import com.service.bean.TestBean1;
import com.service.bean.TestBean2;
import com.service.congig.AppConfig; // Imports the AppConfig class
import org.springframework.context.ApplicationContext; // Imports the ApplicationContext interface
import org.springframework.context.annotation.AnnotationConfigApplicationContext; // Imports the AnnotationConfigApplicationContext class

public class AppInitializer { // Declares a public class named AppInitializer

    public static void main(String[] args) { // The main method, entry point of the application
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(); // Creates a new Spring context
        context.register(AppConfig.class); // Registers the AppConfig class with the context
        context.refresh(); // Refreshes the context, initializing all beans

        SpringBean springBean = context.getBean(SpringBean.class);
        System.out.println(springBean);
        SpringBean springBean1 = (SpringBean) context.getBean("springBean");
        System.out.println(springBean1);

//        Runtime.getRuntime().addShutdownHook(new Thread() {
//            public void run() {
//                context.close();
//            }
//        });

        context.registerShutdownHook();
        TestBean2 testBean2 = (TestBean2) context.getBean("shasidu");

        System.out.println(testBean2);

//        MyConnection myConnection = context.getBean(MyConnection.class);
//        System.out.println(myConnection);
//
////        MyConnection myConnection2 = (MyConnection) context.getBean("malshan");
//
//
//        MyConnection myConnection2 = (MyConnection) context.getBean(MyConnection.class);
//        System.out.println(myConnection2);

        MyConnection myConnection = (MyConnection) context.getBean("prototype");
        System.out.println(myConnection);

//        MyConnection myConnection2 = (MyConnection) context.getBean("malshan");


        MyConnection myConnection2 = (MyConnection) context.getBean("prototype");
        System.out.println(myConnection2);



    }
}
