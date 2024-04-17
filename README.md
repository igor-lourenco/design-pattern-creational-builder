# Builder

O Builder é um padrão de projeto criacional que permite a você construir objetos complexos passo a passo. O padrão permite que você produza diferentes tipos e representações de um objeto usando o mesmo código de construção.

## Problema

Criar objeto complexo que necessite de uma inicialização passo a passo trabalhosa de muitos campos e objetos agrupados. Tal código de inicialização fica geralmente enterrado dentro de um construtor monstruoso com vários parâmetros, ou espalhado por todo o código.

Imagem_1

Por exemplo, para criar um objeto `FastFoodMeal`. Para construir um `FastFoodMeal` simples, você precisa adicionar um sanduiche mas para adicionar mais itens a solução mais simples é estender a classe base  `FastFoodMeal` e criar um conjunto de subclasses para cobrir todas as combinações de parâmetros. Mas eventualmente acabará com um número considerável de subclasses. Qualquer novo parâmetro,vai precisar aumentar essa hierarquia cada vez mais.

Outra abordagem que não envolve a propagação de subclasses. Seria criar um construtor gigante diretamente na classe `FastFoodMeal` base com todos os possíveis parâmetros que controlam o objeto `FastFoodMeal`. Embora essa abordagem realmente elimine a necessidade de subclasses, ela cria outro problema.

Imagem_2

Na maioria dos casos a maioria dos parâmetros não será usada, tornando as chamadas do construtor em algo feio de se ver. Por exemplo, apenas algumas refeiçoes terão `dessert`, então os parâmetros relacionados a `dessert` serão inúteis nove em cada dez vezes.
