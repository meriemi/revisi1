package simplSta;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Stack;

import static org.junit.Assert.*;

/**
 * Created by Mes documents on 05/12/2016.
 * modification  du commentaire
 *
 */
public class SimpleStackImlemTest {
    SimpleStack stacki;
    @Before
    public void setUp() throws Exception {
        stacki = new SimpleStackImlem();
        System.out.println("je suis executé avant chaque test");


    }

    @Test
    public void isEmpty() throws Exception {
        Assert.assertEquals(true,stacki.isEmpty());
        Item it = new Item();
        stacki.push(it);
        Assert.assertEquals(false,stacki.isEmpty());

    }

    @Test
    public void getSize() throws Exception {
        Assert.assertEquals(0,stacki.getSize());
        Item i =new Item();
        stacki.push(i);
        Assert.assertEquals(1,stacki.getSize());

    }

    @Test
    public void push() throws Exception {
        Assert.assertEquals(0,stacki.getSize());
        Item m = new Item();
        stacki.push(m);
        Assert.assertEquals(1,stacki.getSize());

    }

    @Test
    public void peek() throws Exception {
        Assert.assertEquals(0,stacki.getSize());
        Item ito1 = new Item();
        stacki.push(ito1);
        Assert.assertEquals(1,stacki.getSize());
        Item it;
        it = stacki.peek();
        Assert.assertEquals(1,stacki.getSize());
    }

    @Test
    public void pop() throws Exception {
        Assert.assertEquals(0,stacki.getSize());
        Item ito = new Item();
        stacki.push(ito);
        Assert.assertEquals(1,stacki.getSize());
        Item it;
        it = stacki.pop();
        Assert.assertEquals(0,stacki.getSize());

    }

}