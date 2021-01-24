package com.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class RedirectController {

    private static final Logger logger = LoggerFactory.getLogger(RedirectController.class);

    @RequestMapping("/doE")
    public String doE(RedirectAttributes redirectAttributes){

        logger.info("/doE called and redirect to /doF");
        redirectAttributes.addAttribute("msg", "this is the message with redirected");

        return "redirect:/doC";
    }

}
