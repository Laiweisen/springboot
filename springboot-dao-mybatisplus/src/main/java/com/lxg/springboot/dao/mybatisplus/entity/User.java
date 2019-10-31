package com.lxg.springboot.dao.mybatisplus.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;

import java.io.Serializable;


/**
 * @Description: 用户实体类
 * @Author: XIANGUO LI
 * @Date: 2019-10-28 17:33
 */
@TableName("t_user")
@Data
public class User implements Serializable {
    /** id */
    private String id;
    /** 姓名 */
    private String name;
    /** 年龄 */
    private Integer age;
}
