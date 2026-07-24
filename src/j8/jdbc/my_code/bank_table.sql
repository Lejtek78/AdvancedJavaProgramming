CREATE DATABASE IF NOT EXISTS bank_db;

CREATE TABLE IF NOT EXISTS bank_db.bank_table
(
	branch_code VARCHAR(10),
	account_number VARCHAR(10),
	cust_name VARCHAR(20),
	cust_address VARCHAR(50),
	balance DECIMAL(7),
	PRIMARY KEY (branch_code, account_number)
);

INSERT INTO bank_db.bank_table VALUES
(
	'123456',
	'12345678',
	'Joe Bloggs',
	'Athlone',
	300.0
),
(
	'111111',
	'87654321',
	'Ann Bloggs',
	'Athlone',
	500.0
),
(
	'222222',
	'67676767',
	'Jane Doe',
	'Dublin',
	200.0
);
