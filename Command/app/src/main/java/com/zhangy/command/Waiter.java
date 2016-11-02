package com.zhangy.command;

/**
 * Created by Administrator on 2016/10/12 0012.
 * 调用者的角色
 *   负责调用命令对象执行请求。通常会持有持有命令对象（可以持有多个命令对象）。
 */

public class Waiter {
    private Command pig;
    private Command duck;

    public void setPig(Command pig) {
        this.pig = pig;
    }

    public void setDuck(Command duck) {
        this.duck = duck;
    }

 /*执行正常的命令*/
    public void invoke(int args){
        //可以根据具体情况执行某些命令
        if(args==0){
            pig.excute();
        }else if(args==1){
            duck.excute();
        }
    }
    /*执行删除的命令*/
   public void delete(int args){
       if(args==0){
           pig.undo();
       }else if(args==1){
           duck.undo();
       }
   }
    /*执行撤销的命令*/
    public void move(int args){
        if(args==0){
            pig.redo();
        }else if(args==1){
            duck.redo();
        }
    }

}
