package com.szxs.controller.analyze;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexController {


        @RequestMapping("/")
        public String index(){
            return "ana-index";
        }


    @RequestMapping("/index2")
    public String index2(){
        return "ana-Details";
    }

}
