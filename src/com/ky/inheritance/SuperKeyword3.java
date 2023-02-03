package com.ky.inheritance;
class Bank{
    public String name,branch;
    public Bank(String name, String branch){
        this.name=name;
        this.branch=branch;
    }
}

class NMB extends Bank{
    String address;
    public NMB(String name, String branch,String address){
        super(name,branch);
        this.address=address;
    }
    public void bankInfo(){
        System.out.println("Bank Name: "+name);
        System.out.println("Bank Branch: "+branch);
        System.out.println("Bank Address: "+address);
    }
}

public class SuperKeyword3 {
    public static void main(String[] args) {
        NMB bank=new NMB("NMB","Ktm","Ktm");
        bank.bankInfo();
    }
}
