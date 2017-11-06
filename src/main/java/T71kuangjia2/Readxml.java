package T71kuangjia2;

import java.io.File;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;


public class Readxml {

	public static void main(String[] args) throws DocumentException {
		SAXReader saxreade = new SAXReader();
		Document document = saxreade.read(new File("C:/Users/陈欢/workspace/UItest/config/a.xml"));
	
		Element root = document.getRootElement();
		System.out.println("Root: " + root.getName());
		
		List<Element> childList = root.elements();
		for(int i =0;i<childList.size();i++){
		System.out.println("节点名称" + childList.get(i).getName()); 
		System.out.println("姓名" + childList.get(i).getText());
		System.out.println("姓名" + childList.get(i).attributeValue("name"));
		System.out.println("姓名" + childList.get(i).attributeValue("age "));
	}
	}
}
