package httpclient;

import java.io.IOException;

import javax.swing.text.html.parser.Entity;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.protocol.ResponseContent;
import org.apache.http.util.EntityUtils;

public class aaa {

	public static void main(String[] args) {
		CloseableHttpClient httpclient = null;
		HttpGet httpget = null;
		CloseableHttpResponse response=null;
		HttpEntity entity = null;
		String responsecontent = null;
		try {
			//1.创建httpclient对象
			httpclient = HttpClients.createDefault();
			//2.创建httpGet对象
			httpget = new HttpGet("http://www.qq.com");
			//3.执行请求//4.接收返回的数据
			response = httpclient.execute(httpget);	
			//5.提取主体
			entity = response.getEntity();
			responsecontent = EntityUtils.toString(entity,"utf-8");
			
			System.out.println(httpget.getURI());
			System.out.println(responsecontent);
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		//6.关闭
		try {
			httpclient.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
