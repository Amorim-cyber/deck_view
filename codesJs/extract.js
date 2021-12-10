
function extract(){
    let tabela = document.getElementsByClassName('CardTableLayout__CardTableView-sc-1jy3g9y-1 fiNlUx pt-br')[0];
    let j = 1
    let card;
    let cards = [];

    for(var i=1; i<tabela.rows.length;i++){
        
        setTimeout(function() {

            card = {
                name: tabela.rows[j].cells[0].innerText,
                type: "",
                school: "",
                rarity: "",
                minion: "",
                set: "",
                class: "",
                dustCreation: "",
                dustDestrution: "",
                artist: "",
                mana: tabela.rows[j].cells[2].innerText,
                attack: tabela.rows[j].cells[3].innerText,
                health: tabela.rows[j].cells[4].innerText,
                keyWord: tabela.rows[j].cells[7].innerText,
                description: "",
                effect: "",
                cropImage: tabela.rows[j].cells[0].getElementsByClassName('cropImage')[0].style.backgroundImage.split('"')[1],
                image: ""
            };

            tabela.rows[j].cells[0].getElementsByTagName('div')[0].click();
        },1000+(5000*(i-1)));

        setTimeout(function() {
            let itens = document.getElementsByClassName('CardDetailsLayout__AttributesList-sc-4r6wq5-6 exPYBL')[0].getElementsByTagName('li');
            card.description = document.getElementsByClassName('CardDetailsLayout__CardFlavorText-sc-4r6wq5-4 ijEQkD')[0].innerText;
            card.effect = document.getElementsByClassName('CardDetailsLayout__CardText-sc-4r6wq5-5 fNQbVa')[0].innerText;
            card.image = document.getElementsByClassName('CardLayout__CardImage-sc-1eiryq6-5 ivJAqy CardImage loaded')[0].src;
            for(var l=0; l<itens.length-1;l++){
                switch(itens[l].innerText.split(':')[0]){
                    case 'Tipo':{
                        card.type = itens[l].innerText.split(':')[1];
                        break;
                    }
                    case 'Escola de Feitiços':{
                        card.school = itens[l].innerText.split(':')[1];
                        break;
                    }
                    case 'Raridade':{
                        card.rarity = itens[l].innerText.split(':')[1];
                        break;
                    }
                    case 'Tipo de lacaio':{
                        card.minion = itens[l].innerText.split(':')[1];
                        break;
                    }
                    case 'Conjunto':{
                        card.set = itens[l].innerText.split(':')[1];
                        break;
                    }
                    case 'Classe':{
                        card.class = itens[l].innerText.split(':')[1];
                        break;
                    }
                    case 'Custo de criação':{
                        card.dustCreation = itens[l].innerText.split(':')[1];
                        break;
                    }
                    case 'Rendimento ao desencantar':{
                        card.dustDestrution = itens[l].innerText.split(':')[1];
                        break;
                    }
                    case 'Artista':{
                        card.artist = itens[l].innerText.split(':')[1];
                        break;
                    }
                }
            }
        },3000+(5000*(i-1)));

        setTimeout(function() {
            document.getElementsByClassName('CardDetailsLayout__CloseButton-sc-4r6wq5-8 iBjkqs')[0].click();
            cards[j-1] = card;
            j++;
        },5000+(5000*(i-1)));


    }

    setTimeout(function() {
            console.log("finish");
            var element = document.createElement('a');
            element.setAttribute('href', 'data:text/plain;charset=utf-8,' + encodeURIComponent(JSON.stringify(cards)));
            element.setAttribute('download', "doc.txt");

            element.style.display = 'none';
            document.body.appendChild(element);

            element.click();

            document.body.removeChild(element);
    },4000+(6000*(tabela.rows.length)));
    

}

