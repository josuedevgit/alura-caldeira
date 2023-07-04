const lista = document.querySelector("ul");

document.querySelector(".close").addEventListener("click", () => {
  lista.setAttribute("data-lista", "esconder");
});

document.querySelector("#botao").addEventListener("click", () => {
    lista.setAttribute("data-lista", "mostrar");
});