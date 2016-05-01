package com.example.caiqiujun.model;

import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * Created by caiqiujun on 16/4/18.
 */
public class Project {
    /// 项目类型
    private String type;
    /// 项目名称
    private String name;
    /// 标签列表
    private ArrayList<String> labels;
    /// 所属地区
    private String address;
    /// 时间
    private String time;

    // 空构造
    public Project() {

    }
    // 满构造
    public Project(String type, String name, ArrayList<String> labels, String address, String time) {
        this.type = type;
        this.name = name;
        this.labels = labels;
        this.address = address;
        this.time = time;
    }

    // get And set 方法
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getLabels() {
        return labels;
    }

    public void setLabels(ArrayList<String> labels) {
        this.labels = labels;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
