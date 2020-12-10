package com.hxzy.entity;

public class Module {//模块表

    private Integer id;//序号
    private String uuid;//程序序号
    private String moduleName;//名称
    private Integer moduleType;//类型
    private Integer moduleLevel;//等级/层级
    private String puuid;//父级程序序号
    private String moduleRemarks;//备注

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

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public Integer getModuleType() {
        return moduleType;
    }

    public void setModuleType(Integer moduleType) {
        this.moduleType = moduleType;
    }

    public Integer getModuleLevel() {
        return moduleLevel;
    }

    public void setModuleLevel(Integer moduleLevel) {
        this.moduleLevel = moduleLevel;
    }

    public String getPuuid() {
        return puuid;
    }

    public void setPuuid(String puuid) {
        this.puuid = puuid;
    }

    public String getModuleRemarks() {
        return moduleRemarks;
    }

    public void setModuleRemarks(String moduleRemarks) {
        this.moduleRemarks = moduleRemarks;
    }
}
