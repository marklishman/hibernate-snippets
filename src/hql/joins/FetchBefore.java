Continent europe = (Continent) session.createQuery(
        "select cont " +
        "from Continent cont join cont.countries " +
        "where cont.name = 'Europe'")
        .uniqueResult();