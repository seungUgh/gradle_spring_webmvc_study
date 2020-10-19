/*INSERT ALL
	INTO MEMBER VALUES ('이소미', 'somi', '1234', 'gmd@naver.com', '010-2362-5157', 0, sysdate)
	INTO MEMBER VALUES ('하상오', 'sang12', '1234', 'ha12@naver.com', '010-5629-8888', 1, sysdate)
	INTO MEMBER VALUES ('김윤승', 'light', '1234', 'youn104@naver.com', '010-9999-8282', 0, sysdate)
	SELECT 1 FROM DUAL;
	*/

INSERT INTO MEMBER(EMAIL, PASSWORD, NAME, REGDATE) 
values('test@test.co.kr', '1111', 'test', '2020-09-28');
INSERT INTO MEMBER(EMAIL, PASSWORD, NAME, REGDATE) 
values('test2@test.co.kr', '1111', 'test2', '2020-09-28');

SELECT ID, EMAIL, PASSWORD, NAME, REGDATE FROM MEMBER WHERE EMAIL = 'test@test.co.kr';

UPDATE MEMBER 
   SET EMAIL 
 WHERE id =?;

DELETE FROM "MEMBER" WHERE id = ?;
