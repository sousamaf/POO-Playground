# Abstração 

Temos duas formas de abstração em Java, cada uma com um propósito diferente: classes abstratas são usadas para relacionamentos de herança, enquanto interfaces servem para definir comportamentos comuns entre classes de hierarquias distintas.

1. **Classe Abstrata (abstract):**
   - Uma classe abstrata em Java é uma classe que não pode ser instanciada diretamente e serve como modelo para outras classes. Ela pode conter tanto métodos abstratos (sem implementação, que devem ser sobrescritos pelas subclasses) quanto métodos concretos (com implementação). A abstração com classes abstratas é usada quando há uma relação de herança entre classes, e compartilham-se comportamentos comuns entre elas, mas algumas funcionalidades precisam ser definidas pelas subclasses.

2. **Interface:**
   - Uma interface em Java é um contrato que define um conjunto de métodos que uma classe deve implementar, mas sem fornecer qualquer implementação. Ao contrário das classes abstratas, as interfaces só contêm métodos abstratos (até o Java 8, quando começaram a suportar métodos com implementação padrão via `default` e `static`). As interfaces permitem que classes não relacionadas compartilhem funcionalidades comuns permitindo a implementação de múltiplas interfaces por uma única classe.

