package com.nowcoder.community.entity;

public class Page {
    //当前页面，默认为1
    private int current=1;
    //每页最多显示几条记录
    private  int limit=10;
    //记录总数
    private int rows;
    //查询路径
    private String path;

    public int getCurrent() {

        return current;
    }

    public void setCurrent(int current) {
        if(current>1) {
            this.current = current;
        }
    }

    public int getLimit() {

        return limit;
    }

    public void setLimit(int limit) {
        if(limit>=1&&limit<100)
        this.limit = limit;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        if(rows>=0) {
            this.rows = rows;
        }
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
    public  int getOffset(){
        return (current-1)*limit;
    }
    //获取总页数
    public  int getTotal(){
        if(rows%limit==0)
            return rows/limit;
        else
            return rows/limit+1;
    }
    //当前页面的显示的最左面页码
    public  int getFrom(){
        int from=current-2;
        return from>1?from:1;
    }
    public  int getTo(){
        int to=current+2;
        int total=getTotal();
        return to>total?total:to;

    }
}
