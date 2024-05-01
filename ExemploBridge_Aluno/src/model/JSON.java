package model;

public class JSON implements TransferType{

	@Override
	public String getData(int prontuario, String nome, double ncc) {
		StringBuilder sb = new StringBuilder()
				.append("{\n")
				.append("\t\"prontuario\":\"")
				.append(prontuario)
				.append("\",\n")
				.append("\t\"nome\":\"")
				.append(nome)
				.append("\",\n")
				.append("\t\"ncc\":\"")
				.append(ncc)
				.append("\"\n")
				.append("}");
		return sb.toString();
	}
}
