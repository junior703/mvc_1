/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controler;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.ViewMain;
import model.ModelMain;
import model.ModelMessage;
import view.ViewMessage;
/**import views.ViewMessage;
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class ControlerMain implements ActionListener{
ViewMessage viewMessage;
  ModelMain modelMain;
  ViewMain viewMain;
  


    public ControlerMain(ViewMain viewMain, ViewMessage viewMessage, ModelMain modelMain) {
   this.viewMessage=viewMessage;
this.modelMain=modelMain;
this.viewMain=viewMain;
this.viewMain.jMimessage.addActionListener( this);

initView();
    }

   

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource ()==viewMain.jMimessage)
     jmiMessage();

    }
    public void jmiMessage(){
        this.viewMain.setContentPane(viewMessage);
        this.viewMain.revalidate();
        this.viewMain.repaint();
    }
      public void jmiM(){
        this.viewMain.setContentPane(viewMessage);
        this.viewMain.revalidate();
        this.viewMain.repaint();
    }
    public void jmiM(){
        this.viewMain.setContentPane(viewMessage);
        this.viewMain.revalidate();
        this.viewMain.repaint();
    }
   public void initView(){
        this.viewMain.setTitle("MDI");
        this.viewMain.setLocationRelativeTo(null);
        this.viewMain.setVisible(true);
   }
}
