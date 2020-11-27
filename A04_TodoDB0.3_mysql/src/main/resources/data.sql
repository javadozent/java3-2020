DROP TABLE IF EXISTS todo;

CREATE TABLE IF NOT EXISTS todo(
                                   id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
                                   entry VARCHAR (150) NOT NULL,
                                   deadline DATE NULL,
                                   done BOOLEAN NULL ,
                                   priority enum('HIGH','MIDDLE','LOW') NULL

);



INSERT INTO todo (entry, deadline, done, priority) VALUES ('einkaufen','2020-11-15', false, 1);
INSERT INTO todo (entry, deadline, done, priority) VALUES ('schlafen','2020-11-15', false, 2);
INSERT INTO todo (entry, deadline, done, priority) VALUES ('abwaschen','2020-11-15', false, 2);
INSERT INTO todo (entry, deadline, done, priority) VALUES ('lesen','2020-11-15', false, 2);
INSERT INTO todo (entry, deadline, done, priority) VALUES ('einkaufen','2020-11-15', false, 1);
INSERT INTO todo (entry, deadline, done, priority) VALUES ('feiern','2020-11-15', false, 1);
INSERT INTO todo (entry, deadline, done, priority) VALUES ('essen','2020-11-15', false, 1);
INSERT INTO todo (entry, deadline, done, priority) VALUES ('lernen','2020-11-15', false, 0);
INSERT INTO todo (entry, deadline, done, priority) VALUES ('sicialmedia','2020-11-15', false, 0);