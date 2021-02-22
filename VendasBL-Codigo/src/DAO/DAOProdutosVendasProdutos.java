/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import conexoes.ConexaoMySql;
import java.util.ArrayList;
import model.ModelProdutos;
import model.ModelProdutosVendasProdutos;
import model.ModelVendasProdutos;

/**
 *
 * @author Mr-Robot
 */
public class DAOProdutosVendasProdutos extends ConexaoMySql{
    
    public ArrayList<ModelProdutosVendasProdutos> getListaProdutosVendasProdutosDAO(int pCodigoVenda){
        //Instanciando todos os objeto que vai precisar
        ArrayList<ModelProdutosVendasProdutos> listaModelProdutosVendasProdutos = new ArrayList<>();
        ModelProdutosVendasProdutos modelProdutosVendasProdutos = new ModelProdutosVendasProdutos();
        ModelProdutos modelprodutos = new ModelProdutos();
        ModelVendasProdutos modelVendasProdutos = new ModelVendasProdutos();
        
        try {
            this.conectar();
            this.executarSQL("SELECT " 
                    + "tbl_produto.pk_id_produto, "
                    + "tbl_produto.pro_estoque, "
                    + "tbl_produto.pro_nome, "
                    + "tbl_produto.pro_valor, "
                    + "tbl_vendas_produtos.fk_produto, "
                    + "tbl_vendas_produtos.fk_vendas, "
                    + "tbl_vendas_produtos.pk_id_venda_produto, "
                    + "tbl_vendas_produtos.ven_pro_quantidade, "
                    + "tbl_vendas_produtos.ven_pro_valor "
                + "FROM " 
                    +" tbl_vendas_produtos "
                + "INNER JOIN " 
                    + "tbl_produto ON tbl_produto.pk_id_produto = tbl_vendas_produtos.fk_produto "
                + "WHERE  tbl_vendas_produtos.fk_vendas = '" + pCodigoVenda + "'"
                + ";"
            );
            
            while(this.getResultSet().next()){
                modelProdutosVendasProdutos = new ModelProdutosVendasProdutos();
                modelprodutos = new ModelProdutos();
                modelVendasProdutos = new ModelVendasProdutos();

                //produtos
                modelprodutos.setIdProduto(this.getResultSet().getInt(1));
                modelprodutos.setProEstoque(this.getResultSet().getInt(2));
                modelprodutos.setProNome(this.getResultSet().getString(3));
                modelprodutos.setProValor(this.getResultSet().getDouble(4));

                //Vendas produtos
                modelVendasProdutos.setProduto(this.getResultSet().getInt(5));
                modelVendasProdutos.setVendas(this.getResultSet().getInt(6));
                modelVendasProdutos.setIdVendaProduto(this.getResultSet().getInt(7));
                modelVendasProdutos.setVenProQuantidade(this.getResultSet().getInt(8));
                modelVendasProdutos.setVenProValor(this.getResultSet().getDouble(9));

                modelProdutosVendasProdutos.setModelProdutos(modelprodutos);
                modelProdutosVendasProdutos.setModelVendasProdutos(modelVendasProdutos);
                
                listaModelProdutosVendasProdutos.add(modelProdutosVendasProdutos);
                
            }    
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listaModelProdutosVendasProdutos;
    }
    
}
