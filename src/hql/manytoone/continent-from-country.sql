select
  CONTINENT.CONT_ID,
  CONTINENT.CONT_NAME,
  COUNTRY.CTRY_ID,
  COUNTRY.CTRY_NAME,
  COUNTRY.AREA
from
  COUNTRY
  left outer join
  CONTINENT
    on COUNTRY.CONT_ID = CONTINENT.CONT_ID
where
  COUNTRY.CTRY_ID=?