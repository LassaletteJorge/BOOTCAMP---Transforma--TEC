function soma (){

    let a = 30
    let b = 40

    let c = a + b //70

    setTimeout(
        function (){
            media(c)
        },
        4000
    )
}

function media (n){ //n = 70

    let m = n/2

    setTimeout(
        function (){
            escreveMedia(m)
        },
        5000
    )

}

function escreveMedia(r){
    
    console.log("Media: ", r)
}

soma()
// funcao que soma de dois numero com um delay de 4 segundos
function soma (){

    let a = 30
    let b = 40

    let c = a + b //70

    //gera um delay de 4 segundos antes de chamar a função de calcular a média
    setTimeout(
        function (){
            media(c)
        },
        4000
    )
}

//função que calcula a média de dois números
function media (n){ //n = 70

    let m = n/2

    //gera um delay de 5 segundos para chamar a função de escrever a média
    setTimeout(
        function (){
            escreveMedia(m)
        },
        5000
    )

}

//função de escrever o valor da média
function escreveMedia(r){
    
    console.log("Media: ", r)
}

soma()