package com.zhangy.command;

/**
 * Created by Administrator on 2016/10/12 0012.
 *
 * 具体命令角色----烤花鸭的命令
 */

public class DuckCook implements Command {

    private Cook mCook;

    public DuckCook(Cook cook){
        this.mCook=cook;
    }
    @Override
    public void excute() {
        mCook.cookDuck(); //执行烤花鸭的命令
    }

    @Override
    public void undo() {

    }

    @Override
    public void redo() {

    }
}
