package controller;

import model.Aluno;
import model.AlunoDEOO;
import model.JSON;
import model.XML;
import view.View;

public class Controller {
	
	private View view;

	public Controller(View view) {
		this.view = view;
	}
	
	public void run() {
		Aluno a = new AlunoDEOO(171, "Elon Musk", new JSON(), 100, 80);
		
		view.mostrarAluno(a.toString());
	}

}
