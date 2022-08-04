classes de pacotes ;

public  class  RaceCar  estende  Carro {

    público  número inteiro  ;

    public  RaceCar ( modelo String  , marca String , número inteiro ) {  
        //chamando o método construtor da classe Car
        super ( modelo , marca );

        //definindo um atributo da classe RaceCar
        isso . número = número ;

    }

     som public void  ( som de string  ){
        Sistema . fora . println ( som );
    }

    public  void  setNumber ( Número inteiro  ) {
        isso . número = número ;
    }

    public  Integer  getNumber () {
         número de retorno ;
    }

    //sobrescendo o método da superclasse Car
    public  void  acelerar (){

        Sistema . fora . println ( "Vriiiiiiiuuuuummmmmmm" );
    }

}