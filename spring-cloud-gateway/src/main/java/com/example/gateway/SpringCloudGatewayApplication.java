package com.example.gateway;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.WebFilter;

/**
 * @author 丁国钊
 * @date 2022-12-29
 */
@RestController
@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudGatewayApplication {
	@Value("${test.uri}")
	private String uri;

	/**
	 * 过滤 server.servlet.context-path 属性配置的项目路径，防止对后续路由策略产生影响，因为 gateway 网关不支持 servlet
	 */
	@Bean
	@Order(-1)
	public WebFilter apiPrefixFilter()
	{
		return (exchange, chain) ->
		{
			ServerHttpRequest request = exchange.getRequest();
			String path = request.getURI().getRawPath();

			path = path.startsWith(uri) ? path.replaceFirst(uri, "") : path;
			ServerHttpRequest newRequest = request.mutate().path(path).build();

			return chain.filter(exchange.mutate().request(newRequest).build());
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudGatewayApplication.class, args);
	}

}
