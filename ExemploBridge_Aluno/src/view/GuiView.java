package view;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class GuiView implements View{

	@Override
	public void mostrarAluno(String aluno) {
		JFrame frame = new JFrame("Aluno");
		frame.setSize(500, 500);
		JTextArea textArea = new JTextArea();
		textArea.append(aluno);
		frame.add(textArea);
		frame.setVisible(true);
	}

}
