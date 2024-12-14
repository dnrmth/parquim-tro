ALTER TABLE parking
ADD CONSTRAINT parking_duplicated_constraint UNIQUE (plate, initial_date_time, final_date_time);