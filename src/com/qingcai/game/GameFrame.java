package com.qingcai.game;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import static com.qingcai.util.Constant.*;

/*
* 游戏的主窗口类
* 所有的游戏展示的内容都要在该类中实现
* */
public class GameFrame extends Frame {
    /*
    * 对窗口进行初始化
    * */
    public GameFrame() {
        initFrame();
        initEventListener();
    }

    /*
    * 属性进行初始化
    * */
    private void initFrame(){
        //设置标题
        setTitle(GAME_TITLE);
        //设置窗口大小
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        //设置窗口的左上角的坐标
        setLocation(FRAME_X, FRAME_Y);
        //设置窗口大小不可改变
        setResizable(false);
        //设置窗口可见
        setVisible(true);
    }

    private void initEventListener() {
        //注册监听事件
        addWindowListener(new WindowAdapter() {
            //点击关闭按钮的时候，方法会被自动调用
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
