package Array;

import java.util.ArrayList;
import java.util.List;

public class Test {
    static LockObject lockObject=new LockObject();
    public static void main(String[] args) {
        List<Run> list1=new ArrayList<Run>();
        for (int i = 0; i < 100; i++) {
            Run iThread=new Run(i);
            iThread.setlObject(lockObject);
            Thread t = new Thread(iThread);
            t.start();
        }


    }

}
