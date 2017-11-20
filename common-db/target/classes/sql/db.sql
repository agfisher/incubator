DROP TABLE IF EXISTS incubation;
CREATE TABLE incubation (
  id SERIAL,
  start_date TIMESTAMP WITHOUT TIME ZONE NOT NULL ,
  end_date TIMESTAMP WITHOUT TIME ZONE,
  status INTEGER NOT NULL ,
  PRIMARY KEY(id)
);

DROP TABLE IF EXISTS incubation_data;
CREATE TABLE incubation_data (
  id SERIAL,
  --incubation_id INTEGER REFERENCES incubation (id),
  day_number INTEGER,
  date TIMESTAMP WITHOUT TIME ZONE NOT NULL ,
  point VARCHAR(10) NOT NULL ,
  value NUMERIC NOT NULL,
  PRIMARY KEY(id)
);
CREATE INDEX ON incubation_data(date);
CREATE INDEX ON incubation_data(point);