package org.zerock.persistance;

import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

import lombok.extern.log4j.Log4j;

@Log4j
public class JDBCTest {

   @Test
   public void testConnection() {
      try {
         Class.forName("oracle.jdbc.driver.OracleDriver");
         Connection con = DriverManager.getConnection(
            "jdbc:oracle:thin:@localhost:1521:xe", "book_ex", "book_ex");
         log.info("Connection : " + con);
         con.close();
      } catch(Exception e) {
         fail(e.getMessage());
      }
   }
}