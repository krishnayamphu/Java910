package com.ky.javaawt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuBarDemo extends Frame {
    /**
     * MenuBar(),Menu(),Menu(String s),MenuItem(),MenuItem(String item)
     *
     * add(Component c)
     * setMenubar(MenuBar mb)
     */
    private MenuBar mb;
    private Menu mFile,mEdit,mHelp;
    private MenuItem miOpen, miClose;
    public MenuBarDemo(){
        initComponents();
    }

    private void initComponents() {
        mb=new MenuBar();
        mFile=new Menu("File");
        miOpen=new MenuItem("Open Window");
        miOpen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MyForm();
            }
        });
        mFile.add(miOpen);

        miClose=new MenuItem("Close");
        miClose.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        mFile.add(miClose);

        mEdit=new Menu("Edit");
        mEdit.add(new MenuItem("Cut"));
        mEdit.add(new MenuItem("Copy"));
        mEdit.add(new MenuItem("Paste"));

        mHelp=new Menu("Help");
        mHelp.add(new MenuItem("About"));

        mb.add(mFile);
        mb.add(mEdit);
        mb.add(mHelp);
        setMenuBar(mb);
        setSize(400,300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MenuBarDemo();
    }
}
