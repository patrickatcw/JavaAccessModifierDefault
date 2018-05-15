package com.me;

public class Main {

    public static void main(String[] args) {

            //step 3 accessing class defaultmod
        DefaultMod defaultMod = new DefaultMod();

        defaultMod.display();

        System.out.println("----------------------------------");

        //step 6 accessing class defaultmod2
        DefaultMod2 defaultMod2 = new DefaultMod2();

        defaultMod2.display2();

        System.out.println("------------------------------------");

        //step 9 accessing class defaultmod3
        DefaultMod3 defaultMod3 = new DefaultMod3();

        //defaultMod3.display3();
        //no access because it is private

    }

}

//so, when you do not use any access modifier, it is basically public
