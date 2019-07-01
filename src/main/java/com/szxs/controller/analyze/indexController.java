package com.szxs.controller.analyze;

import com.szxs.entity.File;
import com.szxs.entity.ReserveTalent;
import com.szxs.service.analyze.AnaFileService;
import com.szxs.service.analyze.AnaFileStatusService;
import com.szxs.service.analyze.AnaOrganizationService;
import com.szxs.service.analyze.AnaReserveTalentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.swing.*;
import java.util.List;

@Controller
public class indexController {


    @Resource
    private AnaOrganizationService anaOrganizationService;
    @Resource
    private AnaFileStatusService anaFileStatusService;
    @Resource
    private AnaFileService anaFileService;
    @Resource
    private AnaReserveTalentService anaReserveTalentService;

    File file = new File();
    @RequestMapping("/")
    public String anaIndex1() {
        return "Login";
    }

    @RequestMapping("/ana-Details")
    public String anaIndex2(HttpSession session,HttpServletRequest request, Model model, @RequestParam(required = false) Integer OrganizationId, @RequestParam(required = false) String employeeName, @RequestParam(required = false) Integer fileStatusId) {

        Object loginsession = session.getAttribute("loginsession");

        //判断是否登录
        if(loginsession==null){

            String ti = "请先登录";
            model.addAttribute("ti",ti);

            return "Login";
        }
        model.addAttribute("loginsessions", loginsession);
        file.setOrganizationId(OrganizationId);
        file.setName(employeeName);
        file.setFileStatusId(fileStatusId);

        model.addAttribute("OrganizationList", anaOrganizationService.queryAllOrganization());
        model.addAttribute("FileStatusList", anaFileStatusService.queryAllFileStatus());
        model.addAttribute("FileList", anaFileService.queryAllFile(file));
        return "ana-Details";
    }

    @RequestMapping("/ana-SntheticData")
    public String anaIndex3(HttpSession session,Model model,String year) {
        Object loginsession = session.getAttribute("loginsession");

        //判断是否登录
        if(loginsession==null){

            String ti = "请先登录";
            model.addAttribute("ti",ti);

            return "Login";
        }
        model.addAttribute("loginsessions", loginsession);

        model.addAttribute("FileList", anaFileService.queryAllFile(file));
        model.addAttribute("CountFile",anaFileService.countByYearAndRecord());
        return "ana-SntheticData";
    }

    //储备人才
    @RequestMapping("/ana-ReserveTalent")
    public String anaIndex4(HttpSession session,Model model, @RequestParam(required = false) String name) {
        Object loginsession = session.getAttribute("loginsession");

        //判断是否登录
        if(loginsession==null){

            String ti = "请先登录";
            model.addAttribute("ti",ti);

            return "Login";
        }
        model.addAttribute("loginsessions", loginsession);
        ReserveTalent reserveTalent = new ReserveTalent();
        reserveTalent.setName(name);
        List<ReserveTalent> list  = anaReserveTalentService.queryAll(reserveTalent);
        model.addAttribute("ReserveTalentList",anaReserveTalentService.queryAll(reserveTalent));


        return "ana-ReserveTalent";
    }

    @RequestMapping("/ana-Architecture")
    public String anaIndex5(HttpSession session,Model model) {
        Object loginsession = session.getAttribute("loginsession");

        //判断是否登录
        if(loginsession==null){

            String ti = "请先登录";
            model.addAttribute("ti",ti);

            return "Login";
        }
        model.addAttribute("loginsessions", loginsession);
        return "ana-Architecture";
    }

    @RequestMapping("/ana-PostChangesStatistics")
    public String anaIndex6(HttpSession session,Model model) {
        Object loginsession = session.getAttribute("loginsession");

        //判断是否登录
        if(loginsession==null){

            String ti = "请先登录";
            model.addAttribute("ti",ti);

            return "Login";
        }
        model.addAttribute("loginsessions", loginsession);
        return "ana-PostChangesStatistics";
    }

    @RequestMapping("/ana-PostChangesStatisticsByMonth")
    public String anaIndex7(HttpSession session,Model model) {
        Object loginsession = session.getAttribute("loginsession");

        //判断是否登录
        if(loginsession==null){

            String ti = "请先登录";
            model.addAttribute("ti",ti);

            return "Login";
        }
        model.addAttribute("loginsessions", loginsession);
        return "ana-PostChangesStatisticsByMonth";
    }

    @RequestMapping("/ana-ChangesDetails")
    public String anaIndex8(HttpSession session,Model model) {
        Object loginsession = session.getAttribute("loginsession");

        //判断是否登录
        if(loginsession==null){

            String ti = "请先登录";
            model.addAttribute("ti",ti);

            return "Login";
        }
        model.addAttribute("loginsessions", loginsession);
        return "ana-ChangesDetails";
    }

    @RequestMapping("/ana-EntryDetails")
    public String anaIndex9(HttpSession session,Model model) {
        Object loginsession = session.getAttribute("loginsession");

        //判断是否登录
        if(loginsession==null){

            String ti = "请先登录";
            model.addAttribute("ti",ti);

            return "Login";
        }
        model.addAttribute("loginsessions", loginsession);
        return "ana-EntryDetails";
    }
}
