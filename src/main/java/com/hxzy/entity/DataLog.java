package com.hxzy.entity;

public class DataLog {//资源操作日志表

    private Integer id;//序号
    private String userUuid;//用户UUID
    private String userName;//用户名称
    private String operateTime;//操作时间
    private String dataUuid;//资源UUID
    private String originalContent;//原始内容
    private String latestContent;//更改后的内容
    private String operateRemarks;//操作备注
    private String logType;//日志类型

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(String operateTime) {
        this.operateTime = operateTime;
    }

    public String getDataUuid() {
        return dataUuid;
    }

    public void setDataUuid(String dataUuid) {
        this.dataUuid = dataUuid;
    }

    public String getOriginalContent() {
        return originalContent;
    }

    public void setOriginalContent(String originalContent) {
        this.originalContent = originalContent;
    }

    public String getLatestContent() {
        return latestContent;
    }

    public void setLatestContent(String latestContent) {
        this.latestContent = latestContent;
    }

    public String getOperateRemarks() {
        return operateRemarks;
    }

    public void setOperateRemarks(String operateRemarks) {
        this.operateRemarks = operateRemarks;
    }

    public String getLogType() {
        return logType;
    }

    public void setLogType(String logType) {
        this.logType = logType;
    }
}
