package university.configuration;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import university.model.Additional_Information;
import university.model.Student;

public class DbConfig {
	public SessionFactory getSessionFactory() {
		
		Configuration config = new Configuration();
		Properties properties = new Properties();
		SessionFactory factory = null;
		try {
		properties.put(Environment.DRIVER , "com.mysql.cj.jdbc.Driver" );
		properties.put(Environment.URL, "jdbc:mysql://localhost:3306/university_college");
		properties.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
		properties.put(Environment.USER, "root");
		properties.put(Environment.PASS, "divya");
		properties.put(Environment.SHOW_SQL, true);
		properties.put(Environment.HBM2DDL_AUTO, "update");
		config.setProperties(properties).addAnnotatedClass(Student.class).addAnnotatedClass(Additional_Information.class);
		ServiceRegistry registry = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
		factory = config.buildSessionFactory(registry);
		return factory;
		}
		catch(Exception e) {
			System.out.println(e.getMessage() + "Connection failed");
			
		}
		return factory;
	}
}
