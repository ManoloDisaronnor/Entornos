package proyectoEntornos;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;

public class MenuFormulario extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JLabel lblNewLabel;
	private JScrollPane scrollPane;
	private JPanel panel_2;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_6;
	private JTextField textField_7;
	private JScrollPane scrollPane_1;
	private JPanel panel_2_2;
	private JLabel lblNewLabel_2_1_3;
	private JLabel lblNewLabel_2_5;
	private JLabel lblNewLabel_2_1_1_2;
	private JButton btnNewButton;
	private JLabel lblNewLabel_2_2_2;
	private JCheckBox chckbxNewCheckBox;
	private JCheckBox chckbxPatatas;
	private JCheckBox chckbxRefrescos;
	private JCheckBox chckbxAlcohol;
	private JCheckBox chckbxOtroindicarA;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			MenuFormulario dialog = new MenuFormulario();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public MenuFormulario() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(MenuFormulario.class.getResource("/proyectoEntornos/spiderman.png")));
		setTitle("FORMULARIO");
		setBounds(100, 100, 1080, 925);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(254, 255, 191));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		
		lblNewLabel = new JLabel(new ImageIcon(MenuFormulario.class.getResource("/proyectoEntornos/100_renders_de_personajes_de_Disney_en__PNG-removebg-preview.png")));
		JLabel lblNewLabel_1 = new JLabel("¡¡EY EY VAQUERO!!");
		lblNewLabel_1.setForeground(new Color(255, 128, 64));
		lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		
		scrollPane = new JScrollPane();
		scrollPane.setBackground(new Color(254, 255, 191));
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 720, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_contentPanel.createSequentialGroup()
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 281, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(Alignment.TRAILING, gl_contentPanel.createSequentialGroup()
							.addComponent(lblNewLabel_1)
							.addGap(39))))
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_contentPanel.createSequentialGroup()
					.addGap(30)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_contentPanel.createSequentialGroup()
							.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 802, Short.MAX_VALUE)
							.addContainerGap())
						.addGroup(Alignment.TRAILING, gl_contentPanel.createSequentialGroup()
							.addComponent(lblNewLabel_1)
							.addPreferredGap(ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 705, GroupLayout.PREFERRED_SIZE)
							.addGap(32))))
		);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBackground(new Color(255, 255, 255));
		scrollPane.setViewportView(tabbedPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(253, 184, 115));
		tabbedPane.addTab("DATOS PERSONALES", null, panel, null);
		
		panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		
		JLabel lblNewLabel_2_2 = new JLabel("DATOS PERSONALES PARA LA ASISTENCIA:");
		lblNewLabel_2_2.setForeground(new Color(255, 0, 128));
		lblNewLabel_2_2.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		
		JLabel lblNewLabel_2_1_2 = new JLabel(new ImageIcon(MenuFormulario.class.getResource("/proyectoEntornos/marco1.png")));
		lblNewLabel_2_1_2.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		
		JLabel lblNewLabel_2_4 = new JLabel("DIRECCIÓN:");
		lblNewLabel_2_4.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		
		JLabel lblNewLabel_2_3_2 = new JLabel("ALERGIAS:");
		lblNewLabel_2_3_2.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		
		JLabel lblNewLabel_2_3_1_2_1 = new JLabel("ENFERMEDADES:");
		lblNewLabel_2_3_1_2_1.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel(new ImageIcon(MenuFormulario.class.getResource("/proyectoEntornos/marco3.png")));
		lblNewLabel_2_1_1_1.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		
		scrollPane_1 = new JScrollPane();
		GroupLayout gl_panel_2_1 = new GroupLayout(panel_2_1);
		gl_panel_2_1.setHorizontalGroup(
			gl_panel_2_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_2_1.createSequentialGroup()
					.addComponent(lblNewLabel_2_1_2)
					.addGap(43)
					.addGroup(gl_panel_2_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_2_3_1_2_1)
						.addGroup(gl_panel_2_1.createParallelGroup(Alignment.LEADING, false)
							.addComponent(lblNewLabel_2_4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(lblNewLabel_2_3_2)))
					.addGap(32)
					.addGroup(gl_panel_2_1.createParallelGroup(Alignment.LEADING, false)
						.addComponent(textField_7)
						.addComponent(scrollPane_1)
						.addComponent(textField_6, GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
					.addComponent(lblNewLabel_2_1_1_1, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
		);
		gl_panel_2_1.setVerticalGroup(
			gl_panel_2_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2_1.createSequentialGroup()
					.addGroup(gl_panel_2_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_2_1_1_1, GroupLayout.PREFERRED_SIZE, 259, Short.MAX_VALUE)
						.addComponent(lblNewLabel_2_1_2, 0, 0, Short.MAX_VALUE)
						.addGroup(gl_panel_2_1.createSequentialGroup()
							.addGap(28)
							.addGroup(gl_panel_2_1.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_2_4)
								.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(33)
							.addGroup(gl_panel_2_1.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_2_3_2, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(39)
							.addGroup(gl_panel_2_1.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2_3_1_2_1, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
								.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		
		JTextArea textArea = new JTextArea();
		scrollPane_1.setViewportView(textArea);
		panel_2_1.setLayout(gl_panel_2_1);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("OTROS DATOS PERSONALES IMPORANTES:");
		lblNewLabel_2_2_1.setForeground(new Color(255, 0, 128));
		lblNewLabel_2_2_1.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		
		JButton btnNewButton_1 = new JButton("ENVIAR FORMULARIO");
		btnNewButton_1.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(45)
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblNewLabel_2_2_1, GroupLayout.PREFERRED_SIZE, 588, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_2_1, GroupLayout.PREFERRED_SIZE, 603, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2_2, GroupLayout.PREFERRED_SIZE, 588, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 603, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(225)
							.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 263, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(91, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(25)
					.addComponent(lblNewLabel_2_2, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addGap(26)
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 259, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
					.addComponent(lblNewLabel_2_2_1, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addGap(37)
					.addComponent(panel_2_1, GroupLayout.PREFERRED_SIZE, 259, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addGap(50))
		);
		
		JLabel lblNewLabel_2 = new JLabel("NOMBRE:");
		lblNewLabel_2.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		
		JLabel lblNewLabel_2_1 = new JLabel(new ImageIcon(MenuFormulario.class.getResource("/proyectoEntornos/marco1.png")));
		lblNewLabel_2_1.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		
		JLabel lblNewLabel_2_1_1 = new JLabel(new ImageIcon(MenuFormulario.class.getResource("/proyectoEntornos/marco3.png")));
		lblNewLabel_2_1_1.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblNewLabel_2_3 = new JLabel("APELLIDOS:");
		lblNewLabel_2_3.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2_3_1 = new JLabel("EDAD:");
		lblNewLabel_2_3_1.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_2_3_1_1 = new JLabel("TELEFONO:");
		lblNewLabel_2_3_1_1.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_2_3_1_2 = new JLabel("CORREO:");
		lblNewLabel_2_3_1_2.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addComponent(lblNewLabel_2_1)
					.addGap(43)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2)
								.addComponent(lblNewLabel_2_3)
								.addComponent(lblNewLabel_2_3_1_2, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE))
							.addGap(28)
							.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING, false)
								.addComponent(textField_4)
								.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
								.addComponent(textField, GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)))
						.addGroup(gl_panel_2.createSequentialGroup()
							.addComponent(lblNewLabel_2_3_1)
							.addGap(33)
							.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
							.addGap(78)
							.addComponent(lblNewLabel_2_3_1_1, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
					.addComponent(lblNewLabel_2_1_1, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING, false)
							.addComponent(lblNewLabel_2_1_1, GroupLayout.PREFERRED_SIZE, 259, Short.MAX_VALUE)
							.addComponent(lblNewLabel_2_1, 0, 0, Short.MAX_VALUE))
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGap(28)
							.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2))
							.addGap(33)
							.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_2_3, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(39)
							.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2_3_1_2, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(41)
							.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
									.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addComponent(lblNewLabel_2_3_1_1, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
									.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblNewLabel_2_3_1, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel_2.setLayout(gl_panel_2);
		panel.setLayout(gl_panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(253, 184, 115));
		tabbedPane.addTab("OTROS DATOS", null, panel_1, null);
		
		panel_2_2 = new JPanel();
		panel_2_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		
		lblNewLabel_2_1_3 = new JLabel(new ImageIcon(MenuFormulario.class.getResource("/proyectoEntornos/marco1.png")));
		lblNewLabel_2_1_3.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		
		lblNewLabel_2_5 = new JLabel("¿Qué vas a aportar a mi fiesta?");
		lblNewLabel_2_5.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		
		lblNewLabel_2_1_1_2 = new JLabel(new ImageIcon(MenuFormulario.class.getResource("/proyectoEntornos/marco3.png")));
		lblNewLabel_2_1_1_2.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		
		chckbxNewCheckBox = new JCheckBox("Risas");
		chckbxNewCheckBox.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		
		chckbxPatatas = new JCheckBox("Patatas");
		chckbxPatatas.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		
		chckbxRefrescos = new JCheckBox("Refrescos");
		chckbxRefrescos.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		
		chckbxAlcohol = new JCheckBox("Alcohol");
		chckbxAlcohol.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		
		chckbxOtroindicarA = new JCheckBox("Otro (Indicar a continuación)");
		chckbxOtroindicarA.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		
		JScrollPane scrollPane_2 = new JScrollPane();
		
		JLabel lblNewLabel_2_5_1 = new JLabel("¿Qué generos de música te gustaría escuchar?");
		lblNewLabel_2_5_1.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		
		JCheckBox chckbxUrbana = new JCheckBox("Urbana");
		chckbxUrbana.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		
		JCheckBox chckbxReggaetton = new JCheckBox("Reggaetton");
		chckbxReggaetton.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		
		JCheckBox chckbxTrap = new JCheckBox("Trap");
		chckbxTrap.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		
		JCheckBox chckbxPop = new JCheckBox("Pop");
		chckbxPop.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		
		JCheckBox chckbxOtroindicarA_1 = new JCheckBox("Otro (Indicar a continuación)");
		chckbxOtroindicarA_1.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		
		JScrollPane scrollPane_2_1 = new JScrollPane();
		
		JLabel lblNewLabel_2_5_1_1 = new JLabel("¿Me vas a traer un buen regalo?");
		lblNewLabel_2_5_1_1.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("SÍ");
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("SÍ");
		
		JLabel lblNewLabel_2_5_1_1_1 = new JLabel("¿Algo más?");
		lblNewLabel_2_5_1_1_1.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		
		JScrollPane scrollPane_2_1_1 = new JScrollPane();
		GroupLayout gl_panel_2_2 = new GroupLayout(panel_2_2);
		gl_panel_2_2.setHorizontalGroup(
			gl_panel_2_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2_2.createSequentialGroup()
					.addComponent(lblNewLabel_2_1_3)
					.addGroup(gl_panel_2_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2_2.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_panel_2_2.createSequentialGroup()
								.addGap(79)
								.addGroup(gl_panel_2_2.createParallelGroup(Alignment.TRAILING)
									.addGroup(gl_panel_2_2.createSequentialGroup()
										.addGroup(gl_panel_2_2.createParallelGroup(Alignment.LEADING)
											.addComponent(chckbxPatatas)
											.addComponent(chckbxRefrescos)
											.addComponent(chckbxAlcohol, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE))
										.addGap(80)
										.addComponent(scrollPane_2, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED, 80, Short.MAX_VALUE))
									.addGroup(gl_panel_2_2.createSequentialGroup()
										.addGroup(gl_panel_2_2.createParallelGroup(Alignment.TRAILING)
											.addGroup(gl_panel_2_2.createSequentialGroup()
												.addComponent(chckbxNewCheckBox)
												.addPreferredGap(ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
												.addComponent(chckbxOtroindicarA))
											.addComponent(chckbxOtroindicarA_1, GroupLayout.PREFERRED_SIZE, 221, GroupLayout.PREFERRED_SIZE))
										.addGap(61))))
							.addGroup(gl_panel_2_2.createSequentialGroup()
								.addGap(43)
								.addGroup(gl_panel_2_2.createParallelGroup(Alignment.LEADING)
									.addComponent(lblNewLabel_2_5_1)
									.addComponent(lblNewLabel_2_5, GroupLayout.PREFERRED_SIZE, 280, GroupLayout.PREFERRED_SIZE)
									.addGroup(gl_panel_2_2.createSequentialGroup()
										.addComponent(lblNewLabel_2_5_1_1, GroupLayout.PREFERRED_SIZE, 235, GroupLayout.PREFERRED_SIZE)
										.addGap(29)
										.addComponent(rdbtnNewRadioButton)
										.addGap(26)
										.addComponent(rdbtnNewRadioButton_1, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
									.addGroup(gl_panel_2_2.createSequentialGroup()
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(lblNewLabel_2_5_1_1_1, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addComponent(scrollPane_2_1_1, GroupLayout.PREFERRED_SIZE, 355, GroupLayout.PREFERRED_SIZE)))
								.addPreferredGap(ComponentPlacement.RELATED, 33, Short.MAX_VALUE)))
						.addGroup(gl_panel_2_2.createSequentialGroup()
							.addGap(79)
							.addGroup(gl_panel_2_2.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_2_2.createSequentialGroup()
									.addGroup(gl_panel_2_2.createParallelGroup(Alignment.LEADING)
										.addComponent(chckbxReggaetton)
										.addComponent(chckbxTrap, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
										.addComponent(chckbxPop, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE))
									.addGap(76)
									.addComponent(scrollPane_2_1, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE))
								.addComponent(chckbxUrbana))
							.addGap(76)))
					.addComponent(lblNewLabel_2_1_1_2, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
		);
		gl_panel_2_2.setVerticalGroup(
			gl_panel_2_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2_2.createParallelGroup(Alignment.LEADING, false)
					.addComponent(lblNewLabel_2_1_3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(lblNewLabel_2_1_1_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(gl_panel_2_2.createSequentialGroup()
					.addGap(28)
					.addComponent(lblNewLabel_2_5)
					.addGap(18)
					.addGroup(gl_panel_2_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(chckbxNewCheckBox)
						.addComponent(chckbxOtroindicarA, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_panel_2_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2_2.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(chckbxPatatas, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(chckbxRefrescos, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(chckbxAlcohol, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_2_2.createSequentialGroup()
							.addGap(18)
							.addComponent(scrollPane_2, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)))
					.addGap(36)
					.addComponent(lblNewLabel_2_5_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_panel_2_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(chckbxUrbana, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
						.addComponent(chckbxOtroindicarA_1, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_panel_2_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2_2.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(chckbxReggaetton, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(chckbxTrap, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(chckbxPop, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_2_2.createSequentialGroup()
							.addGap(17)
							.addComponent(scrollPane_2_1, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)))
					.addGap(18)
					.addGroup(gl_panel_2_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2_5_1_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(rdbtnNewRadioButton)
						.addComponent(rdbtnNewRadioButton_1))
					.addGroup(gl_panel_2_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2_2.createSequentialGroup()
							.addGap(18)
							.addComponent(scrollPane_2_1_1, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_2_2.createSequentialGroup()
							.addGap(41)
							.addComponent(lblNewLabel_2_5_1_1_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))))
		);
		
		JTextArea textArea_1_1_1 = new JTextArea();
		scrollPane_2_1_1.setViewportView(textArea_1_1_1);
		
		JTextArea textArea_1_1 = new JTextArea();
		scrollPane_2_1.setViewportView(textArea_1_1);
		
		JTextArea textArea_1 = new JTextArea();
		scrollPane_2.setViewportView(textArea_1);
		panel_2_2.setLayout(gl_panel_2_2);
		
		btnNewButton = new JButton("ENVIAR FORMULARIO");
		btnNewButton.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		
		lblNewLabel_2_2_2 = new JLabel("DATOS PARA EL CUMPLEAÑOS:");
		lblNewLabel_2_2_2.setForeground(new Color(255, 0, 128));
		lblNewLabel_2_2_2.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(44)
							.addComponent(panel_2_2, GroupLayout.PREFERRED_SIZE, 603, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(144)
							.addComponent(lblNewLabel_2_2_2, GroupLayout.PREFERRED_SIZE, 410, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(221)
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 270, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(92, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(30)
					.addComponent(lblNewLabel_2_2_2, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addGap(32)
					.addComponent(panel_2_2, GroupLayout.PREFERRED_SIZE, 543, GroupLayout.PREFERRED_SIZE)
					.addGap(47)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(83, Short.MAX_VALUE))
		);
		panel_1.setLayout(gl_panel_1);
		contentPanel.setLayout(gl_contentPanel);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(254, 255, 191));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						setVisible(false);					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
