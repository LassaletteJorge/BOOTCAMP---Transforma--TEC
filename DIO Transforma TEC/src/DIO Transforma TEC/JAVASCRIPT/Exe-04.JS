function promessa() {
    return new Promise(
        (resolve) => {
            let a = 2
            let b = 3
    
            resolve(a * b)
        }
    )
}

const soma = async function (){

    const valor = await promessa()

    return valor + 2 
}

soma().then(

    res => {
        console.log("RES ASYNC/AWAIT: ",res)
    }

)