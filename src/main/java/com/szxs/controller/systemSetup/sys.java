package com.szxs.controller.systemSetup;


import com.szxs.entity.Organization;
import com.szxs.service.systemSetup.SysService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.Random;

@Controller
public class sys {

    @Resource
    private SysService sysService;

    @RequestMapping("Organization")
    public String Organization(HttpSession session, Model model) {
        Object loginsession = session.getAttribute("loginsession");

        //判断是否登录
        if (loginsession == null) {

            String ti = "请先登录";
            model.addAttribute("ti", ti);

            return "Login";
        }
        //把登录状态存到会话
        model.addAttribute("loginsessions", loginsession);

        //获取随机数
        int i = (int) (Math.random() * 90000 + 10000);
        String myStr = Integer.toString(i);

        String bBC = "职业教育研究院";
        String bBD = "BDQN-" + myStr;
        String bBE = "北京市海淀区成府路207号";

        model.addAttribute("bBC",bBC);
        model.addAttribute("bBD",bBD);
        model.addAttribute("bBE",bBE);


        return "sys-OrganizationStructure";
    }

    @RequestMapping("OrganizationAdd")
    public String OrganizationAdd(HttpSession session, Model model, Organization organization) {
        Object loginsession = session.getAttribute("loginsession");

        //判断是否登录
        if (loginsession == null) {

            String ti = "请先登录";
            model.addAttribute("ti", ti);

            return "Login";
        }
        //把登录状态存到会话
        model.addAttribute("loginsessions", loginsession);


        int s = sysService.insertOrgan(organization);



        String chen  = "保存成功";
        String shi  = "保存失败";
        if(s>0){

            model.addAttribute("ti",chen);
            return Organization(session,model);
        }

        model.addAttribute("ti",shi);
        return Organization(session,model);
    }

}
