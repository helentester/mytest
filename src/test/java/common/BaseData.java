/**
 * @author:Helen
 * @date：2018年4月18日
 */
package common;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 描述：数据处理
 */
public class BaseData {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseData baseData = new BaseData();
		/*System.out.println(baseData.getRandomName("技能班")); 
		String url="https://backend.dev.jinengxia.com/course/course-score-list?course_id=38?page=67?";
		baseData.getTargetList(url, "(\\d+)(\\d+)");
		System.out.println(baseData.getTargetList(url, "(\\d+)(\\d+)"));*/
		String s= baseData.getPhoneNo();
		System.out.println(s);
	}

	/* 返回参数与随机数并接成新的值 */
	public String getRandomName(String s) {
		Random random = new Random();
		return s + Integer.toString(random.nextInt(10000));
	}

	/* 通过正则表达式匹配，返回结果列表 */
	public List<String> getTargetList(String matcherStr, String compileStr) {
		List<String> targetList= new ArrayList<String>();
		Pattern p = Pattern.compile(compileStr);// 规则
		Matcher m = p.matcher(matcherStr);
		while (m.find()){
			targetList.add(m.group());//把匹配到的结果存到列表中
		}
		return targetList;
	}
	
	/*随机生成手机号*/
	public String getPhoneNo() {
		//各号段
		List<String> telList=new ArrayList<String>(Arrays.asList("133","149","153","173","177","180","181","189","199",//电信号段
				"130","131","132","145","155","156","166","171","175","176","185","186",//联通号段
				"134","135","136","137","138","139","147","150","151","152","157","158","159","178","182","183","184","187","188","198"));//移动号段
		Random random = new Random();
		return telList.get(random.nextInt(telList.size()-1))+random.nextInt(99999999);
	}
}
