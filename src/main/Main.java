/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;
import  view.*;
import model.*;
import controler.*;
/**
 * 
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Main {
    private static ViewMain viewMain;
    private static ModelMain modelMain;
    private static ControlerMain controlerMain;
    
       private static ViewMessage viewMessage;
    private static ModelMessage modelMessage;
    private static ControlerMessage controlerMessage;

    public static void main(String [] jr){
    viewMessage=new ViewMessage();
    modelMessage=new ModelMessage();
    controlerMessage=new ControlerMessage(viewMessage, modelMessage);
    
    viewMain=new ViewMain();
    modelMain=new ModelMain();
     controlerMain=new ControlerMain(viewMain, viewMessage, modelMain);
controlerMain.initView();
    }
 
}
