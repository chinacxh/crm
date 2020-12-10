package com.hxzy.entity;

public class Progress {//进度表

    private Integer id;//序号
    private String uuid;//程序识别号
    private String proTitle;//进度标题
    private String proFilePath;//文件路径
    private Integer proType;//文件类型
    private String createTime;//创建时间
    private String nextStepTime;//下一节点时间
    private String dataUuid;//关联档案UUID
    private String userUuid;//用户UUID
    private String userName;//用户名称

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

    public String getProTitle() {
        return proTitle;
    }

    public void setProTitle(String proTitle) {
        this.proTitle = proTitle;
    }

    public String getProFilePath() {
        return proFilePath;
    }

    public void setProFilePath(String proFilePath) {
        this.proFilePath = proFilePath;
    }

    public Integer getProType() {
        return proType;
    }

    public void setProType(Integer proType) {
        this.proType = proType;
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

    public String getDataUuid() {
        return dataUuid;
    }

    public void setDataUuid(String dataUuid) {
        this.dataUuid = dataUuid;
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
}
