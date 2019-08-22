package basePackage.session;

/**
 * Created by 小马哥 on 2019/7/17.
 */


/*
* 用于生产sqlsession的工厂接口，
* */
public interface SqlSessionFactory {

    SqlSession openSession();

}
