package hello.jdbc.connection

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test
class DBConnectionTest() {
    @Test
    fun connectionTest(){
        val dbConnectionUtil = DBConnectionUtil()
        val connection = dbConnectionUtil.getConnection()
        Assertions.assertThat(connection).isNotNull
    }
}