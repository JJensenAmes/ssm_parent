package com.dl.controller;

import com.dl.entity.Option;
import com.dl.entity.Subject;
import com.dl.service.OptionService;
import com.dl.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class VoteController {
    @Autowired
    private SubjectService subjectService;
    @Autowired
    private OptionService optionService;

   @RequestMapping("/view.do")
    public String view(HttpServletRequest request){
       List<Subject> list = subjectService.findSub();
       Collections.sort(list);
       request.setAttribute("list",list);
       return "index";
   }

    @RequestMapping("/tovote.do")
    public String tovote(HttpServletRequest request){
        String status = request.getParameter("status");
        if(status!=null) {
           if (status.equals("hide")) {
               request.setAttribute("status", status);
           } else {
               status = "show";
               request.setAttribute("status", status);
           }
       }
       Map<String,Object> result=new HashMap<>();
       int id=Integer.parseInt(request.getParameter("id"));
         Subject sub= subjectService.updateView(id);
        List<Option> oplist = optionService.findBySid(id);
        result.put("sub",sub);
        result.put("oplist",oplist);
        request.setAttribute("result",result);
        return "vote";
    }

    @RequestMapping("/dovote.do")
    public String dovote(int id,String option ,HttpServletRequest request){
       optionService.updateVote(id,option);
       subjectService.updateTotalVotes(id);
        return onlyView(request);
    }

    @RequestMapping("/onlyView.do")
    public String onlyView(HttpServletRequest request){
        String status = request.getParameter("status");
        if(status!=null) {
            if (status.equals("hide")) {
                request.setAttribute("status", status);
            } else {
                status = "show";
                request.setAttribute("status", status);
            }
        }
        Map<String,Object> result=new HashMap<>();
        int id=Integer.parseInt(request.getParameter("id"));
        Subject sub= subjectService.updateView(id);
        List<Option> oplist = optionService.findBySid(id);
        result.put("sub",sub);
        result.put("oplist",oplist);
        request.setAttribute("result",result);
        return "comvote";
    }
}
