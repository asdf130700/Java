import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


public class GetRSS {

public static void main(String[] args) {
String rssUrl = "http://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=1159068000";

try {
parseXml(rssUrl);
} catch (Exception e) {
e.printStackTrace();
}
}



private static void parseXml(String _url) throws Exception{
System.out.println("parse XML");

DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
DocumentBuilder db = dbf.newDocumentBuilder();
Document doc = db.parse(_url);

doc.getDocumentElement().normalize();

NodeList itemNodeList = doc.getElementsByTagName("description");

System.out.println("count :"  + itemNodeList.getLength());
for(int i =0; i < itemNodeList.getLength(); i++){
Node itemNode = itemNodeList.item(i);

if(itemNode.getNodeType() == Node.ELEMENT_NODE){
Element itemElement = (Element)itemNode;

NodeList titleNodeList = itemElement.getElementsByTagName("day");
   Element titleElement = (Element)titleNodeList.item(0);
   NodeList childTitleNodeList = titleElement.getChildNodes();
   System.out.printf("[title : %s]\n", ((Node)childTitleNodeList.item(0)).getNodeValue());
   
   NodeList linkNodeList = itemElement.getElementsByTagName("hour");
   Element linkElement = (Element) linkNodeList.item(0);
   NodeList childLinkNodeList = linkElement.getChildNodes();
   System.out.printf("[link : %s]\n", ((Node)childLinkNodeList.item(0)).getNodeValue());
 
   NodeList descriptionNodeList = itemElement.getElementsByTagName("guid");
   Element descriptionElement = (Element) descriptionNodeList.item(0);
   NodeList childDescriptionNodeList = descriptionElement.getChildNodes();
   System.out.printf("[guid : %s]\n", ((Node)childLinkNodeList.item(0)).getNodeValue());
   
   NodeList pubDate = itemElement.getElementsByTagName("pubDate");
   Element pubDateElement = (Element)pubDate.item(0);
   NodeList childPubDateNodeList = pubDateElement.getChildNodes();
   System.out.printf("[pubDate : %s]\n", ((Node)childPubDateNodeList.item(0)).getNodeValue());
 
   NodeList createDate = itemElement.getElementsByTagName("dc:creator");
   Element createElement = (Element)createDate.item(0);
   NodeList childCreateNodeList = createElement.getChildNodes();
   System.out.printf("[creator : %s]\n", ((Node)childCreateNodeList.item(0)).getNodeValue());
}
}
}

}

