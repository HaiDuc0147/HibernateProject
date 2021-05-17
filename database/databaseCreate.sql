create table "LOGIN"(
	id smallserial primary key, 
	username varchar(50),
	password varchar(50), 
	role bit
);
create table "STUDENT"(
	student_id varchar(8) primary key,
	student_name varchar(50),
	class_id varchar(6),
	credits int
);
create table "SUBJECT"(
	subject_id varchar(10) primary key,
	subject_name varchar(50),
	credit smallint
);
create table "CLASS"(
	class_id varchar(6) primary key,
	number_of_student int,
	number_of_male int,
	number_of_female int
);
create table "SEMESTER"(
	semester_name varchar(3),
	year int, 
	start_day date,
	end_day date,
	primary key(semester_name, year)
)
create table "COURSE"(
	course_id varchar(10),
	study_day date, 
	study_time varchar(5),
	teacher_id varchar(10),
	classroom varchar(6),
	primary key(course_id, study_day, study_time )
)
create 