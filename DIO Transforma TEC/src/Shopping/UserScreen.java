compras de pacotes ;

importar  java . útil . Lista ;
importar  java . útil . Scanner ;

// Classe que gera um menu de opções para o usuário com métodos de implementação da interface
public  class  UserScreen  implementa  UserInterface {

    //criando o carrinho de compras
    Carrinho  carrinho = novo  Carrinho ();

    //opção do usuário
    private  int  opt ​​= 0 ;

    //construtor que inicia o menu
     tela de usuário pública (){
        cardápio ();
    }

    //método de opções iniciais do menu
    @ Substituir
    public  void  tela inicial () {
        
        Sistema . fora . println ( "1 - Menu de produtos" );
        Sistema . fora . println ( "2 - Itens no carrinho" );
        Sistema . fora . println ( "3 - Quantidade de itens no carrinho" );
        Sistema . fora . println ( "4 - Listar preços do carrinho" );
        Sistema . fora . println ( "5 - Preço total do carrinho" );
        Sistema . fora . println ( "0 - Sair" );
        
    }

    //método de opções para adicinar e removedor produtos do carrinho
    @ Substituir
     produtos public voidMenu  () {
        
        Sistema . fora . println ( "1 - Adicionar produto ao carrinho" );
        Sistema . fora . println ( "2 - Removedor produto do carrinho" );
        Sistema . fora . println ( "0 - Sair" );
        
    }

    //iniciando uma interface de usuário com as opções de menu
    @ Substituir
     menu public void  () {

        fazer {
            //renderiza o menu inicial
            tela inicial ();

            //pega opção do usuárop pelo teclado
            getUserInput ();
    
            //seleção de acordo com a opção do usuário
            alternar ( optar ) {
                caso  1 :

                    //lista de produtos em estoque
                    exibirProdutos ();

                    //menu de produtos para adicionar ou remover do carrinho
                    produtosMenu ();

                    //opção do usuário
                    getUserInput ();

                    //mostra o menu de opções para o usuário
                    submenu ();
                    quebrar ;
                caso  2 :

                    //mostra lista de produtos no carrinho
                    mostrarCarrinho ();
                    quebrar ;
                caso  3 :
                    showCartQuantity ();
                    quebrar ;
                caso  4 :
                    showCartPreços ();
                    quebrar ;
                caso  5 :
                    showCartTotalPrice ();
                    quebrar ;
                caso  0 :
                    //Saindo fora
                    Sistema . fora . println ( "Tchau!" );
                    Sistema . saída ( 0 );
                    quebrar ;
                padrão :
                    quebrar ;
            }
        } while ( opção != 0 );
        
    }


    //menu de produtos para adicionar ou remover do carrinho
     subMenu privado void  () {

        alternar ( optar ) {
            caso  1 :
                addProductToCart ();
                mostrarCarrinho ();
                quebrar ;
            caso  2 :
                removeProductFromCart ();
                quebrar ;
            padrão :
                quebrar ;
        }
    }

    //exibindo a lista de produtos em estoque
    @ Substituir
    public  void  displayProdutos () {
        
        Lista < Produto > produtos = novos  Produtos (). obterProdutos ();

        for ( Prod do produto  : produtos ) {
            Sistema . fora . println ( "Id do produto: " + prod . getId ());
            Sistema . fora . println ( "Nome do produto: " + prod . getName ());
            Sistema . fora . println ( "Marca do produto: " + prod . getBrand ());
            Sistema . fora . println ( "Descricao do produto: " + prod . getDescription ());
            Sistema . fora . println ( "Preco do produto: " + prod . getPrice ());
            Sistema . fora . println ();
            
            Sistema . fora . println ();
        }
        
    }

    //método para pegar a opção do usuáro pelo teclado
    @ Substituir
    public  int  getUserInput () {

        Sistema . fora . println ( "Sua opção:" );
        Scanner  scanner = novo  Scanner ( System . in );
        opt = inteiro . parseInt ( scanner . nextLine ());
         opção de retorno ;
        
    }

    //método para adicionar um produto ao carrinho pelo id
    public  void  addProductToCart (){

        int  id = getUserInput ();
        carrinho . addProduto ( id );

    }

    //listando o carrinho
    public  void  showCart (){

        Sistema . fora . println ( " -> Itens do carrinho:" );

        carrinho . imprimirCarrinho ();
    }

    //quantidade de itens do carrinho
    private  void  showCartQuantity () {
        Sistema . fora . println ( " -> Total de itens no carrinho" );
        carrinho . itensCount ();
    }

    
    private  void  showCartTotalPrice () {
        Sistema . fora . println ( " -> Valor total do carrinho" );
        carrinho . getCartTotalPrice ();
    }

    //apresentando lista de preços do carrinho
    private  void  showCartPrices () {
        Sistema . fora . println ( " -> Lista de preços do carrinho: " );
        carrinho . listaCartPreços ();
    }


    //exclui um produto do carrinho
    public  void  removeProductFromCart (){

        int  id = getUserInput ();
        carrinho . removeProduto ( id );

    }
    
}