package P1;

import org.junit.Test;

import static org.junit.Assert.*;

public class L2022211927_2_Test {

    Solution2 solution2 = new Solution2();


    /**
     * 空的字符串
     * 单个字符
     * 重复的单个字符
     * 不重复的多个字符
     * 交错重复的字符串
     */

    //空的字符串
    @Test
    public void test1(){
        String b = "";
        String s = solution2.removeDuplicateLetters(b);
        assertEquals("",s);
    }

    //单个字符
    @Test
    public void test2(){
        String b = "a";
        String s = solution2.removeDuplicateLetters(b);
        assertEquals("a",s);
    }

    //重复的单个字符
    @Test
    public void test3(){
        String b = "aaaaa";
        String s = solution2.removeDuplicateLetters(b);
        assertEquals("a",s);
    }

    //不重复的多个字符
    @Test
    public void test4(){
        String b = "arvde";
        String s = solution2.removeDuplicateLetters(b);
        assertEquals("arvde",s);
    }

    //交错重复的字符串
    @Test
    public void test5(){
        String b = "arvvdeevt";
        String s = solution2.removeDuplicateLetters(b);
        assertEquals("ardevt",s);
    }

}