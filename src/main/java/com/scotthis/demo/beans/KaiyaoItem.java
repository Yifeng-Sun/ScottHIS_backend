package com.scotthis.demo.beans;

public class KaiyaoItem {
    private int id;
    private String records_num;
    private String drugName;
    private String state;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRecords_num() {
        return records_num;
    }

    public void setRecords_num(String records_num) {
        this.records_num = records_num;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public KaiyaoItem(int id, String records_num, String drugName, String state) {
        this.id = id;
        this.records_num = records_num;
        this.drugName = drugName;
        this.state = state;
    }
}
