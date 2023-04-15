package com.example.take_out.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.take_out.entity.SetmealDish;
import com.example.take_out.mapper.SetmealDishMapper;
import com.example.take_out.service.SetmealDishService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j  //lombok注解:添加该注解后，可以在代码中直接使用log.info( ) 打印日志
public class SetmealDishServiceImpl extends ServiceImpl<SetmealDishMapper,SetmealDish> implements SetmealDishService {
}
