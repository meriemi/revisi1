package simplSta;

import java.util.EmptyStackException;
import java.util.Objects;
import java.util.Stack;

/**
 * Created by Mes documents on 05/12/2016.
 */
public class SimpleStackImlem implements  SimpleStack{
    Stack<Object> st = new Stack<Object>();
    @Override
    public boolean isEmpty() {
        return st.isEmpty();
    }

    @Override
    public int getSize() {
        return st.size();
    }

    @Override
    public void push(Item item) {
        st.push(item);
    }

    @Override
    public Item peek() throws EmptyStackException {
        return (Item) st.peek();
    }

    @Override
    public Item pop() throws EmptyStackException {
        return (Item) st.pop();
    }
}
