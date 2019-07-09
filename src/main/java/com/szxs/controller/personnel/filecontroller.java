package com.szxs.controller.personnel;

import com.szxs.entity.File;
import com.szxs.entity.Task;
import com.szxs.service.personnel.fileService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


@Controller
public class filecontroller {
    @Resource
    private fileService fileService;

    /**
     * 查询档案信息
     *
     * @param model
     * @return
     */
    @RequestMapping("/showList")
    public String showList(Model model, HttpSession session) {
        Object loginsession = session.getAttribute("loginsession");

        //判断是否登录
        if (loginsession == null) {

            String ti = "请先登录";
            model.addAttribute("ti", ti);

            return "Login";
        }
        //把登录状态存到会话
        model.addAttribute("loginsessions", loginsession);
        List<File> files = fileService.queryArchives();
        model.addAttribute("fileList", files);
        return "per-news";
    }

    /**
     * 根据档案编码查询档案信息
     *
     * @param model
     * @return
     */
    @RequestMapping("/showListById")
    public String showListById(Model model, HttpSession session, File file) {
        Object loginsession = session.getAttribute("loginsession");

        //判断是否登录
        if (loginsession == null) {

            String ti = "请先登录";
            model.addAttribute("ti", ti);

            return "Login";
        }
        //把登录状态存到会话
        model.addAttribute("loginsessions", loginsession);

        List<File> files = fileService.queryArchivesById(file);
        model.addAttribute("fileList", files);

        return "per-news";
    }

    @RequestMapping("inserts")
    public String inserts(HttpSession session, Model model) {
        Object loginsession = session.getAttribute("loginsession");

        //判断是否登录
        if (loginsession == null) {

            String ti = "请先登录";
            model.addAttribute("ti", ti);

            return "Login";
        }
        model.addAttribute("loginsessions", loginsession);


        return "per-insertFile";
    }

    /**
     * 查询所有信息到明细页面
     *
     * @param model
     * @return
     */
    @RequestMapping("/showList2")
    public String showList2(Integer id, Model model, HttpSession session) {
        Object loginsession = session.getAttribute("loginsession");

        //判断是否登录
        if (loginsession == null) {

            String ti = "请先登录";
            model.addAttribute("ti", ti);

            return "Login";
        }
        model.addAttribute("loginsessions", loginsession);
        File file = fileService.queryFileByid(id);
        model.addAttribute("fileList", file);
        return "per-updateFile";
    }

    /**
     * 变更页面查询
     *
     * @param model
     * @return
     */
    @RequestMapping("/showList3")
    public String changes(Integer id, Model model, HttpSession session) {
        Object loginsession = session.getAttribute("loginsession");

        //判断是否登录
        if (loginsession == null) {

            String ti = "请先登录";
            model.addAttribute("ti", ti);

            return "Login";
        }
        model.addAttribute("loginsessions", loginsession);

        model.addAttribute("fileList", fileService.queryFileStatus("审核通过"));
        return "per-changes";
    }

    /**
     * 复核页面查询
     *
     * @param model
     * @return
     */
    @RequestMapping("/showList4")
    public String checks(Model model, HttpSession session) {
        Object loginsession = session.getAttribute("loginsession");

        //判断是否登录
        if (loginsession == null) {

            String ti = "请先登录";
            model.addAttribute("ti", ti);

            return "Login";
        }
        model.addAttribute("loginsessions", loginsession);
        model.addAttribute("fileList", fileService.queryChecks("审核中"));
        return "per-toCheck";
    }

    /**
     * 修改审核状态为审核通过
     *
     * @param check
     * @return
     */
    @RequestMapping("/updateChecks")
    public String updateChecks(@PathVariable String check, HttpSession session, Model model) {
        Object loginsession = session.getAttribute("loginsession");

        //判断是否登录
        if (loginsession == null) {

            String ti = "请先登录";
            model.addAttribute("ti", ti);

            return "Login";
        }
        model.addAttribute("loginsessions", loginsession);
        fileService.updateChecks("审核通过");
        return "/showList";
    }


    /**
     * 查询复核信息
     *
     * @param model
     * @return
     */
    @RequestMapping("/showCultivate")
    public String showCultivate(Model model, HttpSession session) {
        Object loginsession = session.getAttribute("loginsession");

        //判断是否登录
        if (loginsession == null) {

            String ti = "请先登录";
            model.addAttribute("ti", ti);

            return "Login";
        }
        model.addAttribute("loginsessions", loginsession);
        model.addAttribute("cultivateList", fileService.queryCultivate());
        return "per-review";
    }


    /**
     * 删除档案信息
     *
     * @param
     * @return
     */
    @RequestMapping("deleteFile")
    public String deleteFile(Integer id, HttpSession session, Model model) {
        Object loginsession = session.getAttribute("loginsession");

        //判断是否登录
        if (loginsession == null) {

            String ti = "请先登录";
            model.addAttribute("ti", ti);

            return "Login";
        }
        model.addAttribute("loginsessions", loginsession);
        fileService.deleteFile(id);
        return "redirect:/showList";
    }


    /**
     * 添加供应商信息
     *
     * @return
     */
    @RequestMapping("/insertfile")
    public String insertfile(@ModelAttribute File file, Model model, HttpSession session, Task task) {
        Object loginsession = session.getAttribute("loginsession");

        //判断是否登录
        if (loginsession == null) {

            String ti = "请先登录";
            model.addAttribute("ti", ti);

            return "Login";
        }
        model.addAttribute("loginsessions", loginsession);
        //获取随机数
        int i = (int) (Math.random() * 900 + 100);
        String myStr = Integer.toString(i);

        String sBD = "BDQN-" + myStr;
        String bBD = "BDQN-BM" + myStr;
        //设置随机数
        file.setFileCode(sBD);
        file.setPositionCode(bBD);


        //新增任务
        String name = file.getName() + "的档案登记录入审核";
        Date date = new Date();
        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd");


        task.setArrive(dateFormat.format(date));
        task.setTaskName(name);

        int i1 = fileService.insertTask(task);

        int insertfile = fileService.insertfile(file);

        if (insertfile > 0) {

            return showList(model, session);

        }
        return "insertFile";
    }
}
