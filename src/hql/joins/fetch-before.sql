select
  CONTINENT.CONT_ID,
  CONTINENT.CONT_NAME
from
  CONTINENT
  inner join
  COUNTRY
    on CONTINENT.CONT_ID=COUNTRY.CONT_ID
where
  CONT_NAME='Europe'