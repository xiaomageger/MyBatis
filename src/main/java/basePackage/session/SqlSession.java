package basePackage.session;

/**
 * Created by 小马哥 on 2019/7/17.
 */

/*
* 此接口里存放一些查询方法
* */

public interface SqlSession {

    <T> T query();

    <T> T seleceOne(String statementId,Object param);

    <T> T selectList(String statementId, Object param);

}
