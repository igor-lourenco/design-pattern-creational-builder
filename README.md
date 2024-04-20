# Builder

O Builder é um padrão de projeto criacional que permite a você construir objetos complexos passo a passo. O padrão permite que você produza diferentes tipos e representações de um objeto usando o mesmo código de construção.

## Problema

Criar objeto complexo que necessite de uma inicialização passo a passo trabalhosa de muitos campos e objetos agrupados. Tal código de inicialização fica geralmente enterrado dentro de um construtor monstruoso com vários parâmetros, ou espalhado por todo o código.

![imagem_1](https://github.com/igor-lourenco/design-pattern-creational-builder/blob/main/uml/Imagem_1.png)

Por exemplo, para criar um objeto `FastFoodMeal`. Para construir um `FastFoodMeal` simples, você precisa adicionar um sanduiche mas para adicionar mais itens a solução mais simples é estender a classe base  `FastFoodMeal` e criar um conjunto de subclasses para cobrir todas as combinações de parâmetros. Mas eventualmente acabará com um número considerável de subclasses. Qualquer novo parâmetro,vai precisar aumentar essa hierarquia cada vez mais.

Outra abordagem que não envolve a propagação de subclasses. Seria criar um construtor gigante diretamente na classe `FastFoodMeal` base com todos os possíveis parâmetros que controlam o objeto `FastFoodMeal`. Embora essa abordagem realmente elimine a necessidade de subclasses, ela cria outro problema.

![imagem_2](https://github.com/igor-lourenco/design-pattern-creational-builder/blob/main/uml/Imagem_2.png)

Na maioria dos casos a maioria dos parâmetros não será usada, tornando as chamadas do construtor em algo feio de se ver. Por exemplo, apenas algumas refeiçoes terão `dessert`, então os parâmetros relacionados a `dessert` serão inúteis nove em cada dez vezes.

## Solução 

O padrão Builder sugere que extraia o código de construção do objeto para fora de sua própria classe e mova ele para objetos separados chamados builders. “Builder” significa “construtor”.

![imagem_3](https://github.com/igor-lourenco/design-pattern-creational-builder/blob/main/uml/imagem_3.png)

O padrão organiza a construção de objetos em uma série de etapas (buildDrink, buildMain, etc.). Para criar um objeto você executa uma série de etapas em um objeto builder. A parte importante é que você não precisa chamar todas as etapas. Você chama apenas aquelas etapas que são necessárias para a produção de uma configuração específica de um objeto.

Algumas das etapas de construção podem necessitar de implementações diferentes quando você precisa construir várias representações. Por exemplo, um pedido com `drink`, `main`, `side`, `dessert` e pedido com apenas `side`

Nesse caso, é mais interessante criar diferentes classes construturas que implementam as mesmas etapas de construção, mas de maneira diferente. Então você pode usar esses builders no processo de construção para produzir diferentes tipos de objetos(`Menu1Builder`, `Menu2Builder`, `JustFriesBuilder`)
