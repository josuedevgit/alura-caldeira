const alunos = ["João", "Juliana", "Ana", "Caio"];
const medias = [10, 8, 7.5, 9];

const listaDeAlunosEMedias = [alunos, medias];

function exibeNomeENota(aluno) {
    if (listaDeAlunosEMedias[0].includes(aluno) /* verifica se tá no array */) {
        const [alunos, medias] = listaDeAlunosEMedias 
        
        const indice = alunos.indexOf(aluno); // traz o indice/posição do dado no array

        const mediaDoAluno = medias[indice];

        console.log(`${aluno} tem a média ${mediaDoAluno}`);

    } else {
        console.log("Aluno não encontrado");
    }
}

exibeNomeENota("Ana");