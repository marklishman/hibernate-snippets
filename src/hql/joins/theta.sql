select
  CONTINENT.CONT_ID,
  CONTINENT.CONT_NAME
from
  CONTINENT,
  COUNTRY
where
  CONTINENT.CONT_NAME=COUNTRY.CTRY_NAME