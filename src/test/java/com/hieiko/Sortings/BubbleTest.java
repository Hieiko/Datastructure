package com.hieiko.Sortings;

import org.junit.Test;

public class BubbleTest {

    @Test
    public void sort() {
        Bubble<Integer> bubble=new Bubble<Integer>();
        Integer[] nums={1,4,6,2};
        bubble.sort(nums);
    }
}