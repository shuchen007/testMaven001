package hello;
/*
* 创建依赖其他包的测试类。
 */

import com.hao.demo2.Hello1;
import com.shuchen.hao.Hello;

public class HelloTest {
	public static void main(String[] args){
		Hello hi = new Hello();
		hi.hello();
		Hello1 hi1 = new Hello1();
		hi1.hello1();
	}
	public String main1(){
//		Hello hi = new Hello();
//		hi.hello();
		return "dddz32d";
	}
}
