// arredondamento de números reais

function ganhoPorHora(salario, horasTrabalhadas) {
    const salarioHora = (salario / horasTrabalhadas);

    return Math.round(salarioHora); // arredonda num número inteiro
}

console.log(ganhoPorHora(3000,176));


function ganhoPorHoraDois(salario, horasTrabalhadas) {
    const salarioHora = (salario / horasTrabalhadas);
    const total = salarioHora.toFixed(2); // duas casas decimais, com arredondamento pra cima

    return total;
}

console.log(ganhoPorHoraDois(3000,176));

function ganhoPorHoraTres(salario, horasTrabalhadas) {
    const salarioHora = (salario / horasTrabalhadas);
    const formatado = salarioHora.toLocaleString('pt-BR', {style: 'currency', currency: 'BRL'}); // formatada para o valor da moeda, fazendo arredondamento

    return formatado;
}

console.log(ganhoPorHoraTres(3000,176));