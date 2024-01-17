package proyectoEntornos;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Toolkit;

public class BotonDatos extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JPanel panel;
	private JLabel lblNewLabel_1;
	private JTextField textField;
	private JLabel lblNewLabel_2_3;
	private JLabel lblNewLabel_2_1_1_1_1_1_2;
	private JLabel lblNewLabel_2_1_1_1_1_1_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			BotonDatos dialog = new BotonDatos();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public BotonDatos() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(BotonDatos.class.getResource("/proyectoEntornos/spiderman.png")));
		setTitle("DATOS");
		setBounds(100, 100, 725, 725);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(255, 128, 255));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		JLabel lblNewLabel = new JLabel(new ImageIcon(BotonDatos.class.getResource("/proyectoEntornos/d9ec1-la-sirenita-png-transparente.png")));
		
		panel = new JPanel();
		panel.setBackground(new Color(196, 251, 255));
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 299, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 660, GroupLayout.PREFERRED_SIZE)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGap(11)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 629, GroupLayout.PREFERRED_SIZE))
		);
		
		lblNewLabel_1 = new JLabel(new ImageIcon(BotonDatos.class.getResource("/proyectoEntornos/1.png")));
		
		JLabel lblNewLabel_1_1 = new JLabel(new ImageIcon(BotonDatos.class.getResource("/proyectoEntornos/4.png")));
		
		JLabel lblNewLabel_1_1_1 = new JLabel(new ImageIcon(BotonDatos.class.getResource("/proyectoEntornos/2.png")));
		lblNewLabel_1_1_1.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel(new ImageIcon(BotonDatos.class.getResource("/proyectoEntornos/3.png")));
		
		JLabel lblNewLabel_2 = new JLabel("DATOS DE CONTACTO:");
		lblNewLabel_2.setForeground(new Color(255, 0, 128));
		lblNewLabel_2.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		
		JLabel lblNewLabel_2_1 = new JLabel("Telefono: 602 24 27 60");
		lblNewLabel_2_1.setForeground(new Color(0, 191, 15));
		lblNewLabel_2_1.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Correo: xmsanmar318@gmail.com");
		lblNewLabel_2_1_1.setForeground(new Color(0, 191, 15));
		lblNewLabel_2_1_1.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		
		JLabel lblNewLabel_2_2 = new JLabel("DATOS DEL CUMPLE:");
		lblNewLabel_2_2.setForeground(new Color(255, 0, 128));
		lblNewLabel_2_2.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Dia celebración: 17 de marzo");
		lblNewLabel_2_1_1_1.setForeground(new Color(0, 191, 15));
		lblNewLabel_2_1_1_1.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("Lugar: Av. Andalucía (local)");
		lblNewLabel_2_1_1_1_1.setForeground(new Color(0, 191, 15));
		lblNewLabel_2_1_1_1_1.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		
		JLabel lblNewLabel_2_1_1_1_1_1 = new JLabel("Hora: Sobre las 21:30 p.m");
		lblNewLabel_2_1_1_1_1_1.setForeground(new Color(0, 191, 15));
		lblNewLabel_2_1_1_1_1_1.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		
		JLabel lblNewLabel_2_1_1_1_1_1_1 = new JLabel("Si sufre de alergias déjelas saber:");
		lblNewLabel_2_1_1_1_1_1_1.setForeground(new Color(0, 191, 15));
		lblNewLabel_2_1_1_1_1_1_1.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		
		textField = new JTextField();
		textField.setColumns(10);
		
		lblNewLabel_2_3 = new JLabel("DATOS DE INTERÉS:");
		lblNewLabel_2_3.setForeground(new Color(255, 0, 128));
		lblNewLabel_2_3.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		
		lblNewLabel_2_1_1_1_1_1_2 = new JLabel("No me hago responsable de lo que te");
		lblNewLabel_2_1_1_1_1_1_2.setForeground(new Color(0, 191, 15));
		lblNewLabel_2_1_1_1_1_1_2.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		
		lblNewLabel_2_1_1_1_1_1_3 = new JLabel("pase. Bebe con moderación, gracias.");
		lblNewLabel_2_1_1_1_1_1_3.setForeground(new Color(0, 191, 15));
		lblNewLabel_2_1_1_1_1_1_3.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_panel.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
										.addGroup(gl_panel.createSequentialGroup()
											.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
												.addComponent(lblNewLabel_1_1_1, GroupLayout.PREFERRED_SIZE, 270, Short.MAX_VALUE)
												.addComponent(lblNewLabel_1_1_1_1, GroupLayout.PREFERRED_SIZE, 270, GroupLayout.PREFERRED_SIZE))
											.addPreferredGap(ComponentPlacement.RELATED))
										.addGroup(gl_panel.createSequentialGroup()
											.addComponent(lblNewLabel_2)
											.addGap(26))))
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(13)
									.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblNewLabel_2_1_1, GroupLayout.PREFERRED_SIZE, 251, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel_2_1, GroupLayout.PREFERRED_SIZE, 251, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel_2_1_1_1, GroupLayout.PREFERRED_SIZE, 251, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel_2_1_1_1_1, GroupLayout.PREFERRED_SIZE, 251, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel_2_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 251, GroupLayout.PREFERRED_SIZE))
									.addGap(18)))
							.addGroup(gl_panel.createSequentialGroup()
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(lblNewLabel_2_2, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE)
								.addGap(34))
							.addGroup(gl_panel.createSequentialGroup()
								.addGap(18)
								.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
									.addComponent(textField, Alignment.LEADING)
									.addComponent(lblNewLabel_2_1_1_1_1_1_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
									.addComponent(lblNewLabel_2_1_1_1_1_1_2, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 251, GroupLayout.PREFERRED_SIZE)
									.addComponent(lblNewLabel_2_1_1_1_1_1_3, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 251, GroupLayout.PREFERRED_SIZE))
								.addGap(13)))
						.addGroup(gl_panel.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblNewLabel_2_3, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE)
							.addGap(36)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 643, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 632, Short.MAX_VALUE)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblNewLabel_1_1_1, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblNewLabel_2)
							.addGap(23)
							.addComponent(lblNewLabel_2_1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblNewLabel_2_1_1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
							.addGap(37)
							.addComponent(lblNewLabel_2_2, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(lblNewLabel_2_1_1_1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblNewLabel_2_1_1_1_1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(lblNewLabel_2_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
							.addGap(26)
							.addComponent(lblNewLabel_2_3, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblNewLabel_2_1_1_1_1_1_2, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(lblNewLabel_2_1_1_1_1_1_3, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblNewLabel_2_1_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(lblNewLabel_1_1_1_1, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		panel.setLayout(gl_panel);
		contentPanel.setLayout(gl_contentPanel);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(255, 128, 255));
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
						setVisible(false);
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
