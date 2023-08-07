USE employee_directory;

DROP TABLE IF EXISTS roles;
DROP TABLE IF EXISTS members;

CREATE TABLE members (
	user_id varchar(50) NOT NULL,
    pw char(68) NOT NULL,
    active tinyint NOT NULL,
    PRIMARY KEY (user_id)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO members
VALUES
	('kalu', '{bcrypt}$2a$10$50cP4OIHRJRmpKkZWtyvS.XWGKTiCei6O9trs9le2KxMrf.VdvjpS', 1),
    ('nikola', '{bcrypt}$2a$10$50cP4OIHRJRmpKkZWtyvS.XWGKTiCei6O9trs9le2KxMrf.VdvjpS', 1),
    ('lazar', '{bcrypt}$2a$10$50cP4OIHRJRmpKkZWtyvS.XWGKTiCei6O9trs9le2KxMrf.VdvjpS', 1);
    

CREATE TABLE roles (
	user_id varchar(50) NOT NULL,
    role char(68) NOT NULL,
    UNIQUE KEY authorities5_idx_1 (user_id, role),
    CONSTRAINT authorities5_ibfk_1 FOREIGN KEY (user_id) REFERENCES members (user_id)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO roles
VALUES
	('kalu', 'ROLE_EMPLOYEE'),
    ('nikola', 'ROLE_EMPLOYEE'),
    ('nikola', 'ROLE_MANAGER'),
    ('lazar', 'ROLE_EMPLOYEE'),
    ('lazar', 'ROLE_MANAGER'),
    ('lazar', 'ROLE_ADMIN')


    