# Exercício de Herança em Java - Figuras Geométricas

Este exercício tem como objetivo praticar os conceitos de **herança** em Java através da criação de uma hierarquia de classes envolvendo figuras geométricas.

## 🧠 Conceitos abordados

- Herança
- Classes abstratas (opcional)
- Polimorfismo (opcional)
- Encapsulamento

## 📐 Estrutura do Projeto

- **FiguraGeometrica** (superclasse)
  - Representa uma figura genérica.
  - Pode conter atributos comuns como `nome`.
  - Pode ter métodos como `calcularArea()` e `exibirInformacoes()`.

- **Triangulo** (subclasse de FiguraGeometrica)
  - Atributos: `base` e `altura`.
  - Implementa o cálculo da área: `(base * altura) / 2`.

- **Circulo** (subclasse de FiguraGeometrica)
  - Atributo: `raio`.
  - Implementa o cálculo da área: `π * raio²`.
