List<Object[]> africanContinents = session.createQuery(
        "from Continent cont join cont.countries ctry " +
        "where cont.name = 'Africa'")
        .list();