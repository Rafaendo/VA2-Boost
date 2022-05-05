class Disciplina {

  String nome;
  Professor professor;
  float notaFinal;

  Professor professor1 = new Professor("riquelme");
  
  Disciplina(String nomeDisciplina,float notaFinal){
    nome = nomeDisciplina;
    this.notaFinal = notaFinal;
  }

  void exibirRelatorioDisc(){
    System.out.println("Nome Aluno: " + nome + "\nProfessor:" + professor + "Nota Final:" + notaFinal);
  }
    
   float retornarNotaFinal(){
     
     return notaFinal;
     
   }
}