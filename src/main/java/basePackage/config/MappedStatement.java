package basePackage.config;

/**
 * Created by 小马哥 on 2019/7/17.
 */

/**
 *此類存放 mapper文件里的查询语句中的元素
 */
public class MappedStatement {

    private String id;
    private String statementType;
    private Class<?> parameterTyoeClass;
    private Class<?> resultTypeClass;
    private SqlSource sqlSource;

    public MappedStatement (String id,String statementType,Class<?> parameterTyoeClass,Class<?> resultTypeClass,SqlSource sqlSource){
        this.id = id;
        this.statementType = statementType;
        this.parameterTyoeClass = parameterTyoeClass;
        this.resultTypeClass = resultTypeClass;
        this.sqlSource = sqlSource;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStatementType() {
        return statementType;
    }

    public void setStatementType(String statementType) {
        this.statementType = statementType;
    }

    public Class<?> getParameterTyoeClass() {
        return parameterTyoeClass;
    }

    public void setParameterTyoeClass(Class<?> parameterTyoeClass) {
        this.parameterTyoeClass = parameterTyoeClass;
    }

    public Class<?> getResultTypeClass() {
        return resultTypeClass;
    }

    public void setResultTypeClass(Class<?> resultTypeClass) {
        this.resultTypeClass = resultTypeClass;
    }

    public SqlSource getSqlSource() {
        return sqlSource;
    }

    public void setSqlSource(SqlSource sqlSource) {
        this.sqlSource = sqlSource;
    }
}
