package uniTest;

import implement.MyStack;
import junit.framework.TestCase;
import junit.framework.TestResult;
import junit.framework.TestSuite;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TestMyStack extends TestCase {
    @Override
    protected TestResult createResult() {
        return super.createResult();
    }

    public void testStackEmpty() {
        MyStack<Integer> myStack = new MyStack<>();
        //   myStack.push(123);
        assertEquals(true, myStack.isEmpty());
        // assertEquals(false,myStack.isEmpty());
    }

    public void testPushObjectStack() {
        MyStack<String> myStack = new MyStack<>();
        assertNotNull(null, myStack);
    }
    public void testMakeEmpty(){
        MyStack<Integer> myStack = new MyStack<>();
        myStack.push(123123);
        myStack.makeEmpty();
        assertEquals(true,myStack.isEmpty());
    }

    public void testPopStack() {
        MyStack<Integer> myStack = new MyStack<>();
        myStack.pop();
        //assertEquals(,myStack);
        for (int i = 0; i < 10; i++){
            myStack.push(i);
        }
        for (int i = 9; i >= 0; i--){
            myStack.pop();
            assert(myStack.length() == i);
        }

    }
    public void testTopOfStack(){
        MyStack<Integer> myStack = new MyStack<>();
        myStack.pop();
        for (int i = 0; i < 10; i++){
            myStack.push(i);
        }
        for (int i = 9; i >= 0; i--){
            myStack.top();
            assert(i == myStack.top());
            myStack.pop();
        }

    }

    public void testPushStack() throws IOException {
        MyStack<Integer> myStack = new MyStack<>();
        //test stack null
        assertNotNull(myStack);
        //test length of stack
        myStack.push(123);
        int length = myStack.length();
        assertTrue(length > 0);
        //read file to stack
        myStack = new MyStack<Integer>();
        File file = new File("input.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        int tmp = 0;
        while ((st = br.readLine()) != null) {
            tmp++;
            int a = Integer.parseInt(st);
            myStack.push(a);
        }
        assertEquals(tmp, myStack.length());
        //test correct element push to stack
        while ((st = br.readLine()) != null) {
            tmp++;
            int a = Integer.parseInt(st);
            myStack.push(a);
        }


    }

    public static void main(String[] args) {
        junit.textui.TestRunner.run(new TestSuite(TestMyStack.class));
    }
}
