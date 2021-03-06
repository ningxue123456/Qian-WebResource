package org.lilacseeking.Model.DTO;

import lombok.Getter;

/**
 * @Auther: lilacseeking
 * @Date: 2018/8/27 22:57
 * @Description: 用户登录数据传输对象，不可修改
 */
@Getter
public class LoginDTO {

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 手机
     */
    private String mobile;
}
