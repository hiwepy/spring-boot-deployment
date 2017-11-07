# spring-boot-deployment

deploy spring boot applaction as run script、server、docker




<!-- 第一步：生成可执行的启动脚本 -->
<plugin>  
    <groupId>org.codehaus.mojo</groupId>  
    <artifactId>appassembler-maven-plugin</artifactId>  
</plugin>
<!-- 第二步：通过antrun插件拷贝文件 -->
<plugin>
	<groupId>org.apache.maven.plugins</groupId>
	<artifactId>maven-antrun-plugin</artifactId>
</plugin>
<!-- 第三步：通过docker-maven插件构造Docker镜像 -->
<plugin>
	<groupId>com.spotify</groupId>
	<artifactId>docker-maven-plugin</artifactId>
</plugin>