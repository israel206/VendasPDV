-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 21-Fev-2021 às 18:41
-- Versão do servidor: 10.4.17-MariaDB
-- versão do PHP: 8.0.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `dbvenda`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbl_cliente`
--

CREATE TABLE `tbl_cliente` (
  `pk_id_Cliente` bigint(11) NOT NULL,
  `cli_nome` varchar(255) NOT NULL,
  `cli_zona` varchar(20) NOT NULL,
  `cli_endereco` varchar(255) NOT NULL,
  `cli_bairro` varchar(255) NOT NULL,
  `cli_cidade` varchar(255) NOT NULL,
  `cli_uf` varchar(2) NOT NULL,
  `cli_cep` varchar(10) NOT NULL,
  `cli_tel_fixo` varchar(15) DEFAULT NULL,
  `cli_tel_cel` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `tbl_cliente`
--

INSERT INTO `tbl_cliente` (`pk_id_Cliente`, `cli_nome`, `cli_zona`, `cli_endereco`, `cli_bairro`, `cli_cidade`, `cli_uf`, `cli_cep`, `cli_tel_fixo`, `cli_tel_cel`) VALUES
(1, 'Israel Jesus da Silva', 'Zona Rural', 'Fazenda Santa Luzia ', 'Sitio', 'Cruz do Espirito Santo', 'PB', '58337-000', '(83)3344-5566', '(83)98115-496 ');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbl_forma_pagamento`
--

CREATE TABLE `tbl_forma_pagamento` (
  `pk_id_for_pag` bigint(20) NOT NULL,
  `descricao_for_pag` varchar(255) NOT NULL,
  `desconto_for_pag` float NOT NULL,
  `parcelas_for_pag` int(11) NOT NULL,
  `situacao_for_pag` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbl_produto`
--

CREATE TABLE `tbl_produto` (
  `pk_id_produto` bigint(20) NOT NULL,
  `pro_nome` varchar(255) NOT NULL,
  `pro_valor` double NOT NULL,
  `pro_estoque` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `tbl_produto`
--

INSERT INTO `tbl_produto` (`pk_id_produto`, `pro_nome`, `pro_valor`, `pro_estoque`) VALUES
(1, 'CANETA PRETA', 3.5, 47),
(2, 'LAPÍS GRAFIT', 2.3, 45),
(4, 'ABACAXI', 3.4, 50),
(5, 'BANANA NANINCA NEGÃO', 2.5, 50),
(6, 'COLCHÕES', 150.99, 50);

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbl_usuario`
--

CREATE TABLE `tbl_usuario` (
  `pk_id_usuario` bigint(11) NOT NULL,
  `usu_nome` varchar(255) NOT NULL,
  `usu_login` varchar(20) NOT NULL,
  `usu_senha` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `tbl_usuario`
--

INSERT INTO `tbl_usuario` (`pk_id_usuario`, `usu_nome`, `usu_login`, `usu_senha`) VALUES
(1, 'israel pereira da silva', 'israel', '123'),
(4, 'Ana Paula', 'ana', '123'),
(5, 'administrador', 'admin', 'admin');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbl_vendas`
--

CREATE TABLE `tbl_vendas` (
  `pk_id_vendas` bigint(20) NOT NULL,
  `fk_cliente` bigint(20) NOT NULL,
  `ven_data_venda` date NOT NULL,
  `ven_valor_liquido` double NOT NULL,
  `ven_valor_bruto` double NOT NULL,
  `ven_desconto` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `tbl_vendas`
--

INSERT INTO `tbl_vendas` (`pk_id_vendas`, `fk_cliente`, `ven_data_venda`, `ven_valor_liquido`, `ven_valor_bruto`, `ven_desconto`) VALUES
(7, 1, '2021-02-07', 813.45, 813.45, 0),
(8, 1, '2021-02-07', 0, 0, 0),
(9, 1, '2021-02-07', 8.1, 8.1, 0),
(10, 1, '2021-02-07', 8.1, 8.1, 0);

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbl_vendas_produtos`
--

CREATE TABLE `tbl_vendas_produtos` (
  `pk_id_venda_produto` bigint(20) NOT NULL,
  `fk_produto` bigint(20) NOT NULL,
  `fk_vendas` bigint(20) NOT NULL,
  `ven_pro_valor` double NOT NULL,
  `ven_pro_quantidade` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `tbl_vendas_produtos`
--

INSERT INTO `tbl_vendas_produtos` (`pk_id_venda_produto`, `fk_produto`, `fk_vendas`, `ven_pro_valor`, `ven_pro_quantidade`) VALUES
(15, 1, 7, 3.5, 5),
(16, 2, 7, 2.3, 5),
(17, 4, 7, 3.4, 5),
(18, 5, 7, 2.5, 5),
(19, 1, 8, 3.5, 1),
(20, 2, 8, 2.3, 1),
(21, 1, 9, 3.5, 1),
(22, 2, 9, 2.3, 2),
(23, 1, 9, 3.5, 1),
(24, 2, 9, 2.3, 2),
(25, 1, 10, 3.5, 1),
(26, 2, 10, 2.3, 2);

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `tbl_cliente`
--
ALTER TABLE `tbl_cliente`
  ADD PRIMARY KEY (`pk_id_Cliente`);

--
-- Índices para tabela `tbl_forma_pagamento`
--
ALTER TABLE `tbl_forma_pagamento`
  ADD PRIMARY KEY (`pk_id_for_pag`);

--
-- Índices para tabela `tbl_produto`
--
ALTER TABLE `tbl_produto`
  ADD PRIMARY KEY (`pk_id_produto`);

--
-- Índices para tabela `tbl_usuario`
--
ALTER TABLE `tbl_usuario`
  ADD PRIMARY KEY (`pk_id_usuario`);

--
-- Índices para tabela `tbl_vendas`
--
ALTER TABLE `tbl_vendas`
  ADD PRIMARY KEY (`pk_id_vendas`),
  ADD KEY `fkCliente` (`fk_cliente`);

--
-- Índices para tabela `tbl_vendas_produtos`
--
ALTER TABLE `tbl_vendas_produtos`
  ADD PRIMARY KEY (`pk_id_venda_produto`),
  ADD KEY `fkProduto` (`fk_produto`),
  ADD KEY `fkVendas` (`fk_vendas`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `tbl_cliente`
--
ALTER TABLE `tbl_cliente`
  MODIFY `pk_id_Cliente` bigint(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de tabela `tbl_forma_pagamento`
--
ALTER TABLE `tbl_forma_pagamento`
  MODIFY `pk_id_for_pag` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `tbl_produto`
--
ALTER TABLE `tbl_produto`
  MODIFY `pk_id_produto` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de tabela `tbl_usuario`
--
ALTER TABLE `tbl_usuario`
  MODIFY `pk_id_usuario` bigint(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de tabela `tbl_vendas`
--
ALTER TABLE `tbl_vendas`
  MODIFY `pk_id_vendas` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de tabela `tbl_vendas_produtos`
--
ALTER TABLE `tbl_vendas_produtos`
  MODIFY `pk_id_venda_produto` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=27;

--
-- Restrições para despejos de tabelas
--

--
-- Limitadores para a tabela `tbl_vendas`
--
ALTER TABLE `tbl_vendas`
  ADD CONSTRAINT `tbl_vendas_ibfk_1` FOREIGN KEY (`fk_cliente`) REFERENCES `tbl_cliente` (`pk_id_Cliente`);

--
-- Limitadores para a tabela `tbl_vendas_produtos`
--
ALTER TABLE `tbl_vendas_produtos`
  ADD CONSTRAINT `tbl_vendas_produtos_ibfk_1` FOREIGN KEY (`fk_produto`) REFERENCES `tbl_produto` (`pk_id_produto`),
  ADD CONSTRAINT `tbl_vendas_produtos_ibfk_2` FOREIGN KEY (`fk_vendas`) REFERENCES `tbl_vendas` (`pk_id_vendas`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
