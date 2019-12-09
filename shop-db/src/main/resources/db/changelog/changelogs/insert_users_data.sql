INSERT into `roles`(`title`)VALUES('ADMIN');
GO

INSERT into `roles`(`title`),VALUES('GUEST');
GO

INSERT into `users`(`user_name`,`password`,role)
VALUES('admin','$2a$10$C.1MkZG2wc4T10h2QCyif.QTJyOsdY89z5sNxr9R4CpyFcEya77dK',1);
GO
