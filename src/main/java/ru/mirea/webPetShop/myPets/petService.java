package ru.mirea.webPetShop.myPets;

import org.springframework.stereotype.Service;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

@Service
public class petService {

    private final String dbURL = "jdbc:sqlserver://localhost\\sqlexpress";
    private final String user = "sa";
    private final String pass = "secret";
    private Connection conn;

    public petService() throws SQLException {
        DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
        conn = null;
        initializationDB();
    }

    List<Pet> pets() {
        List<Pet> pets = new LinkedList<Pet>();
        pets.add(new Pet(0, 5, "cat"));
        pets.add(new Pet(1, 10, "dog"));
        return pets;
    }

    private void connect() {

        if(conn != null) {
            try {
                if (conn.isClosed())
                    conn = null;
            }
            catch (SQLException ex) {
                conn = null;
                ex.printStackTrace();
            }
        }

        while (conn == null) try {
            conn = DriverManager.getConnection(dbURL, user, pass);

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (conn != null && !conn.isClosed()) {
                    conn.close();
                    conn = null;
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    private void initializationDB() {
        connect();
        conn.getMetaData().getSchemas();
    }
}

