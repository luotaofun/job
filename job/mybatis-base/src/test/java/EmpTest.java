import com.luotao.mapper.EmpMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.io.InputStream;

/**
 * @Classname EmpTest
 * @Description TODO
 * @Version 1.0.0
 * @Date 2025/4/11 1:19
 * @Author LuoTao
 */
public class EmpTest {
    @Test
    public void tests() throws IOException {
        // 步骤1：从类路径（src/main/resources）加载MyBatis全局配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
        // 步骤2：根据配置文件构建数据库会话工厂
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        // 步骤3：获取一个数据库连接会话
        SqlSession sqlSession = sqlSessionFactory.openSession();
        // 步骤4：获取Mapper代理对象(自动生成EmpMapper接口的实现类)：父接口指向一个实现了EmpMapper的类，实现的细节在`EmpMapper.xml`中(通过EmpMapper.xml中的SQL配置绑定接口方法)
        EmpMapper empMapper = sqlSession.getMapper(EmpMapper.class);
        // 步骤5：执行EmpMapper.xml中id="list"的SQL语句,将查询结果自动映射为Employ对象列表
        empMapper.list().forEach(System.out::println);
    }
}
