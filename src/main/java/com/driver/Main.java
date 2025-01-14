package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly rwonly = new RWOnly();

        rwonly.setName("Birender");

                System.out.println(rwonly.getName());
                // 'name' has private access in 'com. driver. RWOnly'


    }
  
}