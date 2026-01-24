    package br.va1.mpoo.edu.LuizHenrique.entidades;

    import java.util.ArrayList;

    public class BaseDados {
        protected ArrayList<Veiculo> veiculos;
        protected int NumeroVeiculos = 1;

        public void createBase(){
            InicializarBase();
        }
        private void InicializarBase(){
           this.veiculos = new ArrayList<>(); // Elimina o erro de NullPointerException

            // Civic
            Carro civic = new Carro(
                    "Honda", "Civic", 2020,
                    "Seguro 48h grátis",
                    new EquipamentoOpicional(true, true, true),
                    "ABC1234",
                    false,
                    4,
                    true
            );
            addVeiculo(civic);

            // HR-V
            Carro hrv = new Carro(
                    "Honda", "HR-V", 2025,
                    "Seguro 48h grátis",
                    new EquipamentoOpicional(true, true, true),
                    "XYZ1234",
                    false,
                    4,
                    true
            );
            addVeiculo(hrv);

            // R15
            addVeiculo( new Moto(
                    "Yamaha", "R15", 2024,
                    null,
                    new EquipamentoOpicional(false, true, true),
                    "ZZZ0000",
                    false,
                    155
            ));

            // CB650R
            addVeiculo( new Moto(
                    "Honda", "CB650R", 2025,
                    null,
                    new EquipamentoOpicional(false, true, true),
                    "AAA1122",
                    false,
                    650
            ));

            // Hornet 500
            addVeiculo( new Moto(
                    "Honda", "Hornet 500", 2022,
                    null,
                    new EquipamentoOpicional(false, true, true),
                    "BBB9999",
                    false,
                    470
            ));

        }
        public Veiculo BuscarVeiculo(String placa){
                for (Veiculo veiculo : veiculos){
                    if (veiculo.getPlaca().equals(placa)){
                        return veiculo;
                    }
                }
            return null;
        }
        public boolean isVeiculo(String placa){
            return BuscarVeiculo(placa) != null ;

        }
        public boolean isVeiculo(Veiculo veiculo){
            return veiculo != null;
        }
        public boolean addVeiculo(Veiculo veiculo){
            veiculo.setNumeroFrota(NumeroVeiculos);
            NumeroVeiculos ++;
            return veiculos.add(veiculo);

        }
        public boolean removerVeiculo(Veiculo veiculo){
           return veiculos.remove(veiculo);
        }
        public ArrayList<Veiculo> listVeiculosDisponiveis(){
            ArrayList<Veiculo> veiculosDisponiveis = new ArrayList<>();
            for (Veiculo veiculo : veiculos){
                if (!veiculo.isLocado()){
                    veiculosDisponiveis.add(veiculo);
                }
            }
            return veiculosDisponiveis;
        }
        public ArrayList<Carro> listCarroDisponiveis(){
            ArrayList<Carro> carosDisponiveis = new ArrayList<>();
            for (Veiculo veiculo : veiculos){
                if (veiculo instanceof Carro){
                    if (!veiculo.isLocado()){
                        Carro carro = (Carro) veiculo;
                        carosDisponiveis.add(carro);
                    }
                }
            }
                return carosDisponiveis;

        }
        public ArrayList<Moto> listMotosDisponiveis() {
            ArrayList<Moto> motosDisponiveis = new ArrayList<>();
            for (Veiculo veiculo : veiculos) {
                if (veiculo instanceof Moto && !veiculo.isLocado()) {
                    motosDisponiveis.add((Moto) veiculo);
                }
            }
            return motosDisponiveis;
        }
    }
