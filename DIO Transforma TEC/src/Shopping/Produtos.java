compras de pacotes ;

importar  java . útil . ListaMatriz ;
importar  java . útil . Lista ;

//Coleções

 Produtos de classe  pública {

    //lista de produtos - estoque
    private  List < Produto > produtos = new  ArrayList < Produto >();

    //construtor da classe que chama o método de carregar a lista de produtos - estoque
     Produtos públicos () {
        isso . itensdeloja ();
    }

    //lista de produtos em estoque
    public  List < Product > getProducts (){
        devolver  produtos ;
    }

    //método para armazenamento inicial dos produtos em estoque
    private  void  storeItems () {

        isso . produtos . add ( novo  Produto ( produtos . tamanho (), "Perfume" , "Boticário" , "Cheiroso" , 100,00 , 10,00 ));
        isso . produtos . add ( novo  Produto ( produtos . tamanho (), "Sabonete" , "Boticário" , "Cheiroso demais" , 10.00 , 10.00 ));
        isso . produtos . add ( novo  Produto ( produtos . tamanho (), "Oleo Mineral" , "Boticário" , "Bem cheiroso" , 30,00 , 10,00 ));
        isso . produtos . add ( novo  Produto ( produtos . tamanho (), "Shampoo" , "Boticário" , "Bom" , 100,00 , 15,00 ));
        isso . produtos . add ( novo  Produto ( produtos . tamanho (), "Desodorante" , "Boticário" , "Cheiro bom" , 20.00 , 10.00 ));
        isso . produtos . add ( novo  Produto ( produtos . tamanho (), "Creme de mão" , "Boticário" , "Barato" , 30.00 , 10.00 ));
        isso . produtos . add ( novo  Produto ( produtos . tamanho (), "Batom" , "Boticário" , "Bonito" , 50,00 , 10,00 ));


    }

}