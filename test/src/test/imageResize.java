package test;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;


import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JSlider;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.ChangeListener;
import javax.swing.plaf.SliderUI;
import javax.swing.event.ChangeEvent;
import javax.swing.JTextField;

public class imageResize {

	public static int val=0; 									//EDRISEBAHER@GMAIL.COM													//Add codes to create image loader here!
	private JFrame frmEdrisebahergmailcomImage;
	private JTextField t;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					imageResize window = new imageResize();
					window.frmEdrisebahergmailcomImage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public imageResize() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEdrisebahergmailcomImage = new JFrame();
		frmEdrisebahergmailcomImage.setTitle("edrisebaher@gmail.com - IMAGE LOADER APP");
		frmEdrisebahergmailcomImage.setBounds(100, 100, 608, 393);
		frmEdrisebahergmailcomImage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEdrisebahergmailcomImage.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Click Button Load Image!");
		lblNewLabel.setBounds(10, 55, 572, 219);
		frmEdrisebahergmailcomImage.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Load Image!");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
																												//Add codes to create image loader here!
				
				//lblNewLabel.setIcon(new ImageIcon("images/thumb-1920-513116.png"));
				lblNewLabel.setText("");
				ImageIcon dabIcon= new ImageIcon("images/thumb-1920-513116.png");
				Image dabImage=dabIcon.getImage();
				Image modImage=dabImage.getScaledInstance(val, val, java.awt.Image.SCALE_SMOOTH);
				dabIcon=new ImageIcon(modImage);
				lblNewLabel.setIcon(dabIcon);
			}
		});
		btnNewButton.setBounds(10, 285, 181, 23);
		frmEdrisebahergmailcomImage.getContentPane().add(btnNewButton);
		
		JLabel lblImageResizeApp = new JLabel("Image Resize App");
		lblImageResizeApp.setFont(new Font("Segoe UI", Font.BOLD, 17));
		lblImageResizeApp.setBounds(219, 11, 181, 43);
		frmEdrisebahergmailcomImage.getContentPane().add(lblImageResizeApp);
		
		t = new JTextField();
		t.setBounds(10, 319, 181, 20);
		frmEdrisebahergmailcomImage.getContentPane().add(t);
		t.setColumns(10);
		
		JSlider slider = new JSlider();
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
																									//Add codes to create image loader here!
				val=slider.getValue();
				t.setText(Integer.toString(val));
				
				
			}
		});
		slider.setMajorTickSpacing(100);
		slider.setSnapToTicks(true);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		slider.setMinimum(100);
		slider.setMaximum(800);
		slider.setBounds(219, 285, 363, 59);
		frmEdrisebahergmailcomImage.getContentPane().add(slider);
	}
}
