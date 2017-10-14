List<String> continentsWithBigCountries = session.createQuery(
        "select distinct cont.name " +
        "from Continent cont join cont.countries ctry " +
        "where ctry.area > 100000")
        .list();