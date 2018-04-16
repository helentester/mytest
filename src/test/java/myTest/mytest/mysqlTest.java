package myTest.mytest;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;
import common.mysql_conn;

public class mysqlTest {
  @Test(description="从数据库中读取数据，验证测试")
  public void getDataFromMysql() {
	  mysql_conn mysql_conn = new mysql_conn();
	  String result = mysql_conn.getData("SELECT `name` from course where id=1","name");//查询语句
	  assertEquals(result, "PS提高班班");
  }
}
