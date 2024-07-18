CREATE TABLE userr (
    id UUID PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    account_id UUID,
    card_id UUID,
    FOREIGN KEY (account_id) REFERENCES account(id),
    FOREIGN KEY (card_id) REFERENCES card(id)
);