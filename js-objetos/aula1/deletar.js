const objPersonagem = {
    nome: "Gandalf",
    classe: "Mago",
    nivel: "20",
    aliado: {
        nome: "Saruman",
        classe: "Mago"
    },
    status: "Desaparecido"
}

delete objPersonagem.aliado;
delete objPersonagem["status"];

console.log(objPersonagem.aliado);
console.log(objPersonagem.status);

console.log(objPersonagem);