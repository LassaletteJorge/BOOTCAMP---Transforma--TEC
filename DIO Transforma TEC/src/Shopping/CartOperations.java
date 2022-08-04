compras de pacotes ;


//Classe abstrata com para ler dados dos carrinhos métodos de compras
 classe abstrata  pública CartOperations { 

    //método para somar todos os preços dos produtos em um carrinho
    public  abstract  void  getCartTotalPrice ();

    // public void orderCartDesc(){}

    // public void orderCartAsc(){}

    //cria uma lista apenas com os preços dos produtos em um carrinho
    public  void  listCartPrices (){}

    //retorna a quantidade de itens de um carrinho
    public  void  itemsCount (){}
    
}