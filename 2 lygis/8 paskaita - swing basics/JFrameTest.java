import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;

public class JFrameTest extends JFrame implements ActionListener {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		JFrameTest frame = new JFrameTest();
		frame.setSize(400, 200);
		frame.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {
		JButton button = (JButton) event.getSource();
		Integer currentCount = Integer.valueOf(button.getText());
		currentCount += 1;
		button.setText(currentCount.toString());
	}


	/**
	 * Create the frame.
	 */
	public JFrameTest() {
		super("number guesser");
		
		
		JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 2));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton buttonOne = new JButton("0");
		buttonOne.setFont(new Font("Tahoma", Font.PLAIN, 30));
		JButton buttonTwo = new JButton("0");
		buttonTwo.setFont(new Font("Tahoma", Font.PLAIN, 30));
		JButton buttonThree = new JButton("0");
		buttonThree.setFont(new Font("Tahoma", Font.PLAIN, 30));
		JButton buttonFour = new JButton("0");
		buttonFour.setFont(new Font("Tahoma", Font.PLAIN, 30));
		
		
		
		
		
		buttonTwo.addActionListener(this);
		buttonOne.addActionListener(this);
		buttonThree.addActionListener(this);
		buttonFour.addActionListener(this);
		
		
		JTextField number = new JTextField();

		
		
		Random random = new Random();
		Integer randomNumber = random.nextInt(100);
		
		
//		guessNumberButton.addActionListener(new ActionListener() {
//	      @Override
//	      public void actionPerformed(ActionEvent actionEvent) {
//	      	try {
//	      		Integer guessNumber = Integer.valueOf(number.getText());
//	      		if(guessNumber == randomNumber) {
//	      			JOptionPane.showMessageDialog(null, "You guessed the number");
//	      		}
//	      		else if(guessNumber < randomNumber) {
//	      			JOptionPane.showMessageDialog(null, "Your number is lower than correct number");
//	      		}
//	      		else {
//	      			JOptionPane.showMessageDialog(null, "Your number is greater than correct number");
//	      		}
//	      	}
//	      	catch(NumberFormatException e) {
//	      		JOptionPane.showMessageDialog(null, "Invalid format");
//	      	}
//	
//	      }
//	  });
		

		

		
		panel.add(buttonOne);
		panel.add(buttonTwo);
		panel.add(buttonThree);
		panel.add(buttonFour);
		
		
		
		
//		
//		JLabel celsius = new JLabel("Celsius");
//		celsius.setHorizontalAlignment(SwingConstants.CENTER);
//		JLabel fahrenheit = new JLabel("Fahrenheit");
//		fahrenheit.setHorizontalAlignment(SwingConstants.CENTER);
//		
//		JTextField celsiusTextField = new JTextField();
//		JTextField fahrenheitTextField = new JTextField();
//		
//		JButton celsiusToFahrenheitButton = new JButton("Convert celsius to fahrenheit");
//		JButton FahrenheitToCelsiusButton = new JButton("Convert fahrenheit to celsius");
//		
//		Random random = new Random();
//		Integer randomNumber = random.nextInt(100);
//		
//
//		
//		celsiusToFahrenheitButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent actionEvent) {
//            	try {
//                	Double celsius = Double.valueOf(celsiusTextField.getText());
//                	Double fahrenheit = (celsius * 1.8) + 32;
//                	fahrenheitTextField.setText(String.valueOf(fahrenheit));
//            	}
//            	catch(NumberFormatException e) {
//            		JOptionPane.showMessageDialog(null, "Invalid format");
//            	}
//
//            }
//        });
//		
//		
//		FahrenheitToCelsiusButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent actionEvent) {
//            	try {
//                	Double fahrenheit = Double.valueOf(fahrenheitTextField.getText());
//                	Double celsius = (fahrenheit - 32) / 1.8;
//                	celsiusTextField.setText(String.valueOf(celsius));
//            	}
//            	catch (NumberFormatException e) {
//            		JOptionPane.showMessageDialog(null, "Invalid format");
//            	}
//
//            }
//        });
//		
//		
//		
//		panel.add(celsius);
//		panel.add(celsiusTextField);
//		panel.add(fahrenheit);
//		panel.add(fahrenheitTextField);
//		panel.add(celsiusToFahrenheitButton);
//		panel.add(FahrenheitToCelsiusButton);

		setContentPane(panel);
	}


	
	
	// JButton, JTextField, JLabel;

}
