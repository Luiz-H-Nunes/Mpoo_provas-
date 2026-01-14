package mpooSaveAnimalsSystem.animals;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class BaseDados {

    private static ArrayList<Animals> animals = new ArrayList<>();
    private static int seqId = 1;
    BaseDados(){
        this.animals = animals;
        this.seqId = seqId;
    }
    public static void  main(String[] args){
            CreateBaseDados();



            new BaseDados().inicializarBase();

    }

    public static void CreateBaseDados(){
        new BaseDados();
    }
    private  void inicializarBase(){
        System.out.println("Inicializando BaseDados.....\n\n");
        while (true){
            System.out.println("Menu Principal");
            System.out.println("1. Bucar Animal (id)");
            System.out.println("2. Adicionar Animal ");
            System.out.println("3. Remover Animal ");
            System.out.println("4. Atualizar alimentação ");
            System.out.println("5. Sair");
            addAnimal(new Leao("Nala", 4, 180.0, new Caracteristica(true,true),"Feminino",true,0));

            switch (new Scanner(System.in).nextInt()){
                case 1:
                    System.out.println("Qual id deseja buscar ? ");
                    buscarAnimal(new  Scanner(System.in).nextInt());
                    break;

                case 2:
                    try  {
                        System.out.println("Nome do animal: ");
                        String nome = new Scanner(System.in).next();
                        Animals animals1 = new Animals(nome);
                        addAnimal(animals1);
                    }
                    catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("Qual animal deseja remover ? ");
                    int num = 0;
                    for  (Animals animal : animals) {
                        System.out.println(num + animal.toString()+ "\n");
                        num++;
                    }

                    num = new Scanner(System.in).nextInt();
                    System.out.println(animals.size());
                    if (num > 0 || num < animals.size()){
                        removerAnimal(animals.get(num));
                    }

                    else{
                        System.out.println("Animal não encontrado");
                    }
                    break;
                case 4:
                    atualizarAlimentacaoAnimais();
                    break;

                case 5:
                    System.exit(0);

                default:
                    System.out.println("Opção inválida !");
                    break;

            }

        }
    }

    public Animals buscarAnimal(int id){
     try {
         if (animals.isEmpty()){
             System.out.println("Nenhum animal encontrado !");
         }
         for  (Animals animal : animals){
             //int num = Integer.parseInt(animal.getId().split("M")[1]);// ou
             int num = Integer.parseInt(animal.getId().replace("ANIM",""));
             if (num == id){
                 JOptionPane.showMessageDialog(null,animal.toString());
                 return animal;
             }
         }

     }catch (IndexOutOfBoundsException e){
         System.out.println("Erro ao buscar animal");

     }
        return null;
    }

    public boolean isAnimal(int id){
        for  (Animals a : animals){
            int num = Integer.parseInt(a.getId().split("M")[1]);
           if (num == id){
               return true;
           }

        }
        return false;
    }
    public boolean isAnimal(Animals animal){
        if (animals.contains(animal)) {
            return true;
        }
        return false;
    }

    public boolean addAnimal(Animals animal){
        try {
            if (animal.getId() == null) {
                animal.setId("ANIM" + String.format("%03d", seqId++));
            }

            if (animal instanceof Leao) {
                animal.setAlimentação("Carne de boi");
                Leao leao = (Leao) animal;
                animal.definirSomAnimal(leao);
            } else if (animal instanceof Elefante) {
                animal.setAlimentação("Folhas");
                Elefante elefante = (Elefante) animal;
                animal.definirSomAnimal(elefante);

            } else if (animal instanceof Cobra) {
                animal.setAlimentação("Ratos pequenos");
                Cobra cobra = (Cobra) animal;
                animal.definirSomAnimal(cobra);
            }
        }
        catch (Exception e){
            return false;
        }
        animals.add(animal);
        return true;
    }
    public boolean removerAnimal(Animals animal){
        if  (animals.contains(animal)){
            animals.remove(animal);
            System.out.println("Removido com sucesso");
            return true;

        }
        System.out.println("Erro ao remover animal");
        return false;
    }

    public static ArrayList<Mamifero> ListMamiferos(){
        ArrayList<Mamifero> mamiferos = new ArrayList<>();
       for  (Animals a : animals){
           if (a instanceof Mamifero){
               mamiferos.add((Mamifero) a);

           }
       }
       return mamiferos;
    }
    public ArrayList<Cobra> ListCobras(){
        ArrayList<Cobra> cobras = new ArrayList<>();
        for  (Animals a : animals){
            if (a instanceof Cobra){
                cobras.add((Cobra) a);
            }
        }
        return cobras;
    }
    public ArrayList<Animals> ListCarnivoros(){
        ArrayList<Animals> carnivoros = new ArrayList<>();
        for  (Animals a : animals){
            if (a.caracteristica.isCarnivoro){
                carnivoros.add((Animals) a);
            }
        }
        return carnivoros;
    }
    public void atualizarAlimentacaoAnimais(){
        System.out.println("Qual animal deseja atualizar ? ");
        int num = 0;
        for (Animals a : animals){
            System.out.println(num +" - "+ a.toString()+ "\n");
            num ++;
        }
        try {
            Scanner sc = new Scanner(System.in);
            num = Integer.parseInt(sc.nextLine());
            if (num > 0 || num < animals.size()){
                System.out.println("Qual a nova alimentação ? ");
                animals.get(num).setAlimentação(sc.nextLine());
            }

        }catch (Exception e){
            System.out.println("Erro ao atualizar animal");
        }
    }
}
