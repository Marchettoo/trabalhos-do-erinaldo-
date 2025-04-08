Trabalho Aula5_5 lista circular

-Introdução ao Problema-

"Hoje vou apresentar um sistema simples em Java que simula o rodízio de veículos em
grandes cidades. A ideia é ajudar os motoristas a consultarem facilmente se seus
veículos estão restritos em determinados dias da semana, com base na placa ou no
dia."
"O objetivo principal é reduzir o tráfego e a poluição, então criamos um programa que
lê um arquivo com dados dos veículos e permite ao usuário consultar as restrições de
forma contínua."

-Estrutura da Solução-

"Para resolver esse problema, usamos uma lista circular. Esse tipo de estrutura
permite que o usuário navegue pelos veículos de forma infinita, sem ter que reiniciar a
busca manualmente."
"Cada veículo é representado por um nó da lista, contendo três informações: placa, dia
da semana da restrição, e o horário."
"O programa tem algumas funções principais:
Inserir veículos na lista circular
Carregar os dados do arquivo rodizio_de_veiculos
Exibir e navegar pela lista
Buscar veículos por dia da semana
E liberar a memória no final"

-Explicação do Código-

"Na prática, o código é dividido em três partes principais:"
Classe Veiculo
"Guarda os dados de cada veículo e um ponteiro para o próximo."
Classe ListaCircular
"Tem os métodos para inserir, exibir, buscar e navegar pela lista. A navegação contínua
acontece com atual = atual.proximo, e como a lista é circular, nunca termina."
Classe Main
"Aqui a gente pede ao usuário que escolha um critério de busca — por dia da semana
ou final da placa. Depois, lemos o arquivo linha por linha, filtramos pelos critérios e
mostramos os veículos afetados."

-Demonstração e Encerramento-

"Se o usuário quiser, ele pode navegar pelos veículos restritos pressionando ENTER. A
lista é circular, então ele nunca precisa reiniciar a busca manualmente."
"Esse sistema é útil para planejar deslocamentos em grandes cidades com regras de
rodízio."
"Como melhoria futura, seria possível criar uma interface gráfica ou até integrar com
um app.
