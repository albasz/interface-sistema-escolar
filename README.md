# 🎓 Sistema Escolar — Java Swing

Interface gráfica de um sistema de cadastro escolar desenvolvida em Java com Swing, permitindo o gerenciamento de dados pessoais, informações de curso, notas, faltas e visualização de boletim do aluno.

---

## 📋 Sobre o Projeto

Este projeto simula a tela de cadastro de um **sistema acadêmico**, organizado em abas para facilitar a navegação entre as diferentes seções do cadastro do aluno.

---

## ✨ Funcionalidades

A interface é dividida em **4 abas**:

### 👤 Dados Pessoais
- RGM (Registro Geral de Matrícula)
- Nome completo
- E-mail
- Endereço
- Município, UF e Celular

### 📚 Curso
- Seleção do curso (ADS, SI, Engenharia)
- Seleção do campus (Tatuapé, Mooca)
- Período (Matutino, Vespertino ou Noturno)

### 📝 Notas e Faltas
- Seleção da disciplina (POO, Banco de Dados)
- Lançamento de nota
- Lançamento de faltas

### 📊 Boletim
- Tabela com colunas: Disciplina, Nota e Faltas

---

## 🖼️ Interface

A aplicação utiliza um `JTabbedPane` para organizar os formulários em abas, com layout nulo para posicionamento preciso dos componentes. A janela principal tem dimensões de **820 × 540 pixels**.

---

## 🚀 Como Executar

### Pré-requisitos

- [Java JDK 8+](https://www.oracle.com/java/technologies/downloads/) instalado
- Qualquer IDE Java (IntelliJ IDEA, Eclipse, NetBeans) ou terminal

### Clonando o Repositório

```bash
git clone https://github.com/seu-usuario/interface-sistema-escolar.git
cd interface-sistema-escolar
```

### Compilando e Executando pelo Terminal

```bash
# Compilar
javac interfasejanela/JanelaSistema.java

# Executar
java interfasejanela.JanelaSistema
```

### Executando pela IDE

1. Importe o projeto na sua IDE
2. Localize a classe `JanelaSistema.java` no pacote `interfasejanela`
3. Execute o método `main`

---

## 🛠️ Tecnologias Utilizadas

- **Java** — Linguagem principal
- **Java Swing** — Biblioteca para interface gráfica (GUI)
  - `JFrame`, `JTabbedPane`, `JPanel`
  - `JTextField`, `JComboBox`, `JRadioButton`, `ButtonGroup`
  - `JTable`, `JScrollPane`

---

## 📁 Estrutura do Projeto

```
interface-sistema-escolar/
│
└── interfasejanela/
    └── JanelaSistema.java   # Classe principal com toda a interface do sistema
```

---

## 🔮 Possíveis Melhorias Futuras

- [ ] Integração com banco de dados para persistência dos dados
- [ ] Botões de salvar, limpar e consultar por RGM
- [ ] Validação dos campos (RGM numérico, e-mail válido, nota entre 0 e 10)
- [ ] Preenchimento automático do boletim com base nas notas lançadas
- [ ] Exportação do boletim em PDF

---

## 👨‍💻 Autor

Feito com ☕ e Java.
