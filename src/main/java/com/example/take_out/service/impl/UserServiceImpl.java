package com.example.take_out.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.take_out.entity.User;
import com.example.take_out.mapper.UserMapper;
import com.example.take_out.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements UserService{
}


//从源码中可以看出，@Controller和@Service都派生于@Component
//控制层采用注解@Controller，
//在业务层采用注解@Service

//@Component分析
//该注解是万能的注解，通常加在配置类上。
