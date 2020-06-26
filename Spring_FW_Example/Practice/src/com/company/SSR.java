package com.company;
abstract class Baap
{
    Baap()
    {
        System.out.println("Baap ka constructor" );
    }
}
public class SSR extends Baap {

    int x;
    private static int k;
    SSR()
    {
        System.out.println("SSR ka constructor");

    }
    public static void main(String[] args) {
	// write your code here
        SSR S1=new SSR();
        //Baap S1=new Baap();
        Baap S2=new SSR();


    }
}
