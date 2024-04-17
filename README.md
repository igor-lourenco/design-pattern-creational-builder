# Builder

O Builder é um padrão de projeto criacional que permite a você construir objetos complexos passo a passo. O padrão permite que você produza diferentes tipos e representações de um objeto usando o mesmo código de construção.

## Problema

Criar objeto complexo que necessite de uma inicialização passo a passo trabalhosa de muitos campos e objetos agrupados. Tal código de inicialização fica geralmente enterrado dentro de um construtor monstruoso com vários parâmetros, ou espalhado por todo o código.

Imagem_1

Por exemplo, para criar um objeto `FastFoodMeal`. Para construir um `FastFoodMeal` simples, você precisa adicionar um sanduiche mas para adicionar mais itens a solução mais simples é estender a classe base  `FastFoodMeal` e criar um conjunto de subclasses para cobrir todas as combinações de parâmetros. Mas eventualmente acabará com um número considerável de subclasses. Qualquer novo parâmetro,vai precisar aumentar essa hierarquia cada vez mais.
