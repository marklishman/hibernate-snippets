select
  CONT_NAME,
  nvl(CTRY_NAME, '[none]')
from
  CONTINENT
  left outer join
  COUNTRY
    on CONTINENT.CONT_ID=COUNTRY.CONT_ID
       and (
         AREA>100000
       )
order by
  CONT_NAME