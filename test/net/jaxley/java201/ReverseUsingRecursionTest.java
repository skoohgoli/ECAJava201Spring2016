package net.jaxley.java201;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jaxley on 6/1/16.
 */
public class ReverseUsingRecursionTest {
    @Test
    public void reverse() throws Exception {

        Assert.assertEquals("nosaJ", ReverseUsingRecursion.reverse("Jason"));
        Assert.assertEquals("a", ReverseUsingRecursion.reverse("a"));
        Assert.assertEquals("", ReverseUsingRecursion.reverse(""));
        Assert.assertEquals(null, ReverseUsingRecursion.reverse(null));
    }

}