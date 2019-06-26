package jcalc_pk;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrontCalc extends JFrame {

	private JPanel contentPane;
	private JTextField txtMain;
	private JTextField txtPrevious;
	private BackCalc back = new BackCalc();
	private boolean check = true;

	public FrontCalc() {

		setTitle("jCalc");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 315, 375);
		setLocationRelativeTo(null);

		contentPane = new JPanel();
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtPrevious = new JTextField();
		txtPrevious.setEditable(false);
		txtPrevious.setBounds(10, 11, 290, 20);
		contentPane.add(txtPrevious);
		txtPrevious.setColumns(10);

		txtMain = new JTextField();
		txtMain.setText("");
		txtMain.setEditable(false);
		txtMain.setBounds(10, 41, 290, 50);
		contentPane.add(txtMain);
		txtMain.setColumns(10);

		// ++++++++++++++++++++++++++++++++ Buttons - Numbers ++++++++++++++++++++++++++++++++
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				writeTxtMain("0");

			}

		});
		btn0.setBounds(10, 285, 110, 50);
		contentPane.add(btn0);

		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				writeTxtMain("1");

			}

		});
		btn1.setBounds(10, 224, 50, 50);
		contentPane.add(btn1);

		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				writeTxtMain("2");

			}

		});
		btn2.setBounds(70, 224, 50, 50);
		contentPane.add(btn2);

		JButton btn3 = new JButton("3");

		btn3.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				writeTxtMain("3");

			}

		});
		btn3.setBounds(130, 224, 50, 50);
		contentPane.add(btn3);

		JButton btn4 = new JButton("4");

		btn4.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				writeTxtMain("4");

			}

		});
		btn4.setBounds(10, 163, 50, 50);
		contentPane.add(btn4);

		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				writeTxtMain("5");

			}

		});
		btn5.setBounds(70, 163, 50, 50);
		contentPane.add(btn5);

		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				writeTxtMain("6");

			}

		});
		btn6.setBounds(130, 163, 50, 50);
		contentPane.add(btn6);

		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				writeTxtMain("7");

			}

		});
		btn7.setBounds(10, 102, 50, 50);
		contentPane.add(btn7);

		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				writeTxtMain("8");

			}

		});
		btn8.setBounds(70, 102, 50, 50);
		contentPane.add(btn8);

		JButton btn9 = new JButton("9");

		btn9.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				writeTxtMain("9");

			}

		});
		btn9.setBounds(130, 102, 50, 50);
		contentPane.add(btn9);

		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				writeTxtMain(".");

			}

		// ++++++++++++++++++++++++++++++++ Buttons - Functions ++++++++++++++++++++++++++++++++
			
		});
		btnDot.setBounds(130, 285, 50, 50);
		contentPane.add(btnDot);

		JButton btnCE = new JButton("CE");
		btnCE.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				removeLast();

			}

		});
		btnCE.setBounds(190, 102, 50, 50);
		contentPane.add(btnCE);

		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				cleanAllValues();

			}

		});
		btnC.setBounds(190, 163, 50, 50);
		contentPane.add(btnC);

		// ++++++++++++++++++++++++++++++++ Buttons - Operators ++++++++++++++++++++++++++++++++
		
		JButton btnSom = new JButton("+");
		btnSom.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (!txtMain.getText().equals("")) {

					back.setValueA(txtMain.getText());
					back.setOp("+");
					txtPrevious.setText(back.getValueA() + back.getOp());
					txtMain.setText("");
					check = true;

				}

			}

		});
		btnSom.setBounds(250, 102, 50, 50);
		contentPane.add(btnSom);

		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (!txtMain.getText().equals("")) {

					back.setValueA(txtMain.getText());
					back.setOp("-");
					txtPrevious.setText(back.getValueA() + back.getOp());
					txtMain.setText("");
					check = true;

				}

			}

		});
		btnSub.setBounds(250, 163, 50, 50);
		contentPane.add(btnSub);

		JButton btnMul = new JButton("*");
		btnMul.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (!txtMain.getText().equals("")) {

					back.setValueA(txtMain.getText());
					back.setOp("*");
					txtPrevious.setText(back.getValueA() + back.getOp());
					txtMain.setText("");
					check = true;

				}

			}

		});
		btnMul.setBounds(250, 224, 50, 50);
		contentPane.add(btnMul);

		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (!txtMain.getText().equals("")) {

					back.setValueA(txtMain.getText());
					back.setOp("/");
					txtPrevious.setText(back.getValueA() + back.getOp());
					txtMain.setText("");
					check = true;

				}

			}

		});
		btnDiv.setBounds(250, 285, 50, 50);
		contentPane.add(btnDiv);
		
		// ++++++++++++++++++++++++++++++++ Button - Result ++++++++++++++++++++++++++++++++

		JButton btnResult = new JButton("=");
		btnResult.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (!txtMain.getText().equals("")) {

					if (!back.getOp().equals("")) {

						showResult(txtMain.getText());

					}

				}

			}

		});
		btnResult.setBounds(190, 224, 50, 111);
		contentPane.add(btnResult);

	}

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {

			public void run() {

				try {

					FrontCalc frame = new FrontCalc();
					frame.setVisible(true);

				} catch (Exception e) {

					e.printStackTrace();

				}

			}

		});

	} //This class make an operations with values

	private void showResult(String input) {

		if (check == true) { //Check is true. Means that the value A and the operator have already been passed

			back.setValueB(input); //Receive the value B

			if (back.invalidOperation() == true) {

				JOptionPane.showMessageDialog(null, "Não é possivel dividir por zero!");

			} else {

				txtPrevious.setText(txtPrevious.getText() + back.getValueB());
				txtMain.setText("");
				writeTxtMain(back.result());
				check = false;

			}

		} else {

			txtPrevious.setText(back.getValueA() + back.getOp());
			check = true;

		}

	}

	private void cleanAllValues() { //Clear all values

		txtMain.setText("");
		txtPrevious.setText("");
		back.cleanValues();

	}

	private void removeLast() { //Remove last element in to txtMain

		int sizeTxt = txtMain.getText().length();

		if (!txtMain.getText().isEmpty()) {

			txtMain.setText(txtMain.getText().substring(0, sizeTxt - 1));

		} else {

			txtMain.setText("");

		}

	}

	private void writeTxtMain(String input) { //Write in to txtMain

		if (txtMain.getText().isEmpty() && input.equals(".")) {

			txtMain.setText("");

		} else {

			txtMain.setText(txtMain.getText() + input);
			txtMain.setText(txtMain.getText().replace("..", ".")); //Replace .. for .

		}

	}

}
