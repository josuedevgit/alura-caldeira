// == (comparação implícita)

const numero = 5;
const texto = "5";
console.log(numero == texto); // true - js fez a conversão para a comparação

console.log(numero === texto); // false - compara o tipo de dado também

// typeof
console.log(typeof numero);
console.log(typeof texto);

// == -> compara só o valor
// === compara o valor e o tipo de dado

// boa prática, coversão explícita

Number()
String()