CREATE TABLE TB_PERSON(
    ID_PERSON IDENTITY PRIMARY KEY,
    ID_GENDER INT NOT NULL,
    FULL_NAME VARCHAR(50) NOT NULL,
    BIRTHDATE DATE
);

CREATE SEQUENCE TB_PERSON_SEQ
  START WITH 1
  INCREMENT BY 1;

CREATE TABLE TB_GENDER(
    ID_GENDER IDENTITY PRIMARY KEY,
    NAME VARCHAR(10) NOT NULL
);

ALTER TABLE TB_PERSON
    ADD FOREIGN KEY (ID_GENDER) 
    REFERENCES TB_GENDER(ID_GENDER);

INSERT INTO TB_GENDER(NAME) VALUES('MALE');
INSERT INTO TB_GENDER(NAME) VALUES('FEMALE');