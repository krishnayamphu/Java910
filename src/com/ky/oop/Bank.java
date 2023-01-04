package com.ky.oop;

public class Bank {
    private String name;
    private String address;
    public Bank(){
//        this.name = "ABC Bank";
//        this.address = "KTM, Nepal";
    }
//    public Bank(Bank bank){
//        System.out.println("Bank name: " + bank.name);
//        System.out.println("Bank address: " + bank.address);
//    }


    public void getBankInfo(Bank bank) {
        System.out.println("Bank name: " + bank.name);
        System.out.println("Bank address: " + bank.address);
    }

    public void show() {
        this.name = "ABC Bank";
        this.address = "KTM, Nepal";
        getBankInfo(this);
    }

    public Bank getBank() {
        return this;
    }

    public static void main(String[] args) {
        Bank bank=new Bank();
        bank.show();
        System.out.println("===========");
        new Bank().getBank().show();

    }

}
