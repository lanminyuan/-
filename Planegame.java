package 飞机小游戏;
import java.awt.*;
import javax.swing.*;
public class Planegame extends JFrame{   
	
	double x=100;
	double y=100;
	boolean right=true;
	

	//导入图片
	Image 天空=Toolkit.getDefaultToolkit().getImage("images/天空.jpg");
	Image 飞机=Toolkit.getDefaultToolkit().getImage("images/飞机.png");
	//使图片出现在窗口中
	public void paint(Graphics g) {
		System.out.println("被画了一次");
		g.drawImage(天空, 0, 0, null);
		g.drawImage(飞机,(int)x,(int)y,null);
		
	if(right) {
		x=x+10;
	}else {
		x=x-10;
	}
	if(x>800) {
		right=false;
	}
	if(x<30) {
		right=true;
	}
	}
	
	//窗口加载
	void lunchFrame() {
		setSize(850,600);
		setLocation(400,400);
		setVisible(true);
		while(true) {
			repaint();
			try {
				Thread.sleep(40);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
	
	public  static void main(String[] args) {
 
		System.out.println("画一个圈");
		Planegame game=new Planegame();
		game.lunchFrame();
		
		}

	
}
