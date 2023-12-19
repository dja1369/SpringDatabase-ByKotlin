package hello.jdbc.connection

import hello.jdbc.utils.logger
import java.sql.Connection
import java.sql.DriverManager
import java.sql.SQLException

class DBConnectionUtil {
    val logger = logger()
    fun getConnection(): Connection {
         try {
             val connection: Connection = DriverManager.getConnection(URL, USERNAME, PASSWORD)
             logger.info("get Connection=$connection, class=${connection.javaClass}")
             return connection
         } catch (e: SQLException) {
             throw IllegalStateException(e)
         }
     }
}