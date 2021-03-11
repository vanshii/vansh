import java.awt.*;
import java.awt.event.*;
class Fdemo extends Frame implements ActionListener
{
	TextField tx1,tx2,tx3;
	Button b1,b2,b3,b4;
	Fdemo()
	{
		setLayout(null);
		Font f= new Font("Arial Black",Font.ITALIC,30);
		setFont(f);
		Label n1=new Label("Enter no.1");
		n1.setSize(150,50);
		n1.setLocation(100,100);
		add(n1);
		
	    tx1=new TextField(10);
		tx1.setSize(150,50);
		tx1.setLocation(300,100);
		add(tx1);
		
		Label n2=new Label("Enter no.2");
		n2.setSize(150,50);
		n2.setLocation(100,150);
		add(n2);
		
		tx2=new TextField(10);
		tx2.setSize(150,50);
		tx2.setLocation(300,150);
		add(tx2);
		
		
		b1=new Button("+");
		b1.setSize(50,50);
		b1.setLocation(100,300);
		add(b1);
		
		
		b2=new Button("-");
		b2.setSize(50,50);
		b2.setLocation(200,300);
		add(b2);
		
		
		b3=new Button("*");
		b3.setSize(50,50);
		b3.setLocation(300,300);
		add(b3);
		
		
		b4=new Button("/");
		b4.setSize(50,50);
		b4.setLocation(400,300);
		add(b4);
		
		Label op=new Label("Output");
		op.setSize(100,50);
		op.setLocation(100,400);
		add(op);
		
		tx3=new TextField(10);
		tx3.setSize(100,50);
		tx3.setLocation(250,400);
		add(tx3);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
	}
	
	public void actionPerformed (ActionEvent e)
	{
		String s1=tx1.getText();
		String s2=tx2.getText();
		
		int x=Integer.parseInt(s1);
		int y=Integer.parseInt(s2);
		
		if(e.getSource()==b1)
		{
			int z=x+y;
			tx3.setText(""+z);
		
		}
		if(e.getSource()==b2)
		{
			int z=x-y;
			tx3.setText(""+z);
		}
		if(e.getSource()==b3)
		{
			int z=x*y;
			tx3.setText(""+z);
		}
		if(e.getSource()==b4)
		{
			int z=x/y;
			tx3.setText(""+z);
		}
		
		
	}
}

class calc
{
	public static void main(String args[])
	{
		Fdemo f=new Fdemo();
		f.setVisible(true);
		f.setSize(800,800);
		f.setLocation(500,300);
	}
}