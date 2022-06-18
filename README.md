# mynews-manager
微服务之新闻管理系统

什么是微服务（MicroService）？
1.  单一职责   微服务中每一个服务都对应唯一的业务功能
2.  微：服务拆分的粒度最小的，每个服务都是完整的系统，独立部署。每个微服务是一个完整ssm系统。
3.  面向服务： 都外统一提供访问接口。比如：restful服务接口。
4. 促进了前后端分离技术的发展
6. 团队的独立性：每个服务可以是一个独立的开发团队，人数不多。

微服务的开发方向：
dubbo
springboot+springcloud
springboot开发独立的微服务系统
springcloud是一个工具集，主要用于治理分布式应用的

springcloud包含很多技术栈。Springcloud Netflex技术栈是最基础：
注册中心   Eureka
负载均衡器   Ribbon
熔断器        Hystrix
网关            Zuul
微服务间访问的客户端   Feign

Eureka注册中心
微服务系统的组成：
服务注册中心
服务提供者
服务消费者
