package com.example.take_out.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 地址簿
 */
@Data
        //实现Serializable接口是为了序列化
        //序列化是指把对象转换为字节序列的过程，我们称之为对象的序列化，
        // 就是把内存中的这些对象变成一连串的字节(bytes)描述的过程。
        //writeObject   objectOutputStream
        //如将User对象及其携带的数据写入了文本user.txt中

//而反序列化则相反，就是把持久化的字节文件数据恢复为对象的过程
//readObject    objectInputStream
//如将持久化的对象字节流数据通过IO转化为Java对象

public class AddressBook implements Serializable {

//Java官方强烈建议所有要序列化的类都显示地声明serialVersionUID字段，
// 因为如果高度依赖于JVM默认生成serialVersionUID，可能会导致其与编译器的实现细节耦合，
// 这样可能会导致在反序列化的过程中发生意外的InvalidClassException异常。
//为了保证跨不同Java编译器实现的serialVersionUID值的一致，
// 实现Serializable接口的必须显示地声明serialVersionUID字段。
    private static final long serialVersionUID = 1L;//声明为1L, 2L会报错

    private Long id;


    //用户id
    private Long userId;


    //收货人
    private String consignee;


    //手机号
    private String phone;


    //性别 0 女 1 男
    private String sex;


    //省级区划编号
    private String provinceCode;


    //省级名称
    private String provinceName;


    //市级区划编号
    private String cityCode;


    //市级名称
    private String cityName;


    //区级区划编号
    private String districtCode;


    //区级名称
    private String districtName;


    //详细地址
    private String detail;


    //标签
    private String label;

    //是否默认 0 否 1是
    private Integer isDefault;

    //创建时间
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;


    //更新时间
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;


    //创建人
    @TableField(fill = FieldFill.INSERT)
    private Long createUser;


    //修改人
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Long updateUser;


    //是否删除
    private Integer isDeleted;
}
