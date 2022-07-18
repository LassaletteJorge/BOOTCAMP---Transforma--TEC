classes de pacotes ;

importar  java . útil . ListaMatriz ;
importar  java . útil . Lista ;

 classe  pública Raça {

    public  static  void  main ( String [] args ) {

        List < RaceCar > raceCars = new  ArrayList < RaceCar >();

        carros de corrida . add ( new  RaceCar ( "Uno de escada" , "FIAT" , 10 ));
        carros de corrida . add ( new  RaceCar ( " Marea bomba " , "FIAT" , 193 ));

        RaceCar  uno = raceCars . obter ( 0 );
        Sistema . fora . println ( um . getModel ());
        um . som ( "Vrooooooooooooooooooooooooooooooooooooom" );
        um . acelerar ();

        RaceCar  marea = raceCars . obter ( 1 );
        Sistema . fora . println ( marea . getModel ());
        mareia . som ( "BOOOOOOOOOOOOOOOOOOOOOOOOOOOOM!!!!" );


    }

}