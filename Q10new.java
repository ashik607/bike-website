
    

package applet;

import java.applet.Applet;
import java.awt.Graphics;

public class NewApplet extends Applet {
int x[]={20,120,220,20};
int y[]={20,40,140,20};
int n=4;
   
@Override
    public void paint(Graphics g)
    {
       g.drawPolygon(x, y, n);
    }

  
}
