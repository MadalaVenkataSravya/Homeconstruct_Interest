package com.epam.Homeconstruct_Interest;
import java.lang.Math;
public class Interest extends Clientinterest{
	float a,b;
	public float simpleinterest(int principal,int time,float rate) {
		a=((principal*time*rate)/100);
		return a;
	}
    public float compoundinterest(int principal,int time,float rate) {
    	b=(float)(principal*Math.pow(1+(rate/100),time));
    	return b;
    }
}
