-- 테이블 생성 전 drop
drop table second_board;

-- 테이블 생성
create table second_board (
idx INT not null auto_increment,
`group` varchar(100),
title varchar(100),
contents varchar(100),
create_date datetime,
update_date datetime,
primary KEY(idx)
);

-- 테이블 확인
select * from trial.second_board;

-- dummy data
INSERT INTO SECOND_BOARD(`group`, title, contents, create_date) VALUES ('free', 'test_1', '내용 테스트1', now());
INSERT INTO SECOND_BOARD(`group`, title, contents, create_date) VALUES ('free', 'test_2', '내용 테스트2', now());
INSERT INTO SECOND_BOARD(`group`, title, contents, create_date) VALUES ('free', 'test_3', '내용 테스트3', now());

INSERT INTO SECOND_BOARD(`group`, title, contents, create_date) VALUES ('notice', 'test_1', '내용 테스트1', now());
INSERT INTO SECOND_BOARD(`group`, title, contents, create_date) VALUES ('notice', 'test_2', '내용 테스트2', now());
INSERT INTO SECOND_BOARD(`group`, title, contents, create_date) VALUES ('notice', 'test_3', '내용 테스트3', now());

commit;
