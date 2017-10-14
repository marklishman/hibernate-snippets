Continent europe = (Continent) session.createQuery(
        "select cont " +
        "from Continent cont join fetch cont.countries " +
        "where cont.name = 'Europe'")