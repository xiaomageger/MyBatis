package basePackage.session;

/**
 * Created by 小马哥 on 2019/7/17.
 */

import basePackage.config.Configuration;
import basePackage.config.XMLConfigParser;
import org.dom4j.Document;

import java.io.InputStream;
import java.io.Reader;

/**
 *
 */
public class SqlSessionFactoryBuilder {

    private Configuration configuration;

    private XMLConfigParser xmlConfigParser;

    public SqlSessionFactory build(InputStream inputStream){

        //通过inputstream创建Document
        Document document = DocumentReader.createDocument(inputStream);
        xmlConfigParser = new XMLConfigParser();
        xmlConfigParser.parseConfiguration(document.getRootElement());

        return build();
    };
    public SqlSessionFactory build(Reader reader){
        return build();
    };

    public SqlSessionFactory build(){
        return new DefaultSqlSessionFactory();
    }

}
