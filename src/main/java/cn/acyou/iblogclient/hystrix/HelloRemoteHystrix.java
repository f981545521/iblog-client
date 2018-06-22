package cn.acyou.iblogclient.hystrix;

import cn.acyou.iblogclient.remote.HelloRemote;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 熔断器
 * @author youfang
 * @version [1.0.0, 2018-06-22 下午 03:29]
 **/
@Component
public class HelloRemoteHystrix implements HelloRemote {

    @Override
    public String hello(@RequestParam(value = "name") String name) {
        return "hello ： " + name + ", 你的信息发送到productor失败了。";
    }
}
