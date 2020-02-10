# 启动项目
##  1 自行新建mysql数据库，导入smart-boot项目中的src\main\resources\sql\smart.sql
##  2 启动顺序
    smart-cloud-register
    smart-cloud-config
    smart-cloud-auth
    smart-cloud-service
    smart-cloud-gateway
#  测试
##  1获取token   
    [POST] http://localhost:8080/auth/oauth/token
        Header:{
            Authorization: Basic c2VydmljZToxMjM=
        }
        Body:{
            grant_type: password
            username: admin
            password: 123456
        }
##  2 获取数据
    [GET] http://localhost:8080/service/user
        Header:{
            Authorization: Bearer [1中获取的token码]
        }
        