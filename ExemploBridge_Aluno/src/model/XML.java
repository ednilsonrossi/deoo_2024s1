package model;

public class XML implements TransferType{

	@Override
	public String getData(int prontuario, String nome, double ncc) {
		
		StringBuilder sb = new StringBuilder()
				.append("<aluno>\n")
				.append("\t<prontuario>")
				.append(prontuario)
				.append("</prontuario>\n")
				.append("\t<nome>")
				.append(nome)
				.append("</nome>\n")
				.append("\t<ncc>")
				.append(ncc)
				.append("</ncc>\n")
				.append("</aluno>");
		
		return sb.toString();
	}
}
