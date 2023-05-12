package com.ruoyi.pill.domain;

import com.ruoyi.common.core.domain.BaseEntity;

public class PillFactory extends BaseEntity {
    private static final long serialVersionUID = 1L;
    private Long factoryId;
    private String factoryName;
    private String factoryCode;
    private String contact;
    private String phone;
    private String keyword;
    private String status;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getFactoryId() {
        return factoryId;
    }

    public void setFactoryId(Long factoryId) {
        this.factoryId = factoryId;
    }

    public String getFactoryName() {
        return factoryName;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }

    public String getFactoryCode() {
        return factoryCode;
    }

    public void setFactoryCode(String factoryCode) {
        this.factoryCode = factoryCode;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "PillFactory{" +
                "factoryId=" + factoryId +
                ", factoryName='" + factoryName + '\'' +
                ", factoryCode='" + factoryCode + '\'' +
                ", contact='" + contact + '\'' +
                ", phone='" + phone + '\'' +
                ", keyword='" + keyword + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
