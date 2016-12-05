package simplSta;

import java.util.EmptyStackException;
import java.util.Objects;
import java.util.Stack;

/**
 * Created by Mes documents on 05/12/2016.
 */
public class SimpleStackImlem implements  SimpleStack{
    Stack<Object> sti = new Stack<Object>();
    @Override
    public boolean isEmpty() {
        return sti.isEmpty();
    }

    @Override
    public int getSize() {
        return sti.size();
    }

    @Override
    public void push(Item item) {
        sti.push(item);
    }

    @Override
    public Item peek() throws EmptyStackException {
        return (Item) sti.peek();
    }

    @Override
    public Item pop() throws EmptyStackException {
        return (Item) sti.pop();
    }
}
