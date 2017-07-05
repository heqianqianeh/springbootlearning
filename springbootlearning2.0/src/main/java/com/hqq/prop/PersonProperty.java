package com.hqq.prop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * PersonProperty
 * Created by heqianqian on 2017/7/3.
 */
@Component
public class PersonProperty {

    @Value("${com.hqq.name}")
    private String name;
    @Value("${com.hqq.age}")
    private String age;
    @Value("${com.hqq.address}")
    private String address;
    @Value("${com.hqq.desc}")
    private String desc;
    @Value("${com.hqq.value}")
    private String value;
    @Value("${com.hqq.number}")
    private Integer number;
    @Value("${com.hqq.bignumber}")
    private Long bigNumber;
    @Value("${com.hqq.test1}")
    private Integer random1;
    @Value("${com.hqq.test2}")
    private Integer random2;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Long getBigNumber() {
        return bigNumber;
    }

    public void setBigNumber(Long bigNumber) {
        this.bigNumber = bigNumber;
    }

    public Integer getRandom1() {
        return random1;
    }

    public void setRandom1(Integer random1) {
        this.random1 = random1;
    }

    public Integer getRandom2() {
        return random2;
    }

    public void setRandom2(Integer random2) {
        this.random2 = random2;
    }

    @Override
    public String toString() {
        return "PersonProperty{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", address='" + address + '\'' +
                ", desc='" + desc + '\'' +
                ", value='" + value + '\'' +
                ", number=" + number +
                ", bigNumber=" + bigNumber +
                ", random1=" + random1 +
                ", random2=" + random2 +
                '}';
    }
}
