package myTest.mytest;

import java.io.IOException;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

/**
 * @author:Helen
 * @date：2018年4月8日
 * @Description: 
 */
public class MyHTTPClient {

    public static void main(String[] args) throws Exception {
    	CloseableHttpClient httpCilent = HttpClients.createDefault();//Creates CloseableHttpClient instance with default configuration.
    	HttpGet httpGet = new HttpGet("http://spring.dev.xsteach.com/api/member/logout");
    	HttpPost httpPost = new HttpPost("api.dev.jinengxia.com/session");
    	String srtResult = "";
    	try {
    		HttpResponse httpResponse = httpCilent.execute(httpGet);
    	    srtResult = EntityUtils.toString(httpResponse.getEntity());//获得返回的结果
            System.out.println(srtResult);
    	} catch (IOException e) {
    	    e.printStackTrace();
    	}finally {
    	    try {
    	        httpCilent.close();//释放资源
    	    } catch (IOException e) {
    	        e.printStackTrace();
    	    }
    	}
    }
}


