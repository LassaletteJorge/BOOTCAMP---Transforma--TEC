classes de pacotes ;

 classe  pública CarGarage {

    public  static  void  main ( String [] args ) {

        Carro  carro = carro novo  ( "Saveiro" , "VW" );
        carro . acelerar ();
        carro . freio ();

        Sistema . fora . println ( carro . getModel ());
        Sistema . fora . println ( carro . marca );
        //System.out.println(car.model);
        Sistema . fora . println ( carro . ano );


    }
}