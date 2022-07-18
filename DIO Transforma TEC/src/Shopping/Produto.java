compras de pacotes ;

 classe  pública Produto {

    // Atributos da classe
     ID inteiro  privado ;
     nome da string  privada ;
     marca de cordas  privada ;
     descrição de string  privada ;
     preço duplo  privado ;
     estoque duplo  privado ;

    //método construtor da classe - criando um novo objeto
    Public  Product ( Integer  id , String  name , String  brand , String  description , Double  price , Double  stock ){

        isso . id = id ;
        isso . nome = nome ;
        isso . marca = marca ;
        isso . descrição = descrição ;
        isso . preço = preço ;
        isso . estoque = estoque ;

    }

    //métodos getters e setters
    public  Integer  getId () {
         ID de retorno ;
    }

    public  void  setId ( Integer  id ) {
        isso . id = id ;
    }

    public  String  getNome () {
         nome de retorno ;
    }

    public  void  setName ( nome da string  ) {
        isso . nome = nome ;
    }

    public  String  getBrand () {
         marca de retorno ;
    }

    public  void  setBrand ( String  brand ) {
        isso . marca = marca ;
    }

    public  String  getDescrição () {
         descrição de retorno ;
    }

    public  void  setDescription ( Descrição da string  ) {
        isso . descrição = descrição ;
    }

    public  void  setPrice ( preço duplo  ) {
        isso . preço = preço ;
    }

    public  Double  getPrice () {
         preço de retorno ;
    }

    public  Double  getStock () {
        devolver o  estoque ;
    }

    public  void  setStock ( Estoque duplo  ) {
        isso . estoque = estoque ;
    }

}