package com.young.provider;

import com.alibaba.dubbo.config.annotation.Service;
import com.young.api.UserService;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Tornado Young
 * @version 2019/8/19 11:28
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public List<String> getAddrs(String userId) {
        List<String> addrs=new ArrayList<>();
        addrs.add("北京市东城区东直门");
        addrs.add("北京市西城区西直门");
        addrs.add("北京市海淀区紫竹桥");
        addrs.add("北京市朝阳区四惠东");
        addrs.add("北京市通州区小羊坊");
        return addrs;
    }
}
