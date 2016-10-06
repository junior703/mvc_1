/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controler;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.ViewMessage;
import model.ModelMessage;


/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class ControlerMessage implements ActionListener{
    private final ViewMessage viewMessage;
    private final ModelMessage modelMessage;

public ControlerMessage(ViewMessage viewMessage, ModelMessage modelMessage){
this.viewMessage=viewMessage;
this.modelMessage=modelMessage;
this.viewMessage.jBhello.addActionListener( this);
this.viewMessage.jBBye.addActionListener(this);
}

    @Override
    public void actionPerformed(ActionEvent e) {
if(e.getSource()==viewMessage.jBhello){
    hello();
}
else if(e.getSource()==viewMessage.jBBye){
bye();
}
    
    }

    private void hello(){
        modelMessage.setMessage("Hello from MVC Panel");
        viewMessage.jLmess.setText(modelMessage.getMessage());

    }
    
    private void bye(){
     modelMessage.setMessage("Bye from MVC Panel");
        viewMessage.jLmess.setText(modelMessage.getMessage());
    }
}
