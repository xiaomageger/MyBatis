package basePackage.session;

/**
 * Created by 小马哥 on 2019/7/17.
 */


import basePackage.config.Configuration;

/**
 *
 */
public class DefaultSqlSessionFactory implements SqlSessionFactory {

    private Configuration configuration;

    public DefaultSqlSessionFactory(Configuration configuration) {
        this.configuration = configuration;
    }

    public DefaultSqlSessionFactory() {

    }


    //实现获取sqlsession功能的代码
    @Override
    public SqlSession openSession() {
        return new DefaultSqlSession(configuration);
    }
}
