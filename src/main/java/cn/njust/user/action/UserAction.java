package cn.njust.user.action;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;


@Controller("userAction")
@Scope("prototype")
public class UserAction extends ActionSupport {
      private static final long serialVersionUID=1L;

      public String login()
      {
    	  System.out.println("hello  world");
    	  return "SUCCESS";
      }
}
