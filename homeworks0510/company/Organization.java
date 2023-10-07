package org.example.homeworks0510.company;

public class Organization {
    private String orgName;
    private String depName;

    public Organization(String orgName, String depName) {
        this.orgName = orgName;
        this.depName = depName;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }
}
