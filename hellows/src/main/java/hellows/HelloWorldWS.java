package hellows;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class HelloWorldWS {
	@WebMethod
	public String sayHello(){
		return "HelloWorldWS";
	}
}
