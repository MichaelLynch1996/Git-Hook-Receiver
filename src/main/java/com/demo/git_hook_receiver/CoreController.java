package com.demo.git_hook_receiver;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CoreController {

    /**
     *
     * Receiver endpoint on localhost:9000
     *
     * @return Main Page
     */
    @RequestMapping(value = "/receiver", method = {RequestMethod.POST})
    public String index() {
        System.out.println("Code change received");
        return "main";
    }

}
