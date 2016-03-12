package cn.njust.user.service.impl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import cn.njust.user.service.UserService;
@Service("userService")
@Scope("prototype")
public class UserServiceImpl implements UserService {

}
