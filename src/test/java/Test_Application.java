import org.junit.Assert;
import org.junit.Test;


public class Test_Application {

    @Test
    public void test1(){
        System.out.println("test1");
    }
    @Test
    public void test2(){
        System.out.println("test2");
    }
    @Test
    public void test3(){
        System.out.println("test3");
    }
    @Test
    public void test4(){
        System.out.println("test4");
        Assert.fail();
    }


}
