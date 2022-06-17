
//Função do algorítimo: calcular a média aritmética
//Autora: Lassalette Jorge

programa
{
	
	funcao inicio()
	{
		real n1,n2,n3,n4,media
		cadeia aluno

		escreva("Digite o seu nome:")
		leia(aluno)
		escreva("Digite a n1:")
		leia(n1)
		escreva("Digite a n2:")
		leia(n2)
		escreva("Digite a n3:")
		leia(n3)
		escreva("Digite a n4:")
		leia(n4)

		media = (n1+n2+n3+n4)/4

		escreva("Sua média é:" + media)
		//Verifica se a média é maior ou igual a 7

		se(media>=7){
			escreva("\n" + "Párabens! Você foi aprovado.")
		}

		//Caso a média seja menor que 7

		senao{
			escreva("\n" + "Infelizmente você foi reprovado")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 566; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */