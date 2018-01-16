package com.company;

/**
 * Created by ttc on 17-12-22.
 */
public class dice {
    int dice[]=new int [6];
    public void init()
    {
        for(int i=0;i<6;i++){
            dice[i]=i+1;
        }
    }
    public int throwdice()
    {
        int n=(int)(Math.random()*6);
        return dice[n];
    }

}
