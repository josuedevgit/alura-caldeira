const cliente = {
    nome: "João",
    idade: 24,
    email: "joao@firma.com",
    telefone: ["1155555550", "11444444400"],
}

cliente.enderecos = [
    {
        rua: "R. Joseph Climber",
        numero: 1337,
        apartamento: true,
        complemento: "ap 934"  
    }
]

for (let chave in cliente) {
    let tipo = typeof cliente[chave];
    if(tipo !== "object" && tipo !== "function") {
        console.log(`A chave é ${chave} e tem valor ${cliente[chave]}`);
    }
}