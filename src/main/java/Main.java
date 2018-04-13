
import utfpr.dainf.ct.ed.exemplo.ArvoreBinaria;
import utfpr.dainf.ct.ed.exemplo.ArvoreBinariaPesquisa;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * 
 * Cria e percorre a seguinte árvore binária:
 *       
 *                    8
 *                   / \
 *                  /   \
 *                 3     10
 *                / \     \
 *               1   6     14 
 *                  / \    /
 *                 4   7  13
 * 
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class Main {
    
    public static void main(String[] args) {
        Main main = new Main();
        main.testaArvoreBinariaPesquisa();
    }
    
    private void testaArvoreBinariaPesquisa() {
        System.out.println("\n\nTESTE DE ARVORE BINÁRIA DE PESQUISA");
        
        // monta a árvore binária de pesquisa
        // e armazena os nós em um vetor para uso posterior
        ArvoreBinariaPesquisa<Integer> a = new ArvoreBinariaPesquisa<>(8);
        System.out.println("\nTESTES DE INSERÇÃO");
        ArvoreBinariaPesquisa[] nos = { a, // 0 raiz
            a.insere(3),    // 1
            a.insere(10),   // 2
            a.insere(1),    // 3
            a.insere(6),    // 4
            a.insere(4),    // 5
            a.insere(7),    // 6
            a.insere(14),   // 7
            a.insere(13)    // 8
        };
               
        System.out.println("\nPesquisa pelo nó com chave 14");
        ArvoreBinaria<Integer> no6 = a.pesquisa(14);
        System.out.println("Nó localizado: " + (no6 == null ? no6 : no6.getValor()));

        System.out.println("\nPesquisa pelo nó com chave 100");
        ArvoreBinaria<Integer> no12 = a.pesquisa(100);
        System.out.println("Nó localizado: " + (no12 == null ? no12 : no12.getValor()));

        System.out.println("\nNó mínimo");
        ArvoreBinaria<Integer> min = a.getMinimo();
        System.out.println("Nó localizado: " + (min == null ? min : min.getValor()));

        System.out.println("\nNó máximo");
        ArvoreBinaria<Integer> max = a.getMaximo();
        System.out.println("Nó localizado: " + (max == null ? max : max.getValor()));
        
        System.out.println("\nTODOS OS SUCESSORES");
        for (ArvoreBinariaPesquisa abp: nos) {
            ArvoreBinaria<Integer> s = a.sucessor(abp);
            System.out.format("Sucessor de %s: %s\n", abp.getValor(), s == null ? s : s.getValor());
        }
        
        System.out.println("\nTODOS OS PREDECESSORES");
        for (ArvoreBinariaPesquisa abp: nos) {
            ArvoreBinaria<Integer> p = a.predecessor(abp);
            System.out.format("Predecessor de %s: %s\n", abp.getValor(), p == null ? p : p.getValor());
        }

        System.out.println("\nPERCURSO ITERATIVO");
        ArvoreBinaria<Integer> no;
        while ((no = a.proximoEmOrdem()) != null)
        {
            System.out.print(" " + no.getValor());
        }
        

        System.out.println("\nTESTES DE EXCLUSÃO");
        for (ArvoreBinariaPesquisa abp: nos) {
            System.out.println("\nExcluindo " + abp.getValor());
            a.exclui(abp); // arvore pode mudar
            a.visitaEmOrdem();
            System.out.println("");
        }
    }
}
