package com.monocept.ocp;


public class FixedDeposit {
    private int accountno;
    private String name;
    private double principle;
    private int duration;
    private Festival festivaltype;

    public FixedDeposit(int accountno, String name, double principle, int duration, Festival festivaltype) {
        super();
        this.accountno = accountno;
        this.name = name;
        this.principle = principle;
        this.duration = duration;
        this.festivaltype = festivaltype;
    }

    public int getAccountno() {
        return accountno;
    }

    public void setAccountno(int accountno) {
        this.accountno = accountno;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrinciple() {
        return principle;
    }

    public void setPrinciple(double principle) {
        this.principle = principle;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Festival getFestivaltype() {
        return festivaltype;
    }

    public void setFestivaltype(Festival festivaltype) {
        this.festivaltype = festivaltype;
    }

    public double getInterestRate() {
        switch (festivaltype) {
            case newyear:
                return 8.0;
            case diwali:
                return 8.5;
            case holi:
                return 7.5;
            case others:
            default:
                return 6.5;
        }
    }
    public double calculateSimpleInterest() {
        double interestRate = getInterestRate();
        return (principle * duration * interestRate) / 100;
    }

    
}
