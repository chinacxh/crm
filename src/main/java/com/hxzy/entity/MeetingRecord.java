package com.hxzy.entity;

public class MeetingRecord {//会议记录表

    private Integer id;//序号
    private String meetTitle;//会议标题
    private String meetContent;//会议简述
    private String createUserUuid;//会议记录者UUID
    private String createUserName;//会议记录者名称
    private String createTime;//创建时间
    private String joinUserUuids;//会议参加者UUIDS
    private String joinUserNames;//会议记录者名称集
    private String meetTime;//会议时间
    private String meetSpeaker;//会议主讲者
    private String meetFilePath;//附件
    private String powerUserUuids;//权限人员UUIDS
    private String powerUserNames;//权限人员名称集
    private String isStats;//公开状态
    private String auditTime;//审核时间

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMeetTitle() {
        return meetTitle;
    }

    public void setMeetTitle(String meetTitle) {
        this.meetTitle = meetTitle;
    }

    public String getMeetContent() {
        return meetContent;
    }

    public void setMeetContent(String meetContent) {
        this.meetContent = meetContent;
    }

    public String getCreateUserUuid() {
        return createUserUuid;
    }

    public void setCreateUserUuid(String createUserUuid) {
        this.createUserUuid = createUserUuid;
    }

    public String getCreateUserName() {
        return createUserName;
    }

    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getJoinUserUuids() {
        return joinUserUuids;
    }

    public void setJoinUserUuids(String joinUserUuids) {
        this.joinUserUuids = joinUserUuids;
    }

    public String getJoinUserNames() {
        return joinUserNames;
    }

    public void setJoinUserNames(String joinUserNames) {
        this.joinUserNames = joinUserNames;
    }

    public String getMeetTime() {
        return meetTime;
    }

    public void setMeetTime(String meetTime) {
        this.meetTime = meetTime;
    }

    public String getMeetSpeaker() {
        return meetSpeaker;
    }

    public void setMeetSpeaker(String meetSpeaker) {
        this.meetSpeaker = meetSpeaker;
    }

    public String getMeetFilePath() {
        return meetFilePath;
    }

    public void setMeetFilePath(String meetFilePath) {
        this.meetFilePath = meetFilePath;
    }

    public String getPowerUserUuids() {
        return powerUserUuids;
    }

    public void setPowerUserUuids(String powerUserUuids) {
        this.powerUserUuids = powerUserUuids;
    }

    public String getPowerUserNames() {
        return powerUserNames;
    }

    public void setPowerUserNames(String powerUserNames) {
        this.powerUserNames = powerUserNames;
    }

    public String getIsStats() {
        return isStats;
    }

    public void setIsStats(String isStats) {
        this.isStats = isStats;
    }

    public String getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(String auditTime) {
        this.auditTime = auditTime;
    }
}
