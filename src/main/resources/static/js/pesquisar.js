function pesquisarValor() {
	var input, filter, table, tr, td, i, selecao;

	input = document.getElementById("pesquisar");
	filter = input.value.toUpperCase();
	table = document.getElementById("tabela");
	tr = table.getElementsByTagName("tr");
	selecao = document.getElementById("filtro").value;

	for (i = 0; i < tr.length; i++) {

		td = tr[i].getElementsByTagName("td")[selecao];

		if (td) {
			if (td.innerHTML.toUpperCase().indexOf(filter) > -1) {
				tr[i].style.display = "";
			} else {
				tr[i].style.display = "none";
			}
		}
	}
}