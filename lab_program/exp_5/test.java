package exp_5;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class test {
    j1_junit obj  = new j1_junit();


    @Test
    public void testAdd(){
        obj.add("mihir");
        obj.add("nijal");
        assertEquals("add 2 student ",2,obj.sizeOfstudent());
    }

    @Test
    public void testRemove(){
        obj.add("mihir");
        obj.add("nijal");
        obj.remove("nijal");
        assertEquals("remove nijal", 1,obj.sizeOfstudent());
    }

    @Test
    public void testRemoveAll(){
        obj.removeAll();
        assertEquals("remove all", 0, obj.sizeOfstudent());
    }

    @Test
    public void testSize(){
        obj.add("mihir");
        obj.add("mihir2");
        assertEquals("add 2 student", 2,obj.sizeOfstudent());
    }
}
