package demo2;

import org.junit.Test;
import org.junit.*;

public class addTest {
    @Test
    public void Testp(){
        add a=new add();
        Assert.assertEquals(5,a.addNo(2,3));
    }

    @Test
    public void Testn(){
        add a=new add();
        Assert.assertEquals(-5,a.addNo(-3, -2));
    }

    @Test
    public void TestZ(){
        add a=new add();
        Assert.assertEquals(0,a.addNo(0, 0));
    }
}
