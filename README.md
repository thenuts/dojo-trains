# Java Study Group - Dojo 1 - Trains

Vamos resolver o problema `Trains`, utilizado no processo de seleção, com os recursos da linguagem Java.


## Sessão 1 (18/10/17)
### DONE
- Iniciamos o projeto
- Adicionamos os primeiros testes
	- Quando a cidade inicial e a cidade final são a mesma
	- Quando a cidade inicial é `A` e a cidade final é `B`
	- Quando a cidade inicial é `B` e a cidade final é `C`

### TODO
- Será que a classe `Route` não está com muitas responsabilidades?
- `startingTown`, `endingTown` e `distance` não deveriam ser propriedades da classe `Route`?
- Qual classe seria responsável por gerenciar as `Routes` existentes?

## Sessão 2 (23/10/17)
### DONE
- Refatoramos a construção dos objetos `Route` e ajustamos os testes existentes
- Discutimos sobre várias coisas (exceções, patterns, IntelliJ, técnicas de teste, padrões de teste, etc)

### ANSWERS
- Será que a classe `Route` não está com muitas responsabilidades? Sim, tem.
- `startingTown`, `endingTown` e `distance` não deveriam ser propriedades da classe `Route`? Fizemos isso.
- Qual classe seria responsável por gerenciar as `Routes` existentes? Criamos a classe `Railroad` pra isso.

### TODO
- O método `calculateDistance` é capaz de calcular a distância entre A e D?
- Será que usar `if` do método calculateDistance são a melhor a solução?