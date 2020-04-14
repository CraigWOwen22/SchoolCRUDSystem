import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBManager {
    /**
     * Connect to Database
     * @author Craig Owen
     */

        public static final String URL = "jdbc:mysql://localhost:3306/testdb";
        public static final String USER = "testuser";
        public static final String PASS = "testpass";
        /**
         * Get a connection to database
         * @return Connection object
         */
        public static Connection getConnection()
        {
            try {
//            DriverManager.registerDriver(new Driver());
                return DriverManager.getConnection(URL, USER, PASS);
            } catch (SQLException ex) {
                throw new RuntimeException("Error connecting to the database", ex);
            }
        }

    }

