package com.ky.javaawt;

import java.awt.*;

public class MyForm extends Frame {
    /**
     * Label,TextField,TextArea,Checkbox,Button,Choice..
     * Label(),Label(String s)
     * TextField(),TextField(int size),TextField(String s),TextField(String s, int size)
     * TextArea(),TextArea(String s), TextArea(int rows, int cols), TextArea(String s, int rows, int cols)
     * Checkbox(),Checkbox(String s,boolean checked),Checkbox(String s, CheckboxGroup cg, boolean checked)
     * Button(),Button(String s)
     * Choice()
     */
    private Label lblname;
    private TextField txtname;
    private TextArea tabox;
    private Checkbox cbjava, cbpython, cbm,cbf;
    private CheckboxGroup gender;
    private Choice list;
    private Button btnok;

    public MyForm(){
            initComponents();
    }
    public void initComponents(){
        lblname=new Label("Name");
        txtname=new TextField(20);
        tabox=new TextArea(5,30);
        cbjava=new Checkbox("Java",true);
        cbpython=new Checkbox("Python",false);

        gender=new CheckboxGroup();
        cbm=new Checkbox("Male",gender,true);
        cbf=new Checkbox("Female",gender,false);
        list=new Choice();
        list.addItem("Apple");
        list.addItem("Mango");
        list.add("Orange");

        btnok=new Button("Submit");

        add(lblname);
        add(txtname);
        add(tabox);
        add(cbjava); add(cbpython);
        add(cbm); add(cbf);
        add(list);
        add(btnok);

        setLayout(new FlowLayout());
        setSize(300,300);
        setTitle("My Form");
        setVisible(true);
    }

    public static void main(String[] args) {
        new MyForm();
    }
}
