let x = "";
console.log(x);
x = "oi";


// 1) declaração
function imprimeTexto(texto) {
    console.log(texto);
}

// 2) execução da função
imprimeTexto("Jesus é bom");
imprimeTexto(5);

// três vezes de escrever funções

function soma() {
    const resultado = 2 + 2;
    return resultado;
}

imprimeTexto(soma());