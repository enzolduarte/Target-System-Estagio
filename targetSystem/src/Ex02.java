public class Ex02 {



        public static void verificarLetraA(String texto) {
            // Converte a string para minúsculas para facilitar a contagem
            String textoMinusculo = texto.toLowerCase();

            // Conta o número de vezes que 'a' aparece na string
            int quantidadeA = 0;
            for (int i = 0; i < textoMinusculo.length(); i++) {
                if (textoMinusculo.charAt(i) == 'a') {
                    quantidadeA++;
                }
            }

            // Verifica se a letra 'a' está presente na string
            if (quantidadeA > 0) {
                System.out.println("A letra 'a' aparece " + quantidadeA + " vezes na string.");
            } else {
                System.out.println("A letra 'a' não está presente na string.");
            }
        }

        public static void main(String[] args) {
            // Exemplo de uso
            String textoTeste = "A Arte de Aprender a Programar";
            verificarLetraA(textoTeste);
        }






}
