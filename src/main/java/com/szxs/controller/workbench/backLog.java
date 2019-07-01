package com.szxs.controller.workbench;

import com.szxs.entity.Task;
import com.szxs.entity.Tasktype;
import com.szxs.entity.User;
import com.szxs.service.workbench.WorkbenchService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class backLog {

    @Resource
    private WorkbenchService workbenchService;



    //跳到登录页面
    @RequestMapping("/ByLogin")
    public String ByLogin() {

        return "Login";
    }

    //跳到首页
    @RequestMapping("/ByIndex")
    public String ByIndex(HttpSession session,Model model) {
        Object loginsession = session.getAttribute("loginsession");
        model.addAttribute("logins", loginsession);
        return "ana-index";
    }

    //执行登录操作 账号密码正确进入管理系统  错误跳回登录页面
    @RequestMapping("/Login")
    public String Login(String code, String password, Model model, HttpSession session) {


        User login = workbenchService.login(code, password);

        if (login == null) {

            return "Login";

        }
        //查询到的数据存到Model
        model.addAttribute("logins", login);
        //把登录状态存到会话
        session.setAttribute("loginsession", login);

        return "ana-index";
    }




    //执行跳转到待办列表
    @RequestMapping("/bocklog")
    public String bocklog(String code, String password,String arrive, Model model, HttpSession session, Task task, @RequestParam(required = false) String OrganizationId) throws ParseException {
        Object loginsession = session.getAttribute("loginsession");

        //判断是否登录
        if(loginsession==null){

            String ti = "请先登录";
            model.addAttribute("ti",ti);

            return "Login";
        }

        if (OrganizationId != null) {
            switch (OrganizationId) {
                case "人事档案录入审核":
                    task.setTypeid(1);
                    break;
                case "人事档案变更":
                    task.setTypeid(2);
                    break;
                case "职位审核":
                    task.setTypeid(3);
                    break;
                case "招聘录用审核":
                    task.setTypeid(4);
                    break;
                case "培训计划审核":
                    task.setTypeid(5);
                    break;
                case "薪资标准审核":
                    task.setTypeid(6);
                    break;
                case "薪资标准变更":
                    task.setTypeid(7);
                    break;
                case "薪资发放审核":
                    task.setTypeid(8);
                    break;


            }

//            System.out.println(task.getArrive());
//            Date date = new Date();
//            String strDateFormat = "yyyy-MM-dd";
//            SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
//            System.out.println(sdf.format(task.getArrive()));
//
//            String format = sdf.format(task.getArrive());
//
//            System.out.println(sdf.parse(format));


        }



        List<Tasktype> tasktypes = workbenchService.queryTasktype();
        List<Task> tasks = workbenchService.queryTask(task);


        //查询到的分类存到Model
        model.addAttribute("tasktypesList", tasktypes);
        //查询到的任务存到Model
        model.addAttribute("taskList", tasks);

        model.addAttribute("loginsessions", loginsession);
        return "wor-backlog";
    }


    //跳转到修改密码
    @RequestMapping("/changePassword")
    public String changePassword(HttpSession session,Model model) {
        Object loginsession = session.getAttribute("loginsession");
        //判断是否登录
        if(loginsession==null){

            String ti = "请先登录";
            model.addAttribute("ti",ti);

            return "Login";
        }

        model.addAttribute("loginsessions", loginsession);
        return "wor-changePassword";
    }


    //修改密码成功
    @RequestMapping("/changePassword2")
    public Object changePassword2(User user,HttpSession session,Model model) {

        int i = workbenchService.updateUser(user);
        System.out.println(i);
        String TiShi = "修改密码成功";
        model.addAttribute("TiShi",TiShi);

        return changePassword(session,model);
    }


    //跳转到待办列表的处理页面
    @RequestMapping("/bocklogByTo")
    public String bocklogByTo(HttpSession session, Model model) {
        Object loginsession = session.getAttribute("loginsession");
        //判断是否登录
        if(loginsession==null){

            String ti = "请先登录";
            model.addAttribute("ti",ti);

            return "Login";
        }
        model.addAttribute("loginsessions", loginsession);

        return "wor-bocklogByTo";
    }


}
