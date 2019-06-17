package com.szxs.controller.workbench;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class backLog {


    @RequestMapping("/backLog")
    public String backLog(){


        return "wor-backlog";
    }

    @RequestMapping("/bocklogByTo")
    public String bocklogByTo(){


        return "wor-bocklogByTo";
    }

    @RequestMapping("/Login")
    public String Login(){



        return "ana-index";
    }


}
