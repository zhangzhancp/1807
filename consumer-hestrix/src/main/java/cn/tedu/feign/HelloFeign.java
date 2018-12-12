package cn.tedu.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("provider-hello")
public interface HelloFeign {
	@RequestMapping("/hello/{name}")
	public String hello(@PathVariable("name") String name);
}
