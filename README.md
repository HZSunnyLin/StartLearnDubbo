# StartLearnDubbo
Project when I learn Dubbo

# 1,dubbo线上部署，必须是一个web工程，可以通过以下两种方式来启动dubbo服务
    #@1，apache tomcat
    #@2，spring boot

# 2,dubbo工程部署时，服务端和消费端一样，也需要在pom.xml中引入接口jar包

# 3,dubbo工程pom.xml需要引入apache tomcat相关的包

# 4,Spring中几个标注组件的注解:

    @Service用于标注业务层组件

    @Controller用于标注控制层组件（如struts中的action）

    @Repository用于标注数据访问组件，即DAO组件

    @Component泛指组件，当组件不好归类的时候，我们可以使用这个注解进行标注。
