package Test;

import Code.DLL;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;

public class DLLTest {

    @org.junit.Test
    public void addB() {
        DLL ll = new DLL();
        ll.addB(5);
        assertEquals(5,ll.getValue(0));
    }

    @org.junit.Test
    public void addF() {
        DLL ll = new DLL();
        ll.addF(1);
        ll.addF(2);
        ll.addF(3);
        assertEquals(2,ll.getValue(1));
    }

    @org.junit.Test
    public void getValue() {
    }

    @org.junit.Test
    public void delete() {
        if(index<0)
        {
            throw new RuntimeException("Index negativ");
        }
        DLL ll = new DLL();
        ll.addB(1);
        ll.addB(2);
        ll.addB(4);
        ll.addB(6);
        ll.delete(1);
        assertEquals(4,ll.getValue(1));
    }
}
