
/* Drop Tables */

DROP TABLE IF EXISTS published_item;
DROP TABLE IF EXISTS users;




/* Create Tables */

CREATE TABLE published_item
(
	-- published_item表的主键
	id serial NOT NULL,
	name bit varying,
	origin_price float,
	sell_price float,
	status bit varying,
	description bit varying,
	picture bit varying,
	-- user表的主键
	users_id_fk int NOT NULL,
	PRIMARY KEY (id)
) WITHOUT OIDS;


CREATE TABLE users
(
	-- user表的主键
	id serial NOT NULL,
	name bit varying,
	password bit varying,
	PRIMARY KEY (id)
) WITHOUT OIDS;



/* Create Foreign Keys */

ALTER TABLE published_item
	ADD FOREIGN KEY (users_id_fk)
	REFERENCES users (id)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;



/* Comments */

COMMENT ON COLUMN published_item.id IS 'published_item表的主键';
COMMENT ON COLUMN published_item.users_id_fk IS 'user表的主键';
COMMENT ON COLUMN users.id IS 'user表的主键';



