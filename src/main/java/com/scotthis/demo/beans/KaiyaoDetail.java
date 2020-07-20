package com.scotthis.demo.beans;

public class KaiyaoDetail {
    private int id;
    private String pName;
    private String idCardNum;
    private String dName;
    private float price;
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "KaiyaoDetial{" +
                "id=" + id +
                ", pName='" + pName + '\'' +
                ", idCareNum='" + idCardNum + '\'' +
                ", dName='" + dName + '\'' +
                ", price=" + price +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getIdCardNum() {
        return idCardNum;
    }

    public void setIdCardNum(String idCardNum) {
        this.idCardNum = idCardNum;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public KaiyaoDetail(int id, String pName, String idCardNum, String dName) {
        this.id = id;
        this.pName = pName;
        this.idCardNum = idCardNum;
        this.dName = dName;
        this.price = 10;
        this.state = "未缴费";
    }
}
