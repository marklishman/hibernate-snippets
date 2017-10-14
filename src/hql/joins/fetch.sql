select
  CONTINENT.CONT_ID,
  COUNTRY.CTRY_ID ,
  CONTINENT.CONT_NAME,
  COUNTRY.AREA,
  COUNTRY.CURRENCY,
  COUNTRY.CTRY_NAME,
  COUNTRY.POP,
  COUNTRY.POP_UPD_ON
from
  CONTINENT
  inner join
  COUNTRY
    on CONTINENT.CONT_ID=COUNTRY.CONT_ID
where
  CONT_NAME='Europe'