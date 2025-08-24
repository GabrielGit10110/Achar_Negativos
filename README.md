# 🧑‍🚀 Achar Negativos
Algoritmo para achar numeros negativos dentro de um vetor usando recursão.

## 📝 Enunciado:
Criar uma aplicação em Java que tenha uma função recursiva que calcule o somatório do N primeiros
número NATURAIS (a função deve retornar zero para números negativos)
O Código deve apresentar, em formato de comentário, como foi definida a condição de parada;
O Código deve apresentar, em formato de comentário, como foi definida a relação de chamada dos passos;

### ⚙️ Como compilar:
1. Transforme todos os arquivos.java em arquivos.class:
```bash
javac -s src -d dist src/controller/MathOperations.java src/view/Main.java
```

2. Execute:
```bash
java -cp dist view.FindNegative
``` 

* ⚙️ Opcional - Compilação para jar: *
1. Crie um MANIFEST.txt e adicione o caminho correto para a classe Main:
```bash
touch MANIFEST.txt
echo 'Main-Class: view.FindNegative' > MANIFEST.txt
```

2. Faca a compilação para jar:
```bash
jar -cvfm FindNegatives.jar MANIFEST.txt -C dist .
```

3. Execute o jar:
```bash
java -jar FindNegatives.jar
```
