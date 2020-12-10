package com.hxzy.entity;

public class Industry {//行业表

    private Integer id;//序号
    private String uuid;//程序序号
    private String indName;//部门名称
    private String puuid;//父级程序序号
    private String indRemarks;//备注

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

    public String getIndName() {
        return indName;
    }

    public void setIndName(String indName) {
        this.indName = indName;
    }

    public String getPuuid() {
        return puuid;
    }

    public void setPuuid(String puuid) {
        this.puuid = puuid;
    }

    public String getIndRemarks() {
        return indRemarks;
    }

    public void setIndRemarks(String indRemarks) {
        this.indRemarks = indRemarks;
    }
}
