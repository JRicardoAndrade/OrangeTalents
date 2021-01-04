INSERT INTO tb_account (type_Account) VALUES ('Conta Corrente');
INSERT INTO tb_account (type_Account) VALUES ('Conta Poupança');
INSERT INTO tb_account (type_Account) VALUES ('Conta Investimento');

INSERT INTO tb_client (name, email, cpf, birth) VALUES ('Tulio','tulio@email.com.br', 44444444444, TIMESTAMP WITH TIME ZONE '2013-07-21T20:59:19Z');
INSERT INTO tb_client (name, email, cpf, birth) VALUES ('Alex','alex@email.com.br', 33333333333, TIMESTAMP WITH TIME ZONE '1968-06-20T20:30:26Z');
INSERT INTO tb_client (name, email, cpf, birth) VALUES ('Marcos','marcos@email.com.br', 45112312332, TIMESTAMP WITH TIME ZONE '1999-06-15T15:01:37Z');
INSERT INTO tb_client (name, email, cpf, birth) VALUES ('Tony','tony@email.com.br', 32678978900, TIMESTAMP WITH TIME ZONE '1980-05-22T19:05:38Z');
INSERT INTO tb_client (name, email, cpf, birth) VALUES ('Meire', 'meire@email.com.br',24098765432, TIMESTAMP WITH TIME ZONE '2000-07-11T11:31:03Z');

INSERT INTO tb_client_account (client_id, account_Number) Values (1,3);
INSERT INTO tb_client_account (client_id, account_Number) Values (1,2);
INSERT INTO tb_client_account (client_id, account_Number) Values (2,3);
INSERT INTO tb_client_account (client_id, account_Number) Values (3,1);
INSERT INTO tb_client_account (client_id, account_Number) Values (4,2);
INSERT INTO tb_client_account (client_id, account_Number) Values (5,1);
INSERT INTO tb_client_account (client_id, account_Number) Values (5,3);
