/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.DAOProdutos;
import java.util.ArrayList;
import model.ModelProdutos;

/**
 *
 * @author Mr-Robot
 */
public class ControllerProdutos {
    
    //Instancia
    private DAOProdutos daoProdutos = new DAOProdutos();
    
    /**
     * Salvar produtos controller
     * 
     * @param pModelProdutos
     * @return int
     */
    public int salvarProdutoController(ModelProdutos pModelProdutos){
        return this.daoProdutos.salvarProdutosDAO(pModelProdutos);
    }
    /**
     * excluir um produto pelo código/ID
     * 
     * @param pIdProduto
     * @return boolean
     */
    public boolean excluirProdutoController(int pIdProduto){
        return this.daoProdutos.excluirProdutoDAO(pIdProduto);
    }
    /**
     * alterar um produto
     * 
     * @param pModelProdutos
     * @return boolean
     */
    public boolean alterarProdutoController(ModelProdutos pModelProdutos){
        return this.daoProdutos.alterarProdutoDAO(pModelProdutos);
    }
    /**
     * retornar produto pelo código
     * 
     * @param pIdProduto
     * @return model produto
     */
    public ModelProdutos retornarProdutoController(int pIdProduto){
        return this.daoProdutos.retornarProdutoDAO(pIdProduto);
    }
    
    /**
     * retornar produto pelo Nome
     * 
     * @param pNomeProduto
     * @return model produto
     */
    public ModelProdutos retornarProdutoController(String pNomeProduto){
        return this.daoProdutos.retornarProdutoDAO(pNomeProduto);
    }
    
    /**
     * retornar uma lista de produtos
     * 
     * @return lista Model produtos
     */
    public ArrayList<ModelProdutos> retornarListaProdutosDAO(){
        return this.daoProdutos.retornarListaProdutosDAO();
    }
    /**
     * Alterar lista de produtos no banco
     * @param plistaModelProdutos
     * @return boolean
     */
    public boolean alterarEstoqueProdutoController(ArrayList<ModelProdutos> plistaModelProdutos) {
        return this.daoProdutos.alterarEstoqueProdutosDAO(plistaModelProdutos);
    }
}
