-- 1. "import.sql" must be placed under /resources/
-- 2. if "import.sql" is to be used, need to set "hibernate.hbm2ddl.auto" to either "create" or "create-drop"
-- 3. every command in "import.sql" must be placed in a line of its own (a single line! - https://idqna.com/question/how-to-import-initial-data-to-database-with-hibernate)
-- 4. entities have to be created in the appropriate order. First Independent entities, then dependent entities. Failed population does not throw an error, it simply fails silently
-- also see: https://stackoverflow.com/questions/4674828/how-to-break-expression-into-more-lines-in-hibernates-import-sql/15090964#15090964
-- INSERT INTO public.universities (id, title, address, founding_date) VALUES (1, 'Vilniaus universitetas', 'Universiteto g. 3, Vilnius', '1579-01-01');
-- INSERT INTO public.universities (id, title, address, founding_date) VALUES (2, 'Kauno technologijos universitetas', 'K. Donelaičio g. 73, Kaunas', '1922-02-16');
-- INSERT INTO public.universities (id, title, address, founding_date) VALUES (3, 'Klaipėdos universitetas', 'H. Manto g. 84, Klaipėda', '1991-01-01');
-- INSERT INTO public.universities (id, title, address, founding_date) VALUES (4, 'Vilniaus Gedimino technikos universitetas', 'Saulėtekio al. 11, Vilnius', '1956-09-01');
-- SELECT setval('universities_id_seq', max(id)) FROM universities;
--
-- INSERT INTO public.professors (id, first_name, last_name, age, degree, university_id) VALUES (1, 'Algis', 'Piskarskas', 62, 'Habil. mokslų daktaras', 1);
-- INSERT INTO public.professors (id, first_name, last_name, age, degree, university_id) VALUES (2, 'Jonas', 'Kubilius', 70, 'Habil. mokslų daktaras', 1);
-- INSERT INTO public.professors (id, first_name, last_name, age, degree, university_id) VALUES (3, 'Vidmantas', 'Pekarskas', 54, 'Habil. mokslų daktaras', 2);
-- INSERT INTO public.professors (id, first_name, last_name, age, degree, university_id) VALUES (4, 'Antanas', 'Žiliukas', 69, 'Habil. mokslų daktaras', 2);
-- INSERT INTO public.professors (id, first_name, last_name, age, degree, university_id) VALUES (5, 'Vygantas', 'Vareikis', 55, 'Mokslų daktaras', 3);
-- INSERT INTO public.professors (id, first_name, last_name, age, degree, university_id) VALUES (6, 'Silva', 'Pocytė', 32, 'Mokslų daktarė', 3);
-- SELECT setval('professors_id_seq', max(id)) FROM professors;
--
INSERT INTO public.students (id, first_name, last_name, personal_code) VALUES (1, 'Rokas', 'Paulauskas', '38906191170');
INSERT INTO public.students (id, first_name, last_name, personal_code) VALUES (2, 'Vytautas', 'Kalinauskas', '39502170856');
INSERT INTO public.students (id, first_name, last_name, personal_code) VALUES (3, 'Simona', 'Ilkevičiūtė', '48905157851');
INSERT INTO public.students (id, first_name, last_name, personal_code) VALUES (4, 'Vitalija', 'Moroz', '48608254530');
INSERT INTO public.students (id, first_name, last_name, personal_code) VALUES (5, 'Alina', 'Semionova', '49901240567');
INSERT INTO public.students (id, first_name, last_name, personal_code) VALUES (6, 'Rimas', 'Skėrys', '38205160899');
INSERT INTO public.students (id, first_name, last_name, personal_code) VALUES (7, 'Beatričė', 'Baltaduonytė', '49010087999');
INSERT INTO public.students (id, first_name, last_name, personal_code) VALUES (8, 'Zita', 'Kudulytė-Jestavjeva', '49306050501');
SELECT setval('students_id_seq', max(id)) FROM students; -- must be used with @GeneratedValue(strategy = GenerationType.IDENTITY) on Student.id etc.
--
-- INSERT INTO public.courses (id, code, name, course_responsible_professor_id) VALUES (1, 'MAT11', 'Tiesinė algebra', 2);
-- INSERT INTO public.courses (id, code, name, course_responsible_professor_id) VALUES (2, 'FUN-F01', 'Kinematika ir mechanika', 4);
-- INSERT INTO public.courses (id, code, name, course_responsible_professor_id) VALUES (3, 'LAZ25', 'Netiesiniai reiškiniai optinėse sistemose', 1);
-- INSERT INTO public.courses (id, code, name, course_responsible_professor_id) VALUES (4, 'FUN-S25', 'Medžiagų atsparumas I', 4);
-- INSERT INTO public.courses (id, code, name, course_responsible_professor_id) VALUES (5, 'Arch 1.1', 'Archeologijos įvadas', 5);
-- SELECT setval('courses_id_seq', max(id)) FROM courses;

-- dėl skaitiklio pasukimo po importo: https://stackoverflow.com/questions/44708548/postgres-complains-id-already-exists-after-insert-of-initial-data
-- dar žr. SERIAL tipus: https://www.postgresql.org/docs/current/datatype-numeric.html#DATATYPE-SERIAL
-- dar žr. bendriausias sprendimas remiantis tik SQL specifikacija (identity columns): https://www.postgresql.org/docs/current/sql-createtable.html

-- INSERT INTO public.students_universities (student_id, university_id) VALUES (1, 1);
-- INSERT INTO public.students_universities (student_id, university_id) VALUES (1, 3);
-- INSERT INTO public.students_universities (student_id, university_id) VALUES (2, 1);
-- INSERT INTO public.students_universities (student_id, university_id) VALUES (3, 1);
-- INSERT INTO public.students_universities (student_id, university_id) VALUES (3, 2);
-- INSERT INTO public.students_universities (student_id, university_id) VALUES (3, 3);
