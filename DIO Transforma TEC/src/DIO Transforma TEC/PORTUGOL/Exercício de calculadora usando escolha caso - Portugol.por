programa
{

	
	funcao real calculadora(real n1, real n2, caracter op){
		real resultado = 0.0

		escolha(op){

			caso '+':
				resultado = n1 + n2
				pare
			caso '-':
				resultado = n1 - n2
				pare
			caso '*':
				resultado = n1 * n2
				pare
			caso '/':
				resultado = n1 / n2
				pare 		
				caso contrario:
					escreva("\nOperacao Inválida!")
					
	  }

	  retorne resultado
		
	}
	
	funcao inicio()
	{
		real numero1, numero2, resultado
		caracter operacao
		
		escreva("\nInforme o primeiro número: ")
		leia(numero1)
		
		escreva("\nInforme o segundo número: ")
		leia(numero2)
		
		escreva("\nInforme a operacao aritimética desejada: ")
		leia(operacao)

		resultado = calculadora(numero1, numero2, operacao)

		escreva("\n\nO esultado de ", numero1," " ,operacao," " ,numero2, " é: ", resultado,"\n\n")

		escolha(operacao){

			caso '+':
				resultado = numero1 + numero2
				pare
			caso '-':
				resultado = numero1 - numero2
				pare
			caso '*':
				resultado = numero1 * numero2
				pare
			caso '/':
				resultado = numero1 / numero2
				pare 		
				caso contrario:
					escreva("\nOperacao Inválida!")
					
		}

		escreva("\n\nO resultado de ", numero1, " ",operacao," ",numero2, " é: ", resultado,"\n\n")


	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 455; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */