classes de pacotes ;

 carro de classe  pública {

    //private: visível apenas na própria classe ou por herança
     modelo de string  privado ;

    //protected: visível apenas dentro do pacote ou da mesma classe
     marca String  protegida ;

    //público: visível para todas as entidades
    público  Ano inteiro  ;

     carro público ( modelo String  , marca String ) { 
        isso . modelo = modelo ;
        isso . marca = marca ;
    }

    public  void  acelerar () {
        Sistema . fora . println ( "Vroooom" );
    }

     freio de vazio  público (){
        Sistema . fora . println ( "Shhh" );
    }

    public  void  setModel ( modelo de string  ) {
        isso . modelo = modelo ;
    }

    public  String  getModel () {
         modelo de retorno ;
    }

    public  void  setBrand ( String  brand ) {
        isso . marca = marca ;
    }

    public  String  getBrand () {
         marca de retorno ;
    }

    public  void  setYear ( Ano inteiro  ) {
        isso . ano = ano ;
    }

    public  Integer  getYear () {
         ano de retorno ;
    }

}