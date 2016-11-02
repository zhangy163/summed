package com.zhangy.command;

/**
 * Created by Administrator on 2016/10/12 0012.
 * 组装角色
 */

public class Client {
    /*组装操作*/

    public void assembleAction(){
        //创建一个命令接收者
        Cook cook=new Cook();

        //创建一个命令的具体实现对象，并指定命令接收者
        Command pig =new PigCook(cook);
        Command duck=new DuckCook(cook);

        //创建一个命令调用者
        Waiter mWaiter=new Waiter();
        //为调用者指定烤乳猪的命令对象
        mWaiter.setPig(pig);
        //为调用者指定烤鸭的命令对象
        mWaiter.setDuck(duck);

        //发起调用烤乳猪的命令
        mWaiter.invoke(0);
        //发起烤花鸭的命令
        mWaiter.invoke(1);

        /*===================================*/
        /*在此也可以进行删除和撤销的操作*/

    }
}
