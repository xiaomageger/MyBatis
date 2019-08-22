package basePackage.session;

/**
 * Created by 小马哥 on 2019/7/17.
 */

import basePackage.config.Configuration;

/**
 *
 */
public class DefaultSqlSession implements SqlSession {

    private Configuration configuration;

    public DefaultSqlSession(Configuration configuration) {
        this.configuration = configuration;
    }

    @Override
    public <T> T query() {
        return null;
    }

    @Override
    public <T> T seleceOne(String statementId, Object param) {
        return null;
    }

    @Override
    public <T> T selectList(String statementId, Object param) {
        return null;
    }
}
