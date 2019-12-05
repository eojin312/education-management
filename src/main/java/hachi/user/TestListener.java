package hachi.user;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class TestListener implements ServletContextListener {

    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("톰캣이 시작됐다");
    }

    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("톰캣이 방금 죽었다");
    }
}
