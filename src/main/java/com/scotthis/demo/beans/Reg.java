package com.scotthis.demo.beans;

import java.sql.Date;

public class Reg {

//    records_num: 100001,
//    name: "李大牛",
//    idCardNum: "209384719998475091",
//    regTime: "2020-07-01",
//    department: "内科",
//    doctor: "华佗",
//    state: "未诊断"

    private int id; // db

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

//    newReg.records_num = this.records_num
//    newReg.pName = this.name
//    newReg.sex = this.sex
//    newReg.idCardNum = this.idCardNum
//    newReg.Birthday = this.Birthday
//    newReg.age = this.age
//    newReg.homeAddress = this.homeAddress
//    newReg.department_type_id = this.department_type_id
//    newReg.department_id = this.department_id
//    newReg.reg_level_id = this.reg_level_id
//    newReg.doctor_id = this.doctor_id
//
    private int records_num;
    private String name;
    private String sex;
    private String idCardNum;
    private Date birthday;
    private int age;
    private String homeAddress;
    private String department_type_id;
    private Date regTime;
    private String department_id;
    private String doctor_id;
    private String state;

    public Reg(int id, int records_num, String name, String sex, String idCardNum, Date birthday, int age, String homeAddress, String department_type_id, Date regTime, String department_id, String doctor_id, String state) {
        this.id = id;
        this.records_num = records_num;
        this.name = name;
        this.sex = sex;
        this.idCardNum = idCardNum;
        this.birthday = birthday;
        this.age = age;
        this.homeAddress = homeAddress;
        this.department_type_id = department_type_id;
        this.regTime = regTime;
        this.department_id = department_id;
        this.doctor_id = doctor_id;
        this.state = state;
        System.out.println("New reg constructed");
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getDepartment_type_id() {
        return department_type_id;
    }

    public void setDepartment_type_id(String department_type_id) {
        this.department_type_id = department_type_id;
    }

    public int getRecords_num() {
        return records_num;
    }

    public void setRecords_num(int records_num) {
        this.records_num = records_num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdCardNum() {
        return idCardNum;
    }

    public void setIdCardNum(String idCardNum) {
        this.idCardNum = idCardNum;
    }

    public Date getRegTime() {
        return regTime;
    }

    public void setRegTime(Date regTime) {
        this.regTime = regTime;
    }

    public String getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(String department_id) {
        this.department_id = department_id;
    }

    public String getDoctor_id() {
        return doctor_id;
    }

    public void setDoctor_id(String doctor_id) {
        this.doctor_id = doctor_id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Reg{" +
                "id=" + id +
                ", records_num=" + records_num +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", idCardNum='" + idCardNum + '\'' +
                ", birthday=" + birthday +
                ", age=" + age +
                ", homeAddress='" + homeAddress + '\'' +
                ", department_type_id='" + department_type_id + '\'' +
                ", regTime=" + regTime +
                ", department_id='" + department_id + '\'' +
                ", doctor_id='" + doctor_id + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
