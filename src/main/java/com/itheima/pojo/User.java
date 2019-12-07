package com.itheima.pojo;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

//在编译阶段会根据注解自动生成对应的方法；data包含get/set/hashCode/equals/toString等方法


@Table(name="tb_user")
@Data
public class User {

    @Id
    //开启主键自增回填
    @KeySql(useGeneratedKeys = true)
    private Long id;

    //user_name --> userName
    private String userName;

    private String password;

    private String name;

    private Integer age;

    private Integer sex;

    private Date birthday;

    private String note;

    private Date created;

    private Date updated;

}
