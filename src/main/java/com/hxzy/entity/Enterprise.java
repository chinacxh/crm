package com.hxzy.entity;

public class Enterprise {//企业档案表

    private Integer id;//序号
    private String uuid;//程序识别号
    private String entName;//企业名称
    private String entAddress;//企业地址
    private String entOnePerson;//联系人1
    private String entOnePhone;//电话1
    private String entOneBirthday;//生日1
    private String entTwoPerson;//联系人2
    private String entTwoPhone;//电话2
    private String entTwoBirthday;//生日2
    private String entIndustryOne;//行业大类
    private String entIndustryTwo;//行业子类
    private String entUpstream ;//上游企业
    private String entDownstream ;//下游企业
    private String entStockRight;//股权
    private String entProduct;//产品
    private String entMode;//企业模式
    private String entNeedsUrgent;//紧急需求
    private String entNeedsCommonly;//一般需求
    private String userUuid;//该资源负责人序号
    private String userName;//该资源负责人名称
    private String powerUserName;//权限人员
    private String createTime;//建档时间
    private String lastEditTime;//最后一次编辑时间
    private String entStats;//状态

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

    public String getEntName() {
        return entName;
    }

    public void setEntName(String entName) {
        this.entName = entName;
    }

    public String getEntAddress() {
        return entAddress;
    }

    public void setEntAddress(String entAddress) {
        this.entAddress = entAddress;
    }

    public String getEntOnePerson() {
        return entOnePerson;
    }

    public void setEntOnePerson(String entOnePerson) {
        this.entOnePerson = entOnePerson;
    }

    public String getEntOnePhone() {
        return entOnePhone;
    }

    public void setEntOnePhone(String entOnePhone) {
        this.entOnePhone = entOnePhone;
    }

    public String getEntOneBirthday() {
        return entOneBirthday;
    }

    public void setEntOneBirthday(String entOneBirthday) {
        this.entOneBirthday = entOneBirthday;
    }

    public String getEntTwoPerson() {
        return entTwoPerson;
    }

    public void setEntTwoPerson(String entTwoPerson) {
        this.entTwoPerson = entTwoPerson;
    }

    public String getEntTwoPhone() {
        return entTwoPhone;
    }

    public void setEntTwoPhone(String entTwoPhone) {
        this.entTwoPhone = entTwoPhone;
    }

    public String getEntTwoBirthday() {
        return entTwoBirthday;
    }

    public void setEntTwoBirthday(String entTwoBirthday) {
        this.entTwoBirthday = entTwoBirthday;
    }

    public String getEntIndustryOne() {
        return entIndustryOne;
    }

    public void setEntIndustryOne(String entIndustryOne) {
        this.entIndustryOne = entIndustryOne;
    }

    public String getEntIndustryTwo() {
        return entIndustryTwo;
    }

    public void setEntIndustryTwo(String entIndustryTwo) {
        this.entIndustryTwo = entIndustryTwo;
    }

    public String getEntUpstream() {
        return entUpstream;
    }

    public void setEntUpstream(String entUpstream) {
        this.entUpstream = entUpstream;
    }

    public String getEntDownstream() {
        return entDownstream;
    }

    public void setEntDownstream(String entDownstream) {
        this.entDownstream = entDownstream;
    }

    public String getEntStockRight() {
        return entStockRight;
    }

    public void setEntStockRight(String entStockRight) {
        this.entStockRight = entStockRight;
    }

    public String getEntProduct() {
        return entProduct;
    }

    public void setEntProduct(String entProduct) {
        this.entProduct = entProduct;
    }

    public String getEntMode() {
        return entMode;
    }

    public void setEntMode(String entMode) {
        this.entMode = entMode;
    }

    public String getEntNeedsUrgent() {
        return entNeedsUrgent;
    }

    public void setEntNeedsUrgent(String entNeedsUrgent) {
        this.entNeedsUrgent = entNeedsUrgent;
    }

    public String getEntNeedsCommonly() {
        return entNeedsCommonly;
    }

    public void setEntNeedsCommonly(String entNeedsCommonly) {
        this.entNeedsCommonly = entNeedsCommonly;
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

    public String getPowerUserName() {
        return powerUserName;
    }

    public void setPowerUserName(String powerUserName) {
        this.powerUserName = powerUserName;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getLastEditTime() {
        return lastEditTime;
    }

    public void setLastEditTime(String lastEditTime) {
        this.lastEditTime = lastEditTime;
    }

    public String getEntStats() {
        return entStats;
    }

    public void setEntStats(String entStats) {
        this.entStats = entStats;
    }
}
