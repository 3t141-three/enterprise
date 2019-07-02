package com.szxs.controller.personnel;

import com.szxs.entity.File;
import com.szxs.service.personnel.fileService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;


@Controller
public class filecontroller {
    @Resource
    private fileService fileService;

    /**
     * 查询档案信息
     * @param model
     * @return
     */
    @RequestMapping("/showList")
    public String showList(Model model,HttpSession session){
        Object loginsession = session.getAttribute("loginsession");

        //判断是否登录
        if(loginsession==null){

            String ti = "请先登录";
            model.addAttribute("ti",ti);

            return "Login";
        }
        //把登录状态存到会话
        model.addAttribute("loginsessions", loginsession);
        model.addAttribute("fileList", fileService.queryArchives());
        return "per-news";
    }
    /**
     * 查询所有信息到明细页面
     * @param model
     * @return
     */
    @RequestMapping( "/showList2")
    public String showList2(Integer id, Model model,HttpSession session){
        Object loginsession = session.getAttribute("loginsession");

        //判断是否登录
        if(loginsession==null){

            String ti = "请先登录";
            model.addAttribute("ti",ti);

            return "Login";
        }
        model.addAttribute("loginsessions", loginsession);
        File file = fileService.queryFileByid(id);
        model.addAttribute("fileList",file);
        return "per-updateFile";
    }

    /**
     * 变更页面查询
     * @param model
     * @return
     */
    @RequestMapping("/showList3")
    public String changes(Integer id, Model model,HttpSession session){
        Object loginsession = session.getAttribute("loginsession");

        //判断是否登录
        if(loginsession==null){

            String ti = "请先登录";
            model.addAttribute("ti",ti);

            return "Login";
        }
        model.addAttribute("loginsessions", loginsession);

        model.addAttribute("fileList",fileService.queryFileStatus("审核通过"));
        return "per-changes";
    }

    /**
     * 复核页面查询
     * @param model
     * @return
     */
    @RequestMapping("/showList4")
    public String checks(Model model,HttpSession session){
        Object loginsession = session.getAttribute("loginsession");

        //判断是否登录
        if(loginsession==null){

            String ti = "请先登录";
            model.addAttribute("ti",ti);

            return "Login";
        }
        model.addAttribute("loginsessions", loginsession);
        model.addAttribute("fileList",fileService.queryChecks("审核中"));
        return "per-toCheck";
    }

    /**
     * 修改审核状态为审核通过
     * @param check
     * @return
     */
    @RequestMapping("/updateChecks")
    public String updateChecks(@PathVariable String check,HttpSession session,Model model){
        Object loginsession = session.getAttribute("loginsession");

        //判断是否登录
        if(loginsession==null){

            String ti = "请先登录";
            model.addAttribute("ti",ti);

            return "Login";
        }
        model.addAttribute("loginsessions", loginsession);
        fileService.updateChecks("审核通过");
        return "/showList";
    }


    /**
     *查询复核信息
     * @param model
     * @return
     */
    @RequestMapping("/showCultivate")
    public String showCultivate(Model model,HttpSession session) {
        Object loginsession = session.getAttribute("loginsession");

        //判断是否登录
        if(loginsession==null){

            String ti = "请先登录";
            model.addAttribute("ti",ti);

            return "Login";
        }
        model.addAttribute("loginsessions", loginsession);
      model.addAttribute("cultivateList",fileService.queryCultivate());
        return "per-review";
    }


    /**
     * 删除档案信息
     * @param fileid
     * @return
     */
    @RequestMapping(value = "deleteFile/{fileid}")
    public String deleteFile(@PathVariable  Integer fileid,HttpSession session,Model model){
        Object loginsession = session.getAttribute("loginsession");

        //判断是否登录
        if(loginsession==null){

            String ti = "请先登录";
            model.addAttribute("ti",ti);

            return "Login";
        }
        model.addAttribute("loginsessions", loginsession);
        fileService.deleteFile(fileid);
        return "redirect:/showList";
    }


    /**
     * 添加供应商信息
     * @return
     */
    @RequestMapping("insertfile")
    public String insertfile(HttpSession session, File file,Model model){
        Object loginsession = session.getAttribute("loginsession");

        //判断是否登录
        if(loginsession==null){

            String ti = "请先登录";
            model.addAttribute("ti",ti);

            return "Login";
        }
        model.addAttribute("loginsessions", loginsession);
//        if(file!=null){
//            File file1 = (File)session.getAttribute("userSession");
//            //file.setCreatedBy(file.getId());
//        }
//        String code = "BDQN-"+(int) (Math.random()*(999-100)+100);
//        file.setFileCode(code);
//        fileService.insertfile(file);
        return "per-insertFile";
    }
}
