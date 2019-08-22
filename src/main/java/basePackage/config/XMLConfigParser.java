package basePackage.config;

/**
 * Created by 小马哥 on 2019/7/17.
 */

import org.apache.commons.dbcp.BasicDataSource;
import org.dom4j.Element;

import javax.sql.DataSource;
import java.util.List;
import java.util.Properties;

/**
 *
 */
public class XMLConfigParser {

    private Configuration configuration;

    public Configuration parseConfiguration(Element element) {

        //解析environment标签
        parseEnvironments(element.element("environments"));

        parseMappers(element.element("mappers"));

        return null;
    }

    private void parseMappers(Element element) {
        List<Element> elements = element.elements("mapper");

    }

    //解析数据源
    private void parseEnvironments(Element element) {
        //
        String defaultEnvironmentId = element.attributeValue("default");
        List<Element> elements = element.elements("environment");

        for (Element envElement: elements){
            String envId = envElement.attributeValue("id");
            if (defaultEnvironmentId != null && envId.equals(defaultEnvironmentId)) {
                parseDataSource(envElement.element("dataSource"));
            }
//            String tem = envElement.attributeValue("")
        }

    }

    //数据源的解析
    private void parseDataSource(Element element) {
        String type = element.attributeValue("type");
        if (type == null || type.equals("")) {
            type = "DBCP";
        }
        List<Element> elements = element.elements("property");

        Properties properties = new Properties();
        for(Element property: elements){
            String name = property.attributeValue("name");
            String value = property.attributeValue("value");

            properties.setProperty(name,value);
        }
        BasicDataSource dataSource = null;
        if (type.equals("DBCP")){
            dataSource = new BasicDataSource();
            dataSource.setDriverClassName(properties.getProperty("driver"));
            dataSource.setUrl(properties.getProperty("url"));
            dataSource.setUsername(properties.getProperty("username"));
            dataSource.setPassword(properties.getProperty("password"));
            configuration.setDataSource(dataSource);
        }
    }
}
