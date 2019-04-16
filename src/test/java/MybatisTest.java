import com.feng.mybatis.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @program: MybatisDemo
 * @Date: 2019/4/12 12:51
 * @Author: Mr.Feng
 * @Description:
 */
public class MybatisTest {
 public static void main(String[] args) throws IOException {
  String resource ="mybatis/mybatis-config.xml";
  //通过配置文件获取数据库连接信息
  InputStream in = Resources.getResourceAsStream(resource);
  //通过数据库连接信息构建对应的 sqlsessionFactory
  SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
  //打开一个 sqlSession
  SqlSession sqlSession = sqlSessionFactory.openSession();

  try {
   //进行CRUD,注意 statement 是 namespace.id,返回值是一个User对象
   User user = sqlSession.selectOne("MyMapper.selectUser",1);
   System.out.println(user);
  }finally {
   sqlSession.close();
  }
 }
}
