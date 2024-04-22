package dto;

public class AbastecimentoDto {

	private final String tipoCombustivel;
	private final double litros;
	private final double precoLitro;
	
	public AbastecimentoDto(String tipoCombustivel, double litros, double precoLitro) {
		super();
		this.tipoCombustivel = tipoCombustivel;
		this.litros = litros;
		this.precoLitro = precoLitro;
	}

	public String getTipoCombustivel() {
		return tipoCombustivel;
	}

	public double getLitros() {
		return litros;
	}

	public double getPrecoLitro() {
		return precoLitro;
	}
	
}
