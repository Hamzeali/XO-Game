import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.border.CompoundBorder;

public class XOgame {
	
	
	
	int turn = 2;
	int buttonused[] = {0, 0, 0, 0, 0, 0, 0, 0, 0};
	int p1won[] = {0, 0, 0, 0, 0, 0, 0, 0, 0};
	int p2won[] = {0, 0, 0, 0, 0, 0, 0, 0, 0};
	
	int p1won() {
		if(p1won[0] == 1 && p1won[1] == 1 && p1won[2] == 1) {
			return 1;
		}
		
		if(p1won[3] == 1 && p1won[4] == 1 && p1won[5] == 1) {
			return 1;
		}
		
		if(p1won[6] == 1 && p1won[7] == 1 && p1won[8] == 1) {
			return 1;
		}
		
		if(p1won[0] == 1 && p1won[3] == 1 && p1won[6] == 1) {
			return 1;
		}
		
		if(p1won[1] == 1 && p1won[4] == 1 && p1won[7] == 1) {
			return 1;
		}
		
		if(p1won[2] == 1 && p1won[5] == 1 && p1won[8] == 1) {
			return 1;
		}
		
		if(p1won[2] == 1 && p1won[4] == 1 && p1won[6] == 1) {
			return 1;
		}
		
		if(p1won[0] == 1 && p1won[4] == 1 && p1won[8] == 1) {
			return 1;
		}
		return 0;
		
	}
	
	int p2won() {
		if(p2won[0] == 1 && p2won[1] == 1 && p2won[2] == 1) {
			return 1;
		}
		
		if(p2won[3] == 1 && p2won[4] == 1 && p2won[5] == 1) {
			return 1;
		}
		
		if(p2won[6] == 1 && p2won[7] == 1 && p2won[8] == 1) {
			return 1;
		}
		
		if(p2won[0] == 1 && p2won[3] == 1 && p2won[6] == 1) {
			return 1;
		}
		
		if(p2won[1] == 1 && p2won[4] == 1 && p2won[7] == 1) {
			return 1;
		}
		
		if(p2won[2] == 1 && p2won[5] == 1 && p2won[8] == 1) {
			return 1;
		}
		
		if(p2won[2] == 1 && p2won[4] == 1 && p2won[6] == 1) {
			return 1;
		}
		
		if(p2won[0] == 1 && p2won[4] == 1 && p2won[8] == 1) {
			return 1;
		}
		return 0;
		
	}

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
	 	 UIManager.put("OptionPane.background", Color.LIGHT_GRAY);
		 UIManager.put("Panel.background", Color.LIGHT_GRAY);
		 UIManager.put("Button.background", Color.GRAY);
		 
		 
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					XOgame window = new XOgame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public XOgame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setBounds(100, 100, 315, 297);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton b1 = new JButton("");
		b1.setFocusPainted(false);
		b1.setForeground(Color.BLACK);
		b1.setBackground(Color.LIGHT_GRAY);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(buttonused[0] == 0)
				{
					if((turn % 2) == 0)
					{
						turn++;
						b1.setText("X");
						buttonused[0] = 1;
						p1won[0] = 1;
						
						int result1 = p1won();
						int result2 = p2won();
						
						if(result1 == 1)
						{
							JOptionPane.showMessageDialog(null, "Player 1 has won");
						}

						else if(result2 == 1)
						{
							JOptionPane.showMessageDialog(null, "Player 2 has won");
						}
					}
					else
					{
						turn++;
						b1.setText("O");
						buttonused[0] = 1;
						p2won[0] = 1;
						
						int result1 = p1won();
						int result2 = p2won();
						
						if(result1 == 1)
						{
							JOptionPane.showMessageDialog(null, "Player 1 has won");
						}

						else if(result2 == 1)
						{
							JOptionPane.showMessageDialog(null, "Player 2 has won");
						}
					
					}
				}
				else
				{
					JOptionPane.showMessageDialog(null, "You can't press again!");
				}
			}
		});
		b1.setFont(new Font("Times New Roman", Font.BOLD, 30));
		b1.setBounds(10, 11, 89, 59);
		frame.getContentPane().add(b1);
		
		JButton b2 = new JButton("");
		b2.setFocusPainted(false);
		b2.setBackground(Color.LIGHT_GRAY);
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(buttonused[1] == 0)
				{
					if((turn % 2) == 0)
					{
						turn++;
						b2.setText("X");
						buttonused[1] = 1;
						p1won[1] = 1;
						
						int result1 = p1won();
						int result2 = p2won();
						
						if(result1 == 1)
						{
							JOptionPane.showMessageDialog(null, "Player 1 has won");
						}

						else if(result2 == 1)
						{
							JOptionPane.showMessageDialog(null, "Player 2 has won");
						}
					}
					else
					{
						turn++;
						b2.setText("O");
						buttonused[1] = 1;
						p2won[1] = 1;
						
						int result1 = p1won();
						int result2 = p2won();
						
						if(result1 == 1)
						{
							JOptionPane.showMessageDialog(null, "Player 1 has won");
						}

						else if(result2 == 1)
						{
							JOptionPane.showMessageDialog(null, "Player 2 has won");
						}
					}
				}
				else
				{
					JOptionPane.showMessageDialog(null, "You can't press again!");
				}
			}
		});
		b2.setFont(new Font("Times New Roman", Font.BOLD, 30));
		b2.setBounds(109, 11, 89, 59);
		frame.getContentPane().add(b2);
		
		JButton b3 = new JButton("");
		b3.setFocusPainted(false);
		b3.setForeground(Color.BLACK);
		b3.setBackground(Color.LIGHT_GRAY);
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(buttonused[2] == 0)
				{
					if((turn % 2) == 0)
					{
						turn++;
						b3.setText("X");
						buttonused[2] = 1;
						p1won[2] = 1;
						
						int result1 = p1won();
						int result2 = p2won();
						
						if(result1 == 1)
						{
							JOptionPane.showMessageDialog(null, "Player 1 has won");
						}

						else if(result2 == 1)
						{
							JOptionPane.showMessageDialog(null, "Player 2 has won");
						}
					}
					else
					{
						turn++;
						b3.setText("O");
						buttonused[2] = 1;
						p2won[2] = 1;
						
						int result1 = p1won();
						int result2 = p2won();
						
						if(result1 == 1)
						{
							JOptionPane.showMessageDialog(null, "Player 1 has won");
						}

						else if(result2 == 1)
						{
							JOptionPane.showMessageDialog(null, "Player 2 has won");
						}
					}
				}
				else
				{
					JOptionPane.showMessageDialog(null, "You can't press again!");
				}
			}
		});
		b3.setFont(new Font("Times New Roman", Font.BOLD, 30));
		b3.setBounds(209, 11, 89, 59);
		frame.getContentPane().add(b3);
		
		JButton b4 = new JButton("");
		b4.setFocusPainted(false);
		b4.setForeground(Color.BLACK);
		b4.setBackground(Color.LIGHT_GRAY);
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(buttonused[3] == 0)
				{
					if((turn % 2) == 0)
					{
						turn++;
						b4.setText("X");
						buttonused[3] = 1;
						p1won[3] = 1;
						
						int result1 = p1won();
						int result2 = p2won();
						
						if(result1 == 1)
						{
							JOptionPane.showMessageDialog(null, "Player 1 has won");
						}

						else if(result2 == 1)
						{
							JOptionPane.showMessageDialog(null, "Player 2 has won");
						}
					}
					else
					{
						turn++;
						b4.setText("O");
						buttonused[3] = 1;
						p2won[3] = 1;
						
						int result1 = p1won();
						int result2 = p2won();
						
						if(result1 == 1)
						{
							JOptionPane.showMessageDialog(null, "Player 1 has won");
						}

						else if(result2 == 1)
						{
							JOptionPane.showMessageDialog(null, "Player 2 has won");
						}
					}
				}
				else
				{
					JOptionPane.showMessageDialog(null, "You can't press again!");
				}
			}
		});
		b4.setFont(new Font("Times New Roman", Font.BOLD, 30));
		b4.setBounds(10, 81, 89, 59);
		frame.getContentPane().add(b4);
		
		JButton b5 = new JButton("");
		b5.setFocusPainted(false);
		b5.setForeground(Color.BLACK);
		b5.setBackground(Color.LIGHT_GRAY);
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(buttonused[4] == 0)
				{
					if((turn % 2) == 0)
					{
						turn++;
						b5.setText("X");
						buttonused[4] = 1;
						p1won[4] = 1;
						
						int result1 = p1won();
						int result2 = p2won();
						
						if(result1 == 1)
						{
							JOptionPane.showMessageDialog(null, "Player 1 has won");
						}

						else if(result2 == 1)
						{
							JOptionPane.showMessageDialog(null, "Player 2 has won");
						}
					}
					else
					{
						turn++;
						b5.setText("O");
						buttonused[4] = 1;
						p2won[4] = 1;
						
						int result1 = p1won();
						int result2 = p2won();
						
						if(result1 == 1)
						{
							JOptionPane.showMessageDialog(null, "Player 1 has won");
						}

						else if(result2 == 1)
						{
							JOptionPane.showMessageDialog(null, "Player 2 has won");
						}
					}
				}
				else
				{
					JOptionPane.showMessageDialog(null, "You can't press again!");
				}
			}
		});
		b5.setFont(new Font("Times New Roman", Font.BOLD, 30));
		b5.setBounds(109, 81, 89, 59);
		frame.getContentPane().add(b5);
		
		JButton b6 = new JButton("");
		b6.setFocusPainted(false);
		b6.setForeground(Color.BLACK);
		b6.setBackground(Color.LIGHT_GRAY);
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(buttonused[5] == 0)
				{
					if((turn % 2) == 0)
					{
						turn++;
						b6.setText("X");
						buttonused[5] = 1;
						p1won[5] = 1;
						
						int result1 = p1won();
						int result2 = p2won();
						
						if(result1 == 1)
						{
							JOptionPane.showMessageDialog(null, "Player 1 has won");
						}

						else if(result2 == 1)
						{
							JOptionPane.showMessageDialog(null, "Player 2 has won");
						}
					}
					else
					{
						turn++;
						b6.setText("O");
						buttonused[5] = 1;
						p2won[5] = 1;
						
						int result1 = p1won();
						int result2 = p2won();
						
						if(result1 == 1)
						{
							JOptionPane.showMessageDialog(null, "Player 1 has won");
						}

						else if(result2 == 1)
						{
							JOptionPane.showMessageDialog(null, "Player 2 has won");
						}
					}
				}
				else
				{
					JOptionPane.showMessageDialog(null, "You can't press again!");
				}
			}
		});
		b6.setFont(new Font("Times New Roman", Font.BOLD, 30));
		b6.setBounds(209, 81, 89, 59);
		frame.getContentPane().add(b6);
		
		JButton b7 = new JButton("");
		b7.setFocusPainted(false);
		b7.setForeground(Color.BLACK);
		b7.setBackground(Color.LIGHT_GRAY);
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(buttonused[6] == 0)
				{
					if((turn % 2) == 0)
					{
						turn++;
						b7.setText("X");
						buttonused[6] = 1;
						p1won[6] = 1;
						
						int result1 = p1won();
						int result2 = p2won();
						
						if(result1 == 1)
						{
							JOptionPane.showMessageDialog(null, "Player 1 has won");
						}

						else if(result2 == 1)
						{
							JOptionPane.showMessageDialog(null, "Player 2 has won");
						}
					}
					else
					{
						turn++;
						b7.setText("O");
						buttonused[6] = 1;
						p2won[6] = 1;
						
						int result1 = p1won();
						int result2 = p2won();
						
						if(result1 == 1)
						{
							JOptionPane.showMessageDialog(null, "Player 1 has won");
						}

						else if(result2 == 1)
						{
							JOptionPane.showMessageDialog(null, "Player 2 has won");
						}
					}
				}
				else
				{
					JOptionPane.showMessageDialog(null, "You can't press again!");
				}
			}
		});
		b7.setFont(new Font("Times New Roman", Font.BOLD, 30));
		b7.setBounds(10, 151, 89, 59);
		frame.getContentPane().add(b7);
		
		JButton b8 = new JButton("");
		b8.setFocusPainted(false);
		b8.setForeground(Color.BLACK);
		b8.setBackground(Color.LIGHT_GRAY);
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(buttonused[7] == 0)
				{
					if((turn % 2) == 0)
					{
						turn++;
						b8.setText("X");
						buttonused[7] = 1;
						p1won[7] = 1;
						
						int result1 = p1won();
						int result2 = p2won();
						
						if(result1 == 1)
						{
							JOptionPane.showMessageDialog(null, "Player 1 has won");
						}

						else if(result2 == 1)
						{
							JOptionPane.showMessageDialog(null, "Player 2 has won");
						}
					}
					else
					{
						turn++;
						b8.setText("O");
						buttonused[7] = 1;
						p2won[7] = 1;
						
						int result1 = p1won();
						int result2 = p2won();
						
						if(result1 == 1)
						{
							JOptionPane.showMessageDialog(null, "Player 1 has won");
						}

						else if(result2 == 1)
						{
							JOptionPane.showMessageDialog(null, "Player 2 has won");
						}
					}
				}
				else
				{
					JOptionPane.showMessageDialog(null, "You can't press again!");
				}
			}
		});
		b8.setFont(new Font("Times New Roman", Font.BOLD, 30));
		b8.setBounds(109, 151, 89, 59);
		frame.getContentPane().add(b8);
		
		JButton b9 = new JButton("");
		b9.setFocusPainted(false);
		b9.setForeground(Color.BLACK);
		b9.setBackground(Color.LIGHT_GRAY);
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(buttonused[8] == 0)
				{
					if((turn % 2) == 0)
					{
						turn++;
						b9.setText("X");
						buttonused[8] = 1;
						p1won[8] = 1;
						
						int result1 = p1won();
						int result2 = p2won();
						
						if(result1 == 1)
						{
							JOptionPane.showMessageDialog(null, "Player 1 has won");
						}

						else if(result2 == 1)
						{
							JOptionPane.showMessageDialog(null, "Player 2 has won");
						}
					}
					else
					{
						turn++;
						b9.setText("O");
						buttonused[8] = 1;
						p2won[8] = 1;
						
						int result1 = p1won();
						int result2 = p2won();
						
						if(result1 == 1)
						{
							JOptionPane.showMessageDialog(null, "Player 1 has won");
						}

						else if(result2 == 1)
						{
							JOptionPane.showMessageDialog(null, "Player 2 has won");
						}
					}
				}
				else
				{
					JOptionPane.showMessageDialog(null, "You can't press again!");
				}
			}
		});
		b9.setFont(new Font("Times New Roman", Font.BOLD, 30));
		b9.setBounds(209, 151, 89, 59);
		frame.getContentPane().add(b9);
		
		JButton reset = new JButton("Play again");
		reset.setForeground(Color.BLUE);
		reset.setBorder(new CompoundBorder());
		reset.setFocusPainted(false);
		reset.setBackground(Color.LIGHT_GRAY);
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				b1.setText("");
				b2.setText("");
				b3.setText("");
				b4.setText("");
				b5.setText("");
				b6.setText("");
				b7.setText("");
				b8.setText("");
				b9.setText("");
				
				turn = 2;
				
				for(int i = 0; i < 9; i++) {
					buttonused[i] = 0;
				}
				for(int i = 0; i < p2won.length; i++) {
					p1won[i] = 0;
				}
				for(int i = 0; i < p2won.length; i++) {
					p2won[i] = 0;
				}
			}
		});
		reset.setFont(new Font("Times New Roman", Font.BOLD, 20));
		reset.setBounds(10, 234, 125, 23);
		frame.getContentPane().add(reset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setForeground(Color.RED);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnExit.setFocusPainted(false);
		btnExit.setBorder(new CompoundBorder());
		btnExit.setBackground(Color.LIGHT_GRAY);
		btnExit.setBounds(173, 234, 125, 23);
		frame.getContentPane().add(btnExit);
	}
}
