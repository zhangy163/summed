package com.zhangy.command;

/**
 * Created by Administrator on 2016/10/12 0012.
 *
 * 命令角色
 * 定义命令的接口，声明具体命令类需要执行的方法
 *
 */

public interface Command {
    public void excute();//执行
    public void undo();//撤销
    public void redo();//恢复
}
