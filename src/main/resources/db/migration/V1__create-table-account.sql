CREATE TABLE account (
    id UUID PRIMARY KEY,
    number VARCHAR(255),
    agency VARCHAR(255),
    balance decimal(13, 2),
    additional_limit decimal(13, 2)
);