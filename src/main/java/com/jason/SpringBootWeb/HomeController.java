package com.jason.SpringBootWeb;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){
//        System.out.println("home method called");
        return "index";
    }
    @RequestMapping("add")
    public ModelAndView add(@RequestParam("num1") int num1, @RequestParam("num2") int num2, ModelAndView mv) {

        int result = num1 + num2;
        mv.addObject("result",result);
        mv.setViewName("result");

        return mv;
    }

    @RequestMapping("addUser")
    public ModelAndView add(@RequestParam("uid") int uid, @RequestParam("uname") String uname, ModelAndView mv){

        User user = new User();
        user.setUid(uid);
        user.setUname(uname);
        mv.addObject("user", user);
        mv.setViewName("result");
        return mv;
    }

}
