# p_b

ALTER TABLE user ADD CONSTRAINT unique_key_userId UNIQUE (userId);

ALTER TABLE user ADD CONSTRAINT unique_key_userEmail UNIQUE (userEmail);
