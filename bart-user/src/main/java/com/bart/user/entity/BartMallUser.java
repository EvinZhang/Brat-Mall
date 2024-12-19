package com.bart.user.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

@Data
@TableName("bart_mall_user")
@Accessors(chain = true)
public class BartMallUser {

    @TableId(type = IdType.AUTO)
    private Long userId;

    @TableField("user_name")
    private String userName;

    @TableField("password")
    private String password;

    @TableField("email")
    private String email;

    @TableField("role")
    private String role;

    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime registrationTime;

    @TableField(fill = FieldFill.UPDATE)
    private LocalDateTime updateTime;

    @Version
    private Integer version;
    /**
     * 多租户
     * 不用配置实体字段,但是数据库需要该字段
     */
    private Long tenantId;

}
