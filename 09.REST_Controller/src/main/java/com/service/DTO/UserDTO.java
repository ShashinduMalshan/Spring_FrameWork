package com.service.DTO;

public class UserDTO {

    private String uId;
    private String uName;
    private String uAddress;
    private CityDTO uCity;  // add this field

    public UserDTO() {
    }

    public UserDTO(String uAddress, String uId, String uName, CityDTO uCity) {
        this.uAddress = uAddress;
        this.uId = uId;
        this.uName = uName;
        this.uCity = uCity;
    }

    // getters and setters

    public String getuAddress() {
        return uAddress;
    }

    public void setuAddress(String uAddress) {
        this.uAddress = uAddress;
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public CityDTO getuCity() {
        return uCity;
    }

    public void setuCity(CityDTO uCity) {
        this.uCity = uCity;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "uAddress='" + uAddress + '\'' +
                ", uId='" + uId + '\'' +
                ", uName='" + uName + '\'' +
                ", uCity=" + uCity +
                '}';
    }
}
