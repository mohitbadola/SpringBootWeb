package com.jason.SpringBootWeb;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){
//        System.out.println("home method called");
        return "index.jsp";
    }

    @RequestMapping("add")
    public String add(@RequestParam("num1") int n1,@RequestParam("num2") int n2, HttpSession session){
        int result = n1 + n2;
        session.setAttribute("result", result);
        return "result.jsp";
    }

}
