package org.database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBHelper {

    public static int executeUpdate(String sql, Object... params) throws SQLException {
        try (Connection conn = DBConnection.connect();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
                
                for (int i = 0; i < params.length; i++) {
                    stmt.setObject(i + 1, params[i]);
                }
                
                return stmt.executeUpdate();
             }
    }

    public static void executeQuery(String sql, ResultSetHandler handler, Object... params) throws SQLException {
        try (Connection conn = DBConnection.connect();
            PreparedStatement stmt = conn.prepareStatement(sql)) {

                for (int i = 0; i < params.length; i++) {
                    stmt.setObject( + 1, params[i]);
                }

                try (ResultSet rs = stmt.executeQuery()) {
                    handler.handle(rs);
                }
        }
    }
}
