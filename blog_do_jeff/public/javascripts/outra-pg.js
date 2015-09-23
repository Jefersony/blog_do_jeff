$("#tb-conteudo").append($("#novo-post")).append($("#conteudo")); //insere o conteudo na tabela principal

$("#tb-menus").append($("#menus")); //inserir menus na tabela principal
//$("#tb-conteudo").append($("#novo-post"));
$("#tb-comentarios").append($("#comentarios"));


// insere nova postagem
var numPost = 0;
$("#btn-novo-post").click(function(){
    if( $("#txt-novo-post").val() == "" || $("#novo-titulo") == "" ) {
        alert("Preencha os campos de texto e de titulo.");
    }else{
        var novoTexto = $("#txt-novo-post").val();
        var novoTitulo = $("#novo-titulo").val();
        $("#tb-conteudo").append($(
            "<p>" + novoTitulo + "<br><br>" + novoTexto + "<p>"
        ));
        numPost++;
        $("#txt-novo-post").val("");
        $("#novo-titulo").val("");
    }
});


