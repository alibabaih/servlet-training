package eshop.entity;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//this is a bean
public class MockEntityA {

    private String str;
    private String[] arr;
    private List<Integer> list;
    private Map<String, String> map;
    private MockEntityB mockEntityB; //link on another bean

    public MockEntityA() {
        this.str = "str";
        this.arr = new String["aaa", "bbb", "ccc"];
        this.list = Arrays.asList(123, 456, 789);
        this.map = new HashMap<String, String>(){{put("key-0", "value-0");}};
        this.mockEntityB = new MockEntityB();
    }

}
