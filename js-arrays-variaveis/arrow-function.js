function apresentar(nome) {
    return `meu nome é ${nome}`;
}

// função de flecha -> arrow function
const apresentarArrow = nome => `meu nome é ${nome}`;
const soma = (num1, num2) => num1 + num2;

// arrow function com mais de uma linha
const somaNumerosPequenos = (num1, num2) => {
    if (num1 || num2 > 10) {
        return "só números de 1 à 9";
    } else  {
        return num1 + num2;
    }
}

// hoisting: arrow function se comporta como expressão