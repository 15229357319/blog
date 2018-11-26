package com.porsche.xuhao.blog.controller.admin;

import com.porsche.xuhao.blog.entity.User;
import com.porsche.xuhao.blog.service.UserService;
import com.porsche.xuhao.blog.utils.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;

/**
 * @author Xu hao
 * @Description 后台登录Controller
 * @Version 1.0
 * Email 15229357319@sina.cn
 * create on 2018/11/13
 */
@Controller
@RequestMapping("/admin")
public class LoginController {

    @Autowired
    private UserService userService;

    @GetMapping
    public String loginPage(){
        return "admin/login";
    }

    /**
     * @Author Xu hao
     * @Description 登录
     * @Date 2018/11/13 23:46
     * @param username 用户名
     * @param password 密码
     * @param session session
     * @param attributes attribute
     * @return java.lang.String
     **/
    @PostMapping("/login")
    public String login(@RequestParam String username,
                        @RequestParam String password,
                        HttpSession session,
                        RedirectAttributes attributes){
        User user = userService.checkUser(username, MD5Utils.code(password));
        if (null != user){
            user.setPassword(null);
            session.setAttribute("user", user);
            return "admin/index";
        }
        attributes.addFlashAttribute("message", "用户名或密码错误");
        // 重定向到登录页
        return "redirect:/admin";
    }

    /**
     * @Author Xu hao
     * @Description 注销
     * @Date 2018/11/17 20:52
     * @param session
     * @return java.lang.String
     **/
    @GetMapping("/logout")
    public String logOut(HttpSession session){
        session.removeAttribute("user");
        return "redirect:/admin";
    }

}
