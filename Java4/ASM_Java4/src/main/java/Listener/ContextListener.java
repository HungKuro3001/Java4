package Listener;

import java.io.File;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.log4j.PropertyConfigurator;

public class ContextListener  implements ServletContextListener{
	public ContextListener() {
        // TODO Auto-generated constructor stub
    }
    @Override
    public void contextInitialized(ServletContextEvent sce) {
    	ServletContext context = sce.getServletContext();
    	String log4jconfigFile = context.getInitParameter("log4j-config-location");
    	String fullpath = context.getRealPath("/") + File.separator + log4jconfigFile;
    	PropertyConfigurator.configure(fullpath);
    }
}
