# 航空订票系统

## 需求分析
### 系统的总体设计
本系统采用的CS结构，因此，此系统可分成页面的设计，包括管理员页面和用户页面；业务层的设计，主要是一些关于处理页面发过来业务请求的处理方法。数据层设计，主要是对业务层发来的数据请求的响应。
### 系统功能
**用户端**
1. 用户注册
2. 修改用户信息
3. 查询航班
4. 预订机票
5. 订单改签
6. 退票

**管理员**
1. 航班查询
2. 航班删除
3. 修改航班
4. 添加航班

### 任务详情
#### 会员用户任务详情
**注册**
注册信息：用户名，密码，姓名，身份证号，性别，手机号，电子邮箱，地址，

用户名：由数字、下划线或字母组成，长度为6—16位，

密码：由字母、下划线或数字组成，长度为6—16位，并且两次输入的密码必须一致，

手机号码：为11位

电子邮箱：可选择是否填写

地址：可选择是否填写

**登陆**
登陆账号、密码，验证是否正确，正确则登陆成功，否则失败。

**修改信息**
修改个人信息
**查询**
1） 按出发地、目的地和日期查询
2） 按航班号查询

**订票**
乘客信息（身份证号，姓名，手机号）

机票信息（航班号，出发地，目的地，出发时间，座位号）

**改签**
在已购买的航班起飞两小时之前可办理改签，否则不予受理。

**退票**
取消订单， 

#### 管理员任务详情
**航班查询**
1. 按出发地、目的地和日期查询 多字段查询
2. 按航班号查询

**航班删除**
根据航班号删除，若该航班有乘客则不能删除。

**修改航班**
根据航班号修改，航班号不可修改，可以修改起飞时间

**添加航班**
添加航班信息，航班编号、出发日期不能相同。

## 分析和设计
### 用户登录功能的流程
**用户登陆**
- 功能描述：完成用户登陆
- 输入元素：用户名字、用户密码
- 处理流程：如果数据库中有该用户，登陆系统，没有，返回本页面重新输入

**用户注册**
- 功能描述：完成用户注册
- 输入元素：用户名字、用户密码以及一些相关信息
- 处理流程：如果数据库中没有该用户名，注册成功登陆系统，没有，返回本页面重新输入

### 订票功能流程
- 功能描述：完成用户订票功能
- 输入元素：乘客姓名，身份证号码，订票用户密码等
- 输出元素：订票订单号
- 处理流程：进入乘客信息填写页面中，输入数据通过验证跳转到成功页面，失败返回本页面重新输入

### 退票流程
- 功能描述：完成用户退票功能
- 输入元素：订单编号
- 处理流程：如果数据库中有该订单，跳转到成功提示页面，失败返回本页面重新输入

### 管理员登录流程
- 功能描述：完成管理员登陆功能
- 输入元素：管理员账号，管理员密码
- 处理流程：如果数据库中有该管理员，登陆系统，否则返回本页面重新输入

### 修改航班流程
- 功能描述：完成管理员修改航班的功能
- 输入元素：所要修改航班的信息
- 处理流程：输入的是数据通过验证，跳转到成功提示页面，失败返回本页面重新输入

### 增加航班流程
- 功能描述：完成管理员增加航班的功能 
- 输入元素：所要增加航班的信息
- 处理流程：输入的航班信息通过验证，而且输入的航班编号数据库中不存在，添加成功，否则返回本页面重新输入





