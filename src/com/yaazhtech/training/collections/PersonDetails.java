package com.yaazhtech.training.collections;

import java.util.Objects;

public class PersonDetails { //200
    private String panCardNo; // "ABCDDS34If" // hashcode
    private String name;
    private String address;
    private String accountInfo;
    private String familyInfo;
    private String medicalInfo;
    private String assets;
    private String educationInfo;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PersonDetails)) return false;
        PersonDetails that = (PersonDetails) o;
        return Objects.equals(panCardNo, that.panCardNo) && Objects.equals(name, that.name) && Objects.equals(address, that.address) && Objects.equals(accountInfo, that.accountInfo) && Objects.equals(familyInfo, that.familyInfo) && Objects.equals(medicalInfo, that.medicalInfo) && Objects.equals(assets, that.assets) && Objects.equals(educationInfo, that.educationInfo);
    }

    @Override
    public int hashCode() {
        return 95;
    }
}


