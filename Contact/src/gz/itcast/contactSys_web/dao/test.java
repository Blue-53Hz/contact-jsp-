package gz.itcast.contactSys_web.dao;

import gz.itcast.contactSys_web.dao.impl.ContactDaoImpl;
import gz.itcast.contactSys_web.entity.Contact;
import gz.itcast.contactSys_web.util.XMLUtil;
import org.dom4j.Document;
import org.dom4j.Element;

/**
 * @author huoyueyang
 * @date 2019/8/1 11:14
 * @email mataszhang@163.com
 */
public class test {


    public static void main(String[] args) {
//        ContactDao dao=new ContactDaoImpl();
//       Contact contact= dao.findById("47b047b3-c54b-4773-a5bd-f23ff07e89c1");
//       System.out.println(contact);
        //1)读取原来的xml
        Document doc= XMLUtil.getDocument();
        //2)删除contact标签
        //2.1 根据id查询对应的contact标签
        String id="47b047b3-c54b-4773-a5bd-f23ff07e89c1";
        Element conElem= (Element) doc.selectSingleNode("//concat[@id='"+id+"']");

        System.out.println(conElem.attributeValue("id"));


    }
}