# spring-boot-deployment

##### 通过Maven插件将 Spring-boot 应用发布成可脚本执行、可安装成服务的部署目录结构；
##### 也可以通过Maven插件构建Docker镜像


###### 第一步：生成可执行的启动脚本
```xml
<plugin>  
    <groupId>org.codehaus.mojo</groupId>  
    <artifactId>appassembler-maven-plugin</artifactId>  
</plugin>
```
[![最终生成的目录结构](https://github.com/vindell/spring-boot-deployment/blob/master/images/deploy.png "生成目录结构")](https://github.com/vindell/spring-boot-deployment/blob/master/images/deploy.png "生成目录结构")
###### 第二步：通过antrun插件拷贝文件
```xml
<plugin>
	<groupId>org.apache.maven.plugins</groupId>
	<artifactId>maven-antrun-plugin</artifactId>
</plugin>
```
###### 第三步：通过docker-maven插件构造Docker镜像
```xml
<plugin>
	<groupId>com.spotify</groupId>
	<artifactId>docker-maven-plugin</artifactId>
</plugin>
```