INSERT INTO user(PK_ID,MEMBER_USER_NAME,MEMBER_USER_PASSWORD) VALUES(1,'username','$2a$10$74sWOLn2ah/3EI9TIn0LVOhyXU1zVRl0yh3PlwhU/rRZgrqGMqu/y');
INSERT INTO role(PK_ID,MEMBER_ROLE_NAME) VALUES(1,'admin');
INSERT INTO authority(PK_ID,MEMBER_RESOURCE_ROUTER) VALUES(1,'User.getAllUsers');
INSERT INTO user_role(PK_ID,MEMBER_USER_ID,MEMBER_ROLE_ID) VALUES(1,1,1);
INSERT INTO role_authority(PK_ID,MEMBER_ROLE_ID,MEMBER_AUTHORITY_ID) VALUES(1,1,1);
