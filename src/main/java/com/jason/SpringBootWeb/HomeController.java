package com.jason.SpringBootWeb;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){
//        System.out.println("home method called");
        return "index.jsp";
    }

    @RequestMapping("add")
    public String add(int num1, int num2, HttpSession session){
        int result = num1 + num2;
        session.setAttribute("result", result);
        return "result.jsp";
    }

}
