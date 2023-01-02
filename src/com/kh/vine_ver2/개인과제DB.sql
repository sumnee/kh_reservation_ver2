
CREATE TABLE WINE_TBL(
    WINE_NAME VARCHAR2(20), 
    WINE_PHONE VARCHAR2(15), 
    WINE_EMAIL VARCHAR2(30), 
    WINE_DATE VARCHAR2(20), 
    WINE_TIME VARCHAR2(20), 
    WINE_NUMBER NUMBER, 
    WINE_SETTIME DATE DEFAULT SYSDATE, 
    WINE_CANCEL VARCHAR2(3) DEFAULT 'N'
);

ALTER TABLE WINE_TBL
ADD CONSTRAINT WINE_PK PRIMARY KEY(WINE_PHONE);
ALTER TABLE WINE_TBL
ADD CHECK(WINE_CANCEL IN('Y','N'));
ALTER TABLE WINE_TBL
MODIFY WINE_DATE NOT NULL;
ALTER TABLE WINE_TBL
MODIFY WINE_TIME NOT NULL;
ALTER TABLE WINE_TBL
MODIFY WINE_NUMBER NOT NULL;

INSERT INTO WINE_TBL
VALUES('�ܰ�','01066665555','NDN@ND','1��10��','19��','5',DEFAULT,DEFAULT);
COMMIT;

SELECT * FROM WINE_TBL;
