const tarefas = [];
let editingIndex = null;
document
  .getElementById("filtroStatus")
  .addEventListener("change", listarTarefas);

document
  .getElementById("tarefasFormulario")
  .addEventListener("submit", (event) => {
    event.preventDefault();
    if (editingIndex === null) {
      criarTarefa();
    } else {
      atualizarTarefa();
    }
  });

document.getElementById("botaoListarTarefa").addEventListener("click", () => {
  const tarefasLista = document.getElementById("tarefasLista");
  tarefasLista.style.display =
    tarefasLista.style.display === "none" || tarefasLista.style.display === ""
      ? "block"
      : "none";
  listarTarefas();
});
function criarTarefa() {
  const nome = document.getElementById("nome").value;
  const descricao = document.getElementById("descricao").value;
  const dataTermino = document.getElementById("dataTermino").value;
  const prioridade = document.getElementById("prioridade").value;
  const status =
    document.getElementById("status").value.charAt(0).toUpperCase() +
    document.getElementById("status").value.slice(1).toLowerCase(); // Ajuste aqui
  const categoria = document.getElementById("categoria").value;
  const tarefa = {
    nome,
    descricao,
    dataTermino,
    prioridade,
    status,
    categoria,
  };
  if (!nome || !descricao) {
    alert("Por favor, preencha todos os campos obrigatórios!");
    return;
  }

  tarefas.push(tarefa);
  listarTarefas();

  mostrarPopup("Tarefa adicionada com sucesso!");

  document.getElementById("tarefasFormulario").reset();
}

function mostrarPopup(message) {
  const popup = document.createElement("div");
  popup.className = "popup";
  popup.innerText = message;
  document.body.appendChild(popup);

  setTimeout(() => {
    popup.remove();
  }, 3000);
}

function atualizarTarefa() {
  const tarefa = pegarTarefa();
  tarefas[editingIndex] = tarefa;
  editingIndex = null;
  clearInputs();
  listarTarefas();
}

function pegarTarefa() {
  return {
    nome: document.getElementById("nome").value,
    descricao: document.getElementById("descricao").value,
    dataTermino: document.getElementById("dataTermino").value,
    categoria: document.getElementById("categoria").value,
    prioridade: document.getElementById("prioridade").value,
    status: document.getElementById("status").value,
  };
}

function clearInputs() {
  document.getElementById("nome").value = "";
  document.getElementById("descricao").value = "";
  document.getElementById("dataTermino").value = "";
  document.getElementById("categoria").value = "";
  document.getElementById("prioridade").value = "NAOIMPORTANTE";
  document.getElementById("status").value = "TODO";
}

function listarTarefas() {
  const tabelaBody = document.getElementById("listagemTarefas");
  const filtroStatus = document.getElementById("filtroStatus").value;

  tabelaBody.innerHTML = "";

  const tarefasFiltradas = filtroStatus
    ? tarefas.filter((tarefa) => tarefa.status === filtroStatus)
    : tarefas;

  if (tarefasFiltradas.length === 0) {
    tabelaBody.innerHTML = `
      <tr>
        <td colspan="7" style="text-align: center;">Nenhuma tarefa encontrada</td>
      </tr>
    `;
    return;
  }

  tarefasFiltradas.forEach((tarefa, index) => {
    const row = document.createElement("tr");
    row.innerHTML = `
      <td>${tarefa.nome}</td>
      <td>${tarefa.descricao}</td>
      <td>${tarefa.dataTermino}</td>
      <td>${tarefa.categoria}</td>
      <td>${tarefa.prioridade}</td>
      <td>${tarefa.status}</td>
      <td>
        <button class="editar-tarefa">Editar</button>
        <button class="excluir-tarefa">Remover</button>
      </td>
    `;

    const editarButton = row.querySelector(".editar-tarefa");
    const excluirButton = row.querySelector(".excluir-tarefa");

    editarButton.addEventListener("click", () => {
      editarTarefa(index);
    });

    excluirButton.addEventListener("click", () => {
      excluirTarefa(index);
    });

    tabelaBody.appendChild(row);
  });
}

function editarTarefa(index) {
  const tarefa = tarefas[index];
  document.getElementById("nome").value = tarefa.nome;
  document.getElementById("descricao").value = tarefa.descricao;
  document.getElementById("dataTermino").value = tarefa.dataTermino;
  document.getElementById("categoria").value = tarefa.categoria;
  document.getElementById("prioridade").value = tarefa.prioridade;
  document.getElementById("status").value = tarefa.status;

  editingIndex = index;
}

function excluirTarefa(index) {
  tarefas.splice(index, 1);
  listarTarefas();
}
