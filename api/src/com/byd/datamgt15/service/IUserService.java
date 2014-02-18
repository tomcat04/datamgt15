package com.byd.datamgt15.service;

import com.byd.datamgt15.domain.User;
import java.util.List;

/**
 * 用户服务类
 * @author ty
 */
public interface IUserService {
    /**
     * 获得当前用户自己的相关信息
     * @return 
     */
    public User getMyUser();
    
    /**
     * 更改用户自己的个人信息
     * @param user 
     */
    public void updateMyUser(User user);
    
    public void changeMyPassword(String oldPassword,String newPassword);
    
    /**
     * 更改用户信息
     * @param user 
     */
    public void updateUser(User user);
    
    public void addUser(User user);
    
    /**
     * 获得用户列表
     * @param user
     * @return 
     */
    public List<User> getUsers(User user);
}
