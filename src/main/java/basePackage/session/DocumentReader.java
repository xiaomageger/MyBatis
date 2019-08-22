package basePackage.session;

/**
 * Created by 小马哥 on 2019/7/17.
 */

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;

import java.io.InputStream;

/**
 *
 */
public class DocumentReader {


    public static Document createDocument(InputStream inputStream) {

        Document document = null;
        try {
            SAXReader saxReader = new SAXReader();
            document = saxReader.read(inputStream);
            return document;
        } catch (DocumentException e) {
            e.printStackTrace();
        }
        return null;
    }


}
