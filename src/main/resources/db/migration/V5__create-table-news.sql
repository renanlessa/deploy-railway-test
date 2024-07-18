CREATE TABLE news (
    id UUID PRIMARY KEY,
    icon VARCHAR(255),
    description VARCHAR(255),
    user_id UUID,
    FOREIGN KEY (user_id) REFERENCES userr(id) ON DELETE CASCADE
);