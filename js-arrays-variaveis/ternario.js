const nome = "Leo";
const idade = "23";
const bebidaMaior = "cerveja";
const bebidaMenor = "suco";
const idadeMinima = 18;
const pedido = `${nome} diz: "por favor, quero beber ${idade >= idadeMinima ? bebidaMaior : bebidaMenor}"`

console.log(pedido);