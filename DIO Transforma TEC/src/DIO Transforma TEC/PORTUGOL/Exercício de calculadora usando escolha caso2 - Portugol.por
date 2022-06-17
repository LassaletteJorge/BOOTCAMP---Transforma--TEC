programa
{
	
	funcao inicio()
	{

		real n1, n2, result = 0.0
		caracter op
		
		escreva("Programa Calculadora\n")

		escreva("Informe o primeiro valor:\n")
		leia(n1)

		escreva("Informe o segundo valor:\n")
		leia(n2)
		
		escreva("Selecione uma das opções a seguir\n")
		escreva("+ para somar\n")
		escreva("- para subtrair\n")
		escreva("* para multiplicar\n")
		escreva("/ para dividir\n")
		escreva("Selecione a sua opção\n")

		leia(op)

		escolha(op){
			caso '+':
				result = n1 + n2
				pare
			caso '-':
				result = n1 - n2
				pare
			caso '*':
				result = n1 * n2
				pare
			caso '/':
				result = n1 / n2
				pare	
				caso contrario:
					escreva("\nOpção inválida!")
					pare
		}

		escreva("Resultado: ", n1," ", op," ", n2," = ", result)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 177; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */