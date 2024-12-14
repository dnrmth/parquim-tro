create table parking
(
    id              serial,
    plate           varchar(255) not null,
    initial_date_time timestamp    not null,
    final_date_time   timestamp    not null,
    constraint parking_pk primary key (id)
);
