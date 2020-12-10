package com.hxzy.entity;

public class Project {//项目表

    private Integer id;//序号
    private String uuid;//程序识别号
    private String proName;//项目名称
    private String entUuid;//企业UUID
    private String entName;//企业名称
    private String userUuid;//责任人序号
    private String userName;//责任人名称
    private String createTime;//创建时间
    private String nextStepTime;//下一节点时间
    private String teamMembers;//小组成员
    private Integer proStats;//状态
    private String proRemarks;//项目描述

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

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public String getEntUuid() {
        return entUuid;
    }

    public void setEntUuid(String entUuid) {
        this.entUuid = entUuid;
    }

    public String getEntName() {
        return entName;
    }

    public void setEntName(String entName) {
        this.entName = entName;
    }

    public String getUserUuid() {
        return userUuid;
    }

    public void setUserUuid(String userUuid) {
        this.userUuid = userUuid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getNextStepTime() {
        return nextStepTime;
    }

    public void setNextStepTime(String nextStepTime) {
        this.nextStepTime = nextStepTime;
    }

    public String getTeamMembers() {
        return teamMembers;
    }

    public void setTeamMembers(String teamMembers) {
        this.teamMembers = teamMembers;
    }

    public Integer getProStats() {
        return proStats;
    }

    public void setProStats(Integer proStats) {
        this.proStats = proStats;
    }

    public String getProRemarks() {
        return proRemarks;
    }

    public void setProRemarks(String proRemarks) {
        this.proRemarks = proRemarks;
    }
}
