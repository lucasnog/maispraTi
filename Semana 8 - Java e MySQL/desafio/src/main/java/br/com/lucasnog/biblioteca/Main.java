package br.com.lucasnog.biblioteca;

import br.com.lucasnog.biblioteca.service.IUIService;
import br.com.lucasnog.biblioteca.service.repository.LivroRepository;
import br.com.lucasnog.biblioteca.service.userinterface.UIConsoleService;

public class Main {
    public static void main(String[] args) {

        LivroRepository livroRepository = new LivroRepository();
        IUIService userInterface = new UIConsoleService();
        boolean continuar = true;
        do {
            switch (userInterface.menuPrincipal()) {
                case 1:
                    livroRepository.create(userInterface.addLivro());
                    break;
                case 2:
                    userInterface.showAll();
                    break;
                case 3:
                    userInterface.alugarLivro();
                    break;
                case 4:
                    userInterface.devolverLivro();
                    break;
                case 5:
                    userInterface.showRented();
                    break;
                case 6:
                    userInterface.showAvailable();
                    break;
                case 7:
                    userInterface.deletarLivro();
                    break;
                case 8:
                    continuar = userInterface.sair();

            }
        } while (continuar);
    }
}