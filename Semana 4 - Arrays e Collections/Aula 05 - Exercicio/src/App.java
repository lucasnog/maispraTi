public class App {
    public static void main(String[] args) throws Exception {
        Curso curso = new Curso("Curso da Nasa");

        curso.addDiscplina("Geometria Analitica");
        curso.addDiscplina("Calculo Numérico");
        curso.addDiscplina("Fisica Quantica");

        curso.addAluno(001, "Lucas");
        curso.addAluno(002, "João");
        curso.addAluno(003, "Maria");
        curso.addAluno(004, "Madalena");

        curso.checkAluno(001);

        System.out.println(curso);
        curso.delDiscplina("Geometria Analitica");
        curso.delAluno(004);
        System.out.println(curso);
    }
}
