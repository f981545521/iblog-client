package cn.acyou.iblogclient.controller;

import cn.acyou.iblogclient.remote.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author youfang
 * @version [1.0.0, 2018-06-22 下午 01:37]
 **/
@Controller
@RequestMapping("/hello")
public class HelloController {
    @Autowired
    HelloRemote helloRemote;

    @RequestMapping("/hello/{name}")
    @ResponseBody
    public String index(@PathVariable("name") String name) {
        return helloRemote.hello(name);
    }

}
