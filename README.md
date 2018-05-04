# 介绍
`watchdog-framework`基于SpringBoot+Shiro+Mybatis+Mybatis-Plus+HikariCP+Redis+Vue+iView等开发的轻量级管理系统快速开发脚手架，拥有角色、用户、资源管理、同时数据更新时关联的用户相应的权限也会实时更新，并且此项目会进行持续更新升级，欢迎使用，若对你有帮助请点击上方的star :beers: 。
# 在线演示

[https://wdog-web.licoy.cn](https://wdog-web.licoy.cn)

- 用户名：test
- 密码：test123456

# 部分界面展示
## 登录
![登录](dist/login.png)
## 用户管理
![用户管理](dist/user.png)
## 用户管理
![用户管理](dist/user.png)
## 用户添加
![用户添加](dist/add-user.png) 
## 角色管理
![角色管理](dist/role.png) 
## 角色添加
![角色添加](dist/add-role.png) 
## 资源管理
![用户添加](dist/resource.png) 
## 资源添加
![资源管理](dist/add-resource.png)    
## 更多请查看上方演示
# 技术选型
## 后端技术
技术 | 类型 | 版本 | 官网
----|------|----|----
Spring Boot | 容器 | 1.5.12.RELEASE | [http://start.spring.io/](http://start.spring.io/)
Mybatis-Starter | ORM框架 | 1.3.1 |  [http://www.mybatis.org](http://www.mybatis.org)
Mybatis-Plus | ORM框架 | 1.3.1 |  [http://mp.baomidou.com/](http://mp.baomidou.com/)
Maven | 项目构建管理 | 4.0.0 |  [http://maven.apache.org](http://maven.apache.org/)
Apache Shiro | 安全框架 | 1.3.2 |  [http://shiro.apache.org](http://www.mybatis.org/generator/index.html)
Lombok | 工具 | 1.16.20 |  [https://www.projectlombok.org/](https://www.projectlombok.org/)
HikariCP | 数据库连接池 | 2.7.8 |  [http://brettwooldridge.github.io/HikariCP/](http://brettwooldridge.github.io/HikariCP/)
Shiro-Redis | shiro缓存工具 | 2.8.24 | [https://github.com/alexxiyang/shiro-redis](https://github.com/alexxiyang/shiro-redis)
Springfox-Swagger2 | api文档工具 | 2.7.0 | [https://github.com/springfox/springfox](https://github.com/springfox/springfox)
jedis | redis管理 | 2.9.0 | [https://github.com/xetorthio/jedis](https://github.com/xetorthio/jedis)
jwt | 身份认证 | 3.2.0 | [https://jwt.io/](https://jwt.io/)
## 前端技术
技术 | 类型 | 版本 | 官网
----|------|----|----
Vue | 前端渐进式框架 | 2.5.13 | [https://cn.vuejs.org/](https://cn.vuejs.org/)
Vue-Router | 前端路由 | 3.0.1 | [https://router.vuejs.org/](https://router.vuejs.org/)
Vuex | 前端状态管理 | 3.0.1 | [https://vuex.vuejs.org/](https://vuex.vuejs.org/)
Axios | HTTP库 | 0.18.0 | [https://github.com/axios/axios](https://github.com/axios/axios)
iView | UI框架 | 2.8.0 | [https://www.iviewui.com/](https://www.iviewui.com/)
dayjs | JS时间操作库 | 1.5.14 | [https://github.com/xx45/dayjs](https://github.com/xx45/dayjs)
String-Format | 字符串格式化 | 1.0.0 | [https://github.com/davidchambers/string-format](https://github.com/davidchambers/string-format)
Vue-table-with-tree-grid | iview-树表格 | 0.2.4 | [https://github.com/MisterTaki/vue-table-with-tree-grid](https://github.com/MisterTaki/vue-table-with-tree-grid)
js-md5 | js-md5库 | 0.7.3 | [https://github.com/emn178/js-md5](https://github.com/emn178/js-md5)

# 使用方法
## 软件需求
    JDK1.8+
    MySQL5.6+
    Maven4.0+
## 服务端
- 克隆到本地
```git
git clone git@github.com:watchdog-framework/watchdog-framework.git
```
- 导入SQL

    将项目根目录下的`wdog.sql`导入至数据库信息
    > admin默认密码为：123456
- 修改数据库信息
```yml
# application.yml
spring:
  datasource:
    url: jdbc:mysql://localhost:3306/wdog?useUnicode=yes&characterEncoding=UTF8
    password: root
    username: root
    driver-class-name: com.mysql.jdbc.Driver
```
- 启动
    
    运行`WatchDogApplication.java`，默认端口为1000
 

# 项目地址

- Github：[https://github.com/yuwinter/watchdog-framework](https://github.com/yuwinter/watchdog-framework)

# 开源协议
MIT
    
