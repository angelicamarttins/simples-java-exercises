package compile_multiple_java_files;

import compile_multiple_java_files.utils.Endereco;

public class HelloWorld {

  public static void main(String[] args) {
    Pessoa pessoa = new Pessoa("Angélica");
    Endereco endereco = new Endereco("Rua Siqueira Campos");

    System.out.println(pessoa.getNome());
    System.out.println(endereco.getRua());
  }

}
