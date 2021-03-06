package com.fawda.design.delegate.simple;

/**
 * <b>时间:</b> <i>2020-03-12 21:33</i> 修订原因:初始化创建.详细说明:<br>
 * <br>
 * Action类{@linkplain com.fawda.design.delegate.simple}使用<br>
 *
 * <b>时间:</b> *年*月*日 *时*分*秒 修订原因:比如BUG修复或业务变更.详细说明:<br>
 *
 * @author Fawda liuyl @since 1.0
 **/
public class EmployeeA implements IEmployee {

    private String goodAt = "编程";

    @Override
    public void doing(String task) {
        System.out.format("我比较擅长：%s, 我开始做：%s的工作; \n", goodAt, task);
    }
}
