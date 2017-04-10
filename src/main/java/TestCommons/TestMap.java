package TestCommons;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.junit.Test;

import java.lang.reflect.Type;
import java.util.*;

/**
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 * All Rights Reserved
 * Title:TestMap
 * Description
 * Author: LvShaoMing
 * Date:2017/3/27 21:07
 */
public class TestMap {
    @Test
    public void test() {
        List<User> users = new ArrayList<User>();
        User u1 = new User();
        u1.setId(1);
        u1.setName("lsm");
        users.add(u1);
        User u2 = new User();
        u2.setId(1);
        u2.setName("lsm1");
        users.add(u2);

        User u3 = new User();
        u3.setId(1);
        u3.setName("lsm2");
        users.add(u3);
        Map<Integer, User> userMap = new HashMap<Integer, User>();
        for (int i = 0; i < users.size(); i++) {
            userMap.put(users.get(i).getId(), users.get(i));
        }
        System.out.println(userMap.size() + "--000--" + (userMap.get(1).getName()));

        Set usermap1 = userMap.keySet();
        for (Object u : usermap1) {
            User u12 = (User) userMap.get(u);
            System.out.println("0000000" + u12.getName());
        }

    }
    @Test
    public void testGson(){
        List<User> users=new ArrayList<User>();
        StringBuilder userString=new StringBuilder();
        userString.append("{\"number\":\"123\",");
        userString.append("\"userss\":[{\"");
        userString.append("id\":\"1\",");
        userString.append("\"name\":\"lsm\"},{");
        userString.append("\"id\":\"2\",");
        userString.append("\"name\":\"jpp");
        userString.append("\"}]");
        userString.append("}");

        System.out.println("===userString=="+userString.toString());

        Gson gson=new Gson();
//        List<User> userList=gson.fromJson(userString.toString(),new TypeToken<List<User>>() {}.getType());
        People people=gson.fromJson(userString.toString(),People.class);
        List<User> userList=people.getUserss();
        for(User u:userList){
            System.out.println("name="+u.getName());
        }
        Type type=new TypeToken<List<User>>(){}.getType();
    }

    @Test
    public void testjson(){
        List<User> u=new ArrayList<User>();
        User u1=new User();
        u1.setName("lsm");
        u1.setId(1);
        u.add(u1);

        User u2=new User();
        u2.setName("lsm1");
        u2.setId(2);
        u.add(u2);
        Gson gson=new Gson();
        String s=gson.toJson(u);
        System.out.println(s);
    }
}
