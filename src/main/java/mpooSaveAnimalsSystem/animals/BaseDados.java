package mpooSaveAnimalsSystem.BaseDados;

import mpooSaveAnimalsSystem.animals.Animals;
import mpooSaveAnimalsSystem.animals.Caracteristica;
import mpooSaveAnimalsSystem.animals.Leao;

import java.util.List;

public class BaseDados {

    static List<Animals> animals;
    public static void  main(String[] args){
    }

    public void CreateBaseDados(){
        new BaseDados();
    }
    private void inicializarBase(){
        System.out.println("Inicializando BaseDados.....\n\n");
        while (true){
            System.out.println("Menu Principal");
            System.out.println("1. Bucar Animal (id)");
            System.out.println("2. Adicionar Animal ");
            System.out.println("3. Remover Animal ");
            System.out.println("4. Atualizar alimentação ");
            System.out.println("5. Sair");
            //System.out.println("6. Sair");

        }


    }
}
