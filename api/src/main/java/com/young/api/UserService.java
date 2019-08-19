package com.young.api;

import java.util.List;

/**
 * @author Tornado Young
 * @version 2019/8/19 11:22
 */
public interface UserService {
    List<String> getAddrs(String userId);
}
