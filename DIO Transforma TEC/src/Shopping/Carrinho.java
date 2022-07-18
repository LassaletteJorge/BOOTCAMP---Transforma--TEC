compras de pacotes ;

importar  java . útil . ListaMatriz ;
importar  java . útil . Lista ;

 classe  pública Carrinho {

    List < Product > cartItems = new  ArrayList < Product >();

    //1 - adicionar produtos
    //2 - remover produtos
    //3 - obtém o produto por id
    //4 - listar produtos

    // buscar um produto cadastrado e adicionar na coleção de produtos do carrinho
    public  void  addProduct ( Integer  id ) {

        Produto  produto = getProductById ( id );
        addToCart ( produto );

    }

    //adicionando um produto na coleção do carrinho
    private  void  addToCart ( Produto  produto ) {

        carrinhoItems . adicionar ( produto );

    }

    //remover item do carrinho
    public  void  removeProduct ( Integer  id ) {
        Produto  produto = getProductById ( id );
        carrinhoItems . remover ( produto );
    }

    //método para buscar um produto cadastrado no estoque
    private  Product  getProductById ( Integer  id ) {

        //produto em estoque que será adicionado ao carrinho
        Produto  produto = null ;

        //Lista de produtos em estoque
        Lista < Produto > produtos = novos  Produtos (). obterProdutos ();

        //procutando um elemento no estoque com base no id
        for ( Prod do produto  : produtos ) {

            if ( prod . getId () == id ) {
                //elemento encontrado
                produto = prod ;
            }

        }

        devolução do  produto ;
    }

    //exibir o carrinho
    public  void  printCart (){
        for ( Produto do  produto : cartItems ) {
            Sistema . fora . println ( "Nome do produto: " + produto . getNome ());
            Sistema . fora . println ( "Nome do produto: " + produto . getBrand ());
            Sistema . fora . println ( "Nome do produto: " + produto . getDescription ());
            Sistema . fora . println ( "Nome do produto: " + produto . getPrice ());
        }
    }

}