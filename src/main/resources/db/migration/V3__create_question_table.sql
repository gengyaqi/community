create table question
(
	id int auto_increment,
	titile VARCHAR(50) null,
	description text null,
	grm_create BIGINT null,
	gmt_modified BIGINT null,
	creator int null,
	comment_count int null,
	view_count int null,
	like_count int null,
	tag VARCHAR(256) null,
	constraint question_pk
		primary key (id)
);