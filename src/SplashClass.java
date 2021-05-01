
import java.sql.*;
import javax.swing.*;
public class SplashClass 
{
    public static void main(String[] args) 
    {
        int i;
         Splash sp = new Splash();
         sp.setVisible(true);
        
         
         try
         {
             for( i=0;i<=100;i++)
             {
                 Thread.sleep(30);
                 sp.counter.setText(Integer.toString(i));
                 sp.progress.setValue(i);
                 
             }
             if(i==101)
             {
                  MainPage mp = new MainPage();
                  mp.setVisible(true);
                  sp.setVisible(false);
               
             }
         }
         catch(Exception e)
         {
             JOptionPane.showMessageDialog(null,e);
         }
         
    }
}
