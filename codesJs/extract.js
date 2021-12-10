
function extract(){
    let tabela = document.getElementsByClassName('CardTableLayout__CardTableView-sc-1jy3g9y-1 fiNlUx pt-br')[0];
    let txt = "NOME DO CARD\tCLASSE\tMANA\tATAQUE\tVIDA\tTIPO DE CARD\tRARIDADE\tPALAVRA-CHAVE\tDESCRICAO\tEFEITO\tURL_IMAGEM_CORTADA\tURL_IMAGEM\n";

    let j = 1


    for(var i=1; i<tabela.rows.length;i++){
        
        setTimeout(function() {
            tabela.rows[j].cells[0].getElementsByTagName('div')[0].click();
        },1000+(5000*(i-1)));

        setTimeout(function() {
            let itens = document.getElementsByClassName('CardDetailsLayout__AttributesList-sc-4r6wq5-6 exPYBL')[0].getElementsByTagName('li');
            let k = 0;
            for(var l=0; l<itens.length-1;l++){
                txt+=itens[l].innerText.split(':')[0]+"\t";
            }
        },3000+(5000*(i-1)));

        setTimeout(function() {
            document.getElementsByClassName('CardDetailsLayout__CloseButton-sc-4r6wq5-8 iBjkqs')[0].click();
            txt+="\n";
            j++;
        },5000+(5000*(i-1)));


    }

    setTimeout(function() {
            console.log("finish");
            var element = document.createElement('a');
            element.setAttribute('href', 'data:text/plain;charset=utf-8,' + encodeURIComponent(txt));
            element.setAttribute('download', "doc.txt");

            element.style.display = 'none';
            document.body.appendChild(element);

            element.click();

            document.body.removeChild(element);
    },4000+(6000*(tabela.rows.length)));
    

}

