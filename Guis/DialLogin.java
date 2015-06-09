package Guis;

import Authenticate.*;
import java.awt.*;
import java.awt.event.*;


public class DialLogin extends Dialog implements ActionListener 
{
    private gestFenetre handlerFenetre;
    private java.awt.Label labelUser;
    private java.awt.TextField textFieldUser;
    private java.awt.Button buttonCancel;
    private java.awt.Button buttonChange;
    private java.awt.Button buttonOk;
    private java.awt.Label labelChangePassword;
    private java.awt.Label labelPassword;
    private java.awt.TextField textFieldPassword;
    private String nomFrame;
    
    public DialLogin(java.awt.Frame parent, boolean modal, String nF) 
    {                
        super(parent, modal);

        handlerFenetre = new gestFenetre(parent);
        addWindowListener(handlerFenetre);
        nomFrame = nF;

        initComponents();
    }


    private void initComponents() 
    {
        labelUser = new java.awt.Label();
        textFieldUser = new java.awt.TextField();
        labelPassword = new java.awt.Label();
        textFieldPassword = new java.awt.TextField();
        labelChangePassword = new java.awt.Label();
        buttonChange = new java.awt.Button();
        buttonOk = new java.awt.Button();
        buttonCancel = new java.awt.Button();

        setLayout(new java.awt.GridLayout(4, 2));

        setTitle("Capitainerie - Login de l'utilisateur " + nomFrame);

        labelUser.setText("User :");
        add(labelUser);
        
        add(textFieldUser);

        labelPassword.setText("Password");
        add(labelPassword);

        textFieldPassword.setEchoChar('*');
        add(textFieldPassword);

        labelChangePassword.setText("Change password? ==>");
        add(labelChangePassword);

        buttonChange.setLabel("Change");
        add(buttonChange);

        buttonOk.setLabel("Ok");
        buttonOk.addActionListener(this);
        add(buttonOk);

        buttonCancel.setLabel("Cancel");
        buttonCancel.addActionListener(this);
        add(buttonCancel);

        setLocation(300, 150);
        setResizable(false);

        pack();
    }

    private void closeDialog(WindowEvent evt) 
    {
        setVisible(false);
        dispose();
    }

    public void actionPerformed(ActionEvent evt) 
    {
        String info;
        info = evt.getActionCommand();

        if(info == "Cancel") 
        {
            setVisible(false);
            dispose();
            System.exit(0);
        }
        else if (info == "Ok") 
        {
            VerificateurUsersPasswordHash testPwd = new VerificateurUsersPasswordHash();
            testPwd.setLogin( textFieldUser.getText() );
            testPwd.setPassword( textFieldPassword.getText() );
            Boolean okPassword = testPwd.isOk();
            
            if( okPassword == false )
            {
                textFieldUser.setText("Invalid");
            }
            else
            {
                setVisible(false);
                dispose();
                CapitainerieFrame capitFrame = new CapitainerieFrame();
                capitFrame.setVisible(true);
            }
        }
    }
}
