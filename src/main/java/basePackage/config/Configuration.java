package basePackage.config;

/**
 * Created by 小马哥 on 2019/7/17.
 */

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

/**
 *存储全局配置文件信息；同时加载映射文件
 */
public class Configuration {

    private DataSource dataSource;

    private Map<String,MappedStatement> mappedStatements = new HashMap<>();


    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public Map<String, MappedStatement> getMappedStatements() {
        return mappedStatements;
    }

    public void addMappedStatements(String statementId, MappedStatement mappedStatement) {
        this.mappedStatements.put(statementId,mappedStatement);
    }
}
