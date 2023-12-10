# 项目结构
```
├─java
│  ├─org
│  │  └─example
│  │          Main.java
│  │          
│  └─plant
│      ├─Controller  每个人单独一个/多个类
│      │      LoginController.java
│      │      
│      ├─dao 
│      │      UserDao.java
│      │      UserMapperDelete.xml
│      │      UserMapperInsert.xml
│      │      UserMapperSelect.xml
│      │      UserMapperUpdate.xml
│      │      
│      ├─entity
│      │  ├─JavaBean
│      │  │      Device.java
│      │  │      Drug.java
│      │  │      Image.java
│      │  │      Indicator.java
│      │  │      Pest.java
│      │  │      Plant.java
│      │  │      Species.java
│      │  │      Task.java
│      │  │      User.java
│      │  │      
│      │  ├─Mapping
│      │  │      DeviceIndicator.java
│      │  │      ManagerTask.java
│      │  │      MethodDrug.java
│      │  │      MonitorResult.java
│      │  │      PestMethod.java
│      │  │      SolvePestMethod.java
│      │  │      SpeciesPest.java
│      │  │      StaffTask.java
│      │  │      TaskMethod.java
│      │  │      
│      │  └─Turple 
│      └─util 
│              PopWindow.java  负责弹窗
│              Result.java   返回结构
│              
├─resources
│      log4j.properties
│      mybatis-config.xml
│      springmvc-servlet.xml
│      
└─web
    │  index.jsp
    │  
    ├─jsp
    │      index1.jsp
    │      
    └─WEB-INF
            web.xml
```            
