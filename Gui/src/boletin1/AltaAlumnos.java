package boletin1;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AltaAlumnos {

	private JFrame frmGestinDeAlumnos;
	private JScrollPane scrollPanel;
	private JTextArea areaTexto;
	private JMenuBar barraMenu;
	private JMenu menuAlumnos;
	private JMenuItem itemMenuAlta;
	private JMenuItem itemMenuSalir;
	private JMenuItem itemMenuListarTodo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AltaAlumnos window = new AltaAlumnos();
					window.frmGestinDeAlumnos.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AltaAlumnos() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGestinDeAlumnos = new JFrame();
		frmGestinDeAlumnos.setTitle("Gestión de Alumnos");
		frmGestinDeAlumnos.setMinimumSize(new Dimension(400, 300));
		frmGestinDeAlumnos.setBounds(100, 100, 500, 350);
		frmGestinDeAlumnos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		scrollPanel = new JScrollPane();
		frmGestinDeAlumnos.getContentPane().add(scrollPanel, BorderLayout.CENTER);
		
		areaTexto = new JTextArea();
		scrollPanel.setViewportView(areaTexto);
		
		barraMenu = new JMenuBar();
		scrollPanel.setColumnHeaderView(barraMenu);
		
		menuAlumnos = new JMenu("Alumnos");
		barraMenu.add(menuAlumnos);
		
		itemMenuAlta = new JMenuItem("Alta");
		itemMenuAlta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					DialogoAltaAlumno dialog = new DialogoAltaAlumno();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		});
		menuAlumnos.add(itemMenuAlta);
		
		itemMenuSalir = new JMenuItem("Salir");
		itemMenuSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		itemMenuListarTodo = new JMenuItem("Listar todos");
		menuAlumnos.add(itemMenuListarTodo);
		menuAlumnos.add(itemMenuSalir);
	}

}
