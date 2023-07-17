package Controller;

import View.MostraJTable;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

/**
 * Classe usada para criar um botão o qual permite que o usuário selecione o arquivo que deseja visualizar.
 *
 * @author Guilherme Gomes Botelho
 */
public class BotaoArquivo
{
    /**
     *  Arquivo que o usuário selecionou.
     */
    private File arquivoSelecionado;

    /**
     *  Cria uma nova instância da classe Controller.BotaoArquivo, em seguida, cria uma nova janela a qual permitirá que
     *  o usuário clique em um botão e selecione o arquivo de sua escolha, se o arquivo for válido, cria-se
     *  um outra janela com a tabela de dados(JTable) e a janela atual é fechada.
     */
    public BotaoArquivo()
    {
        JFrame janela = new JFrame("Escolha um arquivo");
        JButton botao = new JButton("Selecionar arquivo");
        botao.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                escolherArquivo();
                Tabela arquivoTabela = new Tabela(arquivoSelecionado);
                MostraJTable view = new MostraJTable(arquivoTabela);
                view.criarInterface();
                janela.dispose();
            }
        });
        janela.getContentPane().add(botao, BorderLayout.CENTER);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.pack();
        janela.setLocationRelativeTo(null);
        janela.setVisible(true);
    }

    /**
     *  Esse método abre o selecionador de arquivos e checa se o usuário escolheu é válido, se sim,
     *  ele guarda o arquivo selecionado. Senão, ele imprime "Erro no arquivo escolhido".
     */
    public void escolherArquivo()  // abre o selecionador de arquivo
    {
        JFileChooser escolhedorDeArquivo = new JFileChooser();
        int resultado = escolhedorDeArquivo.showOpenDialog(null);
        if (resultado == JFileChooser.APPROVE_OPTION) // checa se o usuário escolheu o arquivo
        {
            this.arquivoSelecionado = escolhedorDeArquivo.getSelectedFile(); // guarda o arquivo selecionado
        }
        else // caso contrario
        {
            System.out.println("Erro no arquivo escolhido"); // printa erro
            this.arquivoSelecionado = null;
        }
    }
}
