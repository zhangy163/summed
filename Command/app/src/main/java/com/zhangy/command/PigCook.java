package com.zhangy.command;

/**
 * Created by Administrator on 2016/10/12 0012.
 *
 * 具体命令角色---做乳猪的命令
 */

public class PigCook implements Command {

    private Cook  mCook;

    public PigCook(Cook cook){
        this.mCook=cook;
    }

    @Override
    public void excute() {
        mCook.cookPig(); //执行烤乳猪的方法
    }

    @Override
    public void undo() {

    }

    @Override
    public void redo() {

    }
}
