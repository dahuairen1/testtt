package com.util;

public class MysqlPageUtils {
    private Integer page;
    private Integer rows;
    private Integer begin; //limit的偏移位置

    public MysqlPageUtils(Integer page,Integer rows){
        if(page==null || rows == null){
            throw new RuntimeException("com.jd.util.MysqlPageUtils参数为null");
        }
        this.page = page;
        this.rows = rows;
        this.begin = (page-1)*rows;
    }

    public Integer getPage() {
        return page;
    }

    public Integer getRows() {
        return rows;
    }

    public Integer getBegin() {

        return begin;
    }
}
