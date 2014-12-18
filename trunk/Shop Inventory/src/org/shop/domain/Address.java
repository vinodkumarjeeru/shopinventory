/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.shop.domain;

import java.util.Objects;

/**
 *
 * @author 3500512
 */
public class Address {

    private Long addressId;
    private String doorNo;
    private String villeageName;
    private String districtName;
    private Long pinCode;
    private String stateName;

    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    public String getDoorNo() {
        return doorNo;
    }

    public void setDoorNo(String doorNo) {
        this.doorNo = doorNo;
    }

    public String getVilleageName() {
        return villeageName;
    }

    public void setVilleageName(String villeageName) {
        this.villeageName = villeageName;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public Long getPinCode() {
        return pinCode;
    }

    public void setPinCode(Long pinCode) {
        this.pinCode = pinCode;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public Address(Long addressId, String doorNo, String villeageName,
            String districtName, Long pinCode, String stateName) {
        this.addressId = addressId;
        this.doorNo = doorNo;
        this.villeageName = villeageName;
        this.districtName = districtName;
        this.pinCode = pinCode;
        this.stateName = stateName;
    }

    public Address() {
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.addressId);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Address other = (Address) obj;
        if (addressId == null) {
            if (other.addressId != null) {
                return false;
            }
        } else if (!addressId.equals(other.addressId)) {
            return false;
        }
        if (districtName == null) {
            if (other.districtName != null) {
                return false;
            }
        } else if (!districtName.equals(other.districtName)) {
            return false;
        }
        if (doorNo == null) {
            if (other.doorNo != null) {
                return false;
            }
        } else if (!doorNo.equals(other.doorNo)) {
            return false;
        }
        if (pinCode == null) {
            if (other.pinCode != null) {
                return false;
            }
        } else if (!pinCode.equals(other.pinCode)) {
            return false;
        }
        if (stateName == null) {
            if (other.stateName != null) {
                return false;
            }
        } else if (!stateName.equals(other.stateName)) {
            return false;
        }
        if (villeageName == null) {
            if (other.villeageName != null) {
                return false;
            }
        } else if (!villeageName.equals(other.villeageName)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Address [addressId=");
        builder.append(addressId);
        builder.append(", doorNo=");
        builder.append(doorNo);
        builder.append(", villeageName=");
        builder.append(villeageName);
        builder.append(", districtName=");
        builder.append(districtName);
        builder.append(", pinCode=");
        builder.append(pinCode);
        builder.append(", stateName=");
        builder.append(stateName);
        builder.append("]");
        return builder.toString();
    }
}
