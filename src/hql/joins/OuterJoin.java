List<Object[]> allContinentsAndCountries = session.createQuery(
        "select cont.name, nvl(ctry.name, '[none]') " +
        "from Continent cont left join cont.countries ctry " +
        "with ctry.area > 100000 " +
        "order by cont.name")
        .list();