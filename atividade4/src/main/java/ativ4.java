
import static java.lang.System.console;




/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class ativ4 {
    

    public static void main(String[] args){
        
         let nome = prompt("Digite seu nome:");
         let idade = parseInt(prompt("Digite sua idade:"));
         let curso = prompt("Digite seu curso:");
         let escolaTecnica = prompt("Digite sua escola técnica:");


         String classificacao = null;
         
         if (idade < 12) {
                classificacao = "criança";
         } else if (idade >= 12 && idade < 18) {
                classificacao = "adolescente";
         } else if (idade >= 18 && idade < 60) {
                classificacao = "adulto";
         } else {
                classificacao = "idoso";
}




console.log("Nome: " + nome);
console.log("Idade: " + idade);
console.log("Curso: " + curso);
console.log("Escola Técnica: " + escolaTecnica);
console.log(classificacao);
        
       
}

    private static let prompt(String digite_seu_curso) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static let parseInt(let prompt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}


