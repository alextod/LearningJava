import com.lohika.lerningjava.datasructures.List.NodeList;
import com.lohika.lerningjava.datasructures.Stack.ATStack;
import org.junit.Test;

import java.util.Iterator;
import java.util.Stack;

public class Test1 {
    @Test
    public void testName() throws Exception {
        NodeList<Integer> list = new NodeList<>();
        list.add(32);
        list.add(2);
        list.add(23);
        list.add(5);
        list.add(674);
        list.add(45);
        list.add(35);
        System.out.println(list.toString());
        System.out.println(list.find(45));
    }

    @Test
    public void testIterator() throws Exception {
        NodeList<Integer> list = new NodeList<>();
        list.add(32);
        list.add(2);
        list.add(23);
        list.add(5);
        list.add(674);
        list.add(45);
        list.add(35);
        Iterator<Integer> iter = list.getIterator();
        while (iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }
    }

    @Test
    public void testIterator2() throws Exception {
        NodeList list = new NodeList();
        Iterator iter = list.getIterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }

    @Test
    public void testStack1() throws Exception {
        Stack stack = new Stack();
        stack.push(10);
        stack = new Stack();
        stack.push(20);
        System.out.println(stack.pop());
    }
}
