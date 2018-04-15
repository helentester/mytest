package myTest.mytest;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;
import net.sf.json.JSONObject;

/**
 * @author:Helen
 * @date：2018年4月9日 
 * @Description:HTTP接口测试，包括get和post方法
 */
public class myAPItest {
	CloseableHttpClient httpCilent = HttpClients.createDefault();
	HttpResponse httpResponse;
	JSONObject j;
	String srtResult;

	@Test(priority=1,enabled=false)
	public void API_post() throws URISyntaxException, ClientProtocolException, IOException {
		HttpUriRequest login = RequestBuilder.post()
				.setUri(new URI("http://spring.dev.xsteach.com/api/member/login"))
				.addParameter("username", "helen_14_04")
				.addParameter("password", "123456")
				.addParameter("remember", "0").build();
		httpResponse = httpCilent.execute(login);
		srtResult = EntityUtils.toString(httpResponse.getEntity());// 获得返回的结果
		j = JSONObject.fromObject(srtResult);//结果转换为json
		assertEquals(j.getString("message"), "登录成功");
	}

	@Test(priority=2,enabled=false)
	public void API_get() throws ClientProtocolException, IOException {
		HttpGet httpGet = new HttpGet("http://spring.dev.xsteach.com/api/member/logout");
		httpResponse = httpCilent.execute(httpGet);
		srtResult = EntityUtils.toString(httpResponse.getEntity());// 获得返回的结果
		assertEquals(httpResponse.getStatusLine().getStatusCode(), 200);
		j = JSONObject.fromObject(srtResult);//结果转换为json
		assertEquals(j.getString("message"), "退出成功");
	}

}
