package com.service.DTO;

public class CityDTO {
    private String name;
    private String code;

    public CityDTO() {
    }

    public CityDTO(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "CityDTO{name='" + name + "', code='" + code + "'}";
    }
}
