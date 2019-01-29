package calculator;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.WindowConstants;

public class Calculator extends WindowAdapter{
	//定义3个面板
	Panel p1=new Panel();		
	Panel p2=new Panel();		
	Panel p3=new Panel();       
	TextField txt;				
	private Button[] b=new Button[17];
	private String ss[]={"7","8","9","+","4","5","6","-","1","2","3","*","清空","0","=","/","关闭"};
	static double a=0.0;    
	static String s,str,s1=" "; 
	public static void main(String[] args) throws Exception {
		(new Calculator()).frame();
	}
	public void frame() {
		Frame fm=new Frame("计算器");  
		for(int i=0;i<=16;i++) {
			b[i]=new Button(ss[i]); 
		}
		for(int i=0;i<=15;i++){
			p2.add(b[i]);			
		}
		
		txt=new TextField(10);
		txt.setEditable(false);
		for(int i=0;i<=16;i++) {
			b[i].addActionListener(new buttonlistener());
		}
		//b[16].addActionListener(new close()); 
		fm.addWindowListener(this);
		fm.setBackground(Color.red);
		p1.setLayout(new BorderLayout());
		p1.add(txt, "Center");
		p2.setLayout(new GridLayout(4,4,10,10));//设置面板p2布局管理器
		p3.setLayout(new BorderLayout(10,10)); //设置面板p3布局管理器
		p3.add(b[16]); //添加按钮到面板p3
		//添加各个面板到窗口
		fm.add(p1,"North");
		fm.add(p2, "Center");
		fm.add(p3, "South");
		fm.pack();
		fm.setVisible(true);
		fm.setSize(400,750);
		fm.setTitle("仙女的计算器");
		
	}
	public void windowClosing(WindowEvent e) {
		System.exit(0);   
	}
	
	class buttonlistener implements ActionListener {
		public void actionPerformed(ActionEvent e){
			Button btn=(Button)e.getSource(); //获取发生事件按钮
			if(btn.getLabel()=="="){
				jisuan();
				str=String.valueOf(a);
				txt.setText(str);
				s="";
				s1="";
			}else if(btn.getLabel()=="+") {
				jisuan();
				txt.setText("");
				s="+";
				s1="";
			}else if(btn.getLabel()=="-"){
				jisuan();
				txt.setText("");
				s="-";
				s1="";
			}else if(btn.getLabel()=="*"){
				jisuan();
				txt.setText("");
				s="*";
				s1="";
			}else if(btn.getLabel()=="/"){
				jisuan();
				txt.setText("");
				s="/";
				s1="";
			}else if(btn.getLabel()=="0"){
				s1+=btn.getLabel();
				txt.setText(s1);
			}else if(btn.getLabel()=="1"){
				s1+=btn.getLabel();
				txt.setText(s1);
			}else if(btn.getLabel()=="2"){
				s1+=btn.getLabel();
				txt.setText(s1);
			}else if(btn.getLabel()=="3"){
				txt.setText("3");
			}else if(btn.getLabel()=="4"){
				s1+=btn.getLabel();
				txt.setText(s1);
			}else if(btn.getLabel()=="5"){
				s1+=btn.getLabel();
				txt.setText(s1);
			}else if(btn.getLabel()=="6"){
				s1+=btn.getLabel();
				txt.setText(s1);
			}else if(btn.getLabel()=="7"){
				s1+=btn.getLabel();
				txt.setText(s1);
			}else if(btn.getLabel()=="8"){
				s1+=btn.getLabel();
				txt.setText(s1);
			}
			else if(btn.getLabel()=="9"){
				s1+=btn.getLabel();
				txt.setText(s1);
			}else {
				txt.setText("0");
				s1="";
			}
				
		}
		public void jisuan(){
			if(s=="+")
				a+=Double.parseDouble(txt.getText());
			else if(s=="-")
				a-=Double.parseDouble(txt.getText());
			else if(s=="*")
				a*=Double.parseDouble(txt.getText());
			else if(s=="/")
				a/=Double.parseDouble(txt.getText());
			else
				a=Double.parseDouble(txt.getText());
		}
	}
 
 }
