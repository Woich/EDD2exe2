package utfpr.dainf.ct.ed.exemplo;



/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * 
 * Exemplo de implementação de árvore binária.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 * @param <E> O tipo do valor armazenado nos nós na árvore
 */
public class ArvoreBinaria<E> {
    
    protected E valor;
    
    

    /**
     * Cria uma árvore binária com valor nulo na raiz.
     */
    public ArvoreBinaria() {
    }

    /**
     * Cria uma árvore binária com valor {@code valor} na raiz.
     * @param valor O valor do nó raiz
     */
    public ArvoreBinaria(E valor) {
        this.valor = valor;
    }
    
    
    
    /**
     * Implementação padrão que exibe o valor armazenado no nó usando
     * o método {@code toString()}.
     * Pode ser sobrecarregado em classes derivadas para implementar outras
     * formas de visita.
     * @param no O nó a ser visitado
     */
    protected void visita(ArvoreBinaria<E> no) {
        System.out.print(" " + no.valor);
    }
    
    
    
    /**
     * Visita os nós da subárvore em pre-ordem.
     * @param raiz A raiz da subárvore
     */
    public void visitaPreOrdem(ArvoreBinaria<E> raiz) {
        throw new RuntimeException("Não implementado");
    }
    
    /**
     * Visita os nós da árvore em pre-ordem a partir da raiz.
     */
    public void visitaPreOrdem() {
        visitaPreOrdem(this);
    }
    
    /**
     * Visita os nós da subárvore em pre-ordem.
     * @param raiz A raiz da subárvore
     */
    public void visitaPosOrdem(ArvoreBinaria<E> raiz) {
        throw new RuntimeException("Não implementado");
    }
    
    /**
     * Visita os nós da árvore em pre-ordem a partir da raiz.
     */
    public void visitaPosOrdem() {
        visitaPosOrdem(this);
    }
    
    
 
    
    /**
     * Retorna o próximo nó em pré-ordem.
     * @return O próximo nó em pré-ordem.
     */
    public ArvoreBinaria<E> proximoPreOrdem() {
        throw new RuntimeException("Não implementado");
    }
    
    /**
     * Retorna o próximo nó em pós-ordem.
     * @return O próximo nó em pós-ordem.
     */
    public ArvoreBinaria<E> proximoPosOrdem() {
        throw new RuntimeException("Não implementado");
    }
    
    /**
     * Retorna o próximo nó em nível.
     * @return O próximo nó em nível.
     */
    public ArvoreBinaria<E> proximoEmNivel() {
        throw new RuntimeException("Não implementado");
    }
    
    /**
     * Retorna o valor armazenado no nó.
     * @return O valor armazenado no nó.
     */
    public E getValor() {
        return valor;
    }

    /**
     * Atribui um valor ao nó.
     * @param valor O valor a ser atribuído ao nó.
     */
    public void setValor(E valor) {
        this.valor = valor;
    }

    
}
