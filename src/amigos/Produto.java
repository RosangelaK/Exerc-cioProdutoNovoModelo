/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amigos;

/**
 *
 * @author Rosangela
 */
public class Produto {

    String nome, unidMedida;
    int qtdeCompra, qtdeEstoque;
    float preco, desconto, acrescimo;

   // metodo para listar os produtos 
   public void listarProduto() {
        System.out.println("Produto" + nome + "preco" + preco + "Unid Medida" + unidMedida + "Quantidade" + qtdeCompra);

    }

    public void precodDesconto(double newDesconto) {
        double precoDesconto;
        precoDesconto = preco - (preco * newDesconto) / 100;
        System.out.println("Preço com Desconto : " + precoDesconto);
    }

    public void precoAcrescimo(double newAcrescimo) {
        double precoAcrescimo;
        precoAcrescimo = preco + (preco * (newAcrescimo / 100));
        System.out.println("Preço com Acréscimo : " + precoAcrescimo);
    }
}