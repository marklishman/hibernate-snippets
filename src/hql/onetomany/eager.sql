select
  CONTINENT.CONT_ID,
  CONTINENT.CONT_NAME,
  COUNTRY.CTRY_ID,
  COUNTRY.CTRY_NAME,
  COUNTRY.AREA
from
  CONTINENT
  left outer join
  COUNTRY
    on CONTINENT.CONT_ID = COUNTRY.CONT_ID
where
  CONTINENT.CONT_ID=?