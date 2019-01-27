package jsq;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.util.ArrayList;
import java.awt.util.List;
import java.util.function.IntConsumer;

public class Calculator {
	private TextField textField;
	private int firstNum;
	private final ArrayList fh=new ArrayList();
			
			

	public Calculator() {
		initPanel();
		// TODO 自动生成的构造函数存根
	}

	private void initPanel() {
		Frame frame=new Frame("计算器");
		frame.setLocationRelativeTo(null);
		Panel northPanel=new Panel();
		textField=new TextField(30);
		northPanel.add(textField);
		frame.add(northPanel, BorderLayout.NORTH);
		Panel southPanel=new Panel();
		GridLayout gridLayout=new GridLayout(3,5,4,4);
		southPanel.setLayout(gridLayout);
		String [] Str_Name= {"0","1","2","3","4","5","6","7","8","9","+","-","*","/","="};
		for(int i=0;i<15;i++) {
			final Button tmpButton=new Button(Str_Name[i]);
			tmpButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					String text=textField.getText();
					String buttonLable=tmpButton.getLabel();
					if(buttonLable.contains("+")||buttonLable.contains("-")||buttonLable.contains("*")||buttonLable.contains("/")){
						fh.add(buttonLable);
						firstNum=Integer.valueOf(text);
						textField.setText("");
					}else if(buttonLable.contains("=")) {
						int secondNum=Integer.valueOf(text);
			}
					
					// TODO 自动生成的方法存根
					
				}
			});
		}
		
		
		// TODO 自动生成的方法存根
		
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

}
