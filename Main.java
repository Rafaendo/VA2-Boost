class Main {
  public static void main(String[] args) {
    
    Disciplina disciplina1 = new Disciplina("Matematica" , 10);
    Disciplina disciplina2 = new Disciplina("Português", 3);
    Disciplina disciplina3 = new Disciplina("Geografia" , 6);
    Disciplina disciplina4 = new Disciplina("História" , 8);
    
    Professor professor = new Professor("Jaiminho");
    Professor professor1 = new Professor("Ronaldinho");
    Professor professor2 = new Professor("Robinho");
    
    Curso curso = new Curso("Administração" , disciplina1 , disciplina2, disciplina3);

    Aluno player1 = new Aluno(110 , "Rafael", curso) ;
    
    System.out.println(player1.curso.calcularMedia());

    player1.exibiRelatorio();
    
    }
}