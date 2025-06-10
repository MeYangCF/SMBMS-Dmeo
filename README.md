# SMBMS-Demo (超市订单管理系统)

## 项目介绍
SMBMS-Demo 是一个基于 Java Web 技术开发的超市订单管理系统演示项目。该系统主要用于管理超市的供应商信息、商品信息、用户管理等核心业务功能。

## 技术栈
- **后端框架**：Java Servlet + JSP
- **数据库**：MySQL
- **项目管理工具**：Maven
- **其他技术**：
  - JSTL（JavaServer Pages Standard Tag Library）
  - FastJSON（JSON 处理）
  - JDBC（数据库连接）

## 功能特性
- 用户管理
  - 用户登录/注销
  - 用户权限控制
  - 用户信息管理
- 供应商管理
  - 供应商信息维护
  - 供应商查询
- 商品管理
  - 商品信息维护
  - 商品查询

## 项目结构
```
SMBMS-Demo
├── src/main/java/com/meyangcf
│   ├── servlet/    # Servlet 控制器
│   ├── service/    # 业务逻辑层
│   ├── dao/        # 数据访问层
│   ├── pojo/       # 实体类
│   ├── util/       # 工具类
│   └── filter/     # 过滤器
├── src/main/resources
│   └── database/   # 数据库相关配置
└── src/main/webapp
    ├── WEB-INF/    # Web 配置文件
    ├── css/        # 样式文件
    ├── js/         # JavaScript 文件
    └── jsp/        # JSP 页面
```

## 环境要求
- JDK 1.8+
- Maven 3.6+
- MySQL 5.7+
- Tomcat 8.5+

## 快速开始
1. 克隆项目到本地
2. 导入数据库脚本（位于 `src/main/resources/database` 目录）
3. 配置数据库连接（修改数据库配置文件）
4. 使用 Maven 构建项目：`mvn clean package`
5. 将生成的 WAR 包部署到 Tomcat
6. 访问系统：`http://localhost:8080/SMBMS-Demo`

## 项目特点
- 采用经典的三层架构设计
- 统一的异常处理机制
- 完善的日志记录
- 规范的代码风格
- 详细的注释说明

## 注意事项
- 本项目为演示版本，仅用于学习参考
- 建议在本地开发环境中运行
- 请确保数据库配置正确

## 贡献指南
欢迎提交 Issue 和 Pull Request 来帮助改进项目。
