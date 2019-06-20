package com.szxs.controller.workbench;

import com.szxs.entity.Task;
import com.szxs.entity.Tasktype;
import com.szxs.entity.User;
import com.szxs.service.workbench.WorkbenchService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
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

    //执行登录操作 账号密码正确进入管理系统  错误跳回登录页面
    @RequestMapping("/bocklog")
    public String bocklog(String code, String password, Model model, HttpSession session,Task task) {

        Object loginsession = session.getAttribute("loginsession");

        List<Tasktype> tasktypes = workbenchService.queryTasktype();
        List<Task> tasks = workbenchService.queryTask(task);



        //查询到的分类存到Model
        model.addAttribute("tasktypesList",tasktypes);
        //查询到的任务存到Model
        model.addAttribute("taskList",tasks);

        model.addAttribute("loginsessions", loginsession);
        return "wor-backlog";
    }






    //跳转到待办列表的处理页面
    @RequestMapping("/bocklogByTo")
    public String bocklogByTo(HttpSession session, Model model) {
        Object loginsession = session.getAttribute("loginsession");
        model.addAttribute("loginsessions", loginsession);

        return "wor-bocklogByTo";
    }


}
