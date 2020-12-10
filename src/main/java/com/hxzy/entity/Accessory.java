package com.hxzy.entity;

public class Accessory {//附件表

    private Integer id;//序号
    private String uuid;//程序识别号
    private String accTitle;//附件标题
    private String accFilePath;//文件路径
    private Integer accType;//附件类型
    private String createTime;//创建时间
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

    public String getAccTitle() {
        return accTitle;
    }

    public void setAccTitle(String accTitle) {
        this.accTitle = accTitle;
    }

    public String getAccFilePath() {
        return accFilePath;
    }

    public void setAccFilePath(String accFilePath) {
        this.accFilePath = accFilePath;
    }

    public Integer getAccType() {
        return accType;
    }

    public void setAccType(Integer accType) {
        this.accType = accType;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
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
