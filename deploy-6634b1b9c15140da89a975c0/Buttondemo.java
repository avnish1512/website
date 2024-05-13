import java.awt.*;
import java.applet.*;

public class Buttondemo extends Applet
{
	Button b1=new Button("ok");
	String S;
	
		public void init()
			{
				add(b1);
				S=b1.getLabel();

			}
		public void paint(Graphics g)
			{
				g.drawString(S,10,20);
				//g.setFont(f);
			}
}

/*
<applet code="Buttondemo.class" width=200 height=300>
</applet>
*/	
				