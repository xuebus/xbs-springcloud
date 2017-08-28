package com.zhaopin.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by SYJ on 2017/8/25.
 */
public class GetCompanyInfoDto {
    @JsonProperty("CompanyId")
    private long companyId;
    @JsonProperty("ParentId")
    private long parentId;
    @JsonProperty("CompanyName")
    private String companyName;

    public long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public long getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
