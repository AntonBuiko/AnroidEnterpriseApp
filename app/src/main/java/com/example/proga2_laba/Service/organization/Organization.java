package com.example.proga2_laba.Service.organization;

public enum Organization {
    BELSTU(8),
    BELGUIR(6),
    BENTY(6);

    Organization(int rating){
        this.count = count;
        this.rating = rating;
    }

    private int count;
    private int rating;

    public int getCount(){
        return count;
    }

    public void setCount(int count){
        this.count = count;
    }

    public int getRating() {
        return rating;
    }
}
