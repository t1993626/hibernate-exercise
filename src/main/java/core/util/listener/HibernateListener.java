package core.util.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import static core.util.HibernateUtil.*;

@WebListener
public class HibernateListener implements ServletContextListener {
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		getSessionFactory();
		System.out.println("init");
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		shutdown();
		System.out.println("shutdown");
	}
}
