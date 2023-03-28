package exp_5;

import java.util.ArrayList;
import java.util.List;

/*
Write a program that will check four test cases of adding student, check number of
students currently available (i.e. size of student), remove one student, and remove all
student at a time.
 */
public class j1_junit {
    private List<String> students  = new ArrayList<String>();
    public void add(String name){
        students.add(name);
    }

    public void remove(String name){
        students.remove(name);
    }

    public void removeAll(){
        students.clear();
    }

    public int sizeOfstudent(){
        return students.size();
    }
}
