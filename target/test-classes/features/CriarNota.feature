#language: pt
#encoding: UTF-8

@Calculadora
Funcionalidade: Google Keep

Contexto:
	Dado que eu aciono o get started

Cenario: Criar uma nota
	Quando eu clicar no botao new note
	E eu informar no campo title "Teste nota"
	E eu informar no campo note "Testando a criacao de uma nova nota de forma automatizada!"
	E eu acionar o botao voltar
	Entao o aplicativo cadastra a nota com o titulo "Teste nota"
	
Cenario: Interagir com o switch das configuracoes
	Quando eu acionar o menu
	E eu acionar a aba settings
	E eu tocar no switch
	Entao o switch fica desabilitado
	
@cenario
Cenario: editar nota
	Quando eu acionar a nota
	E eu informar no campo title "NotaEditada"
	E eu informar no campo note "Editando essa nota"
	Entao o aplicativo cadastra a nota com o titulo "NotaEditada"
	