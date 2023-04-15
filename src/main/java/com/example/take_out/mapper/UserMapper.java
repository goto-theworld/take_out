package com.example.take_out.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.take_out.entity.User;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.apache.ibatis.annotations.Mapper;

@Mapper //mybatis注解@Mapper，为了不再写mapper映射文件
//添加了@Mapper注解之后这个接口在编译时会生成相应的实现类
// * 需要注意的是：这个接口中不可以定义同名的方法，因为会生成相同的id
// * 也就是说这个接口是不支持重载的


//mybatisPlus,定义数据层接口与映射配置，继承BaseMapper
public interface UserMapper extends BaseMapper<User>{
}




// 实体类开发————使用Lombok快速制作实体类,
//常用注解@Data,为当前实体类在编译期设置对应的get/set方法，，，
// ，，，toString方法，hashCode方法，equals方法等
//@AllArgsConstructor,全部参数的注解
//@NoArgsConstructor，无参的注解

// Dao开发————整合MyBatisPlus，制作数据层测试类
// Service开发————基于MyBatisPlus进行增量开发，制作业务层测试类
// Controller开发————基于Restful开发，使用PostMan测试接口功能
// Controller开发————前后端开发协议制作


// 页面开发————基于VUE+ElementUI制作，前后端联调，页面数据处理，页面消息处理
    // 列表、新增、修改、删除、分页、查询


// 项目异常处理
// 按条件查询————页面功能调整、Controller修正功能、Service修正功能