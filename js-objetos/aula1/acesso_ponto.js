const cliente = {
    nome: "André",
    idade: 32,
    cpf: "1122233345",
    email: "andre@dominio.com",
}

console.log(`O nome do cliente é ${cliente.nome} e essa pessoa tem ${cliente.idade}`);

console.group(`Os 3 primeiros digitos do CPF são ${cliente.cpf.substring(0,3)}`); 