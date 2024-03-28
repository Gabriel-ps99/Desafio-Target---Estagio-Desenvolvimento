# Desafio Target-Estagio Desenvolvimento
Este é um projeto para o Desafio Target-Estagio Desenvolvimento, contendo a resolução de 4 desafios em JAVA(sendo necessario a instalação em seu ambiente), e 1 em Raciocinio Lógico, totalizando 5 desafios.

## Desafio 01: ##
1) Observe o trecho de código abaixo:

   ```bash
   int INDICE = 13, SOMA = 0, K = 0;

   enquanto K < INDICE faça

   {

   K = K + 1;

   SOMA = SOMA + K;

   }

   imprimir(SOMA);

Ao final do processamento, qual será o valor da variável SOMA? <br>
**Resultado:**
O código Java Desafio01, calcula a soma dos números naturais de 1 a 13 e exibe o resultado, que é 91. Ele usa um loop para adicionar cada número à variável SOMA até atingir o valor 13.

## Desafio 02: ##
Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.

IMPORTANTE:
Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido no código;

**Resolução:**
O código Java Desafio 02, é um programa que verifica se um número informado pelo usuário pertence à sequência de Fibonacci. Ele utiliza a classe Scanner para receber a entrada do usuário e, em seguida, realiza a verificação por meio de um loop while, calculando os números da sequência até ultrapassar o número informado ou encontrá-lo na sequência. Ao final, o programa exibe uma mensagem indicando se o número pertence ou não à sequência de Fibonacci.

## Desafio 03: ##
Descubra a lógica e complete o próximo elemento:
O código em Java Desafio03, apresenta uma série de sequências numéricas e calcula o próximo elemento de cada uma delas. **A resolução das sequências são as seguintes:**

a) 1, 3, 5, 7, ___ - O próximo elemento é o último elemento mais 2. <br>
b) 2, 4, 8, 16, 32, 64, ____ - O próximo elemento é o último elemento multiplicado por 2. <br>
c) 0, 1, 4, 9, 16, 25, 36, ____ - O próximo elemento é o último elemento mais 11, seguindo a soma do próximo número ímpar. <br>
d) 4, 16, 36, 64, ____ - O próximo elemento é calculado usando a raiz quadrada do último elemento mais 2, elevado ao quadrado. <br>
e) 1, 1, 2, 3, 5, 8, ____ - Esta sequência segue a lógica da sequência de Fibonacci, onde cada número é a soma dos dois anteriores. <br>
f) 2, 10, 12, 16, 17, 18, 19, ____ - O próximo elemento é 200, seguindo a lógica da letra inicial de cada número na sequência. <br>

## Desafio 04: ##
Você está em uma sala com três interruptores, cada um conectado a uma lâmpada em uma sala diferente. Você não pode ver as lâmpadas da sala em que está, mas pode ligar e desligar os interruptores quantas vezes quiser. Seu objetivo é descobrir qual interruptor controla qual lâmpada.

Como você faria para descobrir, usando apenas duas idas até uma das salas das lâmpadas, qual interruptor controla cada lâmpada? <br>
**Resolução:** <br>
Ligue o primeiro interruptor e espere alguns minutos. <br>
Desligue o primeiro interruptor e ligue o segundo interruptor. <br>
Entre na sala das lâmpadas e observe o estado delas: <br>
Se uma lâmpada estiver acesa, o primeiro interruptor controla essa lâmpada. <br>
Se uma lâmpada estiver apagada e ainda estiver fria ao toque, o segundo interruptor controla essa lâmpada. <br>
Se uma lâmpada estiver apagada, mas estiver quente ao toque, o terceiro interruptor controla essa lâmpada. <br>
Dessa forma, com apenas duas idas até a sala das lâmpadas, você pode determinar qual interruptor controla cada lâmpada. <br>

## Desafio 05: ##
Escreva um programa que inverta os caracteres de um string.
IMPORTANTE:

a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;
b) Evite usar funções prontas, como, por exemplo, reverse;

**Resolução**
O código em Java Desafio05, permite ao usuário inserir uma string e, em seguida, inverte essa string sem usar funções prontas como reverse. Ele faz isso convertendo a string em um array de caracteres, invertendo manualmente os caracteres no array e, por fim, convertendo o array de volta para uma string invertida. O resultado é exibido na tela junto com a string original.
