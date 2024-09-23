package desafios.polimorfismo;

public class Main {
    public static void main(String[] args){
        Animal meuAnimal = new Animal();
        Animal meuCachorro = new Cachorro();
        Animal meuGato = new Gato();
        Animal meuPassarinho = new Passarinho();
        // Crie uma instância da sua nova classe de animal aqui
        // Exemplo: Animal meuBoi = new Boi();

        Animal[] animais = {meuAnimal, meuCachorro, meuGato, meuPassarinho /*, meuBoi */};

        for(Animal animal : animais){
            animal.emitirSom();
        }
    }
}