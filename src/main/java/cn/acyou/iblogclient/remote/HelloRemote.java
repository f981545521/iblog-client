package cn.acyou.iblogclient.remote;

import cn.acyou.iblogclient.hystrix.HelloRemoteHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author youfang
 * @version [1.0.0, 2018-06-22 下午 01:41]
 **/
@FeignClient(name = "spring-cloud-producer", fallback = HelloRemoteHystrix.class)
public interface HelloRemote {

    @RequestMapping(value = "/hello/hello")
    String hello(@RequestParam(value = "name") String name);

}
