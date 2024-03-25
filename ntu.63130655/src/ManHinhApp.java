import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class ManHinhApp extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtKQ;
	private JTextField txtNhap;

	public ManHinhApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 743);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(55, 68, 83));
		contentPane.setBackground(new Color(55, 68, 83));
		contentPane.setBorder(new EmptyBorder(10, 10, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cmd = e.getActionCommand();
				txtNhap.setText(txtNhap.getText() + cmd);
			}
		});
		btn0.setFont(new Font("Times New Roman", Font.BOLD, 40));
		btn0.setForeground(new Color(255, 255, 255));
		btn0.setBackground(new Color(36, 44, 55));
		btn0.setBounds(25, 601, 80, 80);
		contentPane.add(btn0);
		
		JButton btn_cham = new JButton(".");
		btn_cham.setForeground(new Color(255, 255, 255));
		btn_cham.setFont(new Font("Times New Roman", Font.BOLD, 40));
		btn_cham.setBackground(new Color(36, 44, 55));
		btn_cham.setBounds(128, 601, 80, 80);
		contentPane.add(btn_cham);
		
		JButton btn_Xoa = new JButton("<=");
		btn_Xoa.setForeground(new Color(135, 146, 146));
		btn_Xoa.setFont(new Font("Times New Roman", Font.BOLD, 40));
		btn_Xoa.setBackground(new Color(36, 44, 55));
		btn_Xoa.setBounds(233, 601, 80, 80);
		contentPane.add(btn_Xoa);
		
		JButton btn_Bang = new JButton("=");
		btn_Bang.setForeground(new Color(135, 146, 146));
		btn_Bang.setFont(new Font("Times New Roman", Font.BOLD, 40));
		btn_Bang.setBackground(new Color(36, 44, 55));
		btn_Bang.setBounds(334, 601, 80, 80);
		contentPane.add(btn_Bang);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cmd = e.getActionCommand();
				txtNhap.setText(txtNhap.getText() + cmd);
			}
		});
		
		btn1.setForeground(new Color(255, 255, 255));
		btn1.setFont(new Font("Times New Roman", Font.BOLD, 40));
		btn1.setBackground(new Color(36, 44, 55));
		btn1.setBounds(25, 497, 80, 80);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cmd = e.getActionCommand();
				txtNhap.setText(txtNhap.getText() + cmd);
			}
		});
		btn2.setForeground(new Color(255, 255, 255));
		btn2.setFont(new Font("Times New Roman", Font.BOLD, 40));
		btn2.setBackground(new Color(36, 44, 55));
		btn2.setBounds(128, 497, 80, 80);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cmd = e.getActionCommand();
				txtNhap.setText(txtNhap.getText() + cmd);
			}
		});
		btn3.setForeground(new Color(255, 255, 255));
		btn3.setFont(new Font("Times New Roman", Font.BOLD, 40));
		btn3.setBackground(new Color(36, 44, 55));
		btn3.setBounds(233, 497, 80, 80);
		contentPane.add(btn3);
		
		JButton btn_Cong = new JButton("+");
		btn_Cong.setForeground(new Color(135, 146, 146));
		btn_Cong.setFont(new Font("Times New Roman", Font.BOLD, 40));
		btn_Cong.setBackground(new Color(36, 44, 55));
		btn_Cong.setBounds(334, 497, 80, 80);
		contentPane.add(btn_Cong);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cmd = e.getActionCommand();
				txtNhap.setText(txtNhap.getText() + cmd);
			}
		});
		btn4.setForeground(new Color(255, 255, 255));
		btn4.setFont(new Font("Times New Roman", Font.BOLD, 40));
		btn4.setBackground(new Color(36, 44, 55));
		btn4.setBounds(25, 390, 80, 80);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cmd = e.getActionCommand();
				txtNhap.setText(txtNhap.getText() + cmd);
			}
		});
		btn5.setForeground(new Color(255, 255, 255));
		btn5.setFont(new Font("Times New Roman", Font.BOLD, 40));
		btn5.setBackground(new Color(36, 44, 55));
		btn5.setBounds(128, 390, 80, 80);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cmd = e.getActionCommand();
				txtNhap.setText(txtNhap.getText() + cmd);
			}
		});
		btn6.setForeground(new Color(255, 255, 255));
		btn6.setFont(new Font("Times New Roman", Font.BOLD, 40));
		btn6.setBackground(new Color(36, 44, 55));
		btn6.setBounds(233, 390, 80, 80);
		contentPane.add(btn6);
		
		JButton btn_Tru = new JButton("-");
		btn_Tru.setForeground(new Color(135, 146, 146));
		btn_Tru.setFont(new Font("Times New Roman", Font.BOLD, 40));
		btn_Tru.setBackground(new Color(36, 44, 55));
		btn_Tru.setBounds(334, 390, 80, 80);
		contentPane.add(btn_Tru);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cmd = e.getActionCommand();
				txtNhap.setText(txtNhap.getText() + cmd);
			}
		});
		btn7.setForeground(new Color(255, 255, 255));
		btn7.setFont(new Font("Times New Roman", Font.BOLD, 40));
		btn7.setBackground(new Color(36, 44, 55));
		btn7.setBounds(25, 292, 80, 80);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cmd = e.getActionCommand();
				txtNhap.setText(txtNhap.getText() + cmd);
			}
		});
		btn8.setForeground(new Color(255, 255, 255));
		btn8.setFont(new Font("Times New Roman", Font.BOLD, 40));
		btn8.setBackground(new Color(36, 44, 55));
		btn8.setBounds(128, 292, 80, 80);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cmd = e.getActionCommand();
				txtNhap.setText(txtNhap.getText() + cmd);
			}
		});
		btn9.setForeground(new Color(255, 255, 255));
		btn9.setFont(new Font("Times New Roman", Font.BOLD, 40));
		btn9.setBackground(new Color(36, 44, 55));
		btn9.setBounds(233, 292, 80, 80);
		contentPane.add(btn9);
		
		JButton btn_nhan = new JButton("*");
		btn_nhan.setForeground(new Color(135, 146, 146));
		btn_nhan.setFont(new Font("Times New Roman", Font.BOLD, 40));
		btn_nhan.setBackground(new Color(36, 44, 55));
		btn_nhan.setBounds(334, 292, 80, 80);
		contentPane.add(btn_nhan);
		
		JButton btnC = new JButton("C");
		btnC.setForeground(new Color(135, 146, 146));
		btnC.setFont(new Font("Times New Roman", Font.BOLD, 40));
		btnC.setBackground(new Color(36, 44, 55));
		btnC.setBounds(25, 191, 80, 80);
		contentPane.add(btnC);
		
		JButton btn_DoiDau = new JButton("+/-");
		btn_DoiDau.setForeground(new Color(135, 146, 146));
		btn_DoiDau.setFont(new Font("Times New Roman", Font.BOLD, 40));
		btn_DoiDau.setBackground(new Color(36, 44, 55));
		btn_DoiDau.setBounds(128, 191, 80, 80);
		contentPane.add(btn_DoiDau);
		
		JButton btn_ChiaDu = new JButton("%");
		btn_ChiaDu.setForeground(new Color(135, 146, 146));
		btn_ChiaDu.setFont(new Font("Times New Roman", Font.BOLD, 40));
		btn_ChiaDu.setBackground(new Color(36, 44, 55));
		btn_ChiaDu.setBounds(233, 191, 80, 80);
		contentPane.add(btn_ChiaDu);
		
		JButton btn_ChiaHet = new JButton("/");
		btn_ChiaHet.setForeground(new Color(135, 146, 146));
		btn_ChiaHet.setFont(new Font("Times New Roman", Font.BOLD, 40));
		btn_ChiaHet.setBackground(new Color(36, 44, 55));
		btn_ChiaHet.setBounds(334, 191, 80, 80);
		contentPane.add(btn_ChiaHet);
		
		txtKQ = new JTextField();
		txtKQ.setHorizontalAlignment(SwingConstants.RIGHT);
		txtKQ.setFont(new Font("Times New Roman", Font.BOLD, 85));
		txtKQ.setForeground(new Color(255, 255, 255));
		txtKQ.setBackground(new Color(55, 67, 83));
		txtKQ.setEditable(false);
		txtKQ.setBounds(10, 40, 416, 75);
		contentPane.add(txtKQ);
		txtKQ.setColumns(10);
		
		txtNhap = new JTextField();
		txtNhap.setFont(new Font("Times New Roman", Font.BOLD, 53));
		txtNhap.setForeground(new Color(134, 145, 145));
		txtNhap.setHorizontalAlignment(SwingConstants.RIGHT);
		txtNhap.setBackground(new Color(55, 67, 83));
		txtNhap.setBounds(10, 125, 416, 37);
		contentPane.add(txtNhap);
		txtNhap.setColumns(10);
	}
}
