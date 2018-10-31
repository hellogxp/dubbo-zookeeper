package com.gaoxueping.dubbozookeeperprovider;

import com.gaoxueping.duboozookeeperinterface.UserService;

/**
 * Created by think.
 * Date: 31/10/2018
 * Time: 11:37
 */
public class UserServiceImpl implements UserService {
    @Override
    public String getName(String name) {
        return "hello" + name;
    }
}
