package com.hxzy.entity;

public class User {//用户表

    private Integer id;//序号
    private String uuid;//程序序号
    private String loginName;//登录名称
    private String loginPassword;//登录密码
    private String userRealName;//用户真实名称
    private String userNickName;//用户昵称
    private String userContactPhone;//联系电话
    private String userContactAddress;//联系地址

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }

    public String getUserRealName() {
        return userRealName;
    }

    public void setUserRealName(String userRealName) {
        this.userRealName = userRealName;
    }

    public String getUserNickName() {
        return userNickName;
    }

    public void setUserNickName(String userNickName) {
        this.userNickName = userNickName;
    }

    public String getUserContactPhone() {
        return userContactPhone;
    }

    public void setUserContactPhone(String userContactPhone) {
        this.userContactPhone = userContactPhone;
    }

    public String getUserContactAddress() {
        return userContactAddress;
    }

    public void setUserContactAddress(String userContactAddress) {
        this.userContactAddress = userContactAddress;
    }
}
