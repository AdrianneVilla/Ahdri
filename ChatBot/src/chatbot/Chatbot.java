package chatbot;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Chatbot extends JFrame {
	private JTextArea Chatarea = new JTextArea();
	private JTextField chatbox = new JTextField();
	
	public Chatbot() { 
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
	    frame.setVisible(true);
	    frame.setResizable(false);
	    frame.setLayout(null);
	    frame.setSize(600 , 600);
	    frame.setTitle("ChatBot");
	    frame.add(Chatarea);
	    frame.add(chatbox);
	    //FOR TEXTARE
	    Chatarea.setSize(500 , 400);
	    Chatarea.setLocation(2, 2);
	    
	    
	    //FOR TEXTFIELD
	    chatbox.setSize(540 , 30);
	    chatbox.setLocation(2, 550);
	    
	    chatbox.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String gtext = chatbox.getText().toLowerCase();
				Chatarea.append("YOU ->"+ gtext + "\n" );
				chatbox.setText("");
				
				if(gtext.contains("hi")) {
					bot("Bakit?");
				}else {
					int rand = (int) (Math.random() * 3 +1);
					if(rand == 1) {
						bot("ANO YUN?");
					}else if(rand == 2) {
						bot("ANO YUN BFF?");
					}else if(rand == 1) {
						bot("ANO YUN BFF?");
				}
			}
			}
	    });
	    
	    
	    }
	 private void bot(String string) {
	    	Chatarea.append("BOT ->" +string+ "\n");		
	    	}
	    	
	    
	public static void main(String[] args) {
		
}
}
