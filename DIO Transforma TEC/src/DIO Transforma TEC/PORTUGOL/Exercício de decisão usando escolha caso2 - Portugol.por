programa
{
	
	funcao inicio()
	{

		cadeia nome, servico = " "
		inteiro opcao, sucesso = 1
		
		escreva("Seja bem vindo! Por favor. insira o seu nome:")
		leia(nome)
		
		escreva("\nPerfeito, ", nome,"! Agora escolha uma das opções abaixo para o seu serviço de striming")
		
		escreva("\nPara Netflix escolha 1")
		escreva("\nPara Amazon escolha 2")
		escreva("\nPara HBO escolha 3")
		escreva("\nPara Disney Plus escolha 4")
		escreva("\nSua opção:")
		leia(opcao)
		
		escolha(opcao){
			caso 1:
				servico = "Netflix"
				pare

			caso 2:
				servico = "Amazon"
				pare
				
			caso 3:
				servico = "HBO"
				pare
				
			caso 4:
				servico = "Disney Plus"
				pare
			caso contrario:
				sucesso = 0
				pare
		}
	se(sucesso == 1){
		escreva("Parabéns, ", nome,"! O seviço ", servico," é uma excelente escolha!")
	}senao{
		escreva("Nos desculpe, ", nome,", este serviço não existe") 
	}
	
  }

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 908; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */