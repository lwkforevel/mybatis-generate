package com.zrh.model.menu;

public class Actions {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column actions.action_id
     *
     * @mbggenerated Fri Jun 21 08:25:49 CST 2019
     */
    private Integer actionId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column actions.action_name
     *
     * @mbggenerated Fri Jun 21 08:25:49 CST 2019
     */
    private String actionName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column actions.action_href
     *
     * @mbggenerated Fri Jun 21 08:25:49 CST 2019
     */
    private String actionHref;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column actions.menu_menu_id
     *
     * @mbggenerated Fri Jun 21 08:25:49 CST 2019
     */
    private Integer menuMenuId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column actions.action_id
     *
     * @return the value of actions.action_id
     *
     * @mbggenerated Fri Jun 21 08:25:49 CST 2019
     */
    public Integer getActionId() {
        return actionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column actions.action_id
     *
     * @param actionId the value for actions.action_id
     *
     * @mbggenerated Fri Jun 21 08:25:49 CST 2019
     */
    public void setActionId(Integer actionId) {
        this.actionId = actionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column actions.action_name
     *
     * @return the value of actions.action_name
     *
     * @mbggenerated Fri Jun 21 08:25:49 CST 2019
     */
    public String getActionName() {
        return actionName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column actions.action_name
     *
     * @param actionName the value for actions.action_name
     *
     * @mbggenerated Fri Jun 21 08:25:49 CST 2019
     */
    public void setActionName(String actionName) {
        this.actionName = actionName == null ? null : actionName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column actions.action_href
     *
     * @return the value of actions.action_href
     *
     * @mbggenerated Fri Jun 21 08:25:49 CST 2019
     */
    public String getActionHref() {
        return actionHref;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column actions.action_href
     *
     * @param actionHref the value for actions.action_href
     *
     * @mbggenerated Fri Jun 21 08:25:49 CST 2019
     */
    public void setActionHref(String actionHref) {
        this.actionHref = actionHref == null ? null : actionHref.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column actions.menu_menu_id
     *
     * @return the value of actions.menu_menu_id
     *
     * @mbggenerated Fri Jun 21 08:25:49 CST 2019
     */
    public Integer getMenuMenuId() {
        return menuMenuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column actions.menu_menu_id
     *
     * @param menuMenuId the value for actions.menu_menu_id
     *
     * @mbggenerated Fri Jun 21 08:25:49 CST 2019
     */
    public void setMenuMenuId(Integer menuMenuId) {
        this.menuMenuId = menuMenuId;
    }
}