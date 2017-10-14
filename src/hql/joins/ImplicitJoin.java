List<Country> africanCountries = session.createQuery(
        "from Country where continent.name = 'Africa'")
        .list();