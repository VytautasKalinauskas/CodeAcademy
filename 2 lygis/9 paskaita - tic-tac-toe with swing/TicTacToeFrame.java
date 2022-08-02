import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;

public class TicTacToeFrame extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton button1, button2, button3, button4, button5, button6, button7, button8, button9;
	private Character player = 'X';
	private Integer movesCount = 0;
	
	
	
	private String checkWinner() {
		
		/* check horizontal lines */
		if(button1.getText().equals(button2.getText()) && button1.getText().equals(button3.getText()) && !button1.getText().equals(" ")) {
			return button1.getText();
		}
		else if(button4.getText().equals(button5.getText()) && button4.getText().equals(button6.getText()) && !button4.getText().equals(" ")) {
			return button4.getText();
		}
		else if(button7.getText().equals(button8.getText()) && button7.getText().equals(button9.getText()) && !button7.getText().equals(" ")) {
			return button7.getText();
		}
		
		
		/* check vertical lines */
		else if(button1.getText().equals(button4.getText()) && button1.getText().equals(button7.getText()) && !button1.getText().equals(" ")) {
			return button1.getText();
		}
		else if(button2.getText().equals(button5.getText()) && button2.getText().equals(button8.getText()) && !button2.getText().equals(" ")) {
			return button2.getText();
		}
		else if(button3.getText().equals(button6.getText()) && button3.getText().equals(button9.getText()) && !button3.getText().equals(" ")) {
			return button3.getText();
		}
		else if(button1.getText().equals(button2.getText()) && button1.getText().equals(button3.getText()) && !button1.getText().equals(" ")) {
			return button1.getText();
		}
		
		
		/* check diagonals */
		else if(button1.getText().equals(button5.getText()) && button1.getText().equals(button9.getText()) && !button1.getText().equals(" ")) {
			return button1.getText();
		}
		else if(button3.getText().equals(button5.getText()) && button3.getText().equals(button7.getText()) && !button3.getText().equals(" ")) {
			return button3.getText();
		}
		
		
		return null;
	}
	
	private void resetBoard() {
		button1.setText(" ");
		button2.setText(" ");
		button3.setText(" ");
		button4.setText(" ");
		button5.setText(" ");
		button6.setText(" ");
		button7.setText(" ");
		button8.setText(" ");
		button9.setText(" ");
		player = 'X';
		movesCount = 0;
	}
	
	
	private boolean cellTaken(JButton button) {
		Character buttonText = button.getText().charAt(0);
		return buttonText.equals('X') || buttonText.equals('O');
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton button = (JButton)e.getSource();
		if(cellTaken(button)) {
			JOptionPane.showMessageDialog(null, "The cell is already taken");
		}
		else {
			button.setText(player.toString());
			if(player.equals('X')) {
				player = 'O';
			}
			else {
				player = 'X';
			}
			movesCount++;
		}
		
		String winner = checkWinner();
		if(winner != null) {
			int playAgain = JOptionPane.showConfirmDialog(null, "Game Over. " + winner + " wins. Would you like to play again?", "Game over.", JOptionPane.YES_NO_OPTION);
			if(playAgain == JOptionPane.YES_OPTION) {
				resetBoard();
			}
			else {
				System.exit(0);
			}
		}
		
		if(movesCount == 9 && winner == null) {
			int playAgain = JOptionPane.showConfirmDialog(null, "Game Over its a draw. Would you like to play again?", "Game over.", JOptionPane.YES_NO_OPTION);
			if(playAgain == JOptionPane.YES_OPTION) {
				resetBoard();
			}
			else {
				System.exit(0);
			}
		}
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		TicTacToeFrame frame = new TicTacToeFrame();
		frame.setTitle("Tic-Tac-Toe");
		frame.setSize(600, 600);
		frame.setVisible(true);
	}
	
	/**
	 * Create the frame.
	 */
	public TicTacToeFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setLayout(new GridLayout(3,3));
		initializeButtons(contentPane);
		setContentPane(contentPane);
		
	}	
	
	
	public void initializeButtons(JPanel contentPane) {
		
		button1 = new JButton(" ");
		button1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		button2 = new JButton(" ");
		button2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		button3 = new JButton(" ");
		button3.setFont(new Font("Tahoma", Font.PLAIN, 30));
		button4 = new JButton(" ");
		button4.setFont(new Font("Tahoma", Font.PLAIN, 30));
		button5 = new JButton(" ");
		button5.setFont(new Font("Tahoma", Font.PLAIN, 30));
		button6 = new JButton(" ");
		button6.setFont(new Font("Tahoma", Font.PLAIN, 30));
		button7 = new JButton(" ");
		button7.setFont(new Font("Tahoma", Font.PLAIN, 30));
		button8 = new JButton(" ");
		button8.setFont(new Font("Tahoma", Font.PLAIN, 30));
		button9 = new JButton(" ");
		button9.setFont(new Font("Tahoma", Font.PLAIN, 30));
		
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
		button6.addActionListener(this);
		button7.addActionListener(this);
		button8.addActionListener(this);
		button9.addActionListener(this);
		
		contentPane.add(button1);
		contentPane.add(button2);
		contentPane.add(button3);
		contentPane.add(button4);
		contentPane.add(button5);
		contentPane.add(button6);
		contentPane.add(button7);
		contentPane.add(button8);
		contentPane.add(button9);
	
	}

	

}
