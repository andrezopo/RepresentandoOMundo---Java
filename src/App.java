public class App {
    public static void main(String[] args) throws Exception {
        Student trupico = new Student("André", "Zopolato", 26, new Course("Engenharia de Software", 5, 2), 20, 12, 15);
        System.out.println(trupico.getFirstName() + ": " + "confiança: " + trupico.getConfidence() + " inteligência: " + trupico.getIntelligence() + " contatos: " + trupico.getNetworking() + ".\nCursando: " + trupico.getCourseName() + ".\nSemestres restantes: " + trupico.getCourseRemainingPeriods() + "\n");

        System.out.println("O mínimo para passar de semestre é ter 25 de inteligência e 30 de confiança, contatos são importantes para conseguir o primeiro emprego.\n");

        trupico.studySubject();
        trupico.studySubject();

        System.out.println(trupico.getFirstName() + " estudou incansavelmente para o semestre.\n");

        if (trupico.getIntelligence() >= 25 && trupico.getConfidence() >= 30){
            trupico.beApprovedInPeriod();
            System.out.println("As provas do semestre foram concluídas, qual terá sido seu resultado?\n");
        }

        System.out.println(trupico.getFirstName() + ": " + "confiança: " + trupico.getConfidence() + " inteligência: " + trupico.getIntelligence() + " contatos: " + trupico.getNetworking() + ".\nCursando: " + trupico.getCourseName() + ".\nSemestres restantes: " + trupico.getCourseRemainingPeriods() + "\n");

        System.out.println("Agora ele terá de lutar pelo primeiro emprego/estágio para concluir o último período.");

    }
}
