package subsistema2.cep;

public class CepApi {
	private static CepApi instatncia = new CepApi();
	
	private CepApi() {
		super();
	}
	public static CepApi getInstancia() {
		return instancia;
	}
	public String recuperarCidade(String cep) {
		return "Araraquara";
	}
	public String RecuperarEstadado(String cep) {
		return "SP";
	}
}
