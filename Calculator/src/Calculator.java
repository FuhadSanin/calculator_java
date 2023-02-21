import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.plaf.synth.ColorType;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.Font;
import java.awt.Color;

public class Calculator implements ActionListener{
	int choice,limit=10;
	boolean isOperatorClicked=false;
String oldValue,suboldValue;
	
JFrame jf;
JLabel displayLabel,operatorIndicator;
JButton sevenButton,eightButton,nineButton,fourButton,fiveButton,sixButton,threeButton,twoButton,oneButton,equalButton,zeroButton,dotButton,addButton,subButton,multButton,divButton;
JButton clearButton,backspace;

public Calculator() {
		
		//WINDOW
		jf=new JFrame();
		jf.setLayout(null);
		jf.setSize(600,600);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
		
		
		operatorIndicator=new JLabel("Operator");
		operatorIndicator.setBounds(30,10,170,20);
		jf.add(operatorIndicator);
		operatorIndicator.setBackground(Color.black);
		operatorIndicator.setOpaque(true);
		operatorIndicator.setForeground(Color.white);
		operatorIndicator.setHorizontalAlignment(SwingConstants.CENTER);
		operatorIndicator.setFont(new Font("Calculator", Font.BOLD, 20));
		
		
		//LABEL
	    displayLabel=new JLabel();
		displayLabel.setBounds(30,30,520,70);
		displayLabel.setBackground(Color.gray);
		displayLabel.setOpaque(true);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displayLabel.setVerticalAlignment(SwingConstants.CENTER);
		displayLabel.setForeground(Color.white);
		displayLabel.setFont(new Font("Calculator", Font.BOLD, 40));
		jf.add(displayLabel);
	
		
		//BUTTONS
		sevenButton=new JButton("7");
		sevenButton.setBounds(30,120,80,80);
		jf.add(sevenButton);
		sevenButton.setFont(new Font("Calculator", Font.PLAIN, 40));
		sevenButton.addActionListener(this);
	
		eightButton=new JButton("8");
		eightButton.setBounds(110,120,80,80);
		jf.add(eightButton);
		eightButton.setFont(new Font("Calculator", Font.PLAIN, 40));
		eightButton.addActionListener(this);
		
		nineButton=new JButton("9");
		nineButton.setBounds(190,120,80,80);
		jf.add(nineButton);
		nineButton.setFont(new Font("Calculator", Font.PLAIN, 40));
		nineButton.addActionListener(this);
	
		fourButton=new JButton("4");
		fourButton.setBounds(30,200,80,80);
		jf.add(fourButton);
		fourButton.setFont(new Font("Calculator", Font.PLAIN, 40));
		fourButton.addActionListener(this);
		
		fiveButton=new JButton("5");
		fiveButton.setBounds(110,200,80,80);
		jf.add(fiveButton);
		fiveButton.setFont(new Font("Calculator", Font.PLAIN, 40));
		fiveButton.addActionListener(this);
		
		sixButton=new JButton("6");
		sixButton.setBounds(190,200,80,80);
		jf.add(sixButton);
		sixButton.setFont(new Font("Calculator", Font.PLAIN, 40));
		sixButton.addActionListener(this);
		
		threeButton=new JButton("3");
		threeButton.setBounds(30,280,80,80);
		jf.add(threeButton);
		threeButton.setFont(new Font("Calculator", Font.PLAIN, 40));
		threeButton.addActionListener(this);
		
	    twoButton=new JButton("2");
		twoButton.setBounds(110,280,80,80);
		jf.add(twoButton);
		twoButton.setFont(new Font("Calculator", Font.PLAIN, 40));
		twoButton.addActionListener(this);
		
		oneButton=new JButton("1");
		oneButton.setBounds(190,280,80,80);
		jf.add(oneButton);
		oneButton.setFont(new Font("Calculator", Font.PLAIN, 40));
		oneButton.addActionListener(this);
	
		dotButton=new JButton(".");
		dotButton.setBounds(30,360,80,80);
		jf.add(dotButton);
		dotButton.setFont(new Font("Calculator", Font.PLAIN, 40));
		dotButton.addActionListener(this);
		
		zeroButton=new JButton("0");
		zeroButton.setBounds(110,360,80,80);
		jf.add(zeroButton);
		zeroButton.setFont(new Font("Calculator", Font.PLAIN, 40));
		zeroButton.addActionListener(this);
		
		equalButton=new JButton("=");
		equalButton.setBounds(190,360,80,80);
		jf.add(equalButton);
		equalButton.setFont(new Font("Calculator", Font.PLAIN, 40));
		equalButton.addActionListener(this);
	
		
		String text="C";
		clearButton=new JButton(text);
		clearButton.setBounds(390,200,80,80);
		jf.add(clearButton);
		clearButton.setFont(new Font("Calibri", Font.BOLD, 50));
		clearButton.setForeground(Color.red);
		clearButton.setHorizontalTextPosition(SwingConstants.CENTER);
		clearButton.setBackground(Color.black);
		clearButton.addActionListener(this);
		
		divButton=new JButton("/");
		divButton.setBounds(290,120,80,80);
		jf.add(divButton);
		divButton.setFont(new Font("Calculator", Font.BOLD, 50));
		divButton.addActionListener(this);
		
		multButton=new JButton("x");
		multButton.setBounds(290,200,80,80);
		jf.add(multButton);
		multButton.setFont(new Font("Calculator", Font.BOLD, 50));
		multButton.addActionListener(this);
		
		
		subButton=new JButton("-");
		subButton.setBounds(290,280,80,80);
		jf.add(subButton);
		subButton.setFont(new Font("Calculator", Font.BOLD, 50));
		subButton.addActionListener(this);
		
		addButton=new JButton("+");
		addButton.setBounds(290,360,80,80);
		jf.add(addButton);
		addButton.setFont(new Font("Calculator", Font.BOLD, 50));
		addButton.addActionListener(this);
		
		backspace=new JButton("AC");
		backspace.setBounds(390,120,80,80);
		jf.add(backspace);
		backspace.setFont(new Font("Calculator", Font.BOLD, 30));
		backspace.addActionListener(this);
		
		
		

	
	
	
	
	
	
	}



//MAIN
public static void main(String[] args) {
	new Calculator();
}



//ACTION OF KEY'S
@Override
public void actionPerformed(ActionEvent e) {
	
	
	if(e.getSource()==sevenButton) {
		if(isOperatorClicked==true) {
			displayLabel.setText("7");
			isOperatorClicked=false;
		}else {
		
		displayLabel.setText(displayLabel.getText()+"7");
		
		}
		
	}else if(e.getSource()==eightButton) {
		if(isOperatorClicked==true) {
			displayLabel.setText("8");	
			isOperatorClicked=false;
		}else {
		displayLabel.setText(displayLabel.getText()+"8");
		}
		
		
		
	}else if(e.getSource()==nineButton) {
		if(isOperatorClicked==true) {
			displayLabel.setText("9");
			isOperatorClicked=false;
		}else {
		String countinueText=displayLabel.getText();
		displayLabel.setText(countinueText+"9");
	}
	}else if(e.getSource()==fourButton) {
		if(isOperatorClicked==true) {
			displayLabel.setText("4");
			isOperatorClicked=false;
		}else {
		String countinueText=displayLabel.getText();
		displayLabel.setText(countinueText+"4");
	}
	}else if(e.getSource()==fiveButton) {
		if(isOperatorClicked==true) {
			displayLabel.setText("5");
			isOperatorClicked=false;
		}else {
		String countinueText=displayLabel.getText();
		displayLabel.setText(countinueText+"5");
	}}else if(e.getSource()==threeButton) {
		if(isOperatorClicked==true) {
			displayLabel.setText("3");
			isOperatorClicked=false;
		}else {
		String countinueText=displayLabel.getText();
		displayLabel.setText(countinueText+"3");
		}}else if(e.getSource()==sixButton) {
			if(isOperatorClicked==true) {
				displayLabel.setText("6");
				isOperatorClicked=false;
			}else {
		String countinueText=displayLabel.getText();
		displayLabel.setText(countinueText+"6");
	}}else if(e.getSource()==twoButton) {
		if(isOperatorClicked==true) {
		displayLabel.setText("2");
		isOperatorClicked=false;
	}else {
		String countinueText=displayLabel.getText();
		displayLabel.setText(countinueText+"2");
	}
	}else if(e.getSource()==oneButton) {
		if(isOperatorClicked==true) {
			displayLabel.setText("1");
			isOperatorClicked=false;
		}else {
		String countinueText=displayLabel.getText();
		displayLabel.setText(countinueText+"1");
	}}else if(e.getSource()==dotButton) {
		if(isOperatorClicked==true) {
			displayLabel.setText(".");
			isOperatorClicked=false;
		}else {
		String countinueText=displayLabel.getText();
		displayLabel.setText(countinueText+".");
		}}else if(e.getSource()==zeroButton) {
			if(isOperatorClicked==true) {
				displayLabel.setText("0");
				isOperatorClicked=false;
			}else {
		String countinueText=displayLabel.getText();
		displayLabel.setText(countinueText+"0");
	}}else if(e.getSource()==clearButton) {
		displayLabel.setText("");
	}
	else if(e.getSource()==backspace) {
		displayLabel.setText(displayLabel.getText().substring(0, displayLabel.getText().length()-1));
	}
	
//OPERATORS	
	else if(e.getSource()==addButton) {
		choice=1;

		isOperatorClicked=true;
		operatorIndicator.setText("Additon +");
		oldValue=displayLabel.getText();

		   
	    
	}
	
	else if(e.getSource()==subButton) {
		choice=2;
		oldValue=displayLabel.getText();
		isOperatorClicked=true;
		operatorIndicator.setText("Subtraction -");
		}
	else if(e.getSource()==multButton) {
		choice=3;
		oldValue=displayLabel.getText();
		isOperatorClicked=true;
		operatorIndicator.setText("Multiplication x");
		}
	else if(e.getSource()==divButton) {
		choice=4;
		oldValue=displayLabel.getText();
		isOperatorClicked=true;
		operatorIndicator.setText("Division /");
		}
	
	
	
	
	
	
	
	
	
	
	
	
//EQUAL	
	else if(e.getSource()==equalButton) {
		if(choice==1) {
			String newValue=displayLabel.getText();
			
			float oldValueF=Float.parseFloat(oldValue);
			float newValueF=Float.parseFloat(newValue);
		float result=oldValueF+newValueF;

	
	displayLabel.setText(result+"");
		}		
		else if(choice==2) {

			String newValue=displayLabel.getText();
			
			float oldValueF=Float.parseFloat(oldValue);
			float newValueF=Float.parseFloat(newValue);
		float result=oldValueF-newValueF;
		displayLabel.setText(result+"");
			}
		else if(choice==3) {

			String newValue=displayLabel.getText();
			
			float oldValueF=Float.parseFloat(oldValue);
			float newValueF=Float.parseFloat(newValue);
		float result=oldValueF*newValueF;
		displayLabel.setText(result+"");
			}
		else if(choice==4) {

			String newValue=displayLabel.getText();
			
			float oldValueF=Float.parseFloat(oldValue);
			float newValueF=Float.parseFloat(newValue);
		float result=oldValueF/newValueF;
		displayLabel.setText(result+"");
			}
 
	}








}}
