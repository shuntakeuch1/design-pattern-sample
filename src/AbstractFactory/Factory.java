package AbstractFactory;

import java.sql.Connection;

import javax.security.auth.login.Configuration;

public interface Factory {
	Connection getConnection();
	Configuration getConfiguration();

}
