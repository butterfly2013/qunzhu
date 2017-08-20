package com.butterfly.qunzhu;

import org.junit.Before;
import org.junit.Test;

/**
 * author : dashixiong
 * created at : 2017/8/20 9:32
 * email : lclllccll@163.com
 */
public class AppTest{
    @Before
    public void setup(){
        System.out.println("set up");
    }

    @Test
    public void testSay(){
        App app = new App();
        app.say();
    }

}
