package cn.yayatao.safety.authority.autoconfigure;

import cn.yayatao.safety.authority.core.RowDataAuthorityInterceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.boot.autoconfigure.MybatisAutoConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.util.Iterator;
import java.util.List;

@Configuration
@ConditionalOnBean({SqlSessionFactory.class})
@AutoConfigureAfter({MybatisAutoConfiguration.class})
public class DataAuthorityAutoConfiguration {

    @Autowired
    private List<SqlSessionFactory> sqlSessionFactoryList;

    public DataAuthorityAutoConfiguration(){
    }

    @PostConstruct
    public void addPageInterceptor() {
        RowDataAuthorityInterceptor interceptor  = new RowDataAuthorityInterceptor();
        Iterator<SqlSessionFactory> iter = sqlSessionFactoryList.iterator();
        while(iter.hasNext()) {
            SqlSessionFactory sqlSessionFactory =  iter.next();
            sqlSessionFactory.getConfiguration().addInterceptor(interceptor);
        }
    }
}
