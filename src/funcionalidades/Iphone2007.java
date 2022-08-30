package funcionalidades;

public class Iphone2007 implements AparelhoTelefonico, Navegador, ReprodutorMusical {

	@Override
	public void tocar() {
		System.out.println("Reproduzindo Musica");
	}

	@Override
	public void pausar() {
		System.out.println("Pausando Musica");		
	}

	@Override
	public void selecionarMusica() {
		System.out.println("Selecionando Musica");
		
	}

	@Override
	public void exibirPagina() {
		System.out.println("Exibindo pagina WEB");
		
	}

	@Override
	public void adicionarPagina() {
		System.out.println("Adicionando pagina WEB");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando pagina WEB");
		
		
	}

	@Override
	public void ligar() {
		System.out.println("Iniciando Ligação");
		
	}

	@Override
	public void atender() {
		System.out.println("Atendendo Ligação");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando Correio de Voz");
		
	}

}
