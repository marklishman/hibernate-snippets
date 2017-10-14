List<Continent> sameNames = session.createQuery(
        "select cont " +
        "from Continent cont, Country ctry " +
        "where cont.name = ctry.name")
        .list();