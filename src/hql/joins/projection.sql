select
  distinct CONT_NAME
from
  CONTINENT
  inner join
  COUNTRY
    on CONTINENT.CONT_ID=COUNTRY.CONT_ID
where
  AREA>100000