class Aluno {

  int matricula;
  String nome;
  Curso curso;

  Aluno(int matri , String n , Curso cur){
    matricula = matri;
    nome = n;
    curso = cur;
  }

  void exibiRelatorio(){
    System.out.println("|| matricula: " + matricula + " || Aluno: " + nome + "");
    curso.estaAprovado();
    
  }
  
}