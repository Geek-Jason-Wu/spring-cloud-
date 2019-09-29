一、什么是微服务架构
        微服务是系统架构上的一种设计风格，它的主旨是将一个原本独立的系统拆分成多个小型服务，这些小型服务都在各自独立的进程中运行，服务之间通过基于HTTP的restful API进行相互通信。
    被拆分成的每一个小型服务都围绕着系统中的某一项或一些耦合度较高的业务功能进行构建，并且每一个服务都维护这自身的数据存储、业务开发、自动化测试案例以及独立部署机制。

    微服务与单体系统的区别
            在以往传统的企业系统架构中，我们针对一个复杂的业务需求使用对象或业务类型来构建一个单体项目。但是，随着系统应对不同的业务需求会不断为该单体项目增加不同的业务模块使得
        单体应用变得越来越臃肿。我们往往修改一个小功能，为了部署上线会影响其他功能的运行。
            为了解决单体系统变得庞大臃肿之后产生的难以维护的问题，我们将系统中不同功能模块拆分成多个不同的服务，这些服务能够独立部署和扩展。

二、spring Cloud简介
        springCloud是一个基于springboot实现的微服务架构开发工具。它为微服务架构中涉及的配置管理、服务治理、断路器、智能路由、微代理、控制总线、全局锁、决策竞选、分布式会话和集
    群状态管理等操作提供了一种简单的开发方式。
        spring Cloud包含了多个子项目：
            spring Cloud Config:配置管理工具，支持使用Git存储配置内容，可以使用它实现应用配置的外部化存储，并支持客户端配置信息刷新、加密、解密配置内容等。
            spring Cloud NetFix:核心组件，
                Eureka:服务治理组件，包含服务注册中心、服务注册与发现机制的实现。
                Hystrix:容错管理组件，实现断路器模式，帮助服务依赖中出现的延迟和为故障提供强大的容错能力。
                Ribbon:客户端负载均衡的服务调用组件。
                Feign:基于Ribbon和Hystrix的声明式服务调用组件。
                Zuul:网关组件，提供智能路由、访问过滤等功能。
                Archaius:外部化配置组件。
            spring Cloud Bus:事件、消息总线，用于传播集群中的状态变化或事件，已触发后续的处理。
            spring Cloud Cluster:正对zookeeper、Redis、Consul的选举算法和通用状态模式的实现。
            spring Cloud CloudFoundry:与PivotalCloudFoundry的整合支持。
            spring Cloud Consul:服务发现与配置管理工具。
            spring Cloud Stream:通过Redis、Rabbit或者Kafka实现的消费微服务，可以通过简单的声明式模型来发送和接收消息。
            spring Cloud AWS:用于简化整合Amazon Web Service的组件。
            spring Cloud Security:安全工具包，提供在Zuul代理中对OAuth2客户端请求的中继器。
            spring Cloud Sleuth:Spring Cloud应用的分布式跟踪实现。
            spring Cloud Zookeeper:基于zookeeper的服务发现与配置管理组件。
            spring Cloud Starters:Spring Cloud的基础组件，基于spring Boot风格项目的基础依赖模块。
