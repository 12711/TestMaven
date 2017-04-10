package TestCommons;/**
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 * All Rights Reserved
 */

import java.io.File;

/**
 * @Title:
 * @Description: (描述此类的功能)
 * @author lsm
 * @date 2017-03-28 22:12
 */
public class Test {
    @org.junit.Test
    public void test(){
        File file=new File("C:/Users/LSM/Desktop/testdata\20170401");
         System.out.println("u");
        System.out.println(file==null);
    }
}
