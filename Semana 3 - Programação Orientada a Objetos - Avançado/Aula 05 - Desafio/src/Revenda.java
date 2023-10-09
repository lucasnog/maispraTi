public class Revenda {
    Veiculo veiculo1, veiculo2, veiculo3, veiculo4, veiculo5;

    public void addVeiculo(Veiculo veiculo){
        System.out.println("------------------------------");
        System.out.println("Tentando cadastrar o veiculo: " + veiculo.placa );

        if(veiculo1 == null){
            veiculo1 = veiculo;
            System.out.println("Veiculo " + veiculo.placa +  " cadastrado com sucesso.");
        }else{
            if(veiculo2 == null){
                veiculo2 = veiculo;
                System.out.println("Veiculo " + veiculo.placa +  " cadastrado com sucesso.");
            }else {
                if(veiculo3 == null){
                    veiculo3 = veiculo;
                    System.out.println("Veiculo " + veiculo.placa +  " cadastrado com sucesso.");
                }else {
                    if(veiculo4 == null){
                        veiculo4 = veiculo;
                        System.out.println("Veiculo " + veiculo.placa +  " cadastrado com sucesso.");
                    }else {
                        if(veiculo5 == null){
                            veiculo5 = veiculo;
                            System.out.println("Veiculo " + veiculo.placa +  " cadastrado com sucesso.");
                        }else{
                            System.out.println("Veiculo " + veiculo.placa + " não foi cadastrado. A revenda já está lotada!");
                        }
                    }
                }
            }
        }
    }

    public void removerVeiculo(String placa){
        System.out.println("------------------------------");
       if(placa == veiculo1.placa ){
           veiculo1 = null;
           System.out.println("Veiculo de placa:" + placa + " foi removido da revenda com sucesso.");
       }else {
           if (placa == veiculo2.placa) {
               veiculo2 = null;
               System.out.println("Veiculo de placa:" + placa + " foi removido da revenda com sucesso.");
           } else {
               if (placa == veiculo3.placa) {
                   veiculo3 = null;
                   System.out.println("Veiculo de placa:" + placa + " foi removido da revenda com sucesso.");
               } else {
                   if (placa == veiculo4.placa) {
                       veiculo4 = null;
                       System.out.println("Veiculo de placa:" + placa + " foi removido da revenda com sucesso.");

                   } else {
                       if (placa == veiculo5.placa) {
                           veiculo5 = null;
                           System.out.println("Veiculo de placa:" + placa + " foi removido da revenda com sucesso.");
                       } else {
                           System.out.println("O carro de placa " + placa + " não foi encontrado na revenda.");
                       }
                   }
               }
           }
       }
    };
    public void listarVeiculos(){

        System.out.println("------------------------------");
        System.out.println("Veiculo 01: " + veiculo1);
        System.out.println("------------------------------");
        System.out.println("Veiculo 02: " + veiculo2);
        System.out.println("------------------------------");
        System.out.println("Veiculo 03: " + veiculo3);
        System.out.println("------------------------------");
        System.out.println("Veiculo 04: " + veiculo4);
        System.out.println("------------------------------");
        System.out.println("Veiculo 05: " + veiculo5);
        System.out.println("------------------------------");
    }

    public void addDesconto(String placa, double valorDesconto) {


        if(placa == veiculo1.placa ){
            veiculo1.aplicarDesconto(valorDesconto);
        }else {
            if (placa == veiculo2.placa) {
                veiculo2.aplicarDesconto(valorDesconto);
            } else {
                if (placa == veiculo3.placa) {
                    veiculo3.aplicarDesconto(valorDesconto);
                } else {
                    if (placa == veiculo4.placa) {
                        veiculo4.aplicarDesconto(valorDesconto);

                    } else {
                        if (placa == veiculo5.placa) {
                            veiculo5.aplicarDesconto(valorDesconto);
                        } else {
                            System.out.println("O carro de placa " + placa + "Não foi encontrado na revenda.");
                        }
                    }
                }
            }
        }
    }

}

