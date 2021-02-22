/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;

/**
 *
 * @author Mr-Robot
 */
public class FundoTela extends JDesktopPane {
    //Classe image para colocar imagem
    private Image imagem;
    
    // metodo public, com a variavel imagem
    public FundoTela(String imagem){
        //imagem receber ImageIcon
        this.imagem = new ImageIcon(imagem).getImage();
    }
    //Fazendo a função
    @Override
    //Forçando a execução desse metodo
    public void paintComponent(Graphics g){
        //objeto imagem"desenha no eixo y 0, eixo x 0, até que chegue na altura e largura da tela"
        g.drawImage(imagem, 0, 0, getWidth(), getHeight(), this);
    }
    
}
