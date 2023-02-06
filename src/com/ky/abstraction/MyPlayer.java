package com.ky.abstraction;

public class MyPlayer implements Sound,Video{

    public static void main(String[] args) {
        MyPlayer player=new MyPlayer();
        player.play();
    }
    public void play(){
        playSound("hello");
        playVideo();
        System.out.println("Maximum vol: "+Sound.maxVol);
    }

    @Override
    public void playSound(String song) {
        System.out.println("playing "+song+" song");
    }

    @Override
    public void playVideo() {
        System.out.println("playing video");
    }
}
