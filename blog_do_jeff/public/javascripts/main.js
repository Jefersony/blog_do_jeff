

$("#tb-menus").append($("#menus")); //inserir menus na tabela principal
$("#tb-comentarios").append($("#comentarios"));
$("#tb-span").append("<img src='../public/images/lanca-medieval.jpg'>");// insere a imagem no campo das propagandas

//insere novo comentario com o click do botao
$("#inserir-comentario").click(function(){
    if( $("#novo-comentario").val() == "" ) {
        alert("Digite algum comentario.");
    }else{
        var novoComentario = $("#novo-comentario").val();
        var autor;
        if( $("#autor-comentario").val() == "") {
            autor = "Anonimo";
        }else{
            autor = $("#autor-comentario").val();
        }
        $("#lista-comentarios").append("<li>" + novoComentario + ' | Autor: ' + autor + "<li>" + "<li><br></li>");
        $("#novo-comentario").val("");
        $("#autor-comentario").val("");
    }
});


