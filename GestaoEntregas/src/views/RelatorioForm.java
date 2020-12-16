package views;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
<<<<<<< HEAD
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.io.File;

import controllers.ProcessaEntrega;
import controllers.ProcessaRelatorio;
import models.Entrega;

public class RelatorioForm extends JDialog implements ActionListener {
=======
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class RelatorioForm extends JDialog implements ActionListener{
>>>>>>> 3bd606e2b86d6c2c7e50b651d8182647e3b4a63d
	private static final long serialVersionUID = 1L;
	private JPanel panel;
	private JTextArea areaDeTexto;
	private JScrollPane scroll; 
	private JButton jbSalvar;
<<<<<<< HEAD
	private String relatorio;
=======
>>>>>>> 3bd606e2b86d6c2c7e50b651d8182647e3b4a63d

	RelatorioForm(){
		setTitle("Relat�rio de Entrega");
		setBounds(250,149,700,450);
		panel = new JPanel();
		setContentPane(panel);
		setLayout(null);

<<<<<<< HEAD
		
		
		//Fazer o relatorio
		relatorio = "\n\t\t\tRelat�rio de Entrega\n";
		relatorio += "\t---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n";
		relatorio += "\t ID \t Entregador \t Data \t Hora \t Endereco \t KmRodado \n";
		relatorio += "\t---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n";
		
		
		for(Entrega e: ProcessaEntrega.getArray()) {
			relatorio += "\t" + e.getId() +"\t" + e.getEntregador().getId()  +"\t" + e.getData()+"\t" 
		    + e.getHora() +"\t" + e.getEndereco() + "\t" + e.getKmRodado()+"\n";
			
		}
		
		relatorio += "\t---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n";
		relatorio += "\t\t\t\t\tSubtotal = " + String.format("R$ %.2f", ProcessaEntrega.getSubtotal()) + "\n";
		
		// Declara��o dos componentes do relat�rio
				areaDeTexto = new JTextArea(relatorio);
				scroll = new JScrollPane(areaDeTexto);
				scroll.setBounds(10,10,665,360);
				panel.add(scroll);

				jbSalvar = new JButton("Salvar");
				jbSalvar.setBounds(570,372,100,30);
				panel.add(jbSalvar);
				jbSalvar.addActionListener(this);
=======
		// Declara��o dos componentes do relat�rio
		areaDeTexto = new JTextArea("TEXTO DO RELAT�RIO AQUI");
		scroll = new JScrollPane(areaDeTexto);
		scroll.setBounds(10,10,665,360);
		panel.add(scroll);

		jbSalvar = new JButton("Salvar");
		jbSalvar.setBounds(570,372,100,30);
		panel.add(jbSalvar);
		jbSalvar.addActionListener(this);
>>>>>>> 3bd606e2b86d6c2c7e50b651d8182647e3b4a63d

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == jbSalvar) {
<<<<<<< HEAD
			
			JFileChooser fc = new JFileChooser();
			FileNameExtensionFilter filter = new FileNameExtensionFilter("Selecione apenas TXT", "txt");
			fc.setFileFilter(filter);
			
			if(fc.showSaveDialog(this) != 1) {
				File arquivo = fc.getSelectedFile();
				
				if(arquivo.getPath().endsWith(".txt"))
					ProcessaRelatorio.salvarRelatorio(relatorio, arquivo.getPath());
				else
					ProcessaRelatorio.salvarRelatorio(relatorio, arquivo.getPath() + ".txt");
				
				dispose();
			}

		}
	}

=======
			System.out.println("Entrei pelo bot�o salvar");
		}

	}
>>>>>>> 3bd606e2b86d6c2c7e50b651d8182647e3b4a63d
}
