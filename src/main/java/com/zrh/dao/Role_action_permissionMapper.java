package com.zrh.dao;

import com.zrh.model.menu.Role_action_permission;
import com.zrh.model.menu.Role_action_permissionKey;

public interface Role_action_permissionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_action_permission
     *
     * @mbggenerated Fri Jun 21 08:25:49 CST 2019
     */
    int deleteByPrimaryKey(Role_action_permissionKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_action_permission
     *
     * @mbggenerated Fri Jun 21 08:25:49 CST 2019
     */
    int insert(Role_action_permission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_action_permission
     *
     * @mbggenerated Fri Jun 21 08:25:49 CST 2019
     */
    int insertSelective(Role_action_permission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_action_permission
     *
     * @mbggenerated Fri Jun 21 08:25:49 CST 2019
     */
    Role_action_permission selectByPrimaryKey(Role_action_permissionKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_action_permission
     *
     * @mbggenerated Fri Jun 21 08:25:49 CST 2019
     */
    int updateByPrimaryKeySelective(Role_action_permission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_action_permission
     *
     * @mbggenerated Fri Jun 21 08:25:49 CST 2019
     */
    int updateByPrimaryKey(Role_action_permission record);
}